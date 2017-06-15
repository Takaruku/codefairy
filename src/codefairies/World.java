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
    private static ArrayList<teacher> teacherList = new ArrayList<>();
    private static ArrayList<fairy> fairyList = new ArrayList<>();
    private static ArrayList<cookie> cookieList = new ArrayList<>();

    public static void addToList(variables e) {
        if (e instanceof school) {
            schoolList.add((school) e);
        } else if (e instanceof student) {
            studentList.add((student) e);
        } else if (e instanceof teacher) {
            teacherList.add((teacher) e);
        } else if (e instanceof fairy) {
            fairyList.add((fairy) e);
        } else if (e instanceof cookie) {
            cookieList.add((cookie) e);
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
    
    public static ArrayList<teacher> getTeacherList(int alliegance) {
        ArrayList<teacher> specificTeacherList = new ArrayList<>();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getAlliegance() == alliegance) {
                specificTeacherList.add(teacherList.get(i));
            }
        }
        return specificTeacherList;
    }
    
    public static ArrayList<fairy> getFairyList(int alliegance) {
        ArrayList<fairy> specificFairyList = new ArrayList<>();
        for (int i = 0; i < fairyList.size(); i++) {
            if (fairyList.get(i).getAlliegance() == alliegance) {
                specificFairyList.add(fairyList.get(i));
            }
        }
        return specificFairyList;
    }
    
    public static ArrayList<cookie> getCookieList(int alliegance) {
        ArrayList<cookie> specificCookieList = new ArrayList<>();
        for (int i = 0; i < cookieList.size(); i++) {
            if (cookieList.get(i).getAlliegance() == alliegance) {
                specificCookieList.add(cookieList.get(i));
            }
        }
        return specificCookieList;
    }

    private static int worldXDim = 16;
    private static int worldYDim = 16;
    
    public int getXDim(){
        return worldXDim;
    }
    
    public int getYDim(){
        return worldYDim;
    }
    
    public variables[][] getWorldSpace(){
        return worldSpace;
    }
    
    private static variables[][] worldSpace = new variables[worldXDim][worldYDim];

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
