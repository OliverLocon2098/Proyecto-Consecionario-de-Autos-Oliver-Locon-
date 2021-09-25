/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectoalgoritmos;
import java.util.Scanner;

/**
 *
 * @author Oliver
 */
public class PrimerProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Concesionario de autos que se autil para el proceso de ventas
        int repetidorLinea10 = 1;
        int repetidorGama=1;
        Scanner scan = new Scanner(System.in);
        // Menu principal 
        while(repetidorLinea10==1){
        System.out.println("CONSESIONARIO DE AUTOS");
        System.out.println("MENU PRINCIPAL");
        System.out.println(" ");
        System.out.println("01 -Seleccionar automovil");
        System.out.println("02 -Salir");
        System.out.println(" ");
        System.out.println("ingrese la opcion que desea ejecutar:");
        int Opcion1 = scan.nextInt();
        
        while(repetidorGama==1)//inicia repetidor gama 
        switch(Opcion1){ // inicia primer submenu 
            
             case 1:
                
                int opcion2;
                System.out.println(" ");    
            System.out.println("CONSESIONARIO DE AUTOS");
            System.out.println("SELECCION DE GAMA DE VEHICULOS");
            System.out.println("01 -Sedan Economico");
            System.out.println("02 Sedan");
            System.out.println("03 -Deportivo");
            System.out.println("04 -Hibrido");
            System.out.println("05 -Coupe");
            System.out.println("07 -Compacto");
            System.out.println("08 -Hatchback");
            System.out.println("09 -Economico version Rally");
            System.out.println("10 -Regresar al menu principal");
            System.out.println(" ");
            System.out.println("ingrese gama de vehiculos");
            opcion2 = scan.nextInt();
            
            
            switch(opcion2){ // submenu de gama de automoviles  Sedan economico 
                case 1:
                String Letra1;    
                System.out.println(" ");
                System.out.println("CONSECIONARIO DE AUTOS");
                System.out.println("SELECCION DE GAMA DE VEHICULO");
                System.out.println(" ");
                System.out.println("ha seleccionado la gama: **Sedan economico**");
                System.out.println(" ");
                System.out.println("Desea agregar amenidades? (s/n)");
                Letra1 = scan.next();
                if("s".equals(Letra1)){ // inicia if sedan economico 
                int opcion3;
                    System.out.println("CONCESIONARIO DE AUTOS");
                    System.out.println("-SELECCIONE AMENIDADES-");
                    System.out.println(" ");
                    System.out.println("ha seleccionado: **Sedan Economico**");
                    System.out.println("tipo de amenidades:");
                    System.out.println(" ");
                    System.out.println("01 -Tipo de Transmision: \n02 -Color de pintura exterior: \n03-Aros");
                    System.out.println("04 -Accesorio Exteriores: \n05 -Accesorios Interiores: \n06 -Accesorios Electronicos");
                    System.out.println("07 -Regresar a la seleccion a gama de vehiculos");
                    System.out.println(" ");
                    System.out.println("ingresar el tipo de amenidad");
                    opcion3 = scan.nextInt();
                    
                    switch(opcion3){ //inicia switch opcion3 
                         case 1:
                        int opcion4;
                         System.out.println("CONSECIONARIO DE AUTOS");
                         System.out.println("- SELECCION DE AMENIDADES -");
                            System.out.println("SELECCION DE TIPO DE TRANSMISION");
                            System.out.println(" ");
                            System.out.println("ha seleccionado la gama: Sedan Economico");
                            System.out.println(" ");
                            System.out.println("Tipos de transmision");
                            System.out.println(" ");
                            System.out.println("01 -Manual:             US$ 0.00");
                            System.out.println("02 -CVT:                US$ 800.00");
                         System.out.println("03 -Manual con turbo    US$ 0.00");
                         System.out.println("04 -CVT con turbo       US$ 800.00");
                         System.out.println("05 - Regresar a la seleccion de amanenidades");
                         opcion4 = scan.nextInt();
                        
                        
                        
                        
                         switch(opcion4){ // inicia switch opcion4 
                         case 1:// case para tipo de transmision manual 
                                System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:Tipo de transmision manual ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 24300.00");
                                System.out.println(" ");
                               // System.out.println("Desea agregar otra amenidad?"); 
                                break;
                                
                         case 2: // case para tipo de transmision cvt
                         System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Tipo de transmision CVT                US$ 800.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 19740.00");
                                System.out.println(" ");    
                                break;
                         case 3: // case para tipo de transmision manual con turbo
                                System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Tipo de transmision Turbo                US$ 00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ ");//ingresar cantidad 
                                System.out.println(" ");    
                                break;   
                         case 4: // case para tipo de transmision cvt con turbo 
                                System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Tipo de transmision CVT con Turbo      US$ 800.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                         case 5: 
                                 // repetidor que retorne a la seleccion de amenidades 
                         
                                break;
                         default:
                             System.out.println("opcion invalida");
                        } // finaliza switch opcion 4 
                         break;
                         case 2: // case de color de pintura exterior 
                             
                             System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("COLOR DE PINTURA EXTERIOR");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan Economico");
                             System.out.println(" ");    
                             System.out.println("01. Cosmic Blue");
                             System.out.println("02. Burgundy Night ");    
                             System.out.println("03. Rallye Red");
                             System.out.println("04. Crystal Black");    
                             System.out.println("05. Modern Steel");
                             System.out.println("06. Taffeta White");    
                             System.out.println("07. Energy Green");
                             System.out.println("08. Kona Coffee");    
                             System.out.println("09. Orange Fury");
                             System.out.println("10. Helios Yellow");    
                             System.out.println("11. Sonic Gray");
                             System.out.println("12. Polished Metal");
                             System.out.println("13. Regresar al menu principal ");
                             int pintura = scan.nextInt();
                             
                             switch(pintura){ // inicia switch para tipo de pintura 
                                 case 1://Blue cosmetic
                                  System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Blue cosmetic                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;   
                                 case 2://Burgundy Night
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: urgnundy night                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 3://Rallye Red
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Ralley Red                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 4://Crystal Black
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Crystal Black                         US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 5://Modern Steel
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Modern Steel                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 6://Taffeta White
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Taffeta White                         US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 7://Energy Green
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Energy Green                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 8://Kona Coffee
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Kona Coffee                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 9://Orange Fury
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Orage Fury                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 10://Helios Yellow
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:   Helios Yelow                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 11://Sonic Gray
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:    Sonic Gray                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 12://Polished Metal
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Polished Metal                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 13: 
                                         
                                     // repetidor para el menu de amenidades 
                                     break;
                                 default:
                                     System.out.println("opcion invalida ");
                                     break;

                             }
                             break;
                         case 3: // case para aros 
                             System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("TIPO DE AROS DISPONIBLES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan Economico");
                             System.out.println("01. 15'  " );    
                             System.out.println("02. 16'  "  );
                             System.out.println("03. 17'  " );
                             System.out.println("04. 18' " );
                             System.out.println("05. 19'  ");
                             System.out.println("06. regresar al menu de amenidades");
                             int aros = scan.nextInt();
                             
                             switch(aros){ //inicia switch aros 
                                 case 1:// 15"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 15'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 2://16"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 16'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 3://17"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 17'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 4://18"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 18'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 5://19"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 19'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 6:// ingresar aqui el repetidor para regresar amenidades 
                                     break;
                                     default:
                                         System.out.println("opcion invalida");
                                         break;
                             }//finaliza switch aros
                             break;
                         case 4: // case para accesorio exteriores
                             System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS EXTERIORES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan Economico");
                             System.out.println("01. Body Side Molding ");
                             System.out.println("02. Car Cover ");
                             System.out.println("03. Decklid Spoiler ");
                             System.out.println("04. Door Edge Film");
                             System.out.println("05. Door Edge Guards ");
                             System.out.println("06. Door Trim Chrome");
                             System.out.println("07. Door Visor");
                             System.out.println("08. Front Fender Emblems");
                             System.out.println("09. Rear Bumper Applique");
                             System.out.println("10. Fog Lights");
                             System.out.println("11. Nose Mascs ");
                             System.out.println("12. Moonrof Visor");
                             System.out.println("13. Splash Guard Set");
                             System.out.println("14. Dust Cover ");
                             System.out.println("15. Door Mirror Cover - Carbon Fiber");
                             System.out.println("16. Regresar al menu  de amenidades ");
                             int accesExterior = scan.nextInt();
                                switch(accesExterior){//inicia switch de accesorios exteriores 
                                    case 1://Body Side Molding
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Body side Molding                                US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 2://Car Cover
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:Car Cover                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 3://Decklid Spoiler
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Decklid Spoiler                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 4://Door Edge Film
                                              System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Edge Film                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;   
                                    case 5://Door Edge Guards
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Edge Guards                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 6://Door Trim Chrome
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door trim Chrome                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 7://Door Visor
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door visor                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 8://Front Fender Emblems
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Front Fender Embelms                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 9://Rear Bumper Applique
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Rear Bumper Applique                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 10://Fog Lights
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Fog Lights                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 11://Nose Mascs
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: nose Mascs                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 12://Moonrof Visor
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Moonrof Visor                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 13://Splash Guard Set
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Splasj Guard Set                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 14://Dust Cover
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Dust Cover                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 15://Door Mirror Cover - Carbon Fiber
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door mirror cover - Carbon Fiber        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 16:
                                        //ingresar aqui el repetidor de amenidades 
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
      
                                }//finaliza switch de accesorios exteriores 
                             break;
                             
                         case 5: // case para accesorios interiores
                             System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS INTERIORES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan Economico");
                             System.out.println("01. All-Seasons Floor Mats");
                             System.out.println("02. Automatic-Dimming Mirror");
                             System.out.println("03. Cargo Hook");
                             System.out.println("04. Cargo Net");
                             System.out.println("05. Console Illumination");
                             System.out.println("06. Cargo Organizer");
                             System.out.println("07. Door Panel Protector");
                             System.out.println("08. Armrest Compartiment");
                             System.out.println("09. Door Sill Trim-Illuminated");
                             System.out.println("10. Cargo Cover");
                             System.out.println("11. Cargo Liner");
                             System.out.println("12. Regresar al menu de amenidades");
                             int accesInterior  = scan.nextInt();
                             switch(accesInterior){//inicio de switch de accesorios interiroes 
                                 
                                 case 1:// All-Seasons Floor Mats     
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  All-seasons Floor Mats                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 2:// Automatic-Dimming Mirror
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Automatic-Dimming Mirror                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 3:// Cargo Hook
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Hook                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 4:// Cargo Net
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Net                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 5:// Console Illumination
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Console Ilumination                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 6:// Cargo Organizer
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Otgnanizer                               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 7:// Door Panel Protector
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Panel Protector                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 8:// Armrest Compartiment
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Armrest Campartiment                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 9:// Door Sill Trim-Illuminated
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Sill trim-Illuminated             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 10:// Cargo Cover
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Cover                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 11:// Cargo Liner
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Cargo Liner                               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 12:// ingresar aqui el repetidor de amenidades 
                                     break;
                                 default:
                                     System.out.println("Opcion invalidad");
                                 break;
                             }//finaliza switch de accesorios interiores 
                             break;
                             
                         case 6: // case para accesorios electronicos 
                             System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS ELECTRONICOS");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan Economico");
                             System.out.println("01. Wireless Phone Charger ");
                             System.out.println("02. USB Charger - 2.1 Amp. ");
                             System.out.println("03. Puddle Light");
                             System.out.println("04. Parking Sensors");
                             System.out.println("05. Regresar al menu de Amenidades ");
                             int accesElec = scan.nextInt();
                             switch(accesElec){// inicia switch de accesorios electricos 
                                 case 1://Wireless Phone Charger
                                        System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Wireless phone Charger               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 2://USB Charger - 2.1 Amp.
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  USBCharger 2,1 AMp                      US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 3://Puddle Light
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Puddle Ligth                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 4://Parking Sensors
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  PArking Sensors                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 5:// insertar  aqui el repetidor hacia amenidades 
                                     break;
                                 default:
                                     System.out.println("opcion invalida");
                                     break;
                                             
                             }// finaliza switch de accesorios electricos 
                             
                         case 7: // ingresar repetidor que retorne a gama de vehiculos 
                             repetidorGama=1;
                         break;
                         default:
                             System.out.println("opcion invalida");
                        repetidorGama=0;
                        
                    } // finaliza switch opcion 3 
         break;
                }// finaliza if sedan economico 
            
                else {// inicia else sedan economico 
                    System.out.println("CONCESIONARIO DE AUTOS");
                    System.out.println("- VENTA DE AUTO - ");
                    System.out.println(".......................................");
                    System.out.println("Gama seleccionada:");
                    System.out.println("Amenidad: ninguna ");
                    System.out.println("Total:");
                    System.out.println("Precione enter para regresar al menu principal"); 
                   
                    
                
                } //finaliza else sedan economico 
                break;
            
        
             case 2:
                 // inicia proceso sedan 
                 String Letra2;  
                 System.out.println(" ");
                System.out.println("CONSECIONARIO DE AUTOS");
                System.out.println("SELECCION DE GAMA DE VEHICULO");
                System.out.println(" ");
                System.out.println("ha seleccionado la gama: **Sedan**");
                System.out.println(" ");
                System.out.println("Desea agregar amenidades? (s/n)");
                 Letra2 = scan.next();
                if("s".equals(Letra2)){ // inicia if sedan 
                int opcionS;
                    System.out.println("CONCESIONARIO DE AUTOS");
                    System.out.println("-SELECCIONE AMENIDADES-");
                    System.out.println(" ");
                    System.out.println("ha seleccionado: **Sedan**");
                    System.out.println("tipo de amenidades:");
                    System.out.println(" ");
                    System.out.println("01 -Tipo de Transmision: \n02 -Color de pintura exterior: \n03-Aros");
                    System.out.println("04 -Accesorio Exteriores: \n05 -Accesorios Interiores: \n06 -Accesorios Electronicos");
                    System.out.println("07 -Regresar a la seleccion a gama de vehiculos");
                    System.out.println(" ");
                    System.out.println("ingresar el tipo de amenidad");
                    opcionS = scan.nextInt();   
                    switch(opcionS){ // inicia switch opcion de transmisiones Sedan
                        
                        case 1:
                            int transmision;
                        System.out.println("CONSECIONARIO DE AUTOS");
                        System.out.println("- SELECCION DE AMENIDADES -");
                        System.out.println("SELECCION DE TIPO DE TRANSMISION");
                        System.out.println(" ");
                        System.out.println("ha seleccionado la gama: **Sedan**");
                        System.out.println(" ");
                        System.out.println("Tipos de transmision");
                        System.out.println(" ");
                        System.out.println("01 -Manual:             US$ 0.00");
                        System.out.println("02 -CVT:                US$ 800.00");
                        System.out.println("03 -Manual con turbo    US$ 0.00");
                        System.out.println("04 -CVT con turbo       US$ 800.00");
                        System.out.println("05 - Regresar a la seleccion de amanenidades");  
                        transmision = scan.nextInt();
                        
                        switch(transmision){// inicia switch de transmision
                          case 1:
                                System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Manual ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 24300.00");
                                System.out.println(" ");
                                //System.out.println("Desea agregar otra amenidad?");
                                break;
                          case 2://CVT sedan
                              System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: CVT                                       ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 24300.00");
                                System.out.println(" ");
                                //System.out.println("Desea agregar otra amenidad?");
                                break;
                          case 3:// Manual con tubo sedan
                              System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Manual con turbo                                   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 24300.00");
                                System.out.println(" ");
                                //System.out.println("Desea agregar otra amenidad?");
                                break;
                          case 4:// CVT con turbo sedan 
                              System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: CVT con turbo                                       ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$ 24300.00");
                                System.out.println(" ");
                                //System.out.println("Desea agregar otra amenidad?");
                                break;
                          case 5:// repetidor a menu de ameniddades (transmision)
                              break;
                          default:
                              System.out.println("opcion no valida ");
                              break;
                        }//finaliza switch de transmision
                        break;
                        case 2://Color de pintura exterior sedan
                            System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("COLOR DE PINTURA EXTERIOR");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan ");
                             System.out.println(" ");    
                             System.out.println("01. Cosmic Blue");
                             System.out.println("02. Burgundy Night ");    
                             System.out.println("03. Rallye Red");
                             System.out.println("04. Crystal Black");    
                             System.out.println("05. Modern Steel");
                             System.out.println("06. Taffeta White");    
                             System.out.println("07. Energy Green");
                             System.out.println("08. Kona Coffee");    
                             System.out.println("09. Orange Fury");
                             System.out.println("10. Helios Yellow");    
                             System.out.println("11. Sonic Gray");
                             System.out.println("12. Polished Metal");
                             System.out.println("13. Regresar al menu principal ");
                             int pintura2 = scan.nextInt();
                             switch(pintura2){ // inicia switch para tipo de pintura sedan 
                                 case 1://Blue cosmetic
                                  System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Blue cosmetic                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;   
                                 case 2://Burgundy Night
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                 US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: urgnundy night                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 3://Rallye Red
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Ralley Red                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 4://Crystal Black
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Crystal Black                         US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 5://Modern Steel
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                  US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Modern Steel                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 6://Taffeta White
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Taffeta White                         US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 7://Energy Green
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                  US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Energy Green                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 8://Kona Coffee
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                  US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Kona Coffee                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 9://Orange Fury
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama:  sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Orage Fury                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 10://Helios Yellow
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama:                          US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:   Helios Yelow                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 11://Sonic Gray
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:    Sonic Gray                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 12://Polished Metal
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Polished Metal                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");    
                                break;
                                 case 13: 
                                         
                                     // repetidor para el menu de amenidades 
                                     break;
                                 default:
                                     System.out.println("opcion invalida ");
                                     break;
                             }// finaliza switch sedan pitnura exterior sedan 
                             break;
                        case 3://Aros sedan 
                            System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("TIPO DE AROS DISPONIBLES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan ");
                             System.out.println("01. 15'  " );    
                             System.out.println("02. 16'  "  );
                             System.out.println("03. 17'  " );
                             System.out.println("04. 18' " );
                             System.out.println("05. 19'  ");
                             System.out.println("06. regresar al menu de amenidades");
                             int aros2 = scan.nextInt();
                             switch(aros2){// inicia switch aros sedan
                                 case 1:// 15"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 15'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 2://16"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 16'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 3://17"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 17'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 4://18"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 18'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 5://19"
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Aros 19'                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 6:// ingresar aqui el repetidor para regresar amenidades 
                                     break;
                                     default:
                                         System.out.println("opcion invalida");
                                         break;
                             }// finaliza switch aros sedan 
                             break;
                        case 4://Accesorio Exteriores 
                            System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS EXTERIORES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan ");
                             System.out.println("01. Body Side Molding ");
                             System.out.println("02. Car Cover ");
                             System.out.println("03. Decklid Spoiler ");
                             System.out.println("04. Door Edge Film");
                             System.out.println("05. Door Edge Guards ");
                             System.out.println("06. Door Trim Chrome");
                             System.out.println("07. Door Visor");
                             System.out.println("08. Front Fender Emblems");
                             System.out.println("09. Rear Bumper Applique");
                             System.out.println("10. Fog Lights");
                             System.out.println("11. Nose Mascs ");
                             System.out.println("12. Moonrof Visor");
                             System.out.println("13. Splash Guard Set");
                             System.out.println("14. Dust Cover ");
                             System.out.println("15. Door Mirror Cover - Carbon Fiber");
                             System.out.println("16. Regresar al menu  de amenidades ");
                             int accesExterior2 = scan.nextInt();
                             switch(accesExterior2){// inicia swich access exterior sedan 
                                 case 1://Body Side Molding
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Body side Molding                                US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 2://Car Cover
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:Car Cover                                 US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 3://Decklid Spoiler
                                           System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Decklid Spoiler                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 4://Door Edge Film
                                              System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                   US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Edge Film                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;   
                                    case 5://Door Edge Guards
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                       US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Edge Guards                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 6://Door Trim Chrome
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                   US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door trim Chrome                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 7://Door Visor
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                   US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door visor                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 8://Front Fender Emblems
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Front Fender Embelms                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 9://Rear Bumper Applique
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Rear Bumper Applique                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 10://Fog Lights
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                 US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Fog Lights                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 11://Nose Mascs
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                  US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: nose Mascs                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 12://Moonrof Visor
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Moonrof Visor                          US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 13://Splash Guard Set
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Splasj Guard Set                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 14://Dust Cover
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Dust Cover                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 15://Door Mirror Cover - Carbon Fiber
                                                 System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                  US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Door mirror cover - Carbon Fiber        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                    case 16:
                                        //ingresar aqui el repetidor de amenidades 
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
                             }// finaliza access exteriror sedan 
                             break;
                        case 5://Accesorios interiores sedan
                            System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS INTERIORES");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan ");
                             System.out.println("01. All-Seasons Floor Mats");
                             System.out.println("02. Automatic-Dimming Mirror");
                             System.out.println("03. Cargo Hook");
                             System.out.println("04. Cargo Net");
                             System.out.println("05. Console Illumination");
                             System.out.println("06. Cargo Organizer");
                             System.out.println("07. Door Panel Protector");
                             System.out.println("08. Armrest Compartiment");
                             System.out.println("09. Door Sill Trim-Illuminated");
                             System.out.println("10. Cargo Cover");
                             System.out.println("11. Cargo Liner");
                             System.out.println("12. Regresar al menu de amenidades");
                             int accesInterior2  = scan.nextInt();
                             switch(accesInterior2){// iniicia switch acces Inerior 2 sedan 
                                 case 1:// All-Seasons Floor Mats     
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  All-seasons Floor Mats                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 2:// Automatic-Dimming Mirror
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Automatic-Dimming Mirror                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 3:// Cargo Hook
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                       US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Hook                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 4:// Cargo Net
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Net                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 5:// Console Illumination
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                         US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Console Ilumination                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 6:// Cargo Organizer
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                       US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Otgnanizer                               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 7:// Door Panel Protector
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Panel Protector                            US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 8:// Armrest Compartiment
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                      US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Armrest Campartiment                              US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 9:// Door Sill Trim-Illuminated
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                     US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Door Sill trim-Illuminated             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 10:// Cargo Cover
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                    US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades: Cargo Cover                             US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 11:// Cargo Liner
                                     System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan                       US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Cargo Liner                               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");     
                                break;
                                 case 12:// ingresar aqui el repetidor de amenidades 
                                     break;
                                 default:
                                     System.out.println("Opcion invalidad");
                                 break;
                             }// finaliza switch acces interior 2 sedan 
                             break;
                        case 6://Accesorios electronicos sedan
                            System.out.println("CONSECIONARIO DE AUTOS");
                             System.out.println("- SELECCION DE AMENIDADES -");
                             System.out.println("ACCESORIOS ELECTRONICOS");
                             System.out.println(" ");
                             System.out.println("ha seleccionado la gama: Sedan");
                             System.out.println("01. Wireless Phone Charger ");
                             System.out.println("02. USB Charger - 2.1 Amp. ");
                             System.out.println("03. Puddle Light");
                             System.out.println("04. Parking Sensors");
                             System.out.println("05. Regresar al menu de Amenidades ");
                             int accesElec2 = scan.nextInt();
                             switch(accesElec2){// inicia accesorios electronicos sedan 
                                 case 1://Wireless Phone Charger
                                        System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Wireless phone Charger               US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 2://USB Charger - 2.1 Amp.
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  USBCharger 2,1 AMp                      US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 3://Puddle Light
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  Puddle Ligth                           US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 4://Parking Sensors
                                      System.out.println("CONSECIONARIO DE AUTOS");
                                System.out.println("- RESUMEN DE AMENIDADES");
                                System.out.println(" ");
                                System.out.println("Ha seleccionado la gama: Sedan economico           US$ 18940.00");
                                System.out.println(" ");
                                System.out.println("Amenidades:  PArking Sensors                        US$ 0.00   ");
                                System.out.println("    ");
                                System.out.println("total:                                             US$         ");
                                System.out.println(" ");  
                                break;
                                 case 5:// insertar  aqui el repetidor hacia amenidades 
                                     break;
                                 default:
                                     System.out.println("opcion invalida");
                                     break;
                             } //finaliza  accesorios electronicos sedan 
                             break;
                        case 7:// repetidor al menu principal 
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                        
                        
                    }// finaliza switch sedan 
                    
                    
                } // finaliza if sedan 
                
                else{ // inicia else sedan 
                    System.out.println("CONCESIONARIO DE AUTOS");
                    System.out.println("- VENTA DE AUTO - ");
                    System.out.println(".......................................");
                    System.out.println("Gama seleccionada:");
                    System.out.println("Amenidad: ninguna ");
                    System.out.println("Total:");
                    System.out.println("Precione enter para regresar al menu principal");    
                } //  finaliza else sedan 
                break; // evitar que salte de sedan a deportivo 
             case 3:// case para auto deportivo 
                 
             case 4: // case para auto Hibrido 
                 
                 
             case 5:// case para auto Coupe
                
                 
                 
             case 6: // case para auto Coupe deportivo 
                 
                 
             case 7: //  case para auto compacto 
                 
                 
             case 8: //case para auto Hachtback 
                 
                 
                 
             case 9: //  case para auto economico version Raally 
                 
             case 10:
                 // aqui ingresar repetidor 
                 repetidorLinea10 = 1;
                 
                break;
            
             default:
                 System.out.println("Opcion no valida");
                break;
            } //finaliza switch opcion2 
            
            break; //  break del primer submenu 
             case 2:
                 System.out.println("Bye");
                 repetidorLinea10=0;
                 break;
             default:
                 System.out.println("Opcion invalida");
                 repetidorLinea10=0;
                 break;
                 
        }//finaliza switch opcion1 
        }
        
    } // main
    
} // fin public class 
