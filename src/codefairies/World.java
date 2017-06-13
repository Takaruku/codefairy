/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class World {

    private ArrayList<school> schoolList = new ArrayList<>();
    private ArrayList<student> studentList = new ArrayList<>();

    public void addToList(variables e) {
        if (e instanceof school) {
            schoolList.add((school) e);
        } else if (e instanceof student) {
            studentList.add((student) e);
        }
    }

    public ArrayList<school> getSchoolList(int alliegance) {
        ArrayList<school> specificSchoolList = new ArrayList<>();
        for (int i = 0; i < schoolList.size(); i++) {
            if (schoolList.get(i).getAlliegance() == alliegance) {
                specificSchoolList.add(schoolList.get(i));
            }
        }
        return specificSchoolList;
    }

    public ArrayList<student> getStudentList(int alliegance) {
        ArrayList<student> specificStudentList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getAlliegance() == alliegance) {
                specificStudentList.add(studentList.get(i));
            }
        }
        return specificStudentList;
    }

    private int worldXDim = 16;
    private int worldYDim = 16;

    public variables[][] worldSpace = new variables[worldXDim][worldYDim];

    public String checkSpace(int allegiance, int x, int y, char dir) {
        variables checkedSpace = null;
        switch (dir) {
            case 'u' | 'U':
                try {
                    checkedSpace = worldSpace[x][y - 1];
                } catch (Exception e) {
                }
            case 'd' | 'D':
                try {
                    checkedSpace = worldSpace[x][y + 1];
                } catch (Exception e) {
                }
            case 'l' | 'L':
                try {
                    checkedSpace = worldSpace[x - 1][y];
                } catch (Exception e) {
                }
            case 'r' | 'R':
                try {
                    checkedSpace = worldSpace[x + 1][y];
                } catch (Exception e) {
                }
        }
        if (checkedSpace != null) {
            return checkedSpace.getAlliegance() + " " + checkedSpace.getClass().getName();
        }
        return "Can't be checked!";
    }
    
    
}