
public class Circunferencia extends Punto {
    private double radio;    
    
    public Circunferencia(double radio, double x, double y){
        super(x,y);
        this.radio = radio;
        
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    
    
}
    
