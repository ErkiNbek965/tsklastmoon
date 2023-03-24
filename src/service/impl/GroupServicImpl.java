package service.impl;

import db.Database;
import model.Group;
import service.GroupServic;

import java.util.List;

public class GroupServicImpl implements GroupServic {
    Database database = new Database();


    @Override
    public String addNewGroup(Group group) {
        database.getGroups().add(group);
        System.out.println(group);

        return "дааааа";
    }

    @Override
    public String getGroupById(int id) {
        database.getGroups().stream().filter(group -> group.getId()==id);
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        database.getGroups().stream().forEach(System.out::println);
        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        database.getGroups().stream().toArray();
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
