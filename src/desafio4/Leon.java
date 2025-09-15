package desafio4;

public class Leon extends Animal implements HabitatSabana {
    public Leon(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void moverse() {
        if (getEnergia() >= 25) {
            System.out.println(getNombre() + " camina majestuosamente por el territorio.");
            setEnergia(getEnergia() - 25);
        } else {
            System.out.println(getNombre() + " está demasiado cansado para moverse.");
        }
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " se alimenta de su presa.");
        setEnergia(getEnergia() + 50);
    }

    @Override
    public void pastar() {
        System.out.println(getNombre() + " no pasta, es un depredador.");
    }

    @Override
    public void cazar() {
        System.out.println(getNombre() + " acecha a su presa con sigilo.");
        setEnergia(getEnergia() - 40);
    }

    @Override
    public void dormirBajoElSol() {
        System.out.println(getNombre() + " duerme siestas largas para recuperar fuerzas.");
        setEnergia(getEnergia() + 20);
    }

    public void cazarA(Cebra cebra) {
        System.out.println("El " + getNombre() + " persigue a " + cebra.getNombre() + ".");
        cazar();
        cebra.escapar();
        if (Math.random() > 0.5) {
            System.out.println("¡Éxito! " + getNombre() + " ha cazado a " + cebra.getNombre() + ".");
            this.comer();
            cebra.setEnergia(0);
        } else {
            System.out.println("¡Falló! " + cebra.getNombre() + " escapó.");
        }
    }
}