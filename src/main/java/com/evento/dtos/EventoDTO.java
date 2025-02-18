package com.evento.dtos;

import java.awt.image.BufferedImage;
import java.util.Date;

public class EventoDTO {
    private Long id;
    private Date data;
    private String descricao;
    private String classificacao;
    private int hora_inicio;
    private int hora_fim;
    private int hora_abertura;
    private BufferedImage imagem;

    public  EventoDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(int hora_fim) {
        this.hora_fim = hora_fim;
    }

    public int getHora_abertura() {
        return hora_abertura;
    }

    public void setHora_abertura(int hora_abertura) {
        this.hora_abertura = hora_abertura;
    }

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }
}
