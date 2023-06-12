package EjemploArte.example.EjemploArte;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class EjemploArteApplicationTests {
//fin
	@Test
	void contextLoads()
	{
	}
	@Test
	public void anadirObjeto1()
	{
		DataHanding data =  new DataHanding();
		Obras pr1 = new Obras(0,"Nuevo cuadro",129.36,85,"cuadro","Media");
		LeerJson reader = new LeerJson();
		ArrayList<Obras> listaAux = new ArrayList<Obras>();
		listaAux = data.AnadirObjeto1(pr1,"Arte.json");

		int comprobacion;

		comprobacion = data.ComprobarObjeto(pr1,"Arte.json",listaAux);

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
		DataHanding data = new DataHanding();
		ArrayList<Obras> listaAux= new ArrayList<Obras>();
		Obras pr1 = new Obras(0,"Nuevo cuadro",129.36,85,"cuadro","Media");
		listaAux = data.EliminarObjeto(pr1.getId(),"Arte.json");

		if(data.ComprobarObjeto(pr1,"Arte.json",listaAux) == 0)
		{
			assertTrue(true);
		}
		else
		{
			fail("No se ha eliminado correctamente");
		}
	}

	@Test
	public void comprobarObjeto()
	{
		DataHanding data =  new DataHanding();
		Obras pr1 = new Obras(0,"Nuevo cuadro",129.36,85,"cuadro","Media");
		assertEquals(pr1.getNombre(),"Nuevo cuadro");
		assertEquals(pr1.getValor(),129.36, 0.001);
		assertEquals(pr1.getEdad(),85, 0.001);
		assertEquals(pr1.getCategoria(),"cuadro");
		assertEquals(pr1.getPopularidad(),"Media");
	}

}
