package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;

    public FaceDrawing(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public void fill(String str){
        for(int row = 0; row < faceFeatures.length; row++){
            for(int column = 0; column < faceFeatures[row].length; column++){
                faceFeatures[row][column] = str;
            }
        }
    }

    public void printface(){
        for(String[] row : faceFeatures){
            for(String column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
