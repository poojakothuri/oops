import java.util.*;

class countVowels {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n = sc.nextInt();
        Vector<Character> v = new Vector<Character>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        v.add('A');
        v.add('E');
        v.add('I');
        v.add('O');
        v.add('U');
        // System.out.print(v);
        Vector<Character> ans = new Vector<Character>();
        while (n > 0) {

            System.out.print("enter  a string");
            sc.nextLine();
            String s1 = sc.nextLine();
            int vc = 0, cc = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (v.contains(s1.charAt(i))) {
                    ans.add(s1.charAt(i));
                    vc++;
                } else if (s1.charAt(i) != ' ')
                    cc++;
            }
            System.out.println(ans);
            System.out.println("vowels " + vc + " consonants " + cc);

            n--;
        }

    }
}