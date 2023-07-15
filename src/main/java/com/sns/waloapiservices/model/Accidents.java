package com.sns.waloapiservices.model;

import com.sns.waloapiservices.dtos.Location;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("reported_accident")
public class Accidents {
    @Id
    private String id;
    private String photoUrl;
    private Location accidentLocation;
    private boolean isAmbulanceRequired;
    private boolean isFundRequired;
    private boolean isHospitalRequired;
}
