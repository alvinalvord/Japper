import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Japper {

	public static void main (String[] args) throws IOException {
		CharStream cs = fromFileName (args[0]);
		JapperLexer lexer = new JapperLexer (cs);

		CommonTokenStream token = new CommonTokenStream (lexer);
		JapperParser parser = new JapperParser (token);

//		AST (lexer, token, parser, cs);
		ParseTree tree = parser.compilationUnit ();

		JapperScope scope = new JapperScope ();
		Map<String, JapperFunction> functions = new HashMap<>();

		JapperFunctionVisitor functionVisitor = new JapperFunctionVisitor (functions);
		functionVisitor.visit (tree);


		JapperVisitor visitor = new JapperVisitor (scope, functions);
		visitor.visit (tree);

		functions.get ("main0").invoke (new ArrayList<> (), functions, scope);
	}

	static void  AST  (JapperLexer lexer, CommonTokenStream tokens, JapperParser parser, CharStream cs) {
		lexer = new JapperLexer (cs);
		tokens = new CommonTokenStream(lexer);
		parser = new JapperParser (tokens);
        printAST(Objects.requireNonNull(parser.compilationUnit()), false, 0);
	}

	private static void printAST(RuleContext ctx, boolean verbose, int indentation) {
		boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 &&
				ctx.getChild(0) instanceof ParserRuleContext;
		if (!toBeIgnored) {
			String ruleName = JapperParser.ruleNames[ctx.getRuleIndex()];
			for (int i = 0; i < indentation; i++) {
				System.out.print("  ");
			}
			System.out.println(ruleName + " " + ctx.getText());
		}
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree element = ctx.getChild(i);
			if (element instanceof RuleContext) {
				printAST((RuleContext)element, verbose, indentation + (toBeIgnored ? 0 : 1));
			}
		}
	}

}
