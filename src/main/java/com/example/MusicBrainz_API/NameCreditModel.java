package com.example.MusicBrainz_API;

import com.google.gson.annotations.SerializedName;

public class NameCreditModel
{
    @SerializedName("artist")
    public ArtistModel artist;
    
    public NameCreditModel(){}
}
