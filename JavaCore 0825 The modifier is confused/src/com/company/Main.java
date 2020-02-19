package com.company;

/*
0825 The modifier is confused
Rearrange one static modifier to compile the example.

Requirements:
1. The program should not read data from the keyboard.
2. The Solution class must have the variable A.
3. The Solution class must have a variable B.
4. The Solution class must have a variable C.
5. The Solution class must have a variable D.
6. The Solution class should contain only three methods.
7. The class should have 4 statics (variables and methods).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}




