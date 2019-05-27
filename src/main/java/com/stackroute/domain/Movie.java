package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    private int id;

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    private String movieName;

        Actor actor;


        public Movie() {
            System.out.println("Movie Constructor");
        }

        public Actor getActor() {
            return actor;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        public Movie(Actor actor) {
            this.actor=actor;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "actor=" + actor +
                    '}';
        }

    }

