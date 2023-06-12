package org.vaadin.example;

public class Obras
{
    private int id;
    private String nombre;
    private double valor;
    private int ano;
    private String categoria;
    private String popularidad;

    public Obras(int id, String nombre, double valor, int ano, String categoria, String popularidad) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.ano = ano;
        this.categoria = categoria;
        this.popularidad = popularidad;
    }

    public Obras() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAño() {
        return ano;
    }

    public void setAño(int año) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Obras{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", ano=" + ano +
                ", categoria='" + categoria + '\'' +
                ", popularidad='" + popularidad + '\'' +
                '}';
    }

    public String mostrarJson()
    {
        return "{\n" +
                "\"id\": " + id  +  ",\n" +
                "\"nombre\": " + "\"" + nombre + "\"," + "\n" +
                "\"valor\": " + valor  +  ",\n" +
                "\"ano\": " + ano  +  ",\n" +
                "\"categoria\": " + "\"" + categoria + "\"," + "\n" +
                "\"popularidad\": " + "\"" + popularidad + "\"" + "\n" +
                "}";
    }
}
