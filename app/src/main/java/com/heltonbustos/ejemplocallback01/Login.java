package com.heltonbustos.ejemplocallback01;

public class Login {

    public int verificar(String user, String pass, InterfaceCallback callback){
        if(user.equals("admin") && pass.equals("123")){
            callback.segundoMetodo();
            return 1;
        }
        else{
            callback.segundoMetodo();
            return 0;
        }
    }

}
