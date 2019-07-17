/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package symTable;

/**
 *
 * @author Shiva
 */
class SymNodeObject {
    public String lexeme;
    public Symnode fwPtr;
    public boolean isVar;
    public String type;
    public int offset;// need this??

    public SymNodeObject(String lexeme, Symnode fwPtr, boolean isVar, String type, int offset) {
        this.lexeme = lexeme;
        this.fwPtr = fwPtr;
        this.isVar = isVar;
        this.type = type;
        this.offset = offset;
    }

    
}
