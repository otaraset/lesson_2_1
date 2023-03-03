public class Main {
    public static void main(String[] args) {
        System.out.println(youConGoForAWalk(20,45));
        System.out.println(youConGoForAWalk(0,20));
        System.out.println(youConGoForAWalk(28,35));
        System.out.println(youConGoForAWalk(15,25));
        System.out.println(youConGoForAWalk(30,40));

    }
    public static String youConGoForAWalk(int temperature, int agePerson){
        if (agePerson >=20 && agePerson <=45 && temperature >= -20 && temperature <=30)
            return  "Можно идти гулять";
        else if (agePerson <=20 && temperature >=0 && temperature <=28)
            return "Можно идти гулять";
        else if (agePerson >45 && temperature >= -10 && temperature <=25)
            return "Можно идти гулять";
        else
            return  "Остовайтесь дома";

        }

    }
