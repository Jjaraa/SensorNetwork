/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Master
 */
public class NetworkTest {


@Test
public void Test1(){
Network prueba = new Network(1);

//Ingreso de sensores    
Sensor sensor1 = new Sensor(0,0,1);
Sensor sensor2 = new Sensor(0,1,2);
Sensor sensor3 = new Sensor(1,0,3);
Sensor sensor4 = new Sensor(1,1,4);

//Agregar al ArrayList
ArrayList<Sensor> sensores = new ArrayList<>();
prueba.agregarSensor(sensor1, sensores);
prueba.agregarSensor(sensor2, sensores);
prueba.agregarSensor(sensor3, sensores);
prueba.agregarSensor(sensor4, sensores);

    
int real = prueba.calcularMaximo(sensores);

    assertEquals(3, real);
}

@Test
public void Test2(){
Network prueba = new Network(20);

//Ingreso de sensores    
Sensor sensor1 = new Sensor(0,0,1);
Sensor sensor2 = new Sensor(0,2,2);
Sensor sensor3 = new Sensor(100,100,3);
Sensor sensor4 = new Sensor(100,110,4);
Sensor sensor5 = new Sensor(100,120,5);

//Agregar al ArrayList
ArrayList<Sensor> sensores = new ArrayList<>();
prueba.agregarSensor(sensor1, sensores);
prueba.agregarSensor(sensor2, sensores);
prueba.agregarSensor(sensor3, sensores);
prueba.agregarSensor(sensor4, sensores);
prueba.agregarSensor(sensor5, sensores);

    
int real = prueba.calcularMaximo(sensores);

    assertEquals(3, real);
}
    
}
