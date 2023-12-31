package br.ufsm.csi.poow2.spring_rest_security.dao;

import br.ufsm.csi.poow2.spring_rest_security.model.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private List<Usuario> users = new ArrayList<>();


    public Usuario getUsuario(String login){
        //fez consulta no BD e trouxe esse usuario com esses valores
        if(login.equals("hu@")){

            return new Usuario("hu@",
                    new BCryptPasswordEncoder().encode("123"), "USER");

        }if(login.equals("pietra@teste")){
            System.out.println("pietra logando ....");

            return new Usuario("pietra@teste",
                    new BCryptPasswordEncoder().encode("1234"), "USER");
        }else{
            return null;
        }
    }
}