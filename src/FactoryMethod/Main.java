package FactoryMethod;

import FactoryMethod.*;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new CppDeveloperFactory();
        developerFactory.createDeveloper().writeCode();

    }
}