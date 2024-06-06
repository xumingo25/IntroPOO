package entidad;

public class Cliente {

    //Atributos
    private String nombre; //Domingo
    private int saldoEfectivo; //3000

    //Métodos
    public void comprar(Producto producto){ //argumento
        if(producto.getStock()<=0){
            System.out.println("Producto sin stock :/");
        }else if(saldoEfectivo<producto.getPrecio()){
            System.out.println("No me alcanza :/");
        }else{
            System.out.println("Tengo $"+saldoEfectivo);
            producto.aplicarDescuento25PorCiento();
            System.out.println("voy a comprar un "+ producto.getNombre() + "que vale $"+producto.getPrecio());
            saldoEfectivo = saldoEfectivo - producto.getPrecio();
            producto.disminuirStockEn1();
        }
    }

    public Cliente(String nombre, int saldoEfectivo) {
        this.nombre = nombre;
        this.saldoEfectivo = saldoEfectivo;
    }

    public Cliente() {
    }
}
