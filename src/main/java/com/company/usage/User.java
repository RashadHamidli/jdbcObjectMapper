package com.company.usage;


import lombok.Data;

/**
 *
 * @author mr_rashad
 */
@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private Company company;
}