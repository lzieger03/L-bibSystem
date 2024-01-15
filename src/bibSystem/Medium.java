package bibSystem;

public class Medium {

    protected String title;
    protected String genre;
    protected int releaseYear;

    public Medium(){
        /*System.out.println("Keine gültige Eingabe!");
        throw new IllegalArgumentException("No arguments were provided!");*/
    }

    public Medium(String title, String genre, int releaseYear){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}
