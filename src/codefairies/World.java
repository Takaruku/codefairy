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

    private static ArrayList<school> schoolList = new ArrayList<>();
    private static ArrayList<student> studentList = new ArrayList<>();

    public static void addToList(variables e) {
        if (e instanceof school) {
            schoolList.add((school) e);
        } else if (e instanceof student) {
            studentList.add((student) e);
        }
    }

    public static ArrayList<school> getSchoolList(int alliegance) {
        ArrayList<school> specificSchoolList = new ArrayList<>();
        for (int i = 0; i < schoolList.size(); i++) {
            if (schoolList.get(i).getAlliegance() == alliegance) {
                specificSchoolList.add(schoolList.get(i));
            }
        }
        return specificSchoolList;
    }

    public static ArrayList<student> getStudentList(int alliegance) {
        ArrayList<student> specificStudentList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getAlliegance() == alliegance) {
                specificStudentList.add(studentList.get(i));
            }
        }
        return specificStudentList;
    }

    private static int worldXDim = 16;
    private static int worldYDim = 16;

    public static variables[][] worldSpace = new variables[worldXDim][worldYDim];

    public static String checkSpace( int x, int y, char dir) {
        variables checkedSpace = null;
        boolean error = false;
        switch (dir) {
            case 'u' | 'U':
                try {
                    checkedSpace = worldSpace[x][y - 1];
                } catch (Exception e) {
                    error = true;
                }
            case 'd' | 'D':
                try {
                    checkedSpace = worldSpace[x][y + 1];
                } catch (Exception e) {
                    error = true;
                }
            case 'l' | 'L':
                try {
                    checkedSpace = worldSpace[x - 1][y];
                } catch (Exception e) {
                    error = true;
                }
            case 'r' | 'R':
                try {
                    checkedSpace = worldSpace[x + 1][y];
                } catch (Exception e) {
                    error = true;
                }
        }
        if (error) {
            return "error";
        }
        if (checkedSpace != null) {
            return checkedSpace.getAlliegance() + " " + checkedSpace.getClass().getName();
        }
        return "nothing";
    }

}
