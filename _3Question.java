public class _3Question {
    public static void main(String[] args) {
        int array_variable[] = new int[10];
        for(int i = 0; i < array_variable.length; ++i){
         array_variable[i] = i/2;
         array_variable[i]++;
         System.out.println(array_variable[i] + " " +i);
         i++;
        }

        
    }
}
