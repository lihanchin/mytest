package Lottery;

import java.util.HashSet;
import java.util.Random;

public abstract class Lottery {
    Random random = new Random();
    HashSet<Integer> n = new HashSet<>();
    public abstract void generate();{
        }
    }