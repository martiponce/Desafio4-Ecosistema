package desafio4;

/**
 *
 * @author marpo
 */
public abstract class Animal {
    private String nombre;
    private double peso;
    private double energia;

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.energia = 100.0;
    }

    public String getNombre() { return nombre; }
    public double getPeso() { return peso; }
    public double getEnergia() { return energia; }
    
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("El peso no puede ser negativo :c.");
        }
    }

    public void setEnergia(double energia) {
        this.energia = Math.max(0, energia);
    }
    
  
    public abstract void moverse();
    public abstract void comer();
}
