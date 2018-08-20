package monto.escrito;

public class MontoEscrito {
	String texto = new String();
	public String noletra (int no)
	{		
		int cifras = String.valueOf(no).length();
		if (cifras == 1) {
			switch (no)
			{
			case 0: texto="Cero" ; break ;
			case 1: texto="Uno" ; break ;
			case 2: texto="Dos" ; break ;
			case 3: texto="Tres" ; break ;
			case 4: texto="Cuatro" ; break ;
			case 5: texto="Cinco" ; break ;
			case 6: texto="Seis" ; break ;
			case 7: texto="Siete" ; break ;
			case 8: texto="Ocho" ; break ;
			case 9: texto="Nueve" ; break ;
			}
		}
		else if (cifras == 2) {
			
			String texto1 = "", texto2 ="";
			int n2 = no%10;
			no = no/10;
			int n1 = no%10;
			
			switch (n2)
			{
			case 0: texto2="Cero" ; break ;
			case 1: texto2="Uno" ; break ;
			case 2: texto2="Dos" ; break ;
			case 3: texto2="Tres" ; break ;
			case 4: texto2="Cuatro" ; break ;
			case 5: texto2="Cinco" ; break ;
			case 6: texto2="Seis" ; break ;
			case 7: texto2="Siete" ; break ;
			case 8: texto2="Ocho" ; break ;
			case 9: texto2="Nueve" ; break ;
			case 10: texto="Diez" ; break ;
			case 11: texto="Once" ; break ;
			case 12: texto="Doce" ; break ;
			case 13: texto="Trece" ; break ;
			case 14: texto="Catrorce" ; break ;
			case 15: texto="Quince" ; break ;
			case 16: texto="Diesiseis" ; break ;
			case 17: texto="Diesisiete" ; break ;
			case 18: texto="Diesiocho" ; break ;
			case 19: texto="Diesinueve" ; break ;
			}
			switch (n1) {
			case 2: texto1 = "Veinte y "; break;
			case 3: texto1 = "Treinta y "; break;
			case 4: texto1 = "Cuarenta y "; break;
			case 5: texto1 = "Cincuenta y "; break;
			case 6: texto1 = "Sesenta y "; break;
			case 7: texto1 = "Setenta y "; break;
			case 8: texto1 = "Ochenta y "; break;
			case 9: texto1 = "Noventa y "; break;
			}
			texto=texto1 + texto2;
		}
		else if (cifras == 3) {
			String texto1 = "", texto2 ="", texto3= "";
			
			int n3= no%10;
			no= no/10;			
			int n2 = no%10;
			no = no/10;
			int n1 = no%10;
			
			switch (n3)
			{
			case 0: texto3="Cero" ; break ;
			case 1: texto3="Uno" ; break ;
			case 2: texto3="Dos" ; break ;
			case 3: texto3="Tres" ; break ;
			case 4: texto3="Cuatro" ; break ;
			case 5: texto3="Cinco" ; break ;
			case 6: texto3="Seis" ; break ;
			case 7: texto3="Siete" ; break ;
			case 8: texto3="Ocho" ; break ;
			case 9: texto3="Nueve" ; break ;			
			}
			switch (n2) {
			case 2: texto2 = "Veinte y "; break;
			case 3: texto2 = "Treinta y "; break;
			case 4: texto2 = "Cuarenta y "; break;
			case 5: texto2 = "Cincuenta y "; break;
			case 6: texto2 = "Sesenta y "; break;
			case 7: texto2 = "Setenta y "; break;
			case 8: texto2 = "Ochenta y "; break;
			case 9: texto2 = "Noventa y "; break;
			}
			switch(n1) {
			case 1: texto1="Ciento " ; break ;
			case 2: texto1="Docientos " ; break ;
			case 3: texto1="Trecientos " ; break ;
			case 4: texto1="Cuatrocientos" ; break ;
			case 5: texto1="Quinientos " ; break ;
			case 6: texto1="Seicientos " ; break ;
			case 7: texto1="Setecientos " ; break ;
			case 8: texto1="Ochocientos " ; break ;
			case 9: texto1="Novecientos " ; break;
			}
			texto=texto1 + texto2 + texto3;
		}
		else if (cifras == 4) {
			String texto1 = "", texto2 ="", texto3= "", texto4 = "";
			int n4= no%10;
			no= no/10;
			int n3= no%10;
			no= no/10;
			
			int n2 = no%10;
			no = no/10;
			int n1 = no%10;
			
			switch (n4){
			case 1: texto4="Uno" ; break ;
			case 2: texto4="Dos" ; break ;
			case 3: texto4="Tres" ; break ;
			case 4: texto4="Cuatro" ; break ;
			case 5: texto4="Cinco" ; break ;
			case 6: texto4="Seis" ; break ;
			case 7: texto4="Siete" ; break ;
			case 8: texto4="Ocho" ; break ;
			case 9: texto4="Nueve" ; break ;			
			}
			switch (n3) {
			case 2: texto3 = "Veinte y "; break;
			case 3: texto3 = "Treinta y "; break;
			case 4: texto3 = "Cuarenta y "; break;
			case 5: texto3 = "Cincuenta y "; break;
			case 6: texto3 = "Sesenta y "; break;
			case 7: texto3 = "Setenta y "; break;
			case 8: texto3 = "Ochenta y "; break;
			case 9: texto3 = "Noventa y "; break;
			}
			switch(n2) {
			case 1: texto2="Ciento " ; break ;
			case 2: texto2="Docientos " ; break ;
			case 3: texto2="Trecientos " ; break ;
			case 4: texto2="Cuatrocientos" ; break ;
			case 5: texto2="Quinientos " ; break ;
			case 6: texto2="Seicientos " ; break ;
			case 7: texto2="Setecientos " ; break ;
			case 8: texto2="Ochocientos " ; break ;
			case 9: texto2="Novecientos " ; break;
			}
			
			switch (n1){
			case 1: texto1="Mil" ; break ;
			case 2: texto1="Dos" ; break ;
			case 3: texto1="Tres" ; break ;
			case 4: texto1="Cuatro" ; break ;
			case 5: texto1="Cinco" ; break ;
			case 6: texto1="Seis" ; break ;
			case 7: texto1="Siete" ; break ;
			case 8: texto1="Ocho" ; break ;
			case 9: texto1="Nueve" ; break ;			
			}
			texto=texto1 + "mil " + texto2 + texto3 + texto4 ;		
		}
		return this.texto;
	}
}
