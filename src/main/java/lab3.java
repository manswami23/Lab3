import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/** This is lab 3.
 *
 * @author Mani
 *
 */

public class lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    /** This is lab 3.
    *
    * @author Mani
    *@param args
    */

    public static void main(String[]args)
    {
        String text=urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(text);
        int count=0;
        int i=0;
        char[] list= {' ', '\"', '\'', '?', '!', '.', ',', '(', ')', '[', ']'};

        while (i < text.length())
        {


            for(char ch:list)
            {
                if(text.charAt(i)==ch)
                {
                    count++;
                    i++;
                }
            }
            i++;


        }

        System.out.println(count);
    }
}
