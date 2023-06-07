import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Book implements Serializable {
    //private int ISBN;
    private String author;

    ///region Constructor

    public Book(int ISBN, String author) {
        //this.ISBN = ISBN;
        this.author = author;
    }

    public Book() {
    }

    ///endregion

    ///region Get and Set
    /*
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
*/
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "book{" +
                //"ISBN=" + ISBN +
                ", author='" + author + '\'' +
                '}';
    }


    ///endregion
}
