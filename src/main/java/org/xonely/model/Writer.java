package org.xonely.model;

import java.io.Serializable;
import java.util.*;

public class Writer implements Serializable {

    private final int id;
    private Status status;
    private String firstName;
    private String lastName;
    private final List<Post> posts;

    public Writer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        posts = new ArrayList<>();
        status = Status.UNDER_REVIEW;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Post> getPosts() {
        return posts.stream().distinct().toList();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return
                "id: " + id + " | " + lastName +
                        " " + firstName + " " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Writer writer = (Writer) o;
        return id == writer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
