import java.util.Scanner;
public class TankWars {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String salida = "\n1. Disparar una bala\n"+
                        "2. Activar bomba atomica\n"+
                        "3. Activar Tanque Mutante\n"+
                        "4. La frase de la Abuela\n" +
                        "5. Conteo de disparos\n" + 
                        "6. Mostrar cantidad de sangre\n"+
                        "7. Guardar datos de sangre en archivo\n"+
                        "8. Mostrar Tablero\n"+
                        "9. Mostrar el menu\n";

        Tanque.generarTanques();
        System.out.println(Tanque.tableroTankWars());
        System.out.println("\nSeleccione la opcion que desea realizar\n");
        System.out.println(salida);
        int opcion = entrada.nextInt();
        int cantDisparos = 0;
        while(true){
            
            if(opcion == 1){
                System.out.println("\nDigita la Fila de la posición del tanque\n");
                int fila = entrada.nextInt();
                System.out.println("\nDigita la columna de la posición del tanque\n");
                int columna = entrada.nextInt();
                Tanque.dispararBala(fila,columna);
                cantDisparos++;

            }else if(opcion == 2){
                Tanque.bombaAtomica();
                System.out.println("\nBomba atomica Disparada\n");

            }else if(opcion == 3){
                Tanque.tanqueMutante();
                System.out.println("Tanque mutante activado");

            }else if(opcion == 4){
                System.out.println(Tanque.mensajeAbuela());

            }else if(opcion == 5){
                System.out.println("La cantidad de disparos que se han hecho son: " + cantDisparos);

            }else if(opcion == 6){
                System.out.println("La cantidad de sangre de los tanques es: \n");
                System.out.println(Tanque.leerSangre());
            }else if(opcion == 7){
                System.out.println("Guardando datos de sangre en txt");
                Tanque.guardarSangreTXT();
            }else if(opcion == 8){
                System.out.println(Tanque.tableroTankWars());
            }else if(opcion == 9){
                System.out.println(salida);
            }


            if(Tanque.muertos()==Tanque.tanquesEnLista()){System.out.println("\nJuego Finalizado\n"); break;}

            System.out.println("\nDigita la opcion que desea realizar\n");
            opcion = entrada.nextInt();

        }

        entrada.close();
    }
}
