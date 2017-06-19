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

    private static int numofplayers = 0;// Vincenzo wrote this line
    private static boolean gamestart = false;// Vincenzo wrote this line
      private static boolean gamend = false; 
    public static User[] users; // Vincenzo wrote this line

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
            users[e.getAlliegance()].addstudent((student) e); // Vincenzo wrote this line
        } else if (e instanceof teacher) {
            teacherList.add((teacher) e);

        } else if (e instanceof fairy) {
            fairyList.add((fairy) e);
            users[e.getAlliegance()].addfairy((fairy) e);// Vincenzo wrote this line
        } else if (e instanceof cookie) {
            cookieList.add((cookie) e);
            users[e.getAlliegance()].addcookie((cookie) e);// Vincenzo wrote this line
        }
        addToSpace(e.getxLocation(), e.getyLocation(), e);
    }

    public static void setup(User[] userhold) { // Vincenzo wrote this method
        users = userhold;
    }

    public static ArrayList<school> getSchoolList(int alliegance) { 
        ArrayList<school> specificSchoolList = new ArrayList<>();
        for (int i = 0; i < schoolList.size(); i++) {
            if (alliegance == -1) { // Vincenzo wrote this line // this line returns all schools if -1 is the imput
                specificSchoolList.add(schoolList.get(i));// Vincenzo wrote this line
            } else {
                if (schoolList.get(i).getAlliegance() == alliegance) {
                    specificSchoolList.add(schoolList.get(i));
                }
            }
        }
        return specificSchoolList;
    }

    public static ArrayList<student> getStudentList(int alliegance) {
        ArrayList<student> specificStudentList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (alliegance == -1) { // Vincenzo wrote this line
                specificStudentList.add(studentList.get(i));// Vincenzo wrote this line
            } else {
                if (studentList.get(i).getAlliegance() == alliegance) {
                    specificStudentList.add(studentList.get(i));
                }
            }
        }
        return specificStudentList;
    }

    public static ArrayList<teacher> getTeacherList(int alliegance) {
        ArrayList<teacher> specificTeacherList = new ArrayList<>();
        for (int i = 0; i < teacherList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificTeacherList.add(teacherList.get(i));// Vincenzo wrote this line
            } else {
                if (teacherList.get(i).getAlliegance() == alliegance) {
                    specificTeacherList.add(teacherList.get(i));
                }
            }
        }
        return specificTeacherList;
    }

    public static ArrayList<fairy> getFairyList(int alliegance) {
        ArrayList<fairy> specificFairyList = new ArrayList<>();
        for (int i = 0; i < fairyList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificFairyList.add(fairyList.get(i));// Vincenzo wrote this line
            } else {
                if (fairyList.get(i).getAlliegance() == alliegance) {
                    specificFairyList.add(fairyList.get(i));
                }
            }
        }
        return specificFairyList;
    }

    public static ArrayList<cookie> getCookieList(int alliegance) {
        ArrayList<cookie> specificCookieList = new ArrayList<>();
        for (int i = 0; i < cookieList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificCookieList.add(cookieList.get(i));// Vincenzo wrote this line
            } else {
                if (cookieList.get(i).getAlliegance() == alliegance) {
                    specificCookieList.add(cookieList.get(i));
                }
            }
        }
        return specificCookieList;
    }

    private static int worldXDim = 16;
    private static int worldYDim = 16;

    public static void setNumPlayers(int num) { // Vincenzo wrote this method
        numofplayers = num;
    }

    public static boolean getgamestart() { // Vincenzo wrote this method
        return gamestart;
    }

    public static void setgamestart(boolean start) { // Vincenzo wrote this method
        gamestart = start;
    }
    public static boolean getgameend() {
        return gamend;
    }

    public static void setgameend(boolean start) {
        gamend = start;
    }

    public static int getNumPlayers() { // Vincenzo wrote this method
        return numofplayers;
    }

    public static int getXDim() {
        return worldXDim;
    }

    public static int getYDim() {
        return worldYDim;
    }

    public static variables[][] getWorldSpace() {
        return worldSpace;
    }

    private static variables[][] worldSpace = new variables[worldXDim][worldYDim];

    public static boolean addToSpace(int x, int y, variables v) {
        try {
            worldSpace[x][y] = v;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }

    }

    public static void deleteFromSpace(int x, int y) {//the variables is here for no reason // Vincenzo helped fix this line
        worldSpace[x][y] = null;
    }

    public static String checkSpace(int x, int y, char dir) {
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
        } else {

//          
            return "nothing";
        }
    }

    public void printSpace() {
        for (int i = 0; i < worldSpace.length; i++) {

            System.out.print("[");
            for (int j = 0; j < worldSpace[i].length; j++) {
                //loops through array of images and draws
                if (worldSpace[i][j] instanceof student) {
                    System.out.print("Stud");
                } else if (worldSpace[i][j] instanceof school) {
                    System.out.print("Shco");
                } else if (worldSpace[i][j] instanceof fairy) {
                    System.out.print("Fair");
                } else if (worldSpace[i][j] instanceof teacher) {
                    System.out.print("Teac");
                } else {
//                    g.drawImage(teacher, imageSize * i, imageSize * j, this);
                }
                System.out.print(",");
            }
            System.out.println("]");
        }
    }

}
