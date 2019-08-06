package com.ginger.speednote.model;

import java.util.ArrayList;

public class Note {

    //text
    ArrayList<TextSubstance> textSubstances;

    //photo
    ArrayList<PhotoSubstance> photoSubstances;

    //voice
    ArrayList<VoiceSubstance> voiceSubstances;

    public Note() {
    }

    /**
     * add text in list
     */
    public void addTextSubstance(TextSubstance substance){
        textSubstances.add(substance);
    }

    /**
     * add photo in list
     */
    public void addPhotoSubstance(PhotoSubstance substance){
        photoSubstances.add(substance);
    }

    /**
     * add voice in list
     */
    public void addVoiceSubstance(VoiceSubstance substance){
        voiceSubstances.add(substance);
    }

    /**
     * remove text from list
     * @param index
     */
    public void removeTextSubstance(int index) {
        textSubstances.remove(index);
    }

    /**
     * remove photo from list
     * @param index
     */
    public void removePhotoSubstance(int index) {
        textSubstances.remove(index);
    }

    /**
     * remove voice from list
     * @param index
     */
    public void removeVoiceSubstance(int index) {
        textSubstances.remove(index);
    }
}
