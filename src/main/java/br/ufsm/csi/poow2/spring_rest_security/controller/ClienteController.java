package br.ufsm.csi.poow2.spring_rest_security.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

/*    private static ClienteDAO clienteDAO = new ClienteDAO();

    //alencar - USER
    @GetMapping("/cliente")
    public Cliente getCliente(){
        return new ClienteDAO().getCliente();
    }

    //pietra - ADMIN
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/clientes")
    public ArrayList<Cliente> getClientes(){
        return  clienteDAO.getClientes();

    }

    @PostMapping("/incluir")
    public Cliente adicionar(@RequestParam(value = "id") int id, @RequestParam(value = "nome") String nome){

        return clienteDAO.incluir(new Cliente(id, nome));

    }

    @PostMapping("cadastrar")
    public String cadastrarCliente(@RequestBody Cliente cliente){


       // new ClienteDAO().incluir(cliente);

        if (clienteDAO.incluir(cliente) != null){
            return "Cliente cadastrado com sucesso";
        }else{
            return null;
        }
    }*/

}
