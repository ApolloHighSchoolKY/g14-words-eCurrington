public class WordTester
{
    public static void main(String[] args)
    {
        Word word = new Word();
        word.setWord("should have eight vowels");
        System.out.println(word);
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());
        System.out.println("");
        word.setWord("HI");
        System.out.println(word);
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());

    }
}
