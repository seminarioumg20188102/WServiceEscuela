/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entities.Alumno;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessionbeans.AlumnoFacadeLocal;

/**
 *
 * @author EstelaChayoMonse
 */
@WebService(serviceName = "AlumnoService")
@Stateless()
public class AlumnoService {

    @EJB
    private AlumnoFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "alumno") Alumno alumno) {
        ejbRef.create(alumno);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "alumno") Alumno alumno) {
        ejbRef.edit(alumno);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "alumno") Alumno alumno) {
        ejbRef.remove(alumno);
    }

    @WebMethod(operationName = "find")
    public Alumno find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Alumno> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Alumno> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
