package programusingconstructor;
class Marvel {
    String film;
    int released_year;
    String director_name;

    Marvel(String film, int released_year, String director_name) {
        this.film = film;
        this.released_year = released_year;
        this.director_name = director_name;
    }

    public static void main(String[] args) {
        Marvel M1 = new Marvel("Iron man", 2008, "Jon Favraeu");
        System.out.println(M1.film);
        System.out.println(M1.released_year);
        System.out.println(M1.director_name);
            
    }
}