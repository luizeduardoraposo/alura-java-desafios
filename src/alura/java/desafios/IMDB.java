package alura.java.desafios;

class IMDB {
    public void main() {
       Movies movie = new Movies();
       movie.title = "The GodFather";
       movie.year = 1972;
       movie.minutes = 175;
        System.out.println(movie);
        System.out.println(movie.year);
        System.out.println(movie.minutes);
    }
}