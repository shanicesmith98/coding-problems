public class Movies {
    int year;
    double rating;
    String title;
    String genre;

    // constructor allows us to create new instances of class Movies
    public Movies(int yearReleased, double currentRating, String movieTitle, String movieGenre) {
        year = yearReleased;
        rating = currentRating;
        title = movieTitle;
        genre = movieGenre;
    }
    
    // public method to compare movie ratings
    public static boolean betterRating(double first, double second) {
        if (first > second) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // creating new instances of the class Movies
        Movies Pocahontas = new Movies(1995, 6.7, "Pocahontas","Animation, Drama, Adventure");
        Movies spiderVerse = new Movies(2018, 8.4, "SpiderMan: Into the Spider-Verse", "Animation, Action, Adventure");
        Movies Contact = new Movies(1997, 7.4, "Contact", "Sci-Fi, Drama, Mystery");
        Movies Thirteen = new Movies(2003, 6.8, "Thirteen", "Drama");

        // printing out variables of instances to screen using dot notation
        System.out.println(Pocahontas.genre);
        System.out.println(spiderVerse.title);
        System.out.println(Contact.rating);
        System.out.println(Thirteen.year);
        System.out.print("Is SpiderVerse a better rated movie than Thirteen? ");
        System.out.println(betterRating(spiderVerse.rating, Thirteen.rating));
        System.out.print("Is Pocahontas a better rated movie than Thirteen? ");
        System.out.println(betterRating(Pocahontas.rating, Thirteen.rating));
    }
}
