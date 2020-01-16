package com.example.socialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Photo {

//-id
//-albumId
//-photoUrl
//-createdBy
//-dateCreated

    @Id
    private String id;

    private String albumId;

    private String photoUrl;

    private String createdBy;

    private Date dateCreated;

}
