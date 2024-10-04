abstract class ItemBibliotecaDigital {
    private String titulo;
    private String diretor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.diretor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return diretor;
    }

    public abstract String descricao();
}

interface Baixavel {
    void baixar();
}

interface Visualizavel {
    void visualizar();
}


class Ebook extends ItemBibliotecaDigital implements Baixavel {
    public Ebook(String titulo, String diretor) {
        super(titulo, diretor);
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + " - Diretor: " + getAutor();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
    }
}


class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String diretor) {
        super(titulo, diretor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + " - Diretor: " + getAutor();
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo: " + getTitulo());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando o vídeo: " + getTitulo());
    }
}

