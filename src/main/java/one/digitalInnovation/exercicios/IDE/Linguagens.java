package one.digitalInnovation.exercicios.IDE;
/*
Crie uma classe linguagemFavorita que possua os atributos nome, anoDeCriação e ide.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    Ordem de inserção
    Ordem natural(nome);
    IDE;
    ano de fabricação e nome;
    nome, ano de criação e ide;
Ao final exiba as linguagens no console um abaixo do outro.
 */

import java.util.Objects;

public class Linguagens implements Comparable<Linguagens> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens linguagens1 = (Linguagens) o;
        return Objects.equals(nome, linguagens1.nome) && Objects.equals(anoDeCriacao, linguagens1.anoDeCriacao) && Objects.equals(ide, linguagens1.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Linguagens(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;


    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(Linguagens o) {
        return this.nome.compareToIgnoreCase(o.nome);
    }
}
