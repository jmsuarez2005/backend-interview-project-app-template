package com.ninjaone.backendinterviewproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "operating_system")
@AllArgsConstructor
public class OperatingSystem implements AbstractEntity<String> {

        @Id
        @Column(name = "operating_system_id")
        private String id;
}
