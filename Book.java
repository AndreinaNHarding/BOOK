/**
 * 
 *
 * @author (Andreina Nunez A01011804)
 * @version (date 1/19/2019)
 * @asigment lab 2b
 */
public class Book
{
    private String title;
    private String authorLastName;
    private String authorFirstName;
    private double weightOfTheBook;
    private boolean isFiction;
    private int yearPublished;
    /**
     * The constructor of book objects
     * @param theTitle
     * @param theYearPublished
     * @param TheAuthorLastName
     * @param isFiction Whether the book is fiction or not
     */
    public Book (int theYearPublished, String theTitle, String theAuthorLastName, String theAuthorFirstName,
                 double theWeightOfTheBook, boolean fictionMovie){

        if(theTitle!=null) {
            title=theTitle;
        }
        else {
            throw new IllegalArgumentException("title is not null");
        }

        if (theAuthorLastName!=null){
            authorLastName=theAuthorLastName;
        }
        else {
            throw new IllegalArgumentException("name is not null");
        }

        if (theAuthorFirstName!=null){
            authorFirstName=theAuthorFirstName;
        }
        else {
            throw new IllegalArgumentException("fname is not null");
        }

        if (theWeightOfTheBook>=0 && theWeightOfTheBook<10 ) {
            weightOfTheBook=theWeightOfTheBook;
        }
        else{throw new IllegalArgumentException ("Weight between 0 and 10K");
        }

        if(!isFiction) {
            throw new IllegalArgumentException ("only fiction movie");
        }

        if(theYearPublished>=1455 && theYearPublished<=2019) {
            yearPublished=theYearPublished;
        }
        else{throw new IllegalArgumentException("year between 1455 and 2019");
        }
    }

}