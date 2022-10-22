package ScanerRedes.ConsoleMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu {
    //La clase ConsoleMenu debe mantener una lista de objetos de tipo MenuOption. TIP: Use un
    //ArrayList de Java.
    ArrayList<MenuOption> listOptions =  new ArrayList<>();

    //La clase ConsoleMenu debe implementar un método llamado anadirOpcion() para añadir
    //opciones al menú. P. Ej.: public void anadirOpcion(MenuOption op).
    public void addOption(MenuOption op){
        listOptions.add(op);
    }


    /*La clase ConsoleMenu debe Implementar un método llamado lanzarMenu() que, dentro de
    un ciclo, muestre todas las opciones disponibles (instancias de MenuOption) añadidas con el
    método anadirOpcion() más la opción «Salir» y que permita a un usuario elegir una opción
    del menú.*/
    public void runMenu(){
        System.out.println("---------------Scanner options---------------");
        for (MenuOption op:listOptions) {
            int index = listOptions.indexOf(op);

            // implenetar metodo toString en la clase que heredara de opcion menu

            System.out.println("(" + index + ")" + op);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the option: ");
        int opt = scanner.nextInt();

        for (MenuOption op:listOptions) {
            if(listOptions.indexOf(op) == opt){
                op.execute();
            }
        }
    }


}
