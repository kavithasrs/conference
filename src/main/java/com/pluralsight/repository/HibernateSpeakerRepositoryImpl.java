package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker1 = new Speaker();
        speaker1.setFirstName("Kavitha");
        speaker1.setLastName("Subbiah");

        speakers.add(speaker1);

        return speakers;
    }
}
