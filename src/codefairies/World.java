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

    public void add(variables e) {
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
}
