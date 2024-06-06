package entidad;

//Una clase en java es un molde para crear objetos
//un objeto es una instancia de una clase
public class Producto {
    //atributos
    private String nombre; //papas lays
    // ¿Como acceso al valor y le modifico el valor?
    //Accesadores y mutadores
    //getters & Setters (Métodos)
    private int stock; //10
    private Categoria categoria; //{1,comida chatarra}
    private int precio;
    private boolean tieneDescuento;



    public void disminuirStockEn1(){
        stock--;
    }

    public void aplicarDescuento25PorCiento(){
        if(tieneDescuento){
            precio = (int) (precio * 0.75);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public Producto() {
    }

    public Producto(String nombre, int stock, Categoria categoria, int precio, boolean tieneDescuento) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
        this.tieneDescuento = tieneDescuento;
    }
}
