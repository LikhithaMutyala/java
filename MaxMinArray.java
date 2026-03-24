import java.util.*;
class MaxMinArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of an array:");
int n=sc.nextInt();//array size
System.out.println("Enter array of elements:");
int arr[]=new int[n];//syntax to read elements dynamically
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
//int arr[5]={1,2,3,4,5}==>arr[0]=1,arr[1]=2,arr[2]=3,arr[3]=4,arr[4]=5
int max=arr[0];//max=1
int min=arr[0];//min=1
for(int i=1;i<n;i++)
if(arr[i]>max)
max=arr[i];
else if(arr[i]<min)
min=arr[i];
System.out.println("Max element from array is:" +max);
System.out.println("Min element from array is:" +min);
}
