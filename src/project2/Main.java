
import Common.Algorithm;
import Common.Library;

import Controller.searchProgramming;
import Model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Algorithm algorithm = new Algorithm();
        Element element = new Element();

        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        element.setArray(library.createArray(element.getSize_array()));

        searchProgramming searchProgramming = new searchProgramming(element, library, algorithm);
        searchProgramming.run();
    }
}