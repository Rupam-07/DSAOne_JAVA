class BitManipulationAlgorithmsPart1{
    public static void main(String[] args) {
        int a=10;
        int b=a/2;
        int b1=a>>1; // works faster than /2
        System.out.println(b+" "+b1);

        int c=10;
        int d=c*2;
        int d1=c<<1; // works faster than *2
        System.out.println(d+" "+d1);
    }
}