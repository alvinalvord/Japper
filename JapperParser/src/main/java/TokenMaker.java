import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

import javax.swing.text.Segment;
import java.util.*;

public class TokenMaker extends AbstractTokenMaker {

    @Override
    public TokenMap getWordsToHighlight() {
        TokenMap tokenMap = new TokenMap();

        tokenMap.put("case",  Token.RESERVED_WORD);
        tokenMap.put("for",   Token.RESERVED_WORD);
        tokenMap.put("if",    Token.RESERVED_WORD);
        tokenMap.put("while", Token.RESERVED_WORD);
        tokenMap.put("do", Token.RESERVED_WORD);
        tokenMap.put("public", Token.RESERVED_WORD);
        tokenMap.put("static", Token.RESERVED_WORD);
        tokenMap.put("try", Token.RESERVED_WORD);
        tokenMap.put("catch", Token.RESERVED_WORD);
        tokenMap.put("finally", Token.RESERVED_WORD);
        tokenMap.put("throw", Token.RESERVED_WORD);
        tokenMap.put("throws", Token.RESERVED_WORD);
        tokenMap.put("loop", Token.RESERVED_WORD);
        tokenMap.put("until", Token.RESERVED_WORD);
        tokenMap.put("else", Token.RESERVED_WORD);
        tokenMap.put("switch", Token.RESERVED_WORD);
        tokenMap.put("case", Token.RESERVED_WORD);
        tokenMap.put("default", Token.RESERVED_WORD);
        tokenMap.put("public", Token.RESERVED_WORD);
        tokenMap.put("private", Token.RESERVED_WORD);
        tokenMap.put("protected", Token.RESERVED_WORD);
        tokenMap.put("const", Token.RESERVED_WORD);
        tokenMap.put("enum", Token.RESERVED_WORD);
        tokenMap.put("final", Token.RESERVED_WORD);
        tokenMap.put("static", Token.RESERVED_WORD);
        tokenMap.put("synchronized", Token.RESERVED_WORD);
        tokenMap.put("transient", Token.RESERVED_WORD);
        tokenMap.put("import", Token.RESERVED_WORD);
        tokenMap.put("new", Token.RESERVED_WORD);
        tokenMap.put("package", Token.RESERVED_WORD);
        tokenMap.put("null", Token.RESERVED_WORD);
        tokenMap.put("nothing", Token.RESERVED_WORD);
        tokenMap.put("class", Token.RESERVED_WORD);

        tokenMap.put("true", Token.LITERAL_BOOLEAN);
        tokenMap.put("false", Token.LITERAL_BOOLEAN);

        tokenMap.put("char", Token.DATA_TYPE);
        tokenMap.put("boolean", Token.DATA_TYPE);
        tokenMap.put("byte", Token.DATA_TYPE);
        tokenMap.put("short", Token.DATA_TYPE);
        tokenMap.put("int", Token.DATA_TYPE);
        tokenMap.put("long", Token.DATA_TYPE);
        tokenMap.put("float", Token.DATA_TYPE);
        tokenMap.put("double", Token.DATA_TYPE);
        tokenMap.put("void", Token.DATA_TYPE);
        tokenMap.put("volatile", Token.DATA_TYPE);

        tokenMap.put("yeet", Token.RESERVED_WORD);
        tokenMap.put("oof", Token.RESERVED_WORD);
        tokenMap.put("ree", Token.RESERVED_WORD);
        tokenMap.put("brodie error", Token.RESERVED_WORD);
        tokenMap.put("bro err", Token.RESERVED_WORD);
        tokenMap.put("broerr", Token.RESERVED_WORD);
        tokenMap.put("pweds mag error", Token.RESERVED_WORD);
        tokenMap.put("pweds mag err", Token.RESERVED_WORD);
        tokenMap.put("pwedsmagerr", Token.RESERVED_WORD);
        tokenMap.put("thonking", Token.RESERVED_WORD);
        tokenMap.put("thonkingif", Token.RESERVED_WORD);
        tokenMap.put("kung", Token.RESERVED_WORD);
        tokenMap.put("kungif", Token.RESERVED_WORD);
        tokenMap.put("censored", Token.RESERVED_WORD);
        tokenMap.put("protecc", Token.RESERVED_WORD);
        tokenMap.put("uncensored", Token.RESERVED_WORD);
        tokenMap.put("pubic", Token.RESERVED_WORD);
        tokenMap.put("last na", Token.RESERVED_WORD);
        tokenMap.put("lastna", Token.RESERVED_WORD);
        tokenMap.put("wala", Token.RESERVED_WORD);
        tokenMap.put("take", Token.RESERVED_WORD);
        tokenMap.put("yung kwan", Token.RESERVED_WORD);
        tokenMap.put("yungkwan", Token.RESERVED_WORD);
        tokenMap.put("bago", Token.RESERVED_WORD);
        tokenMap.put("pinalitan", Token.RESERVED_WORD);
        tokenMap.put("ew shipping fee", Token.RESERVED_WORD);
        tokenMap.put("nothing", Token.RESERVED_WORD);
        tokenMap.put("school", Token.RESERVED_WORD);

        tokenMap.put("yes", Token.LITERAL_BOOLEAN);
        tokenMap.put("no", Token.LITERAL_BOOLEAN);

        tokenMap.put("bool", Token.DATA_TYPE);
        tokenMap.put("i1", Token.DATA_TYPE);
        tokenMap.put("int1", Token.DATA_TYPE);
        tokenMap.put("int2", Token.DATA_TYPE);
        tokenMap.put("i2", Token.DATA_TYPE);
        tokenMap.put("int8", Token.DATA_TYPE);
        tokenMap.put("i8", Token.DATA_TYPE);
        tokenMap.put("int16", Token.DATA_TYPE);
        tokenMap.put("i16", Token.DATA_TYPE);
        tokenMap.put("int32", Token.DATA_TYPE);
        tokenMap.put("i32", Token.DATA_TYPE);
        tokenMap.put("int64", Token.DATA_TYPE);
        tokenMap.put("i64", Token.DATA_TYPE);
        tokenMap.put("float32", Token.DATA_TYPE);
        tokenMap.put("f32", Token.DATA_TYPE);
        tokenMap.put("float64", Token.DATA_TYPE);
        tokenMap.put("f64", Token.DATA_TYPE);

        tokenMap.put("print", Token.FUNCTION);
        tokenMap.put("read", Token.FUNCTION);
        tokenMap.put("assert", Token.FUNCTION);
        tokenMap.put("continue", Token.FUNCTION);
        tokenMap.put("goto", Token.FUNCTION);
        tokenMap.put("return", Token.FUNCTION);
        tokenMap.put("break", Token.FUNCTION);
        tokenMap.put("in", Token.FUNCTION);
        tokenMap.put("go on", Token.FUNCTION);
        tokenMap.put("goon", Token.FUNCTION);
        tokenMap.put("bbb", Token.FUNCTION);
        tokenMap.put("yamete", Token.FUNCTION);

        tokenMap.put("gets", Token.OPERATOR);
        tokenMap.put("plus equal", Token.OPERATOR);
        tokenMap.put("plus eq", Token.OPERATOR);
        tokenMap.put("minus equal", Token.OPERATOR);
        tokenMap.put("minus eq", Token.OPERATOR);
        tokenMap.put("times equal", Token.OPERATOR);
        tokenMap.put("times eq", Token.OPERATOR);
        tokenMap.put("div equal", Token.OPERATOR);
        tokenMap.put("div eq", Token.OPERATOR);
        tokenMap.put("mod equal", Token.OPERATOR);
        tokenMap.put("mod eq", Token.OPERATOR);
        tokenMap.put("and equal", Token.OPERATOR);
        tokenMap.put("and eq", Token.OPERATOR);
        tokenMap.put("or equal", Token.OPERATOR);
        tokenMap.put("or eq", Token.OPERATOR);
        tokenMap.put("xor equal", Token.OPERATOR);
        tokenMap.put("xor eq", Token.OPERATOR);
        tokenMap.put("sll equal", Token.OPERATOR);
        tokenMap.put("sll eq", Token.OPERATOR);
        tokenMap.put("srl equal", Token.OPERATOR);
        tokenMap.put("srl eq", Token.OPERATOR);
        tokenMap.put("sra equal", Token.OPERATOR);
        tokenMap.put("sra eq", Token.OPERATOR);
        tokenMap.put("not", Token.OPERATOR);
        tokenMap.put("wak", Token.OPERATOR);
        tokenMap.put("inc", Token.OPERATOR);
        tokenMap.put("dec", Token.OPERATOR);
        tokenMap.put("plus", Token.OPERATOR);
        tokenMap.put("minus", Token.OPERATOR);
        tokenMap.put("times", Token.OPERATOR);
        tokenMap.put("div", Token.OPERATOR);
        tokenMap.put("mod", Token.OPERATOR);
        tokenMap.put("gt", Token.OPERATOR);
        tokenMap.put("ge", Token.OPERATOR);
        tokenMap.put("lt", Token.OPERATOR);
        tokenMap.put("le", Token.OPERATOR);
        tokenMap.put("equals", Token.OPERATOR);
        tokenMap.put("equal", Token.OPERATOR);
        tokenMap.put("eq", Token.OPERATOR);
        tokenMap.put("ne", Token.OPERATOR);
        tokenMap.put("and", Token.OPERATOR);
        tokenMap.put("or", Token.OPERATOR);
        tokenMap.put("bnot", Token.OPERATOR);
        tokenMap.put("band", Token.OPERATOR);
        tokenMap.put("bor", Token.OPERATOR);
        tokenMap.put("bxor", Token.OPERATOR);
        tokenMap.put("sll", Token.OPERATOR);
        tokenMap.put("sl", Token.FUNCTION);
        tokenMap.put("srl", Token.OPERATOR);
        tokenMap.put("sr", Token.OPERATOR);
        tokenMap.put("sra", Token.OPERATOR);

        tokenMap.put("main", Token.IDENTIFIER);
        return tokenMap;
    }

    /**
     * Returns a list of tokens representing the given text.
     *
     * @param text The text to break into tokens.
     * @param startTokenType The token with which to start tokenizing.
     * @param startOffset The offset at which the line of tokens begins.
     * @return A linked list of tokens representing <code>text</code>.
     */
    @Override
    public Token getTokenList(Segment text, int startTokenType, int startOffset) {

        resetTokenList();

        char[] array = text.array;
        int offset = text.offset;
        int count = text.count;
        int end = offset + count;

        // Token starting offsets are always of the form:
        // 'startOffset + (currentTokenStart-offset)', but since startOffset and
        // offset are constant, tokens' starting positions become:
        // 'newStartOffset+currentTokenStart'.
        int newStartOffset = startOffset - offset;

        int currentTokenStart = offset;
        int currentTokenType  = startTokenType;

        for (int i=offset; i<end; i++) {

            char c = array[i];

            switch (currentTokenType) {

                case Token.NULL:

                    currentTokenStart = i;   // Starting a new token here.

                    switch (c) {

                        case ' ':
                        case '\t':
                            currentTokenType = Token.WHITESPACE;
                            break;

                        case '"':
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        case '#':
                            currentTokenType = Token.COMMENT_EOL;
                            break;

                        default:
                            if (RSyntaxUtilities.isDigit(c)) {
                                currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                                break;
                            }
                            else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                                currentTokenType = Token.IDENTIFIER;
                                break;
                            }

                            // Anything not currently handled - mark as an identifier
                            currentTokenType = Token.IDENTIFIER;
                            break;

                    } // End of switch (c).

                    break;

                case Token.WHITESPACE:

                    switch (c) {

                        case ' ':
                        case '\t':
                            break;   // Still whitespace.

                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        case '#':
                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.COMMENT_EOL;
                            break;

                        default:   // Add the whitespace token and start anew.

                            addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                            currentTokenStart = i;

                            if (RSyntaxUtilities.isDigit(c)) {
                                currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                                break;
                            }
                            else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                                currentTokenType = Token.IDENTIFIER;
                                break;
                            }

                            // Anything not currently handled - mark as identifier
                            currentTokenType = Token.IDENTIFIER;

                    } // End of switch (c).

                    break;

                default: // Should never happen
                case Token.IDENTIFIER:

                    switch (c) {

                        case ' ':
                        case '\t':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.WHITESPACE;
                            break;

                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        default:
                            if (RSyntaxUtilities.isLetterOrDigit(c) || c=='/' || c=='_') {
                                break;   // Still an identifier of some type.
                            }
                            // Otherwise, we're still an identifier (?).

                    } // End of switch (c).

                    break;

                case Token.LITERAL_NUMBER_DECIMAL_INT:

                    switch (c) {

                        case ' ':
                        case '\t':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.WHITESPACE;
                            break;

                        case '"':
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            currentTokenStart = i;
                            currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                            break;

                        default:

                            if (RSyntaxUtilities.isDigit(c)) {
                                break;   // Still a literal number.
                            }

                            // Otherwise, remember this was a number and start over.
                            addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                            i--;
                            currentTokenType = Token.NULL;

                    } // End of switch (c).

                    break;

                case Token.COMMENT_EOL:
                    i = end - 1;
                    addToken(text, currentTokenStart,i, currentTokenType, newStartOffset+currentTokenStart);
                    // We need to set token type to null so at the bottom we don't add one more token.
                    currentTokenType = Token.NULL;
                    break;

                case Token.LITERAL_STRING_DOUBLE_QUOTE:
                    if (c=='"') {
                        addToken(text, currentTokenStart,i, Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset+currentTokenStart);
                        currentTokenType = Token.NULL;
                    }
                    break;

            } // End of switch (currentTokenType).

        } // End of for (int i=offset; i<end; i++).

        switch (currentTokenType) {

            // Remember what token type to begin the next line with.
            case Token.LITERAL_STRING_DOUBLE_QUOTE:
                addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
                break;

            // Do nothing if everything was okay.
            case Token.NULL:
                addNullToken();
                break;

            // All other token types don't continue to the next line...
            default:
                addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
                addNullToken();

        }

        // Return the first token in our linked list.
        return firstToken;

    }

    @Override
    public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
        // This assumes all keywords, etc. were parsed as "identifiers."
        if (tokenType==Token.IDENTIFIER) {
            int value = wordsToHighlight.get(segment, start, end);
            if (value != -1) {
                tokenType = value;
            }
        }
        super.addToken(segment, start, end, tokenType, startOffset);
    }
}
