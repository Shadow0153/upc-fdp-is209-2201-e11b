package fpd.gcuatro.tf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;


public class TrabajoFinal {
    //Arreglos de productos
    static String[] productoCodigo = new String[7];
    static String[] productoDescripcion = new String[7];
    static float[] productoPrecio = new float[7];
    static int[] productoCantidadStock = new int[7];

    static LinkedList<String> productoCodigoPedido = new LinkedList<>();
    static LinkedList<String> productoDescripcionPedido = new LinkedList<>();
    static LinkedList<Integer> productoCantidadPedido = new LinkedList<>();
    static LinkedList<Float> productoPrecioPedido = new LinkedList<>();
    static LinkedList<Integer> productoDescuentoPedido = new LinkedList<>();

    static String tipoDocumentoIdentidad = "";
    static String numeroDocumentoIdentidad = "";

    public static void main (String[] args){
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("============FUNDAMENTOS DE PROGRAMACION===========");
        System.out.println("=================TRABAJO FINAL====================");
        System.out.println("==============CHRISTIAN CCASA ANCCANA=============");
        System.out.println("==============ANGELO LEON HUAMANI=================");
        System.out.println("==============VLADIMIR ANTAY RODAS================");
        System.out.println("===============JOEL BARRANTES COPA================");
        System.out.println("==================================================");
        System.out.println("");

        //Inicializar arreglos
        inicializar();

    }

    private static void registraPedidos() {
        Scanner scanner = new Scanner(System.in);
        int indiceCodigoProducto = -1;

        System.out.println("\tIngrese el codigo del producto");
        String codigoProductoPedido = scanner.next();

        for (int i = 0; i < productoCodigo.length; i++) {
            if (codigoProductoPedido.equalsIgnoreCase(productoCodigo[i])) {
                indiceCodigoProducto = i;
            }
        }

        if (indiceCodigoProducto > -1) {
            System.out.println("\tEl producto seleccionado es: " + productoDescripcion[indiceCodigoProducto]);
            System.out.println("\tEl precio unitario es : " + productoPrecio[indiceCodigoProducto]);

            System.out.println("\tIngrese la cantidad del pedido");
            int cantidadProductoPedido = scanner.nextInt();

            if (cantidadProductoPedido > 0) {
                if (cantidadProductoPedido <= productoCantidadStock[indiceCodigoProducto]) {
                    productoCodigoPedido.add(productoCodigo[indiceCodigoProducto]);
                    productoDescripcionPedido.add(productoDescripcion[indiceCodigoProducto]);
                    productoCantidadPedido.add(cantidadProductoPedido);
                    System.out.println("\tPedido registrado");

                    System.out.println("\tDesea ingresar descuento? SI / NO");
                    String tieneDescuento = scanner.next();

                    float precio = productoPrecio[indiceCodigoProducto] * cantidadProductoPedido;
                    int porcentajeDescuento = 0;

                    if (tieneDescuento.equalsIgnoreCase("SI")) {
                        System.out.println("\tIngrese el porcentaje de descuento");
                        porcentajeDescuento = scanner.nextInt();

                        float descuento = (precio * porcentajeDescuento) / 100;

                        productoPrecioPedido.add(precio - descuento);
                        System.out.println("\tEl descuento es de: " + descuento);
                        productoDescuentoPedido.add(porcentajeDescuento);

                    } else {
                        productoPrecioPedido.add(precio);
                        productoDescuentoPedido.add(porcentajeDescuento);
                    }


                } else {
                    System.out.println("\tNo se disponen de suficientes unidades para atender el pedido...");
                }
            } else {
                System.out.println("\tLa cantidad ingresada debe ser mayor a 0 unidades...");
            }

        } else {
            System.out.println("\tEl codigo ingresado no es valido...");
        }
    }
    private static void verPedidos() {
        System.out.println("");
        System.out.println("");
        System.out.println("====================================================================================================");
        System.out.println("====================================================================================================");
        String CodigoPedido = "P2022" + String.format("%05d", 1);
        System.out.println("PERU FARMA\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        float totalPrecioPedido = 0;
        System.out.println("El codigo de pedido es             : " + CodigoPedido);
        System.out.println("Tipo Documento Identidad Cliente   : " + tipoDocumentoIdentidad);
        System.out.println("Numero Documento Identidad Cliente : " + numeroDocumentoIdentidad);

        System.out.println("====================================================================================================");
        System.out.println("Item" + "\t" + "Codigo" + "\t" + "Descripcion" + "\t\t\t\t\t\t\t\t" + "Cantidad" + "\t\t" + "% Descuento" + "\t\t" + "Precio");

        for (int i = 0; i < productoCodigoPedido.size(); i++) {
            System.out.println((i + 1) + "\t\t" + productoCodigoPedido.get(i) + "\t" + productoDescripcionPedido.get(i) + "\t\t" + productoCantidadPedido.get(i) + "\t\t\t\t" + productoDescuentoPedido.get(i) + "%\t\t\t\t" + String.format("%.2f", productoPrecioPedido.get(i)));
            totalPrecioPedido += productoPrecioPedido.get(i);
        }
        System.out.println("====================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTOTAL:");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + String.format("%.2f", totalPrecioPedido) + " SOLES");
        System.out.println("====================================================================================================");
        System.out.println("====================================================================================================");

        System.out.println("");
        System.out.println("");
    }

    private static void inicializar() {
        //Codigos
        productoCodigo[0] = "P00152";
        productoCodigo[1] = "P00015";
        productoCodigo[2] = "P00123";
        productoCodigo[3] = "P00076";
        productoCodigo[4] = "P00194";
        productoCodigo[5] = "C00010";
        productoCodigo[6] = "C00215";

        //Descripciones
        productoDescripcion[0] = "Amoxicilina Blister x 10 unidades";
        productoDescripcion[1] = "Penicilina Caja x 1 Unidad       ";
        productoDescripcion[2] = "Prednisolona Frasco x 1 unidad   ";
        productoDescripcion[3] = "Ibuprofeno Frasco x 1 unidad     ";
        productoDescripcion[4] = "Sulfato Ferroso Frasco x 1 unidad";
        productoDescripcion[5] = "Cubrebocas Caja x 10 unidades    ";
        productoDescripcion[6] = "Guantes Caja x 100 unidades      ";

        //Precios
        productoPrecio[0] = 2.30f;
        productoPrecio[1] = 17.80f;
        productoPrecio[2] = 28.00f;
        productoPrecio[3] = 13.00f;
        productoPrecio[4] = 24.40f;
        productoPrecio[5] = 9.90f;
        productoPrecio[6] = 43.20f;

        //Precios
        productoCantidadStock[0] = 80;
        productoCantidadStock[1] = 50;
        productoCantidadStock[2] = 120;
        productoCantidadStock[3] = 70;
        productoCantidadStock[4] = 30;
        productoCantidadStock[5] = 40;
        productoCantidadStock[6] = 10;
    }
}
