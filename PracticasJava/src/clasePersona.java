public class clasePersona{
/*Se requiere un programa que modele el concepto de una persona.
Una persona posee nombre, apellido, numero de documento de identidad y
año de nacimiento. La clase debe tener un constructor que inicialice los
valores de sus respectivos atributos.

La clase debe incluir los siguientes metodos: 
- Definir un metodo que imprima en pantalla los valores de los atributos
  del objeto.
- En un metodo main se deben crear dos personas y mostrar los valores de
  sus atributos en pantalla.*/
  String nombre, apellido;
  int id, year;

    public String toString(){
       return ("Nombre: "+ nombre +"\nApellido: "+ apellido +"\nID: "+ id +"\nAño de nacimiento: "+ year);
    }
    
}