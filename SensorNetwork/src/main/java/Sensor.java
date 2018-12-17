
public class Sensor extends Punto {
    private int subIndice;
    
    public Sensor(double x, double y, int subIndice){
        super(x,y);
        this.subIndice = subIndice;
    }
    
    public int getSubIndice(){
        return this.subIndice;
    }
    
    public void setSubIndice(int subIndice){
        this.subIndice = subIndice;
    }
}
