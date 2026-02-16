public class Strings {
    public static void Letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.chartAt(i));
        }
        System.out.println();
    }
        
        // CHECKING A STRING IS A PALINDROME OR NOT //

    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
              return false;
            }
        }
               return true;
    }

// SHORTEST PATH PROBLEM AMAZON,FLIPKART

    public static float Shortpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir== 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    // CONVERTING EACH FIRST LETTER OF EACH WORD TO UPPERCASE
    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder(" ");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        }

        //compression a string
public static String compress(String str){
    String newstr=" ";
    for(int i=0;i<str.length();i++){
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newstr += +++++++++++++++++++++++++++++++++++++++++++++++++++++++++str.charAt(i);
        if(count>1){
            newstr +=count.toString();
        }
    }
    return newstr;
}
    public static void main(String[] args){
        String Name="Madhav";
        String Name="racecar";
        System.out.println(palindrome(Name));
        String path="WNEENESENNN";
        System.out.println(Shortpath(path));
        String str="hi, i am madhav";
        System.out.println(toUpperCase(str));
        String str="aaabbcccddhhhdddnn";
        System.out.println(compress(str));

    }
}
