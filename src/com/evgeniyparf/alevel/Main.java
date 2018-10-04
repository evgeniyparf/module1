package com.evgeniyparf.alevel;

public class Main {

    //private int[][] chessField = new int[8][8]

    public static void main(String[] args) {
        int horsePosX = 3, horsePosY = 3, newPosX = 1, newPosY = 4;
        if(checkHorseMove(horsePosX, horsePosY, newPosX, newPosY))
            System.out.println("Horse[" + horsePosX + "][" + horsePosY + "] CAN move to [" + newPosX + "][" + newPosY + "]!");
        else
            System.out.println("Horse[" + horsePosX + "][" + horsePosY + "] CAN'T move to [" + newPosX + "][" + newPosY + "]!");

    }

    public static boolean checkHorseMove(int horsePosX, int horsePosY, int newPosX, int newPosY) {
        if(newPosY < 8 && newPosX < 8) {
            if (newPosY - 2 == horsePosY || newPosY + 2 == horsePosY) {
                if (newPosX + 1 == horsePosX)
                    return true;
                else if (newPosX - 1 == horsePosX)
                    return true;
                else
                    return false;
            }
            if (newPosY - 1 == horsePosY || newPosY + 1 == horsePosY) {
                if (newPosX + 2 == horsePosX)
                    return true;
                else if (newPosX - 2 == horsePosX)
                    return true;
                else
                    return false;
            } else return false;
        } else {
            System.out.println("New positions are out of field!");
            return false;
        }
    }
}
