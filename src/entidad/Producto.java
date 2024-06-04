package entidad;

//Una clase en java es un molde para crear objetos
//un objeto es una instancia de una clase
public class Producto {
    //atributos
    public String nombre; //papas lays
    public int stock; //10
    public Categoria categoria; //{1,comida chatarra}
    public int precio;
    public boolean tieneDescuento;

    public void disminuirStockEn1(){
        stock--;
    }

    public void aplicarDescuento25PorCiento(){
        if(tieneDescuento){
            precio = (int) (precio * 0.75);
        }
    }

}
