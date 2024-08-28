package business;

import java.time.LocalDate;

public class Pessoa {
    private String nome; // sem caracteres especiais || numeros
    private LocalDate dtNascimento; // > 01/01/1900 && < hoje
    private float altura; // > 0 && < 3
    private float peso; // > 0 && < 300
    private float renda; // >= 0
    private boolean feliz;
    private Escolaridade escolaridade;
    private EstadoCivil estadoCivil;
    private Genero genero;
    private Hobbie hobbie;
    private Moradia moradia;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.matches("[\\p{L} '`´]+")) {
            this.nome = nome;
        }
    }
    public LocalDate getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        if(altura > 0 && altura < 3) {
            this.altura = altura;
        }
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        if(peso > 0 && peso < 300){
            this.peso = peso;}
    }
    public float getRenda() {
        return renda;
    }
    public void setRenda(float renda) {
        if(renda >= 0) {
            this.renda = renda;
        }
    }
    public boolean isFeliz() {
        return feliz;
    }
    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }
    public Escolaridade getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Hobbie getHobbie() {
        return hobbie;
    }
    public void setHobbie(Hobbie hobbie) {
        this.hobbie = hobbie;
    }
    public Moradia getMoradia() {
        return moradia;
    }
    public void setMoradia(Moradia moradia) {
        this.moradia = moradia;
    }



}
