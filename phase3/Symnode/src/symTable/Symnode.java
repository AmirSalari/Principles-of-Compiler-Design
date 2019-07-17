/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package symTable;

import java.util.ArrayList;

/**
 *
 * @author Shiva
 */
public class Symnode {

    public Symnode bwPtr;
    public int header;
    public ArrayList<SymNodeObject> objects ;

    public Symnode(Symnode bwPtr, int header) {
        this.bwPtr = bwPtr;
        this.header = header;
        this.objects = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
