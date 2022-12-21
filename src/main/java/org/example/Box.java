package org.example;

import java.util.ArrayList;

public class Box <T extends Fruit>
{
    private T[] obj;
    public Box(T ... obj)
    {
        this.AddFruit(obj);
    }

    public Box()
    {

    }

    public ArrayList<T> box = new ArrayList<T>();
    public double boxWeight;
    int boxSize;

    public void AddFruit(T ... obj)//Метод добавления фруктов
    {
        for (int i = 0; i < obj.length; i++)
        {
            box.add(obj[i]);
        }
    }

    public void AddFruits(int n) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < n; i++)
        {
            T obj = (T) (box.get(0).getClass()).newInstance();
            box.add((obj));
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


    public void Print()
    {
        System.out.print("Содержимое коробки: ");
        for (int i = 0; i < box.size(); i++)
        {
            System.out.print(box.get(i) + " ");
        }
    }
}
