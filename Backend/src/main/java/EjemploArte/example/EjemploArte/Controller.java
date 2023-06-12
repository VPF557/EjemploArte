package EjemploArte.example.EjemploArte;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;

@RestController
public class Controller {

    @GetMapping("/Obras")
    public ArrayList<Obras> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Obras> lista = reader.LeerFicheroJson1("Obras.json");
        //Mostramos los elementos leidos
        return lista;
    }
/*
    @PostMapping("/CriptoA")
    public ArrayList<Criptomoneda> create(@RequestBody Criptomoneda objeto1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.AnadirObjeto1(objeto1,"Criptomonedas.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }

    @DeleteMapping("/CriptoB{id}")
    public ArrayList<Criptomoneda> Borrar(@RequestParam int id)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.EliminarObjeto(id,"Criptomonedas.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
 */
}
