/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.ResultSet;

/**
 *
 * @author Miguel Angel
 */
public class CrudAnimales extends Conexion{
    public void insertarAnimales (Animales animal){//INSERTAR ANIMALES
        try{
            conexionbd();
            String insertar ="call zoologico.insertar_animales('"+animal.getId()+"', '"+animal.getNombre()+"', '"+animal.getEspecie()+"', '"+animal.getPaisOrigen()+"', '"+animal.getEstatus()+"', '"+animal.getPeso()+"', '"+animal.getAltura()+"', '"+animal.getDieta()+"', '"+animal.getSexo()+"', '"+animal.getNivelRiesgo()+"', '"+animal.getNivelRiesgo()+"', '"+animal.getIDHabitad()+"', '"+animal.getPresProp()+"');";
            sentencia.execute(insertar);
        }catch(Exception e){
            
        }
    }
    
   public ResultSet Animales(){
        conexionbd();
       try{
            String query = "SELECT * FROM animales;";
        resultado = sentencia.executeQuery(query);
       }catch(Exception e){
           resultado =null;
       }
        return resultado;
    }

   
   public void asignarHabitad(Animales animal){
       try{
           conexionbd();
           String asignar ="call asignarHabitad ('"+animal.getId()+"', '"+animal.getIDHabitad()+"');";
           sentencia.execute(asignar);
       }catch(Exception e){
       
       }
   }
}
