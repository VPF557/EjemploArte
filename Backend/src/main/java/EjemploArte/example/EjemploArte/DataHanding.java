package EjemploArte.example.EjemploArte;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Obras> AnadirObjeto1(Obras objeto1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Obras> listaAux = reader.LeerFicheroJson1(ruta);
        objeto1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(objeto1);
        return listaAux;
    }

    public ArrayList<Obras> EliminarObjeto (int id, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Obras> listaAux = reader.LeerFicheroJson1(ruta);
        for (int i = 0; i < listaAux.size() ; i++ )
        {
            if(listaAux.get(i).getId() == id)
            {
                listaAux.remove(i);
            }
        }
        return listaAux;
    }

    public int ComprobarObjeto(Obras objeto1, String ruta , ArrayList<Obras> listaAux)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        int control = 0;

        for (int i = 0; i < listaAux.size(); i++)
        {
            if
            (       objeto1.getNombre().equals(listaAux.get(i).getNombre()) &&
                    objeto1.getValor() ==  listaAux.get(i).getValor() &&
                    objeto1.getEdad() == listaAux.get(i).getEdad() &&
                    objeto1.getCategoria().equals(listaAux.get(i).getCategoria()) &&
                    objeto1.getPopularidad().equals(listaAux.get(i).getPopularidad())
            )
            {
                control = 1;
            }
            else
            {
                control = 0;
            }

        }
        return control;
    }



}
