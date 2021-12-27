package Lesson19;

public class homework {
    public static String[] abc(String[] ... arr){
        int len = 0;
        for (String[] strings : arr) {
            len += strings.length;
        }
        String [] ans = new String[len];
        int i = 0;
        for (String[] strings : arr) {
            for (String string : strings) {
                ans[i] = string;
                i++;
            }
        }
		return ans;
	}
	public static void  main(String [] args){
		String []strings = abc(new String[]{"Bew", "bow", "bam"}, new String[]{"Bew", "puf"});
        for (int i = 0; i < strings.length; i++) {
            for (String string : args) {
                if (strings[i].equals(string)) {
                    strings[i] = null;                    
                }
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }
	}
}
