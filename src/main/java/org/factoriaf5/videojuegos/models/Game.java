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
        private int year;
        private double priceOriginal;
        private String etiqueta;
        private int discountPercent;
        private double priceDiscount;
        private String category;
        private String publisher;
        private int pegi;
        private String pegiContentDescriptiors;


        @Override
        public String toString() {
            return "Game{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", category='" + category + '\'' +
                    '}';
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

