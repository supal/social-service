package com.example.socialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Album {
//-id
//-name
//-coverPhotoUrl
//-createdBy
//-dateCreated

    @Id
    private String id;

    private String coverPhotoUrl;

    private String createdBy;

    private Date dateCreated;

}
