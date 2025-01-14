package com.ninjaone.backendinterviewproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "operating_system")
@AllArgsConstructor
@NoArgsConstructor
public class OperatingSystem implements AbstractEntity<String> {

        @Id
        @Column(name = "operating_system_id")
        @JsonProperty("id")
        private String id;
}
