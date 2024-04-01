package parse;

public enum Token {
    EOF("End-of-file"),
    PLUS("OO0O"),
    MINUS("O0oo"),
    TIMES("OO0o"),
    DIVIDE("O0o0"),
    LPAREN("OOOO"),
    RPAREN("OOO0"),
    LBRAKET("OoOoO"),
    RBRAKET("OoOOo"),
    SEMICOLON("0oO0"),
    COLON("0oOO"),
    COMMA("OO00"),
    ASSIGN("0o0O"),
    EQ("0o0O0o0O"),
    NEQ("Oo0o0o0O"),
    LT("0o0o"),
    LE("0o0o0o0O"),
    GT("0o00"),
    GE("0o000o0O"),
    AND("OOo0OOo0"),
    OR("OOO0OOOO0O"),
    KW_STDOUT("00000"),


    ILLEGAL("Illegal");


    private String name;

    Token(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}