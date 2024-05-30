package interfaz;

import entidad.Categoria;
import entidad.Producto;

public class inicio {
    public static void main(String[] args) {
        //instanciando un objeto
        Categoria categoria1 = new Categoria();
        Producto producto2 = new Producto();



        char caracter = 'h';


        //asignarle valores a sus caracteristicas
        categoria1.idCategoria = 1;
        categoria1.nombreCategoria = "Comida Chatarra";

        Producto papasLays = new Producto();

        papasLays.nombre = "Papas Lays";
        papasLays.categoria =categoria1;
        papasLays.precio = 990;
        papasLays.tieneDescuento= false;
        papasLays.stock=10;


        Categoria categoria2 = new Categoria();
        categoria2.idCategoria = 2;
        categoria2.nombreCategoria = "Ensalada";

        System.out.println("Valor objeto categoria: "+ categoria1);

        System.out.println("id de categoria: "+categoria1.idCategoria);

        producto2.nombre = "ensalada cesar";
        producto2.categoria = categoria2;
        producto2.stock = 3;
        producto2.precio = 4990;
        producto2.tieneDescuento = true;
    }
}
