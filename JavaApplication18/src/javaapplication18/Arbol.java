/*
Hoja de trabajo 7
Cecilia Marsicovetere 14
Santiago Solorzano 14619
 */

public class Arbol implements Comparable<Arbol>
{
    int nivel;
    public Arbol(int nivel)
    {
        this.nivel = nivel;
    }
    
    public int comp(Arbol a)
    {
        int diferencia;
        diferencia = nivel - a.nivel;
        return diferencia
    }
    
    public int getNivel()
    {
        return nivel
    }
    
    public void setNivel(int level)
    {
        nivel = level;
    }
   
}
