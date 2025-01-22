package bankaccountapp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

 public class CheckingAccount extends Account{

	public CheckingAccount(String name)
	{
		super(name);
		System.out.println("Checking Account");		
		
	}
}


 class Main {
    public static void main(String[] args) {
        String line1 = "You are the best";
        String line2 = "You are better";

        List<String> unmatchedWords = getUnmatchedWords(line1, line2);
        System.out.println("Unmatched words: " + unmatchedWords);
    }

    public static List<String> getUnmatchedWords(String line1, String line2) {
        Set<String> words1 = new HashSet<>(Arrays.asList(line1.split(" ")));
        Set<String> words2 = new HashSet<>(Arrays.asList(line2.split(" ")));

        Set<String> unmatchedWords = new HashSet<>(words1);
        unmatchedWords.addAll(words2);

        Set<String> commonWords = new HashSet<>(words1);
        commonWords.retainAll(words2);

        unmatchedWords.removeAll(commonWords);

        return unmatchedWords.stream().collect(Collectors.toList());
    }
}

