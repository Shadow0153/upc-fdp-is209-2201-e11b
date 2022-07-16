package fpd.gcuatro.tf;

import java.util.LinkedList;

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
