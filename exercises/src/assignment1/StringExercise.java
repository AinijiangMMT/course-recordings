package assignment1;
public class StringExercise {
	public static void main(String[] args) {
// 1)String can express complex numbers that way exceeds limit. 
	short h=4;
	String g="4534564455666544555555555555444555555664344";
	System.out.println(g);
	/*2)String can express numbers or characters that could not express with primitive data type. 
 * 	for example numbers that not belongs to decimal base.
 * 
 * for example, declare a,b,c separately as hour, minute and second , initialize and express 17:32:08,
 * phone numbers that starts with 0 like 044 8574 3454; But the problem is we can not execute calculation
 * with string , only use for display, concatenation */
 int a=17,b=32,c=48;
 String s="08";
 String t="04485743454";
 System.out.println(s);
  System.out.println(a+":"+b+":"+c);
 System.out.println(a+":"+b+":"+s);
 //3)Strings are very convenient sometiems for expressions;
  /* express address in console 
   * via leonardo cavezzale maximonivs kkkghghgskfghfhf
   * sfsfssgsggjgjfdfsgdfgjdsgsjgjsd;ggsjdfgdgd
   *  davinci 23, 20124, Mi, italy.
   *  telephone:0894573585852 */
 String H="via leonardo cavezzale maximonivs\n kkkghghgskfghfhf\nsfsfssgsggjgjfdfs\ngdfgjdsgsjgjsd;ggsjdfgdgd\ndavinci 23, 20124, Mi, italy.\ntelephone:08877988998989898897888";
		
		System.out.println("my address is:"+H);}}

