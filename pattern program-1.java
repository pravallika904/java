class Main{
    public static void main(String[] args){
        int a,b;
        final int n = 5;
        for ( a = n; a >= 1; a--){
            for ( b = 1; b <= a; b++) {
                System.out.print('*');
            }
             System.out.print(System.lineSeparator());
        }
    }
}