package io.ugshortcourse.notebucket.model;

/**
 * {@link Note} data model
 * Instance of the note object in the database
 */
public class Note {
    private int  id;
    private String title;
    private String description;
    private long timestamp = 0L;


    //Defalt Constructor
    public Note(){}

    //Parameterized constructor
    public Note(String title,String description){
        this.id = 0;
        this.title = title;
        this.description = description;
        this.timestamp = /*Current system time */ System.currentTimeMillis();

    }


    public int getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
