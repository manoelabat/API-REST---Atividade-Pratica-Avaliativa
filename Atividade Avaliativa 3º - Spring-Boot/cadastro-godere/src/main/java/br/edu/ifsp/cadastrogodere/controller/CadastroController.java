package br.edu.ifsp.cadastrogodere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.edu.ifsp.cadastrogodere.model.Cadastro;
import br.edu.ifsp.cadastrogodere.model.CadastroRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CadastroController {
    
    @Autowired
    CadastroRepository cadastroRepository;

    @GetMapping("/cadastro")
    public List<Cadastro> getCadastro(){
        return (List<Cadastro>) cadastroRepository.findAll();
    }

    @PostMapping("/cadastro/criar")
    public Cadastro postCadastro(@RequestBody Cadastro cadastro){
        
        return cadastroRepository.save(cadastro);
    }

    @PutMapping("/cadastro/alterar.cadastro/{id}")
    public Cadastro putCadastro(@RequestBody Cadastro cadastro){
        return cadastro;
    }

    @DeleteMapping("/cadastro/deletar.cadastro/{id}")
    public String deleteCadastro(@PathVariable("id") Long id){
        if (id == 1)
        return "Remoção do cadastro "+id;
        return null;
    }
    
}
