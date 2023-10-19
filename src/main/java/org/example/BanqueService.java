package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double Conversion(@WebParam(name = "montant") double mt){
        return mt*10.85;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,2336,new Date());
    }

    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1,5354,new Date()),
                new Compte(2,7354,new Date()),
                new Compte(3,9354,new Date())
        );
    }
}
