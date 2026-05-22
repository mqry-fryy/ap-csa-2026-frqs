// frq # 1
public class Account {
    private String username; // to be initialized in part(a)

    public Account(String requestedName){   // a
        if (isAvailable(requestedName)){
            username = requestedName;
        }
        else 
        {
            int num = 1;
            while (!isAvailable(requestedName + num)){
                num++;
            }
            username = requestedName + num;
        }
    }

    public static boolean isAvailable(String str){
        return true;
    }

    public String getShortenedName(){// b
        String shortened = "";
        for(int i = 0; i < username.length(); i++){
            if(username.charAt(i) == '-'){
                shortened = shortened.substring(0,shortened.length()-1);
            } else {
                shortened += username.charAt(i);
            }
        }
        return shortened;
    }

}
