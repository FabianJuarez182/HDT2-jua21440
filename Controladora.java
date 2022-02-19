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
    public static void main(String[] args) throws Exception {
        //Atributos
        Vista miVista = new Vista();
        PosfixCalc miCalc = new PosfixCalc();
        File doc = new File("datos.txt");
        Scanner obj = new Scanner(doc);
        String dato = String.valueOf(obj).trim();
        if(dato.length()>0){
            miVista.mensaje("Operacion: " + dato);
            miVista.mensaje("Resultado de la operacion: " + String.valueOf(miCalc.Evaluate(dato)));
        }
        else{
            miVista.mensaje("No existen operaciones en el archivo");
        }
        while (obj.hasNextLine()){
            miVista.mensaje("------------------------------");
            dato = String.valueOf(obj.nextLine()).trim();
            miVista.mensaje("Operacion: " + dato);
            miVista.mensaje("Resultado de la operacion: " + String.valueOf(miCalc.Evaluate(dato)));
        }
        obj.close();

    }
}