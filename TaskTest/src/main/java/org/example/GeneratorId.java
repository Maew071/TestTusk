package org.example;

import java.io.Serializable;

public class GeneratorId {
    public static int MyClass;

    public class MyClass implements Serializable {
        private static int inc = 0;
        private int id;

        public MyClass() {
            this.id = inc++;
        }
    }
}


