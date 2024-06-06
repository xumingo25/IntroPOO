package interfaz;

import entidad.Categoria;
import entidad.Cliente;
import entidad.Producto;

public class inicio {
    public static void main(String[] args) {
        //instanciando un objeto
        Categoria categoria1 = new Categoria(1,"Comida Chatarra");
        Producto producto2 = new Producto();

        Producto papasLays = new Producto("Papas Lays",10,categoria1,990,false);
        //new hace referencia a la acción de instanciar un objeto

        System.out.println("stock papas lays "+papasLays.getStock());

        Cliente ejemploCliente = new Cliente("Domingo",1000);

        ejemploCliente.comprar(papasLays);
        
    }
}
