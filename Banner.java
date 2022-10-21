/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {

    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the
     * message
     */
    public void display() {
        int count = this.message.length();
        String countSquiggle = "  ** ~~";
        String squiggle = "~";

        String countAstrisk = "    ***";
        String astrisk = "*";
        while (count > 0) {
            countSquiggle = countSquiggle.concat(squiggle);
            countAstrisk = countAstrisk.concat(astrisk);
            count -= 1;

        }
        String endSquiggle = "~~ **  ";
        countSquiggle = countSquiggle.concat(endSquiggle);

        String endAstrisk = "***    ";
        countAstrisk = countAstrisk.concat(endAstrisk);

        System.out.println(countAstrisk);
        System.out.println(countSquiggle);
        System.out.print("*** ~  ");
        System.out.print(this.message);
        System.out.println("  ~ ***");
        System.out.println(countSquiggle);
        System.out.println(countAstrisk);

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("i walked to the store");
        myBanner.display();
    }
}
