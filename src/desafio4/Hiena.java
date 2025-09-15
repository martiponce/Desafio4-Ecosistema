package desafio4;


public class Hiena extends Animal implements HabitatSabana {
    public Hiena(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void moverse() {
        if (getEnergia() >= 10) {
            System.out.println(getNombre() + " corre por la sabana en busca de comida.");
            setEnergia(getEnergia() - 10);
        } else {
            System.out.println(getNombre() + " está demasiado cansada para moverse.");
        }
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " come carroña y restos de una presa.");
        setEnergia(getEnergia() + 30);
    }

    @Override
    public void pastar() {
        System.out.println(getNombre() + " no pasta, es un carroñero.");
    }

    @Override
    public void cazar() {
        System.out.println(getNombre() + " persigue a su presa en manada.");
        setEnergia(getEnergia() - 20);
    }

    @Override
    public void dormirBajoElSol() {
        System.out.println(getNombre() + " descansa en su madriguera.");
        setEnergia(getEnergia() + 15);
    }

    public void robarComida(Leon leon) {
        System.out.println(getNombre() + " se acerca sigilosamente para robar la presa de " + leon.getNombre() + ".");
        cazar();
        if (Math.random() > 0.6) {
            System.out.println("¡" + getNombre() + " logró robar parte de la presa!");
            this.comer();
            leon.setEnergia(leon.getEnergia() - 20);
        } else {
            System.out.println("¡" + leon.getNombre() + " la ahuyentó!");
            setEnergia(getEnergia() - 10);
        }
    }
}