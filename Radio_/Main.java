import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Scanner principal
    Scanner sc = new Scanner(System.in);
    RadioImp r = new RadioImp();

    //variables controladoras
    boolean salir = false;
    
    //Inicio del ciclo while (para encender y apagar la radio)
    while (!salir){
        //Menú inicial
        System.out.println("\n Radio");
        System.out.println("1) Encender la radio");
		    System.out.println("2) Apagar");
        Integer opcion = 0;
        
        //Creación de scan 2 (progra defensiva)
        Scanner sc2 = new Scanner(System.in);

        //Probar si la opción ingresada es un número
        try{
          opcion = sc2.nextInt();
        } catch (Exception e) {   //Si no, imprimir mensaje de error
          System.out.println("Ingrese una opción valida");
        }

        //Ejecutar el switch
        switch(opcion){
            case 1: //Opción 1
            boolean salir1 = false; //variable controladora
            System.out.println("Encendido");  //Mensaje que está encendido 
            
            //While de tipos de frecuencia
            while (!salir1){
              //Menú
              System.out.println("\n Tipo: \n-AM \n-FM ");
              //Crear nuevo scanner
              Scanner sc3 = new Scanner(System.in);
              //Entrada del usuario
              String tipo1 = sc3.nextLine();

              boolean salir2 = false; //Variable controladora

              //while del menú de acciones  
              if(tipo1.equalsIgnoreCase("AM")){
                //Menú de acciones AM
                while (!salir2){
                System.out.println("\n1) Cambiar emisoras");
                System.out.println("2) Guardar emisora ");
                System.out.println("3) Apagar la radio");
                
                //Ingreso de datos
                Integer opcion1 = 0;

                //Creación de scan (progra defensiva)
                Scanner sc4 = new Scanner(System.in);

                //Probar si la opción ingresada es un número
                try{
                  opcion1 = sc4.nextInt();
                } catch (Exception e) {   //Si no, imprimir mensaje de error
                  System.out.println("Ingrese una opción valida");
                }
                  
                switch (opcion1){
                  case 1: //opción 1
                  //Salir al menu de frecuencias
                   System.out.println("Ingrese la estación: ");
                   double _station = sc.nextDouble();
                   r.setStation(_station);
                  salir2 = true;
                  break;
                  case 2: //opción 2
                  System.out.println("Seleccione un número del 1-12 para guardar la emisora: ");
                  int _positionAM = sc.nextInt();
                  r.setPositionAM(_positionAM);
                  
                  while (!(0<_positionAM && _positionAM <13)){
                      Scanner sc5 = new Scanner(System.in);
                      
                      try{_positionAM = sc.nextInt();
                    }
                      catch(Exception e){System.out.println("Ingrese una opción válida");
                    }


                    if (!(0<_positionAM && _positionAM <13)) {
                        System.out.println("Ingrese un número del 1-12"); 
                    }
                }
                    System.out.println("La emisora "+ r.getStation() +" se ha guaradado en el boton "+ r.getPositioAM());
                    
                    System.out.println("Desea guardar otra emisora si/no");
						String op = sc.nextLine();
			
						if(op.equalsIgnoreCase("no")){
						  salir2 = true; 
					}

                  break;
                  case 3: //opción 3
                    //Cambio de variables controladoras
                    salir1 = true;
                    salir2 = true;
                    //mensaje de salida
                    System.out.println("Apagando......");
                    break;
                    default: //si se ingresó una opción no valida 
                    System.out.println("Seleccione una opción valida por favor."); 
                    break;
                  }
                }//salir1 = true;
              }//salir1 = true;
                
              if(tipo1.equalsIgnoreCase("FM")){
                while (!salir2){
                  System.out.println("\n1) Cambiar emisoras");
                  System.out.println("2) Guardar emisora ");
                  System.out.println("3) Regresar");
                  //Ingreso de datos
                  Integer opcion2 = 0;

                  //Creación de scan (progra defensiva)
                  Scanner sc5 = new Scanner(System.in);

                  //Probar si la opción ingresada es un número
                  try{
                    opcion2 = sc5.nextInt();
                  } catch (Exception e) {   //Si no, imprimir mensaje de error
                    System.out.println("Ingrese una opción valida");
                  }

                  switch (opcion2){
                    case 1:
                    System.out.println("Ingrese la estación: ");
                    double _station = sc.nextDouble();
                    r.setStation(_station);
                    break;
                    case 2:
                    System.out.println("Seleccione un número del 1-12 para guardar la emisora: ");
                    int _positionFM = sc.nextInt();
                    r.setPositionAM(_positionFM);
                
                    while (!(0<_positionFM && _positionFM <13)){
                      Scanner sc6 = new Scanner(System.in);
                      
                      try{_positionFM = sc.nextInt();
                    }
                      catch(Exception e){System.out.println("Ingrese una opción válida");
                    }
                    if (!(0<_positionFM && _positionFM <13)) {
                        System.out.println("Ingrese un número del 1-12"); 
                    }
                }
                    System.out.println("La emisora "+ r.getStation() +" se ha guaradado en el boton "+ r.getPositioFM());

                    break;
                    case 3:
                      //Cambio de variables controladoras
                      salir1 = true;
                      salir2 = true;
                      //mensaje de salida
                      System.out.println("Apagando......");
                      break;
                      default: //si se ingresó una opción no valida 
                      System.out.println("Seleccione una opción valida por favor."); 
                      break;
                  }
                }
              } 
            }

            case 2: //Opción 2
            salir = true;
            System.out.println("Apagado");
            break;
            
            default:
            System.out.println("Seleccione una opción valida por favor. Elija 1 para encedender la radio o elija 2 para apagar la radio."); 
            break;
        }
    } salir = true; sc.close();
  } 
}