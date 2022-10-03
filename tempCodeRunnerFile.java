import java.io.*;

public class vowelword
{
    public static void main(String arg[])throws IOException
    {
        int l,i,n, p, nowwv;
        boolean flag = true;
        char ch, fc, lc, lastChar;
        String str, prefix = "", suffix = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence : ");
        str = br.readLine();

        l = str.length();
        lastChar = str.charAt(l-1); // Extract the last character

        if(lastChar != '.' && lastChar != '?' && lastChar != '!')
            System.out.println("INVALID INPUT");
        else{

            //Pointer to the first character of each word
            p = 0;
            // store no of words starting and ending with a vowel
            nowwv = 0;

            for(i = 0; i < l; i++){

                ch = str.charAt(i);

                if(ch == ' ' || ch == '?' || ch == '!' || ch == '.'){

                    //Check if first and last character of the word is a vowel
                    if(isVowel(str.charAt(p)) && isVowel(str.charAt(i-1))){

                        //Add words starting and ending with a vowel
                        prefix += str.substring(p,i) + " ";
                        nowwv++;

                    }else{

                        //Add words that doesn't start and end with a vowel
                        suffix += str.substring(p,i) + " ";

                    }

                    p = i + 1;

                }//if

            }//for loop

            System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + nowwv);
            System.out.println(prefix + suffix);

        }//else

    }//end of main

   //Return true if 'ch' is a vowel else returns false
    private static boolean isVowel(char ch){

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;

    }//end of isVowel

}//end of class