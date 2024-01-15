package bibSystem;

import Prog1Tools.IOTools;

public class Book extends Medium  {
    private String authorFirstName;
    private String authorLastName;
    private String isbn;

    public Book(){
        super();
        /*System.out.println("Keine gültige Eingabe!");
        throw new IllegalArgumentException("No arguments were provided!");*/
    }

    public Book(String authorFirstName, String authorLastName, String title, String genre, int releaseYear, String isbn){
        super(title, genre, releaseYear);
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
    }

    public void eingabe(){
        title = IOTools.readLine("Buchtitel: ");
        authorFirstName = IOTools.readLine("Vorname des Authors: ");
        authorLastName = IOTools.readLine("Nachname des Authors: ");
        genre = IOTools.readLine("Genre des Buchs: ");
        releaseYear = IOTools.readInt("Erscheinungsjahr: ");
        isbn = IOTools.readLine("ISBN eingeben: ");
    }

    @Override // <-- "Decorator"
    public String toString(){
        return  title + " von " +
                authorFirstName + " " + authorLastName + " im Genre " +
                genre + " ist im Jahr " +
                releaseYear + " erschienen und hat die ISBN: " +
                isbn;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }
}