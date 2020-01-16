package com.example.socialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comment {

//-id
//-photoId
//-message
//-createdBy
//-dateCreated

    @Id
    private String id;

    private String photoId;

    private String message;

    private String createdBy;

    private Date dateCreated;
}
