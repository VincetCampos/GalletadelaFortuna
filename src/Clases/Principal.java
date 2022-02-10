package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private List<GalletasdelaFortuna> listaGalletas = new ArrayList<>();

    public static void main(String[] args) {
        Principal funciones = new Principal();
        Scanner entrada = new Scanner (System.in);
        String selec;

        funciones.definirGalletas();

        System.out.println("Bienvenido a la tienda de la Galletas de la Fortuna");
        System.out.println("Hoy estamos regalando algunas");
        System.out.println("Pruebe su fortuna presionando enter");
        entrada.nextLine();

        do {
            int numero = (int) (Math.random()*5+1);
            for (GalletasdelaFortuna galletasdelaFortuna : funciones.listaGalletas)
            {
                if (galletasdelaFortuna.getNoGalleta()==numero){
                    System.out.println(galletasdelaFortuna.getDefGalleta());
                }
            }

            System.out.println("Quiere intentarlo de nuevo?");
            System.out.println("1. Si");
            System.out.println("Presione otra tecla para salir");
            selec = entrada.nextLine();

        }while (selec.equals("1"));

    }

    public void definirGalletas(){
        GalletasdelaFortuna galletasdelaFortuna1 = new GalletasdelaFortuna();

        galletasdelaFortuna1.setNoGalleta(1);
        galletasdelaFortuna1.setDefGalleta("El amor y la tos, no se pueden ocultar");
        listaGalletas.add(galletasdelaFortuna1);

        GalletasdelaFortuna galletasdelaFortuna2 = new GalletasdelaFortuna();

        galletasdelaFortuna2.setNoGalleta(2);
        galletasdelaFortuna2.setDefGalleta("Sera mejor no salir mañana");
        listaGalletas.add(galletasdelaFortuna2);

        GalletasdelaFortuna galletasdelaFortuna3 = new GalletasdelaFortuna();

        galletasdelaFortuna3.setNoGalleta(3);
        galletasdelaFortuna3.setDefGalleta("Con esta galleta la Fortuna se puso de su lado");
        listaGalletas.add(galletasdelaFortuna3);

        GalletasdelaFortuna galletasdelaFortuna4 = new GalletasdelaFortuna();

        galletasdelaFortuna4.setNoGalleta(4);
        galletasdelaFortuna4.setDefGalleta("Error al cargar por favor intentelo mas tarde");
        listaGalletas.add(galletasdelaFortuna4);

        GalletasdelaFortuna galletasdelaFortuna5 = new GalletasdelaFortuna();

        galletasdelaFortuna5.setNoGalleta(5);
        galletasdelaFortuna5.setDefGalleta("Lo malo es que no puedes comerte la galleta :(");
        listaGalletas.add(galletasdelaFortuna5);
    }

}
