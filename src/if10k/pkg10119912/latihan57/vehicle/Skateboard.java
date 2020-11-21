/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public class Skateboard extends Vehicle{
    private double myBoardLenght;

    public Skateboard(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
    
}