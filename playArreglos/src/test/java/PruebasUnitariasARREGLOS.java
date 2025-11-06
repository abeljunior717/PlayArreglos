

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.playarreglos.*;

/**
 *
 * @author abel
 */
public class PruebasUnitariasARREGLOS {
    
    public PruebasUnitariasARREGLOS() {
    }
    
    private OperacionesArreglos opa;
    @BeforeEach
    public void setUp() {
        opa=new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void PreubaSuma1 (){
        float [] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void Pruebasuma2nulo(){
        float [] entrada= null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void PruebaPromedio1() {
        float[] entrada = {5f, 10f, 15f};
        float salidaEsperada = 10f;

        float salidaReal = opa.calcularPromedio(entrada);

        assertEquals(salidaEsperada, salidaReal, 0.0001f);
    }

    @Test
    public void PruebaPromedio2_Nulo() {
        float[] entrada = null;
        float salidaEsperada = 0f;

        float salidaReal = opa.calcularPromedio(entrada);

        assertEquals(salidaEsperada, salidaReal, 0.0001f);
    }
    // PRUEBAS PARA contarMayoresQue()
    @Test
    public void PruebaContarMayoresQue1() {
        float[] entrada = {12f, 45f, 3.5f, 60f, 25f};
        float limite = 20f;
        int salidaEsperada = 3;

        int salidaReal = opa.contarMayoresQue(entrada, limite);

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void PruebaContarMayoresQue2_Nulo() {
        float[] entrada = null;
        float limite = 10f;
        int salidaEsperada = 0;

        int salidaReal = opa.contarMayoresQue(entrada, limite);

        assertEquals(salidaEsperada, salidaReal);
    }
    // PRUEBAS PARA invertirArreglo()
    
    @Test
    public void PruebaInvertirArreglo1() {
        float[] entrada = {2f, 1f, 9f, 6f};
        float[] salidaEsperada = {6f, 9f, 1f, 2f};

        float[] salidaReal = opa.invertirArreglo(entrada);

        assertArrayEquals(salidaEsperada, salidaReal, 0.0001f);
    }

    @Test
    public void PruebaInvertirArreglo2_UnElemento() {
        float[] entrada = {7f};
        float[] salidaEsperada = {7f};

        float[] salidaReal = opa.invertirArreglo(entrada);

        assertArrayEquals(salidaEsperada, salidaReal, 0.0001f);
    }
    // PRUEBAS PARA obtenerAbsolutos()
    // --------------------------------------------------
    @Test
    public void PruebaObtenerAbsolutos1() {
        float[] entrada = {2f, -3f, -4f, 5f};
        float[] salidaEsperada = {2f, 3f, 4f, 5f};

        float[] salidaReal = opa.obtenerAbsolutos(entrada);

        assertArrayEquals(salidaEsperada, salidaReal, 0.0001f);
    }

    @Test
    public void PruebaObtenerAbsolutos2_TodosNegativos() {
        float[] entrada = {-1f, -2f, -3f};
        float[] salidaEsperada = {1f, 2f, 3f};

        float[] salidaReal = opa.obtenerAbsolutos(entrada);

        assertArrayEquals(salidaEsperada, salidaReal, 0.0001f);
    }
}
