/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entities.Imagen;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import sessionbeans.ImagenFacadeLocal;

/**
 *
 * @author EstelaChayoMonse
 */
@WebService(serviceName = "ImagenService")
@Stateless()
public class ImagenService {

    @EJB
    private ImagenFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "imagen") Imagen imagen) {
        ejbRef.create(imagen);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "imagen") Imagen imagen) {
        ejbRef.edit(imagen);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "imagen") Imagen imagen) {
        ejbRef.remove(imagen);
    }

    @WebMethod(operationName = "find")
    public Imagen find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Imagen> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Imagen> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
