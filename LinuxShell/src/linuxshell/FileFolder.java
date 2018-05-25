/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linuxshell;

import java.util.Date;

/**
 *
 * @author 77873875
 */
class FileFolder {
    private char tipo;
    private String nome;
    private String author;
    private String dimensione;
    private Date date;

    public FileFolder(char tipo, String nome, String author, String dimensione) {
        this.tipo = tipo;
        this.nome = nome;
        this.author = author;
        this.dimensione = dimensione;
        this.date= new Date();
        
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
