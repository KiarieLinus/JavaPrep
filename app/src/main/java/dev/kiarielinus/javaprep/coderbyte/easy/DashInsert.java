package dev.kiarielinus.javaprep.coderbyte.easy;

/**
 * Have the function DashInsert(str) insert dashes ('-')
 * between each two odd numbers in str. For example:
 * if str is 454793 the output should be 4547-9-3.
 * Don't count zero as an odd number.
 */

public class DashInsert {
    static String dashInsert(String str) {
        try {
            Long.parseLong(str);
            String[] numbs = str.split("");
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < numbs.length;i++){
                boolean isCurrentOdd = Integer.parseInt(numbs[i]) % 2 != 0;
                boolean isNextOdd = i < numbs.length-1 && Integer.parseInt(numbs[i+1]) % 2 != 0;

                if(isCurrentOdd && isNextOdd){
                    sb.append(numbs[i]);
                    sb.append("-");
                    continue;
                }
                sb.append(numbs[i]);
            }

            return sb.toString();
        }catch(Exception e){
            return e.getLocalizedMessage();
        }
    }

    public static void main(String[] args) {
        System.out.println(dashInsert("454793565757575757"));
        System.out.println(dashInsert("454793e"));
        System.out.println(dashInsert("4547933"));
        System.out.println(dashInsert("0157933"));
    }
}
