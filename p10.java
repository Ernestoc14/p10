// Queremos guardar la temperatura mínima y máxima de los 7 días de la semana y para esto
// utilice un arreglo bidimensional.
// Una vez guardados los datos en la matriz el programa debe generar la siguiente información:
// 1. La temperatura media de cada día
// 2. Temperatura más baja y los días con esa temperatura
// 3. Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima
// coincide con ella. Si no existe ningún día se muestra un mensaje notificando que no
// hay ningún día con esa temperatura.
import java.util.Scanner;
public class p10 {
    // Array Temps para guardar la min y max temp de cada dia de la semana
    //Generar 1-Prom por dia 2-Temp mas baja y dias con esa temp 
    //3-Leer un temp y mostrar dias si su tem Max coincide con esa temp, sino hay ningun dia imprimir que no hay dia con esa tem max
    Scanner sn = new Scanner(System.in);
    double [][] temperaturas = new double[2][7]; //0 Dom 1 Lun 2 Mar 3 Mie 4 Jue 5 Vie 6 Sab
    String [] days = new String[] {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    double [] TempMedia = new double[7];
    double TempMasBaja;
    double TempMasAlta; // Si hay dias con temp mostrarlos, sino mostrar mensaje
    public void Fill(){
        int si;
        for(si=0;si<7;si++) //Min Temp
        {   System.out.printf("Deme la temperatura mas baja en el dia %s :",days[si]);
            temperaturas [0][si] = sn.nextDouble();
        }
        for(int fi=0;fi<7;fi++)
        {    System.out.printf("Deme la temperatura mas alta en el dia %s :",days[fi]);
            temperaturas [1][fi] = sn.nextDouble();
        }
        // for(int fi=0;fi<2;fi++)
        // {   for(si=0;si<7;si++)
        //     System.out.printf("\ndia %s es %.2f:",days[si], temperaturas[fi][si]);
        // }
        // System.out.printf("\n");
    }  
    public void Prom(){
        int fi;
        for(fi=0;fi<7;fi++)
        {   TempMedia[fi] = ((temperaturas [0][fi]+temperaturas[1][fi])/2);
            System.out.printf("/nLa temperatura media en el dia %s es de %.2f :",days[fi], TempMedia[fi]);
        }  
    }
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        p10 pr = new p10();
        pr.Fill();
        System.out.print("Promedio ");
        pr.Prom();
        sn.close();
    }
}  