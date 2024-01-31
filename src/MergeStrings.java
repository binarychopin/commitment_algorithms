class MergeStrings {
  public static String mergeAlternately(String word1, String word2) {
    String newString = new String();
    int i = 0;
    int j = 0;

    while(i < word1.length() || j < word2.length() ) {
      if(i < word1.length()) {
        newString+= word1.charAt(i++);
      };
      if(j < word2.length()) {
        newString += word2.charAt(j++);
      };

    }
    return newString.toString();
  }
}