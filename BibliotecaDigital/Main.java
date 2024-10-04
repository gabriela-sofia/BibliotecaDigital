public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("The Lighthouse", "Robert Eggers");
        Ebook ebook2 = new Ebook("High Life", "Claire Denis");


        VideoDigital video1 = new VideoDigital("Remember Me", "Allen Coulter");
        VideoDigital video2 = new VideoDigital("The Twilight", "Bill Condon");


        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());


        ebook1.baixar();
        ebook2.baixar();


        System.out.println(video1.descricao());
        System.out.println(video2.descricao());


        video1.baixar();
        video1.visualizar();
        video2.baixar();
        video2.visualizar();
    }
}
