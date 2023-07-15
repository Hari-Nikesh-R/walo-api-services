package com.sns.waloapiservices.dtos.request;

import com.sns.waloapiservices.dtos.Location;
import lombok.Data;

@Data
public class AccidentDto {
    private String photoUrl;
    private Location accidentLocation;
    private boolean isAmbulanceRequired;
    private boolean isFundRequired;
    private boolean isHospitalRequired;
}
