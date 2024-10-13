import Rater.*;

public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater r = new Rater("Google", 4.5);

        // set rating to 2
        r.setRating(2);
         
        // update review
        r.updateReview();
        
        System.out.println(r);

        // set rating to 5
        r.setRating(5);
        
        // update review
        r.updateReview();        
        
        System.out.println(r);
        
        
    }
}