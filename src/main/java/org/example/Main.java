package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
   {
       System.out.println("Задание 1:");
       Scanner in = new Scanner(System.in);
       int[] arr = new int[]{12, 4, 5, 6, 34, 27};
       List<Integer> listArr = new ArrayList<Integer>();
       System.out.println("Вывод массива:");
       for (int elem:arr)
       {
           System.out.print(elem + " ");
       }
       System.out.println();
       System.out.println("Введите индекс первого элемента массива для замены:");
       int elem1 = in.nextInt();
       System.out.println("Введите индекс второго элемента массива для замены:");
       int elem2 = in.nextInt();

       int elemTemp = arr[elem1];
       arr[elem1] = arr[elem2];
       arr[elem2] = elemTemp;
       System.out.println("Элементы массива поменялись местами:");
       for (int elem:arr)
       {
           System.out.print(elem + " ");
       }
       System.out.println();

       System.out.println("Задание 2:");
       ArrayList<Integer> arrList;
       arrList = ArrToArrList(arr);
       System.out.print("Вывод массива, преобразованного в ArrayList: ");
       for (int elem:arrList)
       {
           System.out.print(elem + " ");
       }
       System.out.println();


       System.out.println("Задание 3:");
       Apple apple = new Apple();
       Apple apple1 = new Apple();
       Apple apple2 = new Apple();
       Orange orange = new Orange();
       Orange orange1 = new Orange();
       Orange orange2 = new Orange();
       Box appleBox = new Box();
       Box orangeBox = new Box();

       appleBox.AddFruit(apple);
       appleBox.AddFruit(apple1);
       appleBox.AddFruit(apple2);
       appleBox.AddFruit(orange);
       orangeBox.AddFruit(orange1);
       orangeBox.AddFruit(orange2);
       orangeBox.AddFruit(orange2);
       orangeBox.AddFruit(apple1);
       System.out.println("Вес коробки: " + appleBox.GetWeight());
       System.out.println("Вес коробки: " + orangeBox.GetWeight());
       if (appleBox.Compare(orangeBox)) System.out.println("Коробки весят одинаково");
       else System.out.println("У коробок разный вес");

       Box box1 = new Box();
       System.out.println("Вес коробки: " + box1.GetWeight());
       orangeBox.AddFruitsToBox(box1);
       System.out.println("Вес коробки: " + box1.GetWeight());
       System.out.println("Вес коробки: " + orangeBox.GetWeight());
       appleBox.AddFruitsToBox(box1);
       appleBox.Print();
       System.out.println();
       box1.Print();
       System.out.println();
       orangeBox.Print();
       System.out.println();
   }

   public static ArrayList<Integer> ArrToArrList(int [] arr)
   {
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       for(int i = 0; i < arr.length; i++)
       {
           arrayList.add(arr[i]);
       }
       return arrayList;
   }
}