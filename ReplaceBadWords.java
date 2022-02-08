package assignments;

/**Assignment on replacing bad words existing in list with aestrics
 * @author Purva */
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceBadWords{
ArrayList<String> list = new ArrayList<String>();

	void list1() {
		list.add("stupid");
		list.add("idiot");
		list.add("bastard");
		list.stream().anyMatch("stupid"::equalsIgnoreCase);
		list.stream().anyMatch("idiot"::equalsIgnoreCase);
		list.stream().anyMatch("bastard"::equalsIgnoreCase);}
	
	public void replacebadwords() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		list1();
		System.out.println("Please Enter Any Word : ");
		String word = sc.nextLine();
		for(String word1 : list) {
			word=word.replace(word1, "*****");
		}
			System.out.println(word);}
	
	public static void main(String[] args) {
		ReplaceBadWords r = new ReplaceBadWords();
		r.replacebadwords();
	}
}