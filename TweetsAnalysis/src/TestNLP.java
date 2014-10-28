
public class TestNLP {
public static void main(String args[])
{
	String a="#fuckyou #Abbott #shitcunt #Budget2014 #Australia is #screwed #politics #TonyAbbott #resign @TonyAbbottMHR http://t.co/MKRJSRae20\"";
	
	System.err.println(SentimentAnalysis.findSentiment(a));
}
}
