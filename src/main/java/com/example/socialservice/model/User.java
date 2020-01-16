package com.example.socialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

//-id
//-name
//-email
//-profilePhotoUrl

    @Id
    private String id;

    private String name;

    private String email;

    private String profilePhotoUrl;

}
