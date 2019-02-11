package com.smelk.tree;


import com.smelk.tree.figures.Figures;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Figures> figures;
    private List<Group> groups;

    public Group() {
        figures = new ArrayList<>();
        groups = new ArrayList<>();
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void addFigures(Figures figure){
        figures.add(figure);
    }

    public List<Figures> getFigures() {
        return figures;
    }

    public void setFigures(List<Figures> figures) {
        this.figures = figures;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
