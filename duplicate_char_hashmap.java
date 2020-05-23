package Java_Program;

import java.util.HashMap;

public class duplicate_char_hashmap {
	public static void main(String[] args) {
		String str = "This is";
		char[] newChar = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<newChar.length;i++){
			if(map.containsKey(newChar[i])){
				int count = map.get(newChar[i]);
				map.put(newChar[i], count+1);
			}
			else{
				map.put(newChar[i], 1);
			}
		}
		System.out.println(map);
	}
}
