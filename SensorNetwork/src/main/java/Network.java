
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Network {
    double d;
    ArrayList<Sensor> sensores = new ArrayList<>();
    ArrayList<int[]> subconjuntos = new ArrayList<>();
    
    /**
     * EL constructor pide como parámetro la distancia máxima de comunicación entre sensores.
     * @param d 
     */
    public Network(double d){
        this.d = d;        
    }
    
    /**
     * Método que crea una circunferencia con un sensor como centro.
     * @param sensor
     * @return 
     */
    private Circunferencia crearCircunferencia(Sensor sensor){
        Circunferencia circulo = new Circunferencia(this.d,sensor.getCoordenadaX(),sensor.getCoordenadaY());
        return circulo;
    }
    
    /**
     * Método para agregar un sensor al arraylist de sensores.
     * @param sensor
     * @param sensores 
     */
    public void agregarSensor(Sensor sensor, ArrayList<Sensor> sensores){
        sensores.add(sensor);
    }

    /**
     * Método que calcula si un sensor se encuentra dentro de la cincunferencia.
     * @param circulo
     * @param sensor
     * @return 
     */
    private boolean inCirculo(Circunferencia circulo, Sensor sensor){
        double variableX = sensor.getCoordenadaX()-circulo.getCoordenadaX();
        double variableY = sensor.getCoordenadaY()-circulo.getCoordenadaY();
        double ecuacion = Math.pow(variableX, 2)+Math.pow(variableY, 2);
        if(ecuacion<=Math.pow(d, 2)){
            return true;
        }   
        else{
            return false;
        }
    }
    
    /**
     * Método que calcula el subconjunto de sensores que se conectan con un sensor en específico
     * @param sensores
     * @param sensor
     * @return 
     */
    public int[] calcularSubconjunto(ArrayList<Sensor> sensores, Sensor sensor){
        Circunferencia circulo = crearCircunferencia(sensor);
        ArrayList<Sensor> subconjunto = new ArrayList<>();
        boolean in = false;
        for(Sensor item:sensores){
            in = inCirculo(circulo,item);
            if(in){
                subconjunto.add(item);
            }
        } 
        int[] subIndices = mostrarSubconjunto(subconjunto);
        this.subconjuntos.add(subIndices);
        return subIndices;
    }
    
    /**
     * Método que retorna un arreglo de int con los subindices del subconjunto.
     * @param subconjunto
     * @return 
     */
    private int[] mostrarSubconjunto(ArrayList<Sensor> subconjunto){
        int[] subIndices = new int[subconjunto.size()];
        int contador = 0;
        for(Sensor item:subconjunto){
            subIndices[contador]= item.getSubIndice();
            contador++;
        }
        return subIndices;
    }
    
    /**
     * Método que compara todos los subconjuntos, y retorna el tamaño de subconjuntos mayor.
     * @param sensores
     * @return 
     */
    public int calcularMaximo(ArrayList<Sensor> sensores){
        int[] cantidadSubconjuntos = new int[sensores.size()];
        int contador = 0;
        int contadorSubconjuntos = 0;
        for(Sensor item:sensores){
            cantidadSubconjuntos[contador] = calcularSubconjunto(sensores, item).length;           
            contador++;
        }
        int max= cantidadSubconjuntos[0];
        for(int i=0;i<cantidadSubconjuntos.length;i++){
            if(max<=cantidadSubconjuntos[i]){
                max = cantidadSubconjuntos[i];
                contadorSubconjuntos = i;
            }
        }
        mostrarValores(this.subconjuntos.get(contadorSubconjuntos));
        return max;
    }
    
    /**
     * Método que imprime las salidas de la solucion.
     * Primera linea: el tamaño del subconjunto máximo de sensores.
     * Segunda linea: los subíndices de los sensores del subconjunto máximo.
     * @param subIndices 
     */
    public void mostrarValores(int[] subIndices){
        System.out.println(subIndices.length);
        for(int i=0;i<subIndices.length;i++){
        System.out.print(subIndices[i]+" ");
        }
        System.out.println("");
    }
    
}

