package sdf;

import java.util.Random;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class App {

    public static void main(String[] args) {
        String[] tttBoard = new String[9];
        String player = "X";


        //populating the tic tac toe board with 1 to 9
        for (int i=0; i<9; i++) {
            tttBoard[i] = String.valueOf(i+1);
        }

        TicTacToe ttt = new TicTacToe();

        //print out the actual ttt board
        ttt.printBoard(tttBoard);

        System.out.println("Tic-Tac-Toe game");
        System.out.println("X will play first");


        
    
    }
}