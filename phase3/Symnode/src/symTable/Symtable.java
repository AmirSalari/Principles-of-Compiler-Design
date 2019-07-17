package symTable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shiva
 */
public class Symtable {
    public Symnode startNode; 
    public Symnode mktable(Symnode previous){
        if (previous!=null)
            startNode=new Symnode(null, 0 );
        Symnode node =new Symnode(previous, 0);
        return node;
    }
    public void enter(Symnode table, String name,String type,int offset){
        SymNodeObject sno=new SymNodeObject(name, null, true, type,offset);
        table.objects.add(sno);
    }
    public void addWidth(Symnode table,int width){
        table.header=width;
    }
    public void enterProc(Symnode table, String name, Symnode newtable){
        SymNodeObject proc =new SymNodeObject(name, newtable, false, "proc", 0);
        table.objects.add(proc);
    }
    
}
