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
        private Int year;
        private Double priceOriginal;
        private String etiqueta;
        private Int discountPercent;
        private Double priceDiscount;
        private String category;
        private String publisher;
        private Int pegi;
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

        public Int getYear() {
            return year;
        }

        public void setYear(Int year) { this.year = year; }

        public Double getPriceOriginal() {
            return priceOriginal;
        }

        public void setPriceOriginal(Int priceOriginal) { this.priceOriginal = priceOriginal; }

        public String getEtiqueta() {
            return etiqueta;
        }

        public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

        public Int getDiscountPercent() {
            return discountPercent;
        }

        public void setDiscountPercent(Int discountPercent) { this.discountPercent = discountPercent; }

        public Double getPriceDiscount() {
            return priceDiscount;
        }

        public void setPriceDiscount(Double priceDiscount) { this.priceDiscount = priceDiscount; }

        public String getCategory() {
            return category;
        }

        public void setCategory (String category) { this.category = category;}

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher (String publisher) { this.publisher = publisher;}

        public Int getPegi() { return pegi; }

        public void setPegi (String pegi) { this.pegi = pegi;}

        public String getPegiContentDescriptiors() { return pegiContentDescriptiors; }

        public void setPegiContentDescriptiors(String pegiContentDescriptiors) { this.pegiContentDescriptiors = pegiContentDescriptiors;}





    }

