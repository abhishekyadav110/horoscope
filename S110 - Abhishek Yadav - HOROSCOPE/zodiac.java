import java.io.*;
import java.lang.*;
public class zodiac
{
public static void main(String a[]
) throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("___      ___   __   ___  ___  __  __       __   __   ___  __ ");
System.out.println(" |  |__||__   |__| |___   |  |   |  | |   |  | |  _ |__  |   ");
System.out.println(" |  |  ||___  |  |  ___|  |  |   |__| |__ |__| |__| |___ |   ");
System.out.println("");
System.out.println("Made By Abhishek Yadav");
System.out.println("class =  SYCS");
System.out.println("Roll NO=S110");
System.out.println("");
System.out.println("");
System.out.println("WELCOME TO THE HOROSCOPE AND LUCK READER.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("(1).Know Your Horoscope.");
System.out.println("(2).Know Your Lucky Colours And Numbers.");
System.out.println("(3).Exit.");

System.out.print("Enter Choice : ");
int ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1 :
System.out.print("The month you were born (1-12) : " );
int month = Integer.parseInt(br.readLine());

System.out.print("The day : " );
int day = Integer.parseInt(br.readLine());


char zodiacSign;
 
switch (month)
{
case 1 :
if (day > 0 && day < 20)
zodiacSign = 'C';
else if (day >= 20 && day < 32)
zodiacSign = 'A';
else
zodiacSign = 'W';
break;

case 2 :
if (day > 0 && day < 19)
zodiacSign = 'A';
else if (day >= 19 && day < 30)
zodiacSign = 'P';
else
zodiacSign = 'W';
break;

case 3 :
if (day > 0 && day <= 20)
zodiacSign = 'P';
else if (day > 20 && day < 32)
zodiacSign = 'I';
else
zodiacSign = 'W';
break;

case 4 :
if (day > 0 && day < 20)
zodiacSign = 'I';
else if (day >= 20 && day < 31)
zodiacSign = 'T';
else
zodiacSign = 'W';
break;

case 5 :
if (day > 0 && day < 21)
zodiacSign = 'T';
else if (day >= 21 && day < 32)
zodiacSign = 'G';
else
zodiacSign = 'W';
break;

case 6 :
if (day > 0 && day < 21)
zodiacSign = 'G';
else if (day >= 21 && day < 31)
zodiacSign = 'R';
else
zodiacSign = 'W';
break;

case 7 :
if (day > 0 && day <= 22)
zodiacSign = 'R';
else if (day > 22 && day < 32)
zodiacSign = 'L';
else
zodiacSign = 'W';
break;

case 8 :
if (day > 0 && day <= 22)
zodiacSign = 'L';
else if (day > 22 && day < 32)
zodiacSign = 'V';
else
zodiacSign = 'W';
break;

case 9 :
if (day > 0 && day <= 22)
zodiacSign = 'V';
else if (day > 22 && day < 31)
zodiacSign = 'B';
else
zodiacSign = 'W';
break;

case 10 :
if (day > 0 && day <= 22)
zodiacSign = 'B';
else if (day >= 23 && day < 32)
zodiacSign = 'S';
else
zodiacSign = 'W';
break;

case 11 :
if (day > 0 && day <= 21)
zodiacSign = 'S';
else if (day > 21 && day < 32)
zodiacSign = 'U';
else
zodiacSign = 'W';
break;

case 12 :
if (day > 0 && day <= 21)
zodiacSign = 'U';
else if (day > 21 && day < 32)
zodiacSign = 'C';
else
zodiacSign = 'W';
break;

default :
zodiacSign = 'W';
}
switch (zodiacSign)
{
case 'C' :
System.out.println("CAPRICORN");
System.out.println("There will times when speaking frankly is required. January is a good month to earn.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'A' :
System.out.println("AQUARIUS");
System.out.println("Let go of the past instead of focusing on what went wrong and how you could have handled the situation differently. A movie is enjoyable.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'P' :
System.out.println("PISCES");
System.out.println("Your Life is headed for a great success in the immediate future. Colleagues may not be helpful and you may have to put in a little extra work to meet the deadline.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'I' :
System.out.println("ARIES");
System.out.println("Just be patient and calm down in dealing with things. A carnival with friends is more than enough for this month's refreshments.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'T' :
System.out.println("TAURUS");
System.out.println("Life will bring surprises and events that you could have never have imagined some time back. Just focus on your tasks and proirise them.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'G' :
System.out.println("GEMINI");
System.out.println("Be careful with money and valuables. There is a reconcilation with someone you have not met for some time.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'R' :
System.out.println("CANCER");
System.out.println("Don't get hyper just cool down during tough times. Try out meditation to improvise your nature.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'L' :
System.out.println("LEO");
System.out.println("Need to change attitude and approach to life. Begin good and properous tasks on Tuesdays. ");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'V' :
System.out.println("VIRGO");
System.out.println("Sometimes there are no easy solutions and even a compromise may not work in your favour. Daily talks with colleagues will help deal with other issues calmly and sensibly.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'B' :
System.out.println("LIBRA");
System.out.println("The leadership quality in you will help you this month. Consciously bring a thought alteration at the soul level.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");

break;
case 'S' :
System.out.println("SCORPIO");
System.out.println("A trip abroad is jinxed as one family member has a change of plans regarding work. Taking on added responsibility is something you really don't need to.");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'U' :
System.out.println("SAGITTARIUS");
System.out.println("A vist to another country is possible. Think before replying to an e-mail and mail it to yourself too to be on the safe side. Lonely sagittarians will make two new friends. ");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;
case 'W' :
System.out.println("WRONG CHOICE");
default :
System.out.println("WRONG CHOICE");

}
break;
case 2 :
System.out.print("The month you were born (1-12) : ");
int month1=Integer.parseInt(br.readLine());
switch (month1)
{
case 1 :
System.out.println("LUCKY COLOUR : Ochre Yellow");
System.out.println("LUCKY NUMBER : 15,29");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 2 :
System.out.println("LUCKY COLOUR : Dark Brown");
System.out.println("LUCKY NUMBER : 10,45");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 3 :
System.out.println("LUCKY COLOUR : Teal");
System.out.println("LUCKY NUMBER : 19,62");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 4 :
System.out.println("LUCKY COLOUR : Violet");
System.out.println("LUCKY NUMBER : 55,68");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 5 :
System.out.println("LUCKY COLOUR : Maroon");
System.out.println("LUCKY NUMBER : 14,75");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 6 :
System.out.println("LUCKY COLOUR : Forest Green");
System.out.println("LUCKY NUMBER : 34,67");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 7 :
System.out.println("LUCKY COLOUR : Dark Green");
System.out.println("LUCKY NUMBER : 33,76");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 8 :
System.out.println("LUCKY COLOUR : Orange");
System.out.println("LUCKY NUMBER : 98,41");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 9 :
System.out.println("LUCKY COLOUR : Grey");
System.out.println("LUCKY NUMBER : 16,44");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 10 :
System.out.println("LUCKY COLOUR : Black");
System.out.println("LUCKY NUMBER : 89,28");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 11 :
System.out.println("LUCKY COLOUR : White");
System.out.println("LUCKY NUMBER : 46,32");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

case 12 :  
System.out.println("LUCKY COLOUR : Red");
System.out.println("LUCKY NUMBER : 22,56");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

default : 
System.out.println("WRONG CHOICE");
}
break;

case 3 :
System.out.println("THANK YOU FOR VISITING. VISIT AGAIN");
break;

default:
System.out.println("WRONG CHOICE");
}
}
}