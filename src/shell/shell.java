/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercion;

/**
 *
 * @author thepa
 */
public class shell {
 public class Shell {
	
	/**
	 * El método que ordena por shell
	 * @param arreglo El arreglo a ordenar
	 * @return El arreglo ordenado
	 */
	public static Integer[] shell(Integer[] arreglo){
		int inta, i, aux;
		boolean band;
		inta = arreglo.length;
		while(inta > 0){
			inta = inta / 2;
			band = true;
			while(band){
				band = false;
				i = 0;
				while ((i+inta) <=arreglo.length-1){//2.1.1
					if (arreglo[i] > arreglo[i + inta]){
						aux = arreglo[i];
						arreglo[i] = arreglo[i+inta];
						arreglo[i+inta] = aux;
						band = true;
					}
					i = i +1;
				}
			}
		}
		
		return arreglo;
	}
 }
}