package desafio4;


public class Desafio4 {

  
    public static void main(String[] args) {
      // Creamos los animales
        Leon simba = new Leon("Simba", 180.0);
        Cebra marty = new Cebra("Marty", 250.0);
        Hiena ed = new Hiena("Santutu", 50.0);
        
        System.out.println("¡Simulación de la sabana en marcha!");
        
        // simulamos acciones
        simba.dormirBajoElSol();
        marty.pastar();
        ed.moverse();

        System.out.println("\n--- ¡Momento de interacción! ---");
        
        // Interacción 1: El león caza a la cebra
        simba.cazarA(marty);

        System.out.println("\n--- Segunda interacción ---");
        
        // Interacción 2: La hiena intenta robar la comida del león
        ed.robarComida(simba);

        System.out.println("\n--- Fin de la simulación ---");
        System.out.println("Energía de " + simba.getNombre() + ": " + simba.getEnergia());
        System.out.println("Energía de " + marty.getNombre() + ": " + marty.getEnergia());
        System.out.println("Energía de " + ed.getNombre() + ": " + ed.getEnergia());

    }
    
}
