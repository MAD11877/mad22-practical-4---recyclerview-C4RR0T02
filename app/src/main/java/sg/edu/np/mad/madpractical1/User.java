package sg.edu.np.mad.madpractical1;

import java.io.Serializable;

public class User implements Serializable {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User() {

    }

    public User(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }
}
