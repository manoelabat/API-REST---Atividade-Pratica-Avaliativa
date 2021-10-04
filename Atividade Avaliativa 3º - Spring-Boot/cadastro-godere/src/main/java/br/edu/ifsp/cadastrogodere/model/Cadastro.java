package br.edu.ifsp.cadastrogodere.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String nickname;
    private int dataNascimento;
    private String email;
    private String artePreferida;
    private int senha;

    public Cadastro() {
        
    }
    public Cadastro(String nome, String nickname, int dataNascimento, String email, String artePreferida,
            int senha) {
        this.nome = nome;
        this.nickname = nickname;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.artePreferida = artePreferida;
        this.senha = senha;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getArtePreferida() {
        return artePreferida;
    }
    public void setArtePreferida(String artePreferida) {
        this.artePreferida = artePreferida;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
}


