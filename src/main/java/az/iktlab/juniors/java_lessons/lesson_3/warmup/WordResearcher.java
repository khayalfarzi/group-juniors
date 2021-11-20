package az.iktlab.juniors.java_lessons.lesson_3.warmup;

/**
 * Words: 6
 * Vowels: 11
 * Const : 19
 */
public class WordResearcher {
    public static void main(String[] args) {

        String words = "Illegal Bot Java Teqdimat God Start";

        int wordsCnt = 0;
        int vowelsCnt = 0;
        int constCnt = 0;

        String wordsArr[] = words.split(" ");
        wordsCnt = wordsArr.length;

        for (int i = 0; i < wordsCnt; i++) {
            String s = wordsArr[i].toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                if (isVowel(s.trim().charAt(j)))
                    vowelsCnt++;
                else constCnt++;
            }
        }

        System.out.printf("Words: %s\n", wordsCnt);
        System.out.printf("Vowel: %s\n", vowelsCnt);
        System.out.printf("Const: %s\n", constCnt);
    }

    public static boolean isVowel(char ch) {
        char[] volwelsArr = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < volwelsArr.length; i++) {

            if (volwelsArr[i] == ch)
                return true;
        }
        return false;
    }
}
