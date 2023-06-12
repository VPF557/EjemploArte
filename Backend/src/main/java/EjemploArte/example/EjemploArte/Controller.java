package EjemploArte.example.EjemploArte;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;

@RestController
public class Controller {

    @GetMapping("/Arte")
    public ArrayList<Obras> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Obras> lista = reader.LeerFicheroJson1("Arte.json");
        //Mostramos los elementos leidos
        return lista;
    }

    @PostMapping("/ArteA")
    public ArrayList<Obras> create(@RequestBody Obras objeto1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Obras> lista;
        lista = dataHanding.AnadirObjeto1(objeto1,"Arte.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
//hecho
    @DeleteMapping("/Arte{id}")
    public ArrayList<Obras> Borrar(@RequestParam int id)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Obras> lista;
        lista = dataHanding.EliminarObjeto(id,"Arte.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }

}
