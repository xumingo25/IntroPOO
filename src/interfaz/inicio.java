package interfaz;

import entidad.Categoria;
import entidad.Cliente;
import entidad.Producto;

public class inicio {
    public static void main(String[] args) {
        //instanciando un objeto
        Categoria categoria1 = new Categoria();
        Producto producto2 = new Producto();

        //asignarle valores a sus caracteristicas
        categoria1.idCategoria = 1;
        categoria1.nombreCategoria = "Comida Chatarra";

        Producto papasLays = new Producto();

        papasLays.nombre = "Papas Lays";
        papasLays.categoria =categoria1;
        papasLays.precio = 990;
        papasLays.tieneDescuento= false;
        papasLays.stock=10;

        Cliente ejemploCliente = new Cliente();
        ejemploCliente.nombre = "Domingo";
        ejemploCliente.saldoEfectivo = 1000;

        ejemploCliente.comprar(papasLays);



    }
}
