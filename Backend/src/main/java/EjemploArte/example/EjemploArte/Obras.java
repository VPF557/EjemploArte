package EjemploArte.example.EjemploArte;

public class Obras
{
    private int id;
    private String nombre;
    private double valor;
    private int edad;
    private String categoria;
    private String popularidad;

    public Obras(int id, String nombre, double valor, int edad, String categoria, String popularidad) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.edad = edad;
        this.categoria = categoria;
        this.popularidad = popularidad;
    }

    public Obras() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
                ", edad=" + edad +
                ", categoria='" + categoria + '\'' +
                ", popularidad='" + popularidad + '\'' +
                '}';
    }
}
