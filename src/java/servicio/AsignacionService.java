/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entities.Asignacion;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessionbeans.AsignacionFacadeLocal;

/**
 *
 * @author EstelaChayoMonse
 */
@WebService(serviceName = "AsignacionService")
@Stateless()
public class AsignacionService {

    @EJB
    private AsignacionFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "asignacion") Asignacion asignacion) {
        ejbRef.create(asignacion);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "asignacion") Asignacion asignacion) {
        ejbRef.edit(asignacion);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "asignacion") Asignacion asignacion) {
        ejbRef.remove(asignacion);
    }

    @WebMethod(operationName = "find")
    public Asignacion find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Asignacion> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Asignacion> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
