package 六四八;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list=new ArrayList<>(Arrays.asList("a","b","c"));
        String newSentence=solution.replaceWords(list,"aadsfasf absbs bbab cadsfafs");
        System.out.println(newSentence);
    }
}
