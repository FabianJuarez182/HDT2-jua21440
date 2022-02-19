/**
 * Copyright (C), 2022-2023, FabianJuarez
 * FileName: Controladora
 * Author:   Fabián Juárez
 * Date:     18/02/2022
 * @author Fabian Juarez
 */
import java.io.File;
import java.util.Scanner;

public class Controladora{

    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Atributos
        Vista miVista = new Vista();
        PosfixCalc miCalc = new PosfixCalc();
        File doc = new File("datos.txt");
        Scanner obj = new Scanner(doc);
        String dato;
        int contadorLineas=0;
        miVista.mensaje("");
        while (obj.hasNextLine()){
            dato = obj.nextLine().trim();
            contadorLineas++;
            if(dato.length()>0){
                miVista.mensaje("Operacion: " + dato);
                miVista.mensaje("Resultado de la operacion: " + String.valueOf(miCalc.Evaluate(dato)));
            }
            else{
                miVista.mensaje("No existen operaciones en la linea " + contadorLineas);
            }
            miVista.mensaje("------------------------------");
        }
        obj.close();

    }
}