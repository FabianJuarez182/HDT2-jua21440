/**
 * Copyright (C), 2022-2023, FabianJuarez
 * FileName: Controladora
 * Author:   Fabián Juárez
 * Date:     18/02/2022
 * @author Fabian Juarez
 */
import java.util.*;
public class Stack implements IStack<Integer>{
    Vector miVector = new Vector();

    
    /** 
     * @return int
     */
    @Override
    public int count() {
        int longitud = miVector.size();
        return longitud;
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        boolean result ;
        if(this.count() > 0){
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }

    
    /** 
     * @return Integer
     */
    @Override
    public Integer peek() {
        Integer numero;
        if(this.count() > 0){
            numero = (Integer) miVector.elementAt(this.count()-1);
        }
        else{
            numero = (Integer) null;
        }
        return numero;
    }

    
    /** 
     * @return Integer
     */
    @Override
    public Integer pull() {
        Integer numero;
        if(this.count() > 0){
            numero = (Integer) miVector.elementAt(this.count()-1);
            miVector.removeElementAt(this.count()-1);
        }
        else{
            numero = (Integer) null;
        }
        return numero;
    }

    
    /** 
     * @param value
     */
    @Override
    public void push(Integer value) {
        miVector.addElement(value);
    }


}
