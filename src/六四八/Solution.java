package 六四八;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        StringBuilder stringBuilder = new StringBuilder();

        if(sentence.equals("")){
            return "";
        }

        Set<String> dictionarySet = new HashSet<String>();
        for (int i = 0; i < dictionary.size(); i++) {
            dictionarySet.add(dictionary.get(i));
        }
        String[] sentenceWord = sentence.split(" ");


//        for (int i = 0; i < sentenceWord.length; i++) {
//
//            int rootCount=0;
//            String shortRoot="";
//
//            for (int j = 0; j < dictionary.size(); j++) {
//                if(sentenceWord[i].contains(dictionary.get(j))){
//                    if (rootCount >= 1 && shortRoot.length() < dictionary.get(j).length()) {
//                        break;
//                    }
//                    shortRoot = dictionary.get(j);
//                    rootCount++;
//                }
//            }
//            if (rootCount == 0) {
//                shortRoot = sentenceWord[i];
//            }
//            stringBuilder.append(shortRoot);
//            stringBuilder.append(" ");
//        }


        for (int i = 0; i < sentenceWord.length; i++) {
            String word = sentenceWord[i];
            for (int j = 0; j < word.length(); j++) {
                if (dictionarySet.contains(word.substring(0, j + 1))) {
                    sentenceWord[i]=word.substring(0, j + 1);
                    break;
                }
            }
        }


        for (int i = 0; i < sentenceWord.length; i++) {
            stringBuilder.append(sentenceWord[i]);
            if(i<sentenceWord.length-1){
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}
