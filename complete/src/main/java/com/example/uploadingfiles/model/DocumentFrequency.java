package com.example.uploadingfiles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documentfrequency")
public class DocumentFrequency {

        @Id
        @GeneratedValue
        private Long id;

        @Column(nullable = false, length = 100)
        private String name;

        @Column(name = "email_address")
        private String emailAddress;

        public Long getIdid() {
                return id;
        }

        public void setIdid(Long idid) {
                this.id = idid;
        }

        // getters and setters

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }
}
