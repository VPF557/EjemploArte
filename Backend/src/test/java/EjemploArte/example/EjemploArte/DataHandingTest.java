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
        ArrayList<Obras> listaAux = reader.LeerFicheroJson1("Arte.json");
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
        Criptomoneda pr1 = new Criptomoneda(0,"SuperCoin",129,78.36,"Terciaria","Media");
        assertEquals(pr1.getNombre(),"SuperCoin");
        assertEquals(pr1.getValor(),129, 0.001);
        assertEquals(pr1.getFluctuacion(),78.36, 0.001);
        assertEquals(pr1.getCategoria(),"Terciaria");
        assertEquals(pr1.getPopularidad(),"Media");
    }
}