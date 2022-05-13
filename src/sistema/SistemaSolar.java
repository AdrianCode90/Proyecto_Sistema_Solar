package sistema;

import java.io.IOException;
import static java.lang.Math.pow;

public class SistemaSolar {
    
    private static Estrella sol;
    private static Planeta mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno;
    

    public static void main(String[] args) throws IOException {

        imprimirMenu();

        char salir = 's';
        char intro = '\n';
        
        crearSistemaSolar();

        System.out.print("\nIntroduce una opcion: ");
        char opcion = (char) System.in.read(); 

        while (opcion != salir) {

           char segundo_caracter = (char) System.in.read();// EL SEGUNDO CARACTER ES UN SALTO DE LINEA
                                                                                                       
            while (segundo_caracter != intro) {                          
                                                                                                       
                opcion = 'z';                                                                 
                segundo_caracter = (char) System.in.read();   
            }
           
            switch (opcion) {

                case 'a':
                        informacionSistemaSolar();
                    break;
                case 'b':
                        System.out.println(sol);
                    break;
                case 'c':
                        verPlanetas();
                    break;
                case 'd':
                        verSatelites();
                    break;
                case 'e':
                        informacionOtrosCuerposCelestes();
                    break;
                case 'f':
                        galaxiaMasCercana();
                    break;
                case 'g':
                        informacionEstrellas();
                    break;
                case 'h':
                        imprimirMenu();
                    break;
                default:
                    System.out.println("La opcion no es correcta. Letra incorrecta ");
                    break;

            }

            System.out.print("Introduce una opcion: ");
            opcion = (char) System.in.read();
        }
        
        System.out.println("La ejecucion del programa ha finalizado");

   }
    
    private static void informacionEstrellas(){
        
        System.out.println("\nCuando se forman estrellas en la actual galaxia de la Vía Láctea, están compuestas por un 71 % de\n "
                + "hidrógeno y un 27 % de helio,99 medido en masa, con una pequeña fracción de elementos más pesados.\n "
                + "Típicamente, la porción de elementos pesados se mide en términos del contenido de hierro de la atmósfera\n "
                + "estelar, ya que el hierro es un elemento común y sus líneas de absorción son relativamente fáciles de medir.\n "
                + "La porción de elementos más pesados puede ser un indicador de la probabilidad de que la estrella tenga un\n "
                + "sistema planetario\n\n");
    }
    
    private static void galaxiaMasCercana(){
        
        System.out.println("\nAlfa Centauri es el sistema estelar más cercano al Sol. Se encuentra a unos 4,36 años luz \n"
                + "(41,2 billones de kilómetros) de distancia. Está constituido por tres estrellas: Alfa Centauri A (nombre oficial\n "
                + "según la UAI: Rigil Kentaurus), Alfa Centauri B (nombre oficial: Toliman) y Alfa Centauri C (nombre oficial: Próxima "
                + "Centauri).\n\n");
    }
    
    private static void informacionOtrosCuerposCelestes(){
        
        System.out.println("\nUn asteroide es un cuerpo celeste rocoso, más pequeño que un planeta y mayor que un meteoroide. \n"
                + "La mayoría orbita entre Marte y Júpiter, en la región del sistema solar conocida como cinturón de asteroides; \notros "
                + "se acumulan en los puntos de Lagrange de Júpiter, y la mayor parte del resto cruza las órbitas de los planetas.\n\n");
        
        System.out.println("\nUn cometa es un cuerpo celeste constituido por polvo, rocas y partículas de hielo que orbita alrededor\n "
                + "del Sol siguiendo diferentes trayectorias elípticas. Los cometas forman parte del Sistema solar, junto con el Sol,\n los "
                + "cuatro planetas interiores, los cuatro planetas exteriores, sus respectivos satélites,\n los plutoides y los cuerpos "
                + "menores del sistema solar.\n\n");
        
        System.out.println("\nUn meteoroide es un cuerpo menor del sistema solar de, aproximadamente, entre 100 µm hasta 50m\n "
                + "(de diámetro máximo). El límite superior de tamaño, 50 m, se emplea para diferenciarlo de los cometas y de los\n "
                + "asteroides, mientras que el límite inferior de tamaño, 100 µm, se emplea para diferenciarlo del polvo cósmico;\n "
                + "no obstante, los límites de tamaño no suelen usarse muy estrictamente siendo ambigua la designación de los\n "
                + "objetos que se encuentren cercanos a estos límites.\n\n");
    }
    
    private static void imprimirMenu() {

        System.out.println("\n*************MENU***************");
        System.out.println("OPCION A: informacion general del sistema solar");
        System.out.println("OPCION B: informacion del Sol");
        System.out.println("OPCION C: informacion general de los planetas");
        System.out.println("OPCION D: informacion general de los satelites");
        System.out.println("OPCION E: informacion sobre otros cuerpos celestes");
        System.out.println("OPCION F: informacion sobre el sistema solar mas cercano");
        System.out.println("OPCION G: composicion de las estrellas");
        System.out.println("OPCION H: ver el menu");
        System.out.println("OPCION S: finalizar ejecucion\n");
 
    }

    private static void crearSistemaSolar() {
        
        crearSol();
        
        crearTierra();
        
        crearMercurio();
        
        crearVenus();
        
        crearMarte();
       
        crearJupiter();
        
        crearSaturno();
        
        crearUrano();
        
        crearNeptuno();
        
        crearSatelites();
    }
    
    private static void informacionSistemaSolar(){
        
        System.out.println("\nEl sistema solar es el sistema planetario que liga gravitacionalmente a un conjunto de objetos\n"
                            + "astronómicos que giran directa o indirectamente en una órbita alrededor de una única estrella\nconocida con"
                            + "el nombre de Sol.\n");
    }
    
    private static void crearSol(){
        
        double superficie = 6.0077 * (pow(10, 12));
    
        double volumen = 1.4123 * (pow(10, 18));
        
        double masa = 1.9891 + (pow(10, 30));
        
        sol = new Estrella("Sol", 1392000, superficie, volumen, masa, 1411, 274, 5505, "Via Lactea");
    }
    
    private static void crearTierra(){
        
        
        double diametro = 12756;
        
        double superficie = 510072000;
    
        double volumen = 1.08321 * (pow(10, 12));
        
        double masa = 5.9736 * (pow(10, 24));
        
        int densidad =  5515;
        
        double gravedad = 9.8;
        
        int temperatura = 14;
        
        double periodo_orbital = 385.25;
        
        double velocidad_orbital = 29.78;
        
        double radio_orbital = 0.99;
        
        double periodo_rotacional =  86.400;
        
        String composicion = "78% Nitrogeno, 21% Oxigeno, 1% Argon";
        
        
        tierra = new Planeta("Tierra", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }

    private static void crearMercurio(){
        
        
        double diametro = 4878;
        
        double superficie = 7.10 * (pow(10, 7));
    
        double volumen = 6.083 * (pow(10, 10));
        
        double masa = 3.302 * (pow(10, 23));
        
        int densidad =  543;
        
        double gravedad = 2.78;
        
        int temperatura = 166;
        
        double periodo_orbital = 0.24 * 365;
        
        double velocidad_orbital = 47.57;
        
        double radio_orbital = 0.99;
        
        double periodo_rotacional =  58.6;
        
        String composicion = "Higrogeno y Helio";
        
        
        mercurio = new Planeta("Mercurio", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void crearVenus(){
        
        
        double diametro = 12100;
        
        double superficie = 4.6 * (pow(10, 8));
    
        double volumen = 9.28 * (pow(10, 11));
        
        double masa = 4.896 * (pow(10, 24));
        
        int densidad =  524;
        
        double gravedad = 8.87;
        
        int temperatura = 463;
        
        double periodo_orbital = 0.615 * 365;
        
        double velocidad_orbital = 35.014;
        
        double radio_orbital = 10865322;
        
        double periodo_rotacional =  243;
        
        String composicion = "Nitrogeno y Agua";
        
        
        venus = new Planeta("Venus", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void crearMarte(){
        
        
        double diametro = 12100;
        
        double superficie = 144550800;
    
        double volumen = 1.6318 * (pow(10, 11));
        
        double masa = 6.4185 * (pow(10, 23));
        
        int densidad =  3335;
        
        double gravedad =3.711;
        
        int temperatura = -46;
        
        double periodo_orbital = 1.88 * 365;
        
        double velocidad_orbital = 24.077;
        
        double radio_orbital = 277.069;
        
        double periodo_rotacional =  1.03;
        
        String composicion = "Nitrogeno y Argon";
        
        
        marte = new Planeta("Marte", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void crearJupiter(){
        
        double diametro = 142984;
        
        double superficie = 4.6 * (pow(10,9));
    
        double volumen = 9.25 * (pow(10, 11));
        
        double masa = 4.896 * (pow(10, 20));
        
        int densidad =  108;
        
        double gravedad = 98.87;
        
        int temperatura = 1563;
        
        double periodo_orbital = 11.36 * 365;
        
        double velocidad_orbital = 13.06;
        
        double radio_orbital = 10865322;
        
        double periodo_rotacional =  0.414;
        
        String composicion = "Metano, Hidrogeno y Helio";
        
        
        jupiter = new Planeta("Jupiter", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void crearSaturno(){
        
        double diametro = 13100;
        
        double superficie = 5.6 * (pow(10,78));
    
        double volumen = 10.28 * (pow(5, 11));
        
        double masa = 6.886 * (pow(10, 21));
        
        int densidad =  224;
        
        double gravedad = 7.87;
        
        int temperatura = 363;
        
        double periodo_orbital = 0.628 * 365;
        
        double velocidad_orbital = 33.014;
        
        double radio_orbital = 10833322;
        
        double periodo_rotacional =  143;
        
        String composicion = "Metano, Hidrogeno y Helio";
        
        
        saturno = new Planeta("Saturno", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void crearUrano(){
        
        
        double diametro = 22100;
        
        double superficie = 2.6 * (pow(9, 8));
    
        double volumen = 3.6318 * (pow(8, 11));
        
        double masa = 4.4185 * (pow(10, 23));
        
        int densidad =  124;
        
        double gravedad = 10.87;
        
        int temperatura = 565;
        
        double periodo_orbital = 1.20 * 365;
        
        double velocidad_orbital = 24.000;
        
        double radio_orbital = 155.0589;
        
        double periodo_rotacional =  1.50;
        
        String composicion = "Metano, Hidrogeno y Helio";
        
        
        urano = new Planeta("Urano", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
     
    private static void crearNeptuno(){
        
        
        double diametro = 13100;
        
        double superficie = 1.6 * (pow(8, 8));
    
        double volumen = 2.6317 * (pow(12, 11));
        
        double masa = 5.505 * (pow(10, 23));
        
        int densidad =  924;
        
        double gravedad = 3.87;
        
        int temperatura = 455;
        
        double periodo_orbital = 2.01 * 365;
        
        double velocidad_orbital = 12.23;
        
        double radio_orbital = 122.366;
        
        double periodo_rotacional =  2.00;
        
        String composicion = "Metano, Hidrogeno y Helio";
        
        
        neptuno = new Planeta("Neptuno", diametro, superficie, volumen, masa, densidad, gravedad, temperatura, periodo_orbital,
                                              velocidad_orbital, radio_orbital, periodo_rotacional, composicion);
    }
    
    private static void imprimirSatelitesPlanetas(Planeta planeta){
        
        if (planeta.getSatelites().length == 0) {
            System.out.println(planeta.getNombre() + " no tiene satelites");
        } else {
            System.out.println("Los satelites de " + planeta.getNombre() + " son: ");
            for (int i = 0; i < planeta.getSatelites().length; i++) {
                System.out.println(planeta.getSatelites()[i]);
            }
        }
    }
    
    private static void verPlanetas() throws IOException {
        
        verMenuPlanetas();
        System.out.print("\nIntroduce una opcion: ");
        
        char opcion = (char) System.in.read();
        
        char intro = (char) System.in.read(); //LEE EL SEGUNDO CARACTER. SI ES UN SALTO DE LINEA (\n) ENTRA EN EL switch
        
        if (intro == '\n'){ //SI INTRODUZCO UN SALTO DE LINEA POR CONSOLA
            
            switch(opcion){
                
                case 'a':
                    System.out.println(mercurio);
                    break;
                case 'b':
                     System.out.println(venus);
                    break;
                case 'c':
                     System.out.println(tierra);
                    break;
                case 'd':
                     System.out.println(marte);
                    break;
                case 'e':
                     System.out.println(jupiter);
                    break;
                 case 'f':
                      System.out.println(saturno);
                    break;
                  case 'g':
                       System.out.println(urano);
                    break;
                  case 'h':
                       System.out.println(neptuno);
                    break;
                  case 'i':
                       System.out.println(mercurio);
                       System.out.println(venus);
                       System.out.println(tierra);
                       System.out.println(marte);
                       System.out.println(jupiter);
                       System.out.println(saturno);
                       System.out.println(urano);
                       System.out.println(neptuno);
                    break;
                    default:System.out.println("La opcion introducida no es valida");
                    verPlanetas();
                    break;
            }
            
        }else{
            
            while (intro != '\n') { //PRIMERO LEE EL SEGUNDO CARACTER Y EL TERCERO (SI HAY) Y ASI HASTA QUE LEA UN SALTO DE LINEA                
                
                intro = (char) System.in.read();
            }
            
            System.out.println("La opcion introducida no es valida");
            verPlanetas();
        }
    
    }

    private static void verMenuPlanetas() {
        
        System.out.println("\n*************MENU PLANETAS***************\n");
        System.out.println("OPCION A: informacion de Mercurio");
        System.out.println("OPCION B: informacion de Venus");
        System.out.println("OPCION C: informacion de Tierra");
        System.out.println("OPCION D: informacion de Marte");
        System.out.println("OPCION E: informacion de Jupiter");
        System.out.println("OPCION F: informacion de Saturno");
        System.out.println("OPCION G: informacion de Urano");
        System.out.println("OPCION H: informacion de Neptuno");
        System.out.println("OPCION I: informacion de todos los planetas. \n");
       
    }
    
    private static void crearSatelites(){
        
        //TIERRA
       
        Satelite satelites[] = new Satelite[1];
        
        satelites[0] = new Satelite("Luna", 384400, 1.62);
       
        tierra.setSatelite(satelites[0]); //ACA LE PASO UN VALOR
        
        //MARTE
        
        satelites = new Satelite[2];
        
        satelites[0] = new Satelite("Fobos", 9377, 0.0084);
        satelites[1] = new Satelite("Deimos", 23460, 0.0039);
        
        marte.setSatelites(satelites); //ACA LE PASO UNA LISTA
        
        //JUPITER
        
        satelites = new Satelite[4];

        satelites[0] = new Satelite("Io", 421800, 1.81);
        satelites[1] = new Satelite("Europa", 671100, 1.314);
        satelites[2] = new Satelite("Gamimedes", 170400, 1.42);
        satelites[3] = new Satelite("Calisto", 1882400, 1.235);
       
        jupiter.setSatelites(satelites); 
        
        //SATURNO
        
        satelites = new Satelite[4];

        satelites[0] = new Satelite("Titan", 1221050, 1.37);
        
        saturno.setSatelites(satelites); 
        
       
        //NEPTUNO
        
        satelites = new Satelite[1];

        satelites[0] = new Satelite("Triton", 354360, 0.78);
        
        neptuno.setSatelites(satelites); 
        
    }

    private static void verSatelites() throws IOException {

        
        verMenuSatelites();
        System.out.print("\nIntroduce una opcion: ");
        
        char opcion = (char) System.in.read();
        
        char intro = (char) System.in.read(); //LEE EL SEGUNDO CARACTER. SI ES UN SALTO DE LINEA (\n) ENTRA EN EL switch
        
        if (intro == '\n'){ //SI INTRODUZCO UN SALTO DE LINEA POR CONSOLA
            
            switch(opcion){
                
                case 'a':
                    imprimirSatelitesPlanetas(mercurio);
                    break;
                case 'b':
                    imprimirSatelitesPlanetas(venus);
                    break;
                case 'c':
                     imprimirSatelitesPlanetas(tierra);
                    break;
                case 'd':
                     imprimirSatelitesPlanetas(marte);
                    break;
                case 'e':
                     imprimirSatelitesPlanetas(jupiter);
                    break;
                 case 'f':
                      imprimirSatelitesPlanetas(saturno);
                    break;
                  case 'g':
                       imprimirSatelitesPlanetas(urano);
                    break;
                  case 'h':
                       imprimirSatelitesPlanetas(neptuno);
                    break;
                    default:System.out.println("La opcion introducida no es valida");
                    verPlanetas();
                    break;
            }
            
        }else{
            
            while (intro != '\n') { //PRIMERO LEE EL SEGUNDO CARACTER Y EL TERCERO (SI HAY) Y ASI HASTA QUE LEA UN SALTO DE LINEA                
                
                intro = (char) System.in.read();
            }
            
            System.out.println("La opcion introducida no es valida");
            verPlanetas();
        }
    
    }
    
    private static void verMenuSatelites() {
        
        System.out.println("\n*************MENU SATELITES***************\n");
        System.out.println("OPCION A: informacion de satelites de Mercurio");
        System.out.println("OPCION B: informacion de satelites de Venus");
        System.out.println("OPCION C: informacion de satelites de Tierra");
        System.out.println("OPCION D: informacion de satelites de Marte");
        System.out.println("OPCION E: informacion de satelites de Jupiter");
        System.out.println("OPCION F: informacion de satelites de Saturno");
        System.out.println("OPCION G: informacion de satelites de Urano");
        System.out.println("OPCION H: informacion de satelites de Neptuno\n");
        
    }
    
}
