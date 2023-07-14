package br.ufsm.csi.poow2.spring_rest_security.model;


public class Exercise {
    private int id;
    private String name;
    private String category;
    private boolean isSelected;

    public Exercise() {
    }

    public Exercise(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isSelected = false;
    }

    public Exercise(String name, String category) {
        this.name = name;
        this.category = category;
        this.isSelected = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
