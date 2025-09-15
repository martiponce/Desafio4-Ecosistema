package desafio4;


public class Cebra extends Animal implements HabitatSabana {
    public Cebra(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void moverse() {
        if (getEnergia() >= 15) {
            System.out.println(getNombre() + " trota por la sabana.");
            setEnergia(getEnergia() - 15);
        } else {
            System.out.println(getNombre() + " está demasiado cansada para moverse.");
        }
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " pasta hierbas de la sabana.");
        setEnergia(getEnergia() + 20);
    }

    @Override
    public void pastar() {
        System.out.println(getNombre() + " se alimenta tranquilamente.");
        comer();
    }

    @Override
    public void cazar() {
        System.out.println(getNombre() + " no caza, es una presa (pobrecita).");
    }

    @Override
    public void dormirBajoElSol() {
        System.out.println(getNombre() + " descansa bajo la sombra de un árbol.");
        setEnergia(getEnergia() + 10);
    }

    public void escapar() {
        System.out.println("¡" + getNombre() + " huye a toda velocidad!");
        setEnergia(getEnergia() - 30);
    }
}