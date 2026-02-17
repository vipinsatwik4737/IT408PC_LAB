import java.util.Scanner;
class L2P1{
public static void main(String[] args){
Scanner sc=new Scanner (System.in) ;
System.out println enter the size*); int n=sc-rextInto;
int []a=new int[n];
System.out.println("enter the elements into array");
for (int i=0;i<n;i++){
a[i]=sc.nextInt();
int count=0;
for (int x : a){
if(x<=1) continue; boolean isPrime= true;
for (int j=2;j<x; j++){
if (x%j==0){
isPrime=false;
break;
}
}
if(isPrime)f
System.out.println(x + " ");
}
}
}
}