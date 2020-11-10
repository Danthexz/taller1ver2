import java.util.Random;
public class Carrito {
    public Carrito() {
    }
    private int crearCantidadProducto ( ) {
        Random azar = new Random();
        int cantidad=0;
         cantidad = azar.nextInt(15);
        return cantidad;
    }


    private int crearLargoCarrito() {
        Random azar = new Random();
        int largo = azar.nextInt(20);
        return largo;
    }

    private int[] crearLugares(int largo) {
        int[] lugares = new int[largo];
        for (int i = 0; i < largo; i++) {
            lugares[i] = i + 1;
        }
        return lugares;
    }

    public int[] crearValores() {
        int largoArray = this.crearLargoCarrito();
        int[] valores = new int[largoArray];
        valores[0] = 500;
        for (int i = 0; i < largoArray; i++) {
            valores[i] = ((i+1) * 150) + valores[0];
        }
        return valores;
    }

    private int[] crearCantidades(int largo) {
        int[] cantidades = new int[largo];
        for (int i = 0; i < largo; i++) {
            cantidades[i] =this.crearCantidadProducto();
        }
        return cantidades;
    }

    private void mostrarCantidadProductos(){
        System.out.println("El carrito contiene"+this.crearCantidadProducto()+"productos");
        }


    private void mostrarValorTotal(int []valores ){
        int valorTotal=0;
        int cantidad=0;

        for (int i = 0; i < valores.length; i++) {
            cantidad=this.crearCantidadProducto();
            valorTotal =valorTotal+(valores[i]*cantidad);
        }
        System.out.println("El valor total es"+valorTotal);
    }

    private void mostrarDetalle(int []valores){
        int valorTotal=0;
        int cantidad=0;
        for (int i = 0; i < valores.length; i++) {
            cantidad=this.crearCantidadProducto();
            valorTotal =valorTotal+(valores[i]*cantidad);
            System.out.println("Cantidad producto ["+i+"]:"+cantidad+", Subtotal:"+valorTotal);

        }
        System.out.println("El valor total es"+valorTotal);

        ;
    }

    }




