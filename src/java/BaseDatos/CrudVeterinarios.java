/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author Miguel Angel
 */
public class CrudVeterinarios extends Conexion {
    public void insertarVeterinarios (Veterinarios veterinario){
        try{
            conexionbd();
            String insertar ="call insertarVeterinario ('"+veterinario.getId()+"', '"+veterinario.getNombre()+"', '"+veterinario.getApellidos()+"', '"+veterinario.getEspecialidad()+"', '"+veterinario.getFechaIngreso()+"', '"+veterinario.getSalario()+"');";
            sentencia.executeQuery(insertar);
        }catch (Exception e){
            
        }
    }
    public void consultarVeterinarios (Veterinarios veterinario){
        try{
            conexionbd();
            String consultar ="select *from veterinarios";
            sentencia.execute(consultar);
        }catch (Exception e){
            
        }
    }
    public void asignarRevisiones (Revisiones revision){
        try{
            conexionbd();
            String asignar ="call asignarRevisiones ('"+revision.getId()+"', '"+revision.getDescripcion()+"', '"+revision.getFechaIngreso()+"', '"+revision.getFechaSalida()+"', '"+revision.getTratamiento()+"', '"+revision.getObservaciones()+"', '"+revision.getEstatus()+"', '"+revision.getIdAnimal()+"', '"+revision.getConcentrado()+"', '"+revision.getIdVeterinario()+"');";
            sentencia.execute(asignar);
        }catch (Exception e){
            
        }
    }
}
