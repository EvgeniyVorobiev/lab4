package org.example;

import java.util.ArrayList;

public class Box
{
    public Box(ArrayList<Fruit> box1)
    {
        this.box = box1;
    }

    public ArrayList<Fruit> box = new ArrayList<Fruit>();
    public double boxWeight;
    boolean isApple = false;
    boolean isOrange = false;
    int boxSize;


    public void AddFruit(Fruit fruit)
    {
        if (fruit.name == "апельсин") isOrange = true;
        if (fruit.name == "яблоко") isApple = true;
        if (((isOrange == false && isApple == false) || (isOrange && isApple == false) || (isOrange == false && isApple)) && (box.contains(fruit) == false)) {
            box.add(fruit);
            System.out.println("В коробку был добавлен фрукт: " + fruit.name);
        }
        else if ((isOrange && isApple) || (box.contains(fruit) == true))
        {
            System.out.print("Нельзя добавить " + fruit.name + " в эту коробку");
            if (box.contains(fruit) == true) System.out.print(". Этот фрукт уже есть в коробке");
            System.out.println();
            if (isApple) isOrange = false;
            if (isOrange) isApple = false;
        }
        /*else if (box.contains(fruit) == true)
            System.out.println("В коробке уже есть этот фрукт");*/
    }

    public void AddFruitThree(Fruit fruit1, Fruit fruit2, Fruit fruit3)
    {
        if (fruit1.name == "апельсин") isOrange = true;
        if (fruit1.name == "яблоко") isApple = true;
        if (fruit2.name == "апельсин") isOrange = true;
        if (fruit2.name == "яблоко") isApple = true;
        if (fruit3.name == "апельсин") isOrange = true;
        if (fruit3.name == "яблоко") isApple = true;
        if (((isOrange == false && isApple == false) || (isOrange && isApple == false) || (isOrange == false && isApple)) && (box.contains(fruit) == false)) {
            box.add(fruit1);
            System.out.println("В коробку был добавлен фрукт: " + fruit1.name);
            box.add(fruit2);
            System.out.println("В коробку был добавлен фрукт: " + fruit2.name);
            box.add(fruit3);
            System.out.println("В коробку был добавлен фрукт: " + fruit3.name);
        }
        else if ((isOrange && isApple) || (box.contains(fruit) == true))
        {
            System.out.print("Нельзя добавить " + fruit1.name + " в эту коробку");
            if (box.contains(fruit1) == true) System.out.print(". Этот фрукт уже есть в коробке");
            System.out.println();
            System.out.print("Нельзя добавить " + fruit2.name + " в эту коробку");
            if (box.contains(fruit1) == true) System.out.print(". Этот фрукт уже есть в коробке");
            System.out.println();
            System.out.print("Нельзя добавить " + fruit3.name + " в эту коробку");
            if (box.contains(fruit1) == true) System.out.print(". Этот фрукт уже есть в коробке");
            System.out.println();
            if (isApple) isOrange = false;
            if (isOrange) isApple = false;
        }
    }

    public  double GetWeight()
    {
        boxSize = box.size();
        if (box.size() != 0)
        return boxWeight = box.get(0).weight * box.size();
        else return box.size();
    }

    public boolean Compare(Box box2)
    {
        if (boxWeight == box2.GetWeight()) return true;
        else return false;
    }
    /*public  void AddFruitsFromBox(Box box2)
    {
        if (box.size() == 0)
        {
            for (int i = 0; i < box2.box.size(); i++)
            {
                box.add(box2.box.get(i));
            }
        }
        //else
    }*/

    public void AddFruitsToBox(Box box2)
    {
        if ((isApple && box2.isApple) || (isOrange && box2.isOrange) || (box2.isApple == false && box2.isOrange == false))
        {
            for (int i = 0; i < boxSize; i++)
            {
                box2.AddFruit(box.get(i));
            }
            box.clear();
            isOrange = false;
            isApple = false;
        }
        else if ((isApple && box2.isOrange) || (isOrange && box2.isApple)) System.out.println("В коробке лежат фрукты другого типа");
    }

    public void Print()
    {
        System.out.print("Содержимое коробки: ");
        for (int i = 0; i < boxSize; i++)
        {
            System.out.print(box.get(i) + " ");
        }
    }
}
