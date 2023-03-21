/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
public class Dutch {

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 2, 2, 1, 0, 1, 2, 0, 2, 1, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {

                    int v = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = v;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int v = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = v;
                    high--;
                    break;
                }
            }
            
        }int k=0;
        for(int v:arr)
        {
            System.out.print(arr[k++]+" ");
        }
    }
}
