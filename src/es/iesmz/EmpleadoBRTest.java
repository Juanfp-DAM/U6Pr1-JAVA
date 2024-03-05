package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpleadoBRTest {

    @Test
    public  void testCalculaSalarioBruto1() {
        float resultadoReal= EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
        float resultadoEsperado=1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @org.junit.jupiter.api.Test
    public void calculaSalarioBruto2() {
        float resultadoReal=EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor,1500.0f,3);
        float resultadoEsperado=1260;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }


    @Test
    public void testCalculaSalarioBruto3(){
        float resultadoReal=EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0);
        float resultadoEsperado=1100;
        assertEquals(resultadoEsperado,resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioBruto4(){
        float resultadoReal=EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado,1250.0f,8);
        float resultaodEsperado=1760;
        assertEquals(resultaodEsperado,resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioBruto5(){
        float resultadoReal=EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado,1000.0f,0);
        float resultaodEsperado=1600;
        assertEquals(resultaodEsperado,resultadoReal,0.01);
    }

}