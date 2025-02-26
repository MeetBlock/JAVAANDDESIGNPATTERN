package DesignPattern;

public class DbConn {
    private int nocon;
    private final int limit = 10;

    private static DbConn instance;

    private DbConn(int nocon){
        this.nocon = nocon;
    }

    public static DbConn getDbconnObject(){
        if(instance == null){
            instance = new DbConn(0);
        }
        return instance;
    }

    public int getNocon(){
        return this.nocon;
    }

    public boolean connect(){
        if(nocon < limit){
            nocon++;
            return true;
        }else{
            return false;
        }
    }
}
