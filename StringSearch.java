import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Narendra Kumar";
        char target = ' ';
          System.out.println(Search(name,target));
        //System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Search2(String str,char target) {
        if (str.length() == 0) {
            return false;
        }
        //to use 'for', each loop have to use array or collection
        //that's why converting string into character of array using toCharArray()
        for(char ch : str.toCharArray()){
            if(ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean Search(String str,char target) {
        if (str.length() == 0) {
            return false;
        }
        for(int i =0; i<str.length();i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
