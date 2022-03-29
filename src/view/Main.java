package view;

import java.util.concurrent.Semaphore;

import controller.ThreadF1;

public class Main {

	public static void main(String[] args) {

		int permissoesPista = 5;
		Semaphore semaforoPista = new Semaphore(permissoesPista);
		
		for (int numeroEquipe = 1; numeroEquipe <= 7; numeroEquipe++) {
            ThreadF1 threadF1 = new ThreadF1(numeroEquipe, semaforoPista);
            threadF1.start();
        }
	}
}