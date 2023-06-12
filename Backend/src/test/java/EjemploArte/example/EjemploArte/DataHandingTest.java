package EjemploArte.example.EjemploArte;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataHandingTest {

    @Test
    public void anadirObjeto1()
    {
        DataHanding data =  new DataHanding();
        Obras pr1 = new Obras(0,"Nuevo cuadro",129.36,85,"cuadro","Media");
        LeerJson reader = new LeerJson();
        ArrayList<Obras> listaAux = new ArrayList<Obras>();
        listaAux = data.AnadirObjeto1(pr1,"Arte.json");

        int comprobacion;

        comprobacion = data.ComprobarObjeto(pr1,listaAux);

        if (comprobacion == 1)
        {
            assertTrue(true);
        }
        else
        {
            fail("No se ha añadido correctamente");
        }
    }

    @Test
    public void eliminarObjeto()
    {
    }

    @Test
    public void comprobarObjeto()
    {
        DataHanding data =  new DataHanding();
        Obras pr1 = new Obras(0,"Nuevo cuadro",129.36,85,"cuadro","Media");
        assertEquals(pr1.getNombre(),"SuperCoin");
        assertEquals(pr1.getValor(),129, 0.001);
        assertEquals(pr1.getEdad(),78.36, 0.001);
        assertEquals(pr1.getCategoria(),"Terciaria");
        assertEquals(pr1.getPopularidad(),"Media");
    }
}