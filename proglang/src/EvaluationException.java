import org.antlr.v4.runtime.*;

public class EvaluationException extends RuntimeException {
	public EvaluationException (ParserRuleContext ctx) {
		this("Illegal expression: " + ctx.getText(), ctx);
	}

	public EvaluationException(String msg, ParserRuleContext ctx) {
		super(msg + " line:" + ctx.start.getLine());
	}
}
