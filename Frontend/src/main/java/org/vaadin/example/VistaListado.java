package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class VistaListado extends VerticalLayout {
    ArrayList<Obras> listaPacientes = new ArrayList<>();
    public VistaListado()
    {

    }
    public void mostrar()
    {
        removeAll();
        HorizontalLayout horizontal= new HorizontalLayout();
        ArrayList<Obras> listaTweets = new ArrayList<>();
        ArrayList<Obras> listaAux = new ArrayList<>();

        Grid<Obras> grid = new Grid<>(Obras.class, false);
        grid.addColumn(Obras::getNombre).setHeader("Nombre");
        grid.addColumn(Obras::getValor).setHeader("Valor");
        grid.addColumn(Obras::getAño).setHeader("Año");
        grid.addColumn(Obras::getCategoria).setHeader("Categoria");
        grid.addColumn(Obras::getPopularidad).setHeader("Popularidad");

        GridContextMenu<Obras> menu = grid.addContextMenu();
        menu.setOpenOnClick(true);
        menu.addItem("Delete", event ->
        {
            DataService.eliminarTweet(event.getItem().get(),listaAux);
        });
        grid.setAllRowsVisible(true);
        this.add(grid);
        add(horizontal);

       try {
            listaTweets = DataService.getProductos(listaTweets);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        grid.setItems(listaTweets);

        this.add(horizontal,grid);
    }

}