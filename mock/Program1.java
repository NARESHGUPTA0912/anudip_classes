
public class Program1 {
//     public static void main(String[] args){
// int array[][]={{1,2,3},{4,5,6},{7,8,9}};
// int sum = 0;
// for(int i=0;i<3;i++)
// {
// for(int j=0;j<3;j++)
// {
// sum = sum + array[i][j];
// }
// }
// System.out.println(sum/5);
// }

// public static void main(String []args)
// {
// int x = 4,y=0;
// try
// {
// int m = x / y;
// System.out.println(m);
// }
// catch(Exception e)
// {
// System.out.print("Unable to divide");
// }
// finally
// {
// System.out.print("Task Complete");
// }
// }
public static int sum(int a, int b){
System.out.print(a+""+b);
return a+b;
}

public static void main(String[] args) {
System.out.println(sum(3, sum(1,2)));
}
// public static void main(String[] args) {
// TreeSet<Integer> set = new TreeSet<>();
// set.add(24);
// set.add(5);
// set.add(50);
// System.out.println(set.first());
// }
// public static void main(String []args)
// {
// int x = 7,y=10;
// String data=(x > y)?"Hello":"World";
// System.out.println(data);
// }
// public static void main(String args[])
// {
// int array[] = new int [6];
// for (int i =3; i > 0; i--)
// array[3-i] = i;
// Arrays.fill(array, 1, 4, 8);
// for (int i = 0; i < 6 ; i++)
// System.out.print(array[i]);
// }
}