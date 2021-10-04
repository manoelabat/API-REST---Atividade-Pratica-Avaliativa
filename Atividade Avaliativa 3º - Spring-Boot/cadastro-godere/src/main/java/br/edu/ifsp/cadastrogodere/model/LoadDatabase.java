package br.edu.ifsp.cadastrogodere.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDataBase(CadastroRepository repository){
        return args ->{
            //Código de inserção de dados iniciais no Banco de Dados.
            Cadastro cadastro1 = new Cadastro("Maria", "artdamaria", 10/05/2003, "mariart@gmail.com", "Pintura", 123);
            Cadastro cadastro2 = new Cadastro("Caetano", "Cart", 8/11/2001, "caetanoartista@gmail.com", "Escultura", 841);
        
            log.info("Inserindo no Banco de Dados: " + repository.save(cadastro1));
            log.info("Inserindo no Banco de Dados: " + repository.save(cadastro2));
        };
    }
}
