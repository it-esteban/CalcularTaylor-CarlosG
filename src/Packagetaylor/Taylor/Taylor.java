
package control;

import java.util.ArrayList;
import java.util.List;
import modelo.serie;

/**
 *
 * @author Carlos Esteban González Castillo - ID:470995
 */

public class Taylor{

    private  String numero;
    private  String result;
    private ArrayList<serie> listDer = new ArrayList<serie>();
    private ArrayList<String> graficar = new ArrayList<String>();

  
    public String getNumero() {
        return numero;
    }

    public void setFun(String numero) {
        this.numero = numero;
    }

    public String getResult() {
        return result
    }

    public void setAs(String result) {
        this.result = result;
   

    public ArrayList<serie> getListDer() {
        return listDer;
    }



public Void TaylorSeno{

	public static long factorial(int number)
	{
	long result=1;
	for(int i=1;i<=number;i++)
	{
		result *= i;
	}
	return result;
	}
	public static void main(String[] args) {
		double epsilon = 0.00000001,x = -1, result = 0,memberOfSeries=x;
		int n=1;
		do
		{
			result += memberOfSeries;
			memberOfSeries = (Math.pow(-1, n)*Math.pow(x,(2*n+1)))/(factorial(2*n+1));
			n++;
		}while(Math.abs(memberOfSeries)>epsilon);
		System.out.println("sin x = "+ result);
		System.out.println("Math.sin(x) = " + Math.sin(x));

	}

}
