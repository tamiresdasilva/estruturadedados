package aula02.ex2;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void reservar(){
        if(disponibilidade){
            setDisponibilidade(false);
        }else{
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver(){
        setDisponibilidade(true);
    }

    //Exibir detalhes usando toString
    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Número de Páginas: " + numPaginas + "\n" +
                "Disponibilidade: " + disponibilidade;
    }
}
