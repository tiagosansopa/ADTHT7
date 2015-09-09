/*
Hoja de trabajo 7
Cecilia Marsicovetere 14
Santiago Solorzano 14619
 */

public class Hoja extends Arbol
{
    public char caracterAlmacenado;
    
    public Hoja(char storedChar,int frecuencia )
    {
        super(frecuencia);
        caracterAlmacenado = storedChar;
    }
    
    public char getCaracter()
    {
        return caracterAlmacenado
    }
}
