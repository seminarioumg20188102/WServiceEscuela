/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Asignacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author EstelaChayoMonse
 */
@Local
public interface AsignacionFacadeLocal {

    void create(Asignacion asignacion);

    void edit(Asignacion asignacion);

    void remove(Asignacion asignacion);

    Asignacion find(Object id);

    List<Asignacion> findAll();

    List<Asignacion> findRange(int[] range);

    int count();
    
}
