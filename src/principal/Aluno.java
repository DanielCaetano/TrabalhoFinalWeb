
package Objetos;


public class Aluno {
    private int matricula;
    private String nome;
    private String categoria;

    public Aluno(int matricula, String nome, String categoria){
        setMatricula(matricula);
        setNome(nome);
        setCategoria(categoria);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
