package entidad;

public class Cliente {

    //Atributos
    public String nombre; //Domingo
    public int saldoEfectivo; //3000

    //Métodos
    public void comprar(Producto producto){ //argumento
        if(producto.stock<=0){
            System.out.println("Producto sin stock :/");
        }else if(saldoEfectivo<producto.precio){
            System.out.println("No me alcanza :/");
        }else{
            System.out.println("Tengo $"+saldoEfectivo);
            producto.aplicarDescuento25PorCiento();
            System.out.println("voy a comprar un "+ producto.nombre + "que vale $"+producto.precio);
            saldoEfectivo = saldoEfectivo - producto.precio;
            producto.disminuirStockEn1();
        }
    }
}
