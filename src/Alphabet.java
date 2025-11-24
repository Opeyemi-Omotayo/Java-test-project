public class Alphabet {

    private char ch;

    public Alphabet(char ch) {
        this.ch = ch;
    }

    static void main() {
        Alphabet alphabet = new Alphabet('a');

        System.out.println(alphabet.isVowel());
        System.out.println(alphabet.isAlphabet());
        System.out.println(alphabet.isNumber());
        System.out.println((int)'0');
    }

     boolean isVowel() {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

     boolean isNumber() {
        return ch >= 48 && ch <= 57;
    }

    boolean isAlphabet() {
        ch = Character.toLowerCase(ch);
        return ch >= 97 && ch <= 122;
    }


}
