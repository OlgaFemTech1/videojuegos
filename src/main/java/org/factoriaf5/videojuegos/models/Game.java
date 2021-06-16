package org.factoriaf5.videojuegos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

    @Entity
    @Table(name = "games")
    public class Game implements Serializable {
        @Id
        @GeneratedValue(strategy = SEQUENCE)
        private Long id;
        private String title;
        private String platform;
        private int years;
        private int pegi;
        private double cost;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public int getYears() {
            return years;
        }

        public void setYears(int years) {
            this.years = years;
        }

        public int getPegi() { return pegi;}

        public void setPegi(int pegi) { this.pegi = pegi;}


        public double getCost() {return cost;}

        public void setCost(double cost) {this.cost = cost;}
    }



