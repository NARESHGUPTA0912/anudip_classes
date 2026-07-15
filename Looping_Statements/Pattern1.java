package Looping_Statements;
class Pattern1{
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=100; i++)
            if(i%7 == 0)
                count++;
        System.out.println("Total Count: "+count);
    }











    // for(int row=1; row<=5; row++) {
        //     for(int col=5; col>=row; col--){
        //         System.out.print("@ ");
        //     } 
        //     System.out.println("");
        // }
        // for(int row=1; row<=5; row++) {
        //     if(row==3) continue;
        //     // for(int col=1; col<=2; col++){
        //     //     System.out.print(row + "" + col+" ");
        //     // } 
        //     System.out.println(row+"");
        // }
        // for(int row=5; row>=1; row--) {
        //     for(int col=1; col<=row; col++){
        //         System.out.print("@ ");
        //     } 
        //     System.out.println("");
        // }
}