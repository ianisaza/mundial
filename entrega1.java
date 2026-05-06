
import java.util.Scanner;

public class entrega1 {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[41m";
    public static final String VERDE = "\u001B[42m";
    public static final String AMARILLO = "\u001B[43m";
    public static final String AZUL = "\u001B[44m";
    public static final String BLANCO = "\u001B[47m";

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("███╗   ███╗██╗   ██╗███╗   ██╗██████╗ ██╗ █████╗ ██╗     ");
        System.out.println("████╗ ████║██║   ██║████╗  ██║██╔══██╗██║██╔══██╗██║     ");
        System.out.println("██╔████╔██║██║   ██║██╔██╗ ██║██║  ██║██║███████║██║     ");
        System.out.println("██║╚██╔╝██║██║   ██║██║╚██╗██║██║  ██║██║██╔══██║██║     ");
        System.out.println("██║ ╚═╝ ██║╚██████╔╝██║ ╚████║██████╔╝██║██║  ██║███████╗");
        System.out.println("╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═════╝ ╚═╝╚═╝  ╚═╝╚══════╝");
        System.out.println("=========================================================");







        
        int op = 0;
        while (op != 5){
        System.out.println("Que desea hacer: \n1. ver banderas \n2. ver tabla \n3. ver fixture \n4. info paises \n5. salir");
        op = sc.nextInt();
        sc.nextLine();
        if (op == 1){
            verBanderas();

        }
        else if (op == 2){
            verTabla();
        }
        else if (op == 3){
            verFixture();
        }
        else if (op == 4){
            verInfo();
        }
        else if (op == 5){
            System.out.println("saliendo...");
        }
        else{
            System.out.println("opcion invalida");
        }

        }
        sc.close();
    }

    public static void verBanderas() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione tamaño:");
        System.out.println("1. Grande");
        System.out.println("2. Mediano");
        System.out.println("3. Pequeño");
        System.out.println("4. Icono");

        int opcion = sc.nextInt();

        int escala = 1;

        switch (opcion) {
            case 1: escala = 4; break;
            case 2: escala = 3; break;
            case 3: escala = 2; break;
            case 4: escala = 1; break;
        }

        System.out.println("\nCOLOMBIA\n");

        int filasC = 6 * escala;
        int columnasC = 12 * escala;

        String[][] colombia = new String[filasC][columnasC];

        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                if (i < filasC / 2) {
                    colombia[i][j] = AMARILLO;
                } else if (i < (filasC * 3) / 4) {
                    colombia[i][j] = AZUL;
                } else {
                    colombia[i][j] = ROJO;
                }
            }
        }

        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                System.out.print(colombia[i][j] + "  " + RESET);
            }
            System.out.println();
        }

        System.out.println("\nPORTUGAL\n");

        int filasP = 6 * escala;
        int columnasP = 12 * escala;

        String[][] portugal = new String[filasP][columnasP];

        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                if (j < columnasP / 3) {
                    portugal[i][j] = VERDE;
                } else {
                    portugal[i][j] = ROJO;
                }
            }
        }

        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                System.out.print(portugal[i][j] + "  " + RESET);
            }
            System.out.println();
        }

        System.out.println("\nCONGO DEMOCRATICO\n");

        int filasCD = 6 * escala;
        int columnasCD = 12 * escala;

        String[][] congo = new String[filasCD][columnasCD];

        for (int i = 0; i < filasCD; i++) {
            for (int j = 0; j < columnasCD; j++) {
                if (j > i) {
                    congo[i][j] = AZUL;
                } else {
                    congo[i][j] = ROJO;
                }
                if (Math.abs(i - j) < escala) {
                    congo[i][j] = AMARILLO;
                }
            }
        }

        for (int i = 0; i < filasCD; i++) {
            for (int j = 0; j < columnasCD; j++) {
                System.out.print(congo[i][j] + "  " + RESET);
            }
            System.out.println();
        }

        System.out.println("\nUZBEKISTAN\n");

        int filasU = 6 * escala;
        int columnasU = 12 * escala;

        String[][] uzbekistan = new String[filasU][columnasU];

        for (int i = 0; i < filasU; i++) {
            for (int j = 0; j < columnasU; j++) {
                if (i < filasU / 3) {
                    uzbekistan[i][j] = AZUL;
                } else if (i < (filasU * 2) / 3) {
                    uzbekistan[i][j] = BLANCO;
                } else {
                    uzbekistan[i][j] = VERDE;
                }
                if (i == filasU / 3 || i == (filasU * 2) / 3) {
                    uzbekistan[i][j] = ROJO;
                }
            }
        }

        for (int i = 0; i < filasU; i++) {
            for (int j = 0; j < columnasU; j++) {
                System.out.print(uzbekistan[i][j] + "  " + RESET);
            }
            System.out.println();
        }

        sc.close();
    }
        public static void verTabla() { 
            Scanner sc = new Scanner(System.in);
            int [][] Tabla = new int[48][10];
            String []equipos = new String[48];

            equipos[0] = "Argentina";
            equipos[1] = "Brasil";
            equipos[2] = "Uruguay";
            equipos[3] = "Colombia";
            equipos[4] = "Chile";
            equipos[5] = "Perú";
            equipos[6] = "Ecuador";
            equipos[7] = "Paraguay";
            equipos[8] = "Venezuela";
            equipos[9] = "México";
            equipos[10] = "Estados Unidos";
            equipos[11] = "Canadá";
            equipos[12] = "Costa Rica";
            equipos[13] = "Panamá";
            equipos[14] = "Japón";
            equipos[15] = "Corea del Sur";
            equipos[16] = "Australia";
            equipos[17] = "Irán";
            equipos[18] = "Arabia Saudita";
            equipos[19] = "Qatar";
            equipos[20] = "Alemania";
            equipos[21] = "Francia";
            equipos[22] = "España";
            equipos[23] = "Inglaterra";
            equipos[24] = "Italia";
            equipos[25] = "Portugal";
            equipos[26] = "Países Bajos";
            equipos[27] = "Bélgica";
            equipos[28] = "Croacia";
            equipos[29] = "Dinamarca";
            equipos[30] = "Suiza";
            equipos[31] = "Serbia";
            equipos[32] = "Polonia";
            equipos[33] = "Suecia";
            equipos[34] = "Noruega";
            equipos[35] = "Marruecos";
            equipos[36] = "Senegal";
            equipos[37] = "Nigeria";
            equipos[38] = "Ghana";
            equipos[39] = "Camerún";
            equipos[40] = "Túnez";
            equipos[41] = "Egipto";
            equipos[42] = "Sudáfrica";
            equipos[43] = "Argelia";
            equipos[44] = "China";
            equipos[45] = "India";
            equipos[46] = "Nueva Zelanda";
            equipos[47] = "Turquía";





            System.out.println("desea ver la tabla o editar los datos: \n1. ver tabla \n2. editar datos:");
            int op2 = sc.nextInt();
            sc.nextLine();

            if ( op2 == 1){

                int equiposPorPagina = 16;
                int totalPaginas = 3;

                for (int pagina = 0; pagina < totalPaginas; pagina++) {

                        System.out.println("\n=== PAGINA " + (pagina + 1) + " ===\n");

                        int inicio = pagina * equiposPorPagina;
                        int fin = inicio + equiposPorPagina;

                        for (int i = inicio; i < fin; i++) {
                            System.out.print((i + 1) + ". " + equipos[i] + "\t");

                            for (int j = 0; j < 10; j++) {
                                System.out.print(Tabla[i][j] + "\t");
                            }

                            System.out.println();
                        }

                        if (pagina < totalPaginas - 1) {
                        int opcion;
                        do {
                            System.out.print("\nPresione 1 para continuar: ");
                            opcion = sc.nextInt();
        }                   while (opcion != 1);
    }
}
            
            }
            else if(op2 == 2){
                System.out.println("1Argentina, 2. Brasil, 3. Uruguay, 4. Colombia, 5. Chile, 6. Perú, 7. Ecuador, 8. Paraguay, \n9. Venezuela, 10. México, 11. Estados Unidos, 12. Canadá, 13. Costa Rica, 14. Panamá, 15. Japón, 16. Corea del Sur,\n 17. Australia, 18. Irán, 19. Arabia Saudita, 20. Qatar, 21. Alemania, 22. Francia, 23. España, 24. Inglaterra,\n 25. Italia, 26. Portugal, 27. Países Bajos, 28. Bélgica, 29. Croacia, 30. Dinamarca, 31. Suiza, 32. Serbia,\n 33. Polonia, 34. Suecia, 35. Noruega, 36. Marruecos, 37. Senegal, 38. Nigeria, 39. Ghana,\n 40. Camerún, 41. Túnez, 42. Egipto, 43. Sudáfrica, 44. Argelia, 45. China, 46. India, 47. Nueva Zelanda, 48. Turquía ");
            
        
                System.out.println("escriba el numero del equipo que quiere editar sus datos");
                int equipo = sc.nextInt();
                sc.nextLine();
                System.out.println("quieres editar los datos de "+ equipos[equipo - 1]);  
                System.out.println("que quieres editar: 1.PJ, 2. PG, 3. PE, 4. PP, 5. GF, 6. GC, 7.DG, 8. TA, 9. TR, 10. pts.");
                int op3 = sc.nextInt();
                sc.nextLine();
                int dato = op3 - 1;
                int pais = equipo - 1;
                System.out.println("ingrese el valor a cambiar:");
                int valor = sc.nextInt();
                sc.nextLine();

                Tabla[pais][dato] = valor;
            }
            sc.close();

}   
    public static void verFixture(){
        

    Scanner sc = new Scanner(System.in);

    String[] equipos = {
        "Argentina","Brasil","Uruguay","Colombia",
        "Chile","Perú","Ecuador","Paraguay"
    };

    int[][] partidos = {
        {0,1}, {2,3}, {4,5}, {6,7},
        {0,2}, {1,3}, {4,6}, {5,7},
        {0,3}, {1,2}, {4,7}, {5,6}
    };

    String[] horas = {
        "10:00","12:00","14:00","16:00",
        "10:00","12:00","14:00","16:00",
        "10:00","12:00","14:00","16:00"
    };

    System.out.println("1. Ver partidos por grupo");
    System.out.println("2. Ver partido específico");

    int opcion = sc.nextInt();

    switch (opcion) {

        case 1:
            System.out.println("\nGRUPO A\n");

            for (int i = 0; i < partidos.length; i++) {
                int eq1 = partidos[i][0];
                int eq2 = partidos[i][1];

                System.out.println((i+1) + ". " + equipos[eq1] + " vs " + equipos[eq2] + " - " + horas[i]);
            }
            break;

        case 2:
            System.out.print("Ingrese número de partido: ");
            int p = sc.nextInt();

            if (p >= 1 && p <= partidos.length) {
                int eq1 = partidos[p-1][0];
                int eq2 = partidos[p-1][1];

                System.out.println(equipos[eq1] + " vs " + equipos[eq2]);
                System.out.println("Hora: " + horas[p-1]);
            } else {
                System.out.println("Partido inválido");
            }
            break;

        default:
            System.out.println("Opción inválida");
            sc.close();
    }
}
    public static void verInfo(){
            Scanner sc = new Scanner(System.in);

            System.out.println("de que pais desea ver la informacion: \n1. colombia \n2. portugal \n3. congo democratico \n 4.uzbekistan");
            int op4 = sc.nextInt();
            sc.nextLine();

            if (op4 == 1){
                System.out.println("capital: ==BOGOTA==");
                System.out.println("Portero: Camilo Vargas\r\n" + 
                                        "Lateral derecho: Daniel Muñoz\r\n" +
                                        "Defensa central: Davinson Sánchez\r\n" + 
                                        "Defensa central: Yerry Mina\r\n" + 
                                        "Lateral izquierdo: Johan Mojica\r\n" + 
                                        "Mediocampista: Wilmar Barrios\r\n" + 
                                        "Mediocampista: Jefferson Lerma\r\n" + 
                                        "Mediocampista ofensivo: James Rodríguez\r\n" + 
                                        "Extremo derecho: Luis Díaz\r\n" + 
                                        "Extremo izquierdo: Jhon Arias\r\n" + 
                                        "Delantero: Rafael Santos Borré\r\n" + 
                                        "");
                System.out.println("Copa Mundial de la FIFA 2014: Mejor resultado histórico\n" + 
                                        "Llegó a cuartos de final\n" + 
                                        "Copa Mundial de la FIFA 1990\n" + 
                                        "Llegó a octavos de final\n" + 
                                        "Copa Mundial de la FIFA 2018" +
                                        "llego a octavos de final"
                                    );
            }
            else if (op4 ==2){
                System.out.println("capital: ==LISBOA==");
                System.out.println("Portero: Diogo Costa\r\n" + 
                    "Lateral derecho: João Cancelo\r\n" +
                    "Defensa central: Rúben Dias\r\n" + 
                    "Defensa central: Pepe\r\n" + 
                    "Lateral izquierdo: Nuno Mendes\r\n" + 
                    "Mediocampista: Bruno Fernandes\r\n" + 
                    "Mediocampista: Bernardo Silva\r\n" + 
                    "Mediocampista defensivo: João Palhinha\r\n" + 
                    "Extremo derecho: Rafael Leão\r\n" + 
                    "Extremo izquierdo: Diogo Jota\r\n" + 
                    "Delantero: Cristiano Ronaldo\r\n" + 
                    "");
                System.out.println("Copa Mundial de la FIFA 1966: Mejor resultado histórico\n" + 
                    "Llegó a tercer lugar\n" + 
                    "Copa Mundial de la FIFA 2006\n" + 
                    "Llegó a cuarto lugar\n" + 
                    "Copa Mundial de la FIFA 2022\n" +
                    "Llegó a cuartos de final"
                );
            }
            else if ( op4 == 3){
                System.out.println("capital: ==KINSHASA==");
                System.out.println("Portero: Lionel Mpasi\r\n" + 
                    "Lateral derecho: Gédéon Kalulu\r\n" +
                    "Defensa central: Chancel Mbemba\r\n" + 
                    "Defensa central: Christian Luyindama\r\n" + 
                    "Lateral izquierdo: Arthur Masuaku\r\n" + 
                    "Mediocampista: Samuel Moutoussamy\r\n" + 
                    "Mediocampista: Charles Pickel\r\n" + 
                    "Mediocampista ofensivo: Gaël Kakuta\r\n" + 
                    "Extremo derecho: Silas Katompa Mvumpa\r\n" + 
                    "Extremo izquierdo: Yoane Wissa\r\n" + 
                    "Delantero: Cédric Bakambu\r\n" + 
                    "");
                System.out.println("Copa Mundial de la FIFA 1974: Única participación\n" + 
                    "Eliminado en fase de grupos\n" + 
                    "No ha clasificado nuevamente\n" + 
                    "Mejor desempeño histórico\n" +
                    "Participación en Alemania 1974"
                );
            }
            else if (op4 == 4){
                System.out.println("capital: ==TASKENT==");
                System.out.println("Portero: Utkir Yusupov\r\n" + 
                    "Lateral derecho: Rustamjon Ashurmatov\r\n" +
                    "Defensa central: Abdulkodir Khusanov\r\n" + 
                    "Defensa central: Islom Tukhtakhodjaev\r\n" + 
                    "Lateral izquierdo: Farrukh Sayfiev\r\n" + 
                    "Mediocampista: Odiljon Hamrobekov\r\n" + 
                    "Mediocampista: Otabek Shukurov\r\n" + 
                    "Mediocampista ofensivo: Jaloliddin Masharipov\r\n" + 
                    "Extremo derecho: Dostonbek Khamdamov\r\n" + 
                    "Extremo izquierdo: Abbosbek Fayzullaev\r\n" + 
                    "Delantero: Eldor Shomurodov\r\n" + 
                    "");
                System.out.println("Copa Mundial de la FIFA: Sin participaciones\n" + 
                    "No ha clasificado a un mundial\n" + 
                    "Mejor desempeño en eliminatorias\n" + 
                    "Fases avanzadas en Asia"
                );
            }
            else{
                System.out.println("opcion invaida: X");
            }



    }
}
        


