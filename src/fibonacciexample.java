 class fibonacciexample {
    public static void main(String[] args) {
        int n1=2,n2=7,n3=2,i,count=10;
        System.out.print(n1+""+n2);

        for(i=2;i<count;++i){
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }

}}