/*
Hoja de trabajo 7
Cecilia Marsicovetere 14
Santiago Solorzano 14619
 */

public class Nodo extends Arbol
{
    public Arbol izq = null, der = null;
    
    public Nodo(Arbol i, Arbol d)
    {
        int nuevoNivel = i.getNivel() + d.getNivel();
        super(nuevoNivel);
        izq = i;
        der = d;
    }
}
