/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intercambio;

/**
 *
 * @author thepa
 */
public class NewClass {
    public static void intercambiar(int []a, int i, int j)
{
	 int aux = a[i];
	 a[i] = a[j];
	 a[j]= aux ;
}
public static void ordIntercambio (int a[])
     {
	 int i, j;
	 for (i = 0 ; i < a.length-1; i++)
	 	 // sitúa mínimo de a[i+1]...a[n-1] en a[i]
	 	 for (j = i+1 ; j < a.length; j++)
	 	 	 if (a[i] > a[j])
	 	 	 {
	 	 	 	 intercambiar(a, i, j);
	 	 	 }
}   
}
