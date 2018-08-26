package sda.hangman;

import sda.hangman.domain.port.PhraseRepository;
import sda.hangman.infrastructure.memory.InMemoryPhraseRepository;

import java.util.Scanner;

public class Application {

    private static Scanner scanner;
    private static PhraseRepository phraseRepository;

    public static void main(String[] args) {
        phraseRepository = new InMemoryPhraseRepository();
        scanner = new Scanner(System.in);
        boolean menuFlag = true;
        do {


            System.out.println("1. Start");
            System.out.println("2. Wyniki");
            System.out.println("Inne. Koniec");
            int decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("tutaj bedzie logika do start");
                    break;
                case 2:
                    System.out.println("tutaj bedzie logika do wynikow");
                    break;
                default:
                    System.out.println("tutaj bedzie logika do koniec");
            }
        } while (menuFlag);
    }

    public static void startGame(){
        System.out.println("podaj swoje imie");
        String name = scanner.nextLine();
        System.out.println("kliknij enter by rozpoczac");
        String phrase = phraseRepository.getPhrase();
    }
}
