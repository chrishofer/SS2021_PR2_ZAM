package at.campus02.zam.pr2;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class StackApp {
    public static void main(String[] args) {
        // in main we should react to it
        try {
            helper();
        } catch (StackFullException e) {
            e.printStackTrace();
        }
        // this code after helper is not executed if an exception is thrown
        System.out.println("You will never see me");

        System.out.println("puhh so many methods");
    }
    public static void helper() throws StackFullException {
        Stack s = new Stack(5);

        s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini"));
        try {
            s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini"));
            s.push(new Note(LocalDate.now(), "Anrufen", "Steffi, Toni, Hubsi, Anton"));
            s.push(new Note(LocalDate.now(), "Vatertags geschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));
            s.push(new Note(LocalDate.now(), "Vatertags geschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));
            s.push(new Note(LocalDate.now(), "Vatertags geschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));
            s.push(new Note(LocalDate.now(), "Vatertags geschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));

            System.out.println("Hello how are you?");

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        }  catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        } catch(Exception e){
            System.out.println("anderer Fehler");
        } finally {
            System.out.println("wird immer gemacht");
        }
        System.out.println("hier hinten ist code");
    }
}
