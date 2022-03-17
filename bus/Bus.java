
package cz.tul.agp1.thurs.bus;


public class Bus {
    private int nSedadlo;
    private int nCestujuci;
    private int nLinka;
    private String spolocnost;
    
    public Bus(){
        this(40,0,0,"");
    }

    public Bus(int nSedadlo, int nCestujuci, int nLinka, String spolocnost) {
        this.nSedadlo = nSedadlo;
        this.nCestujuci = nCestujuci;
        this.nLinka = nLinka;
        this.spolocnost = spolocnost;
    }

    public int getnSedadlo() {
        return nSedadlo;
    }

    public int getnCestujuci() {
        return nCestujuci;
    }

    public int getnLinka() {
        return nLinka;
    }

    public String getSpolocnost() {
        return spolocnost;
    }


    public void setnLinka(int nLinka) {
        this.nLinka = nLinka;
    }

    public void setSpolocnost(String spolocnost) {
        this.spolocnost = spolocnost;
    }
    
    public void vystupenieAll(){
        this.nCestujuci = 0;
    }
    public void nastupenie(int n){
        this.nCestujuci += n;
    }
    
    public void vystupenie(int n){
        this.nCestujuci -= n;
    }
    
    public void info(){
        System.out.println("Autobus c." + this.nLinka + " spolocnosti " + this.spolocnost + " s poctom sedadiel " + this.nSedadlo + " vezie " + this.nCestujuci + " pasazierov.");
    }
    
}
