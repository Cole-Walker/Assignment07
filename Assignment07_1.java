package com.mycompany.assignment07;

// MergeSort Algorithm

public class Assignment07_1
{
    public static int count =0;
    
    public static void main(String args[])
    {
        int array[] = {105, 17, 86, 27, 31, 9, 313};

        System.out.println("Given Array");
        print(array);

        Assignment07_1 ob = new Assignment07_1();
        ob.sorting(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        print(array);

        System.out.println("The count is: " + Assignment07_1.count);
    }
    
    void merge(int array[], int left, int middle, int right)
    {
        int pos1 = middle - left + 1;
        int pos2 = right - middle;

        int arrayL[] = new int[pos1];
        int arrayR[] = new int[pos2];

        for (int i = 0; i < pos1; i++)
        {
            arrayL[i] = array[left + i];
        }

        for (int j = 0; j < pos2; ++j)
        {
            arrayR[j] = array[middle + 1 + j];
        }  

        int i = 0; 
                
        int j = 0;

        int l = left;

        while (i < pos1 && j < pos2) 
        {
            if (arrayL[i] <= arrayR[j]) 
            {
                array[l] = arrayL[i];
                i++;
            }
            else 
            {
                array[l] = arrayR[j];
                j++;
            }
            
            l++;
            count++;
        }

        while (i < pos1) 
        {
            array[l] = arrayL[i];
            i++;
            l++;
            count++;
        }

        while (j < pos2) 
        {
            array[l] = arrayR[j];
            j++;
            l++;
            count++;
        }
    }
    
    public void sorting(int array[], int left, int right)
    {
        if (left < right) 
        {
            int middle = (left + right )/ 2;

            sorting(array, left, middle);
            sorting(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    static void print(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
