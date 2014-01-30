/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_bubble;
import java.lang.Math;

/**
 *
 * @author Admin
 */
public class Sorting_Bubble 
{
    public static void printMassive( int massive[] )
    {
        System.out.print( "[ " );
        for ( int i = 0; i < massive.length; i++ )        
            System.out.print( massive[i] + " " );
        
        System.out.print( "]" );
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) 
    {
        int t = arr[i];
                arr[i] = arr[j];
                         arr[j] = t;
    }   
    public static void bubble( int[] arr )
    {
        for ( int i = arr.length - 1; i > 0 ; i-- )        
            for ( int j = 0 ; j < i; j++ )            
                if ( arr[j] > arr[j+1] )
                    swap( arr, j, j+1 );
    }
    public static int[] createArray()
    {
        int[] arr = new int [10];
        for ( int i = 0; i < arr.length; i++ )
            arr[ i ] = (int)( Math.random() * ( arr.length * 2 ) );
        
        return arr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] massive= createArray();        
        
        printMassive( massive );
        bubble( massive );
        printMassive( massive );
    }
}
