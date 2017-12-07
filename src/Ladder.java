import java.util.*;

public class Ladder {
	
	public static void main(String[] args) {
		//System.out.println(length2("hit","cog", new int [] {"hot","dot","dog","lot","log"}));
	}
	public static int length2(String begin, String end, Set<String> wordsDict) {
	    Queue<String> curLevel = new LinkedList<>();
	    Queue<String> nextLevel = new LinkedList<>();
	    curLevel.add(begin);
	 
	    wordsDict.add(end);
	 
	    String curWord;
	    int level = 1;
	 
	    while(!curLevel.isEmpty()){
	        level++;
	        while(!curLevel.isEmpty()) {
	            curWord = curLevel.poll();
	 
	            char[] arr = curWord.toCharArray();
	            for(int i=0; i< arr.length; i++){
	                for(char c='a'; c<='z'; c++){
	                    char temp = arr[i];
	                    if(arr[i]!=c){
	                        arr[i]=c;
	                    }
	 
	                    String newWord = new String(arr);
	 
	                    if(newWord.equals(end)){
	                        return level;
	                    }
	                    if(wordsDict.contains(newWord)){
	                        nextLevel.add(newWord);
	                        wordsDict.remove(newWord);
	                    }
	 
	                    arr[i]=temp;
	                }
	            }
	        }
	        curLevel = nextLevel;
	        nextLevel = new LinkedList<>();
	 
	    }
	 
	    return 0;
	}
}
