
package br.lpm.business;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;
    private int peso;
    private float renda;
    private String naturalidade;
    private boolean isFeliz;
    private Escolaridade escolaridade;
    private EstadoCivil estadoCivil;
    private Genero genero;
    private Hobby hobby;
    private Moradia moradia;

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

    public Hobby getHobby() {
        return hobby;
    }
    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public Moradia getMoradia() {
        return moradia;
    }
    public void setMoradia(Moradia moradia) {
        this.moradia = moradia;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(isStringValida(nome)) {
        this.nome = nome;
        }
    }   

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int ano, int mes, int dia) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        if(LocalDate.now().isAfter(data)) {
            this.dataNascimento = data;
        }
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        if(altura > 0 && altura < 4) {
            this.altura = altura;
        }
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        if(peso > 0 && peso < 400) {
            this.peso = peso;
        }
    }

    public float getRenda() {
        return renda;
    }
    public void setRenda(float renda) {
        if(renda > 0) {
            this.renda = renda;
        }
    }

    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        if(isStringValida(naturalidade)) {
            this.naturalidade = naturalidade;
            }
    }

    public boolean isFeliz() {
        return isFeliz;
    }
    public void setFeliz(boolean isFeliz) {
        this.isFeliz = isFeliz;
    }

    private boolean isStringValida(String nome) {
        char[] nomeCompleto = nome.toCharArray();
    
        for(char letra: nomeCompleto) {
            if(!Character.isLetter(letra) && !Character.isWhitespace(letra)) {
                return false;
            }
        }

        return true;
    }

    public Pessoa() {};

    public Pessoa(String nome, LocalDate dataNascimento, float altura, int peso, float renda,
                  String naturalidade, boolean isFeliz, Escolaridade escolaridade,
                  EstadoCivil estadoCivil, Genero genero, Hobby hobby, Moradia moradia) {
        setNome(nome);
        this.dataNascimento = LocalDate.now();
        setAltura(altura);
        setPeso(peso);
        setRenda(renda);
        setNaturalidade(naturalidade);
        setFeliz(isFeliz);
        setEscolaridade(escolaridade);
        setEstadoCivil(estadoCivil);
        setGenero(genero);
        setHobby(hobby);
        setMoradia(moradia);
    }
}
