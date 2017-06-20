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
    public static User[] users; //The list of users playing in the world, Vincenzo wrote this line

    //Lists of entities in the world
    private static ArrayList<school> schoolList = new ArrayList<>();
    private static ArrayList<student> studentList = new ArrayList<>();
    private static ArrayList<teacher> teacherList = new ArrayList<>();
    private static ArrayList<fairy> fairyList = new ArrayList<>();
    private static ArrayList<cookie> cookieList = new ArrayList<>();

    
    //Written by Aidan, with the lines pertaining to users[] written by Vincenzo
    //Adds a "variables" to the right list if possible,both in the master list and in the user's list
    //Also places the "variables" on the board in the object's specified location
    public static void addToList(variables e) {
        //If the object is an instance of a certain entity type, add to the relevant list,
        //and if applicable, add to the entity owner's list of entities
        if (e instanceof school) {
            schoolList.add((school) e);
        } else if (e instanceof student) {
            studentList.add((student) e);
            users[e.getAlliegance()].addstudent((student) e); 
        } else if (e instanceof teacher) {
            teacherList.add((teacher) e);
        } else if (e instanceof fairy) {
            fairyList.add((fairy) e);
            users[e.getAlliegance()].addfairy((fairy) e);
        } else if (e instanceof cookie) {
            cookieList.add((cookie) e);
            users[e.getAlliegance()].addcookie((cookie) e);
        }
        //Place the item where it belongs on the board
        addToSpace(e.getxLocation(), e.getyLocation(), e);
    }

    public static void setup(User[] userhold) { // Vincenzo wrote this method
        users = userhold;
    }

    //Written by Aidan, with Vincenzo adding a means to return all list elements
    //Returns an ArrayList of all schools with the given alliegance
    //If -1 is given as the alliegance, then return an ArrayList of all schools, regardless of alliegance
    public static ArrayList<school> getSchoolList(int alliegance) {
        ArrayList<school> specificSchoolList = new ArrayList<>();
        //Copy neccessary elements from one list into the other
        for (int i = 0; i < schoolList.size(); i++) {
            if (alliegance == -1) { // Vincenzo wrote this line
                specificSchoolList.add(schoolList.get(i));// Vincenzo wrote this line
            } else if (schoolList.get(i).getAlliegance() == alliegance) {
                specificSchoolList.add(schoolList.get(i));
            }
        }
        return specificSchoolList;
    }

    //Written by Aidan, with Vincenzo adding a means to return all list elements
    //Returns an ArrayList of all students with the given alliegance
    //If -1 is given as the alliegance, then return an ArrayList of all students, regardless of alliegance
    public static ArrayList<student> getStudentList(int alliegance) {
        ArrayList<student> specificStudentList = new ArrayList<>();
        //Copy neccessary elements from one list into the other
        for (int i = 0; i < studentList.size(); i++) {
            if (alliegance == -1) { // Vincenzo wrote this line
                specificStudentList.add(studentList.get(i));// Vincenzo wrote this line
            } else if (studentList.get(i).getAlliegance() == alliegance) {
                specificStudentList.add(studentList.get(i));
            }
        }
        return specificStudentList;
    }

    //Written by Aidan, with Vincenzo adding a means to return all list elements
    //Returns an ArrayList of all teachers with the given alliegance
    //If -1 is given as the alliegance, then return an ArrayList of all teachers, regardless of alliegance
    public static ArrayList<teacher> getTeacherList(int alliegance) {
        ArrayList<teacher> specificTeacherList = new ArrayList<>();
        //Copy neccessary elements from one list into the other
        for (int i = 0; i < teacherList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificTeacherList.add(teacherList.get(i));// Vincenzo wrote this line
            } else if (teacherList.get(i).getAlliegance() == alliegance) {
                specificTeacherList.add(teacherList.get(i));
            }
        }
        return specificTeacherList;
    }

    //Written by Aidan, with Vincenzo adding a means to return all list elements
    //Returns an ArrayList of all fairies with the given alliegance
    //If -1 is given as the alliegance, then return an ArrayList of all fairies, regardless of alliegance
    public static ArrayList<fairy> getFairyList(int alliegance) {
        ArrayList<fairy> specificFairyList = new ArrayList<>();
        //Copy neccessary elements from one list into the other
        for (int i = 0; i < fairyList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificFairyList.add(fairyList.get(i));// Vincenzo wrote this line
            } else if (fairyList.get(i).getAlliegance() == alliegance) {
                specificFairyList.add(fairyList.get(i));
            }
        }
        return specificFairyList;
    }

    //UNUSED
    //Written by Aidan, with Vincenzo adding a means to return all list elements
    //Returns an ArrayList of all cookies belonging to the user with the given alliegance
    //If -1 is given as the alliegance, then return an ArrayList of all cookies, regardless of alliegance
    public static ArrayList<cookie> getCookieList(int alliegance) {
        ArrayList<cookie> specificCookieList = new ArrayList<>();
        //Copy neccessary elements from one list into the other
        for (int i = 0; i < cookieList.size(); i++) {
            if (alliegance == -1) {// Vincenzo wrote this line
                specificCookieList.add(cookieList.get(i));// Vincenzo wrote this line
            } else if (cookieList.get(i).getAlliegance() == alliegance) {
                specificCookieList.add(cookieList.get(i));
            }
        }
        return specificCookieList;
    }

    //The number of tiles that make up the length and width of the world
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

    //Written as a void method by Aidan, turned into a boolean by Vincenzo
    //Puts a variable v into a specified tile in the world, returning true if successful, and false if not
    public static boolean addToSpace(int x, int y, variables v) {
        try {
            worldSpace[x][y] = v;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }

    }

    //Written by Aidan, with Vincenzo deleting an unnecessary parameter
    //Deletes whatever occupies a specified spot on the board by replacing it with null
    public static void deleteFromSpace(int x, int y) {
        try { 
            worldSpace[x][y] = null;
        } catch (Exception e) {

        }
    }

    //Written by Aidan
    //Checks and returns contents of a space adjacent in the specified direction from a given tile
    public static String checkSpace(int x, int y, char dir) {
        variables checkedSpace = null;
        boolean error = false; //Becomes true if checking the space is impossible
        switch (dir) {
            //Check up
            case 'u' | 'U':
                try {
                    checkedSpace = worldSpace[x][y - 1];
                } catch (Exception e) {
                    error = true;
                }
            //Check down
            case 'd' | 'D':
                try {
                    checkedSpace = worldSpace[x][y + 1];
                } catch (Exception e) {
                    error = true;
                }
            //Check left
            case 'l' | 'L':
                try {
                    checkedSpace = worldSpace[x - 1][y];
                } catch (Exception e) {
                    error = true;
                }
            //Check right
            case 'r' | 'R':
                try {
                    checkedSpace = worldSpace[x + 1][y];
                } catch (Exception e) {
                    error = true;
                }
        }
        //Checking the space is impossible
        if (error) {
            return "error";
        }
        //Return the alliegance and type of what is in the checked space, if there is anything
        if (checkedSpace != null) {
            return checkedSpace.getAlliegance() + " " + checkedSpace.getClass().getName();
        } else {      
            return "nothing";
        }
    }

    //Written by Aidan
    //Checks to see if a user has won the game by seeing if everything has the same alliegance
    public boolean checkDomination() {
        int temp = 0;
        //Loop through whole world
        for (int i = 0; i < worldSpace.length; i++) {
            for (int j = 0; j < worldSpace[i].length; j++) {
                try {
                    int all = worldSpace[i][j].getAlliegance();
                    //If no spaces checked have an allegance yet
                    if (temp == 0) {
                        //The current space's alliegance is assumed to be the only one
                        temp = all;
                    
                    //If the alliegance does not match all previous
                    } else if (temp != 0 && all != temp) {
                        //Assumption was wrong, no-one has won
                        return false;
                    }
                } catch (Exception e) {
                }
            }
        }
        //All the allegiences are the same or non-existent, game has been won
        return true;
    }

    public void printSpace() { // Vincenzo wrote this method
        for (int i = 0; i < worldSpace.length; i++) {

            System.out.print("[");
            for (int j = 0; j < worldSpace[i].length; j++) {
                //loops through array of images and draws
                if (worldSpace[i][j] instanceof student) {
                    System.out.print("Stud");
                } else if (worldSpace[i][j] instanceof school) {
                    System.out.print("Scho");
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
