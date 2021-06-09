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
        private double priceOriginal;
        private String etiqueta;
        private String discountPercent;
        private double priceDiscount;
        private String category;
        private String publisher;
        private int pegi;
        private String pegiContentDescriptiors;

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

        public double getPriceOriginal() {
            return priceOriginal;
        }

        public void setPriceOriginal(double priceOriginal) {
            this.priceOriginal = priceOriginal;
        }

        public String getEtiqueta() {
            return etiqueta;
        }

        public void setEtiqueta(String etiqueta) {
            this.etiqueta = etiqueta;
        }

        public String getDiscountPercent() {
            return discountPercent;
        }

        public void setDiscountPercent(String discountPercent) {
            this.discountPercent = discountPercent;
        }

        public double getPriceDiscount() {
            return priceDiscount;
        }

        public void setPriceDiscount(double priceDiscount) {
            this.priceDiscount = priceDiscount;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getPegi() {
            return pegi;
        }

        public void setPegi(int pegi) {
            this.pegi = pegi;
        }

        public String getPegiContentDescriptiors() {
            return pegiContentDescriptiors;
        }

        public void setPegiContentDescriptiors(String pegiContentDescriptiors) {
            this.pegiContentDescriptiors = pegiContentDescriptiors;}
        }



