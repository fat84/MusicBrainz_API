package com.example.MusicBrainz_API;

import com.google.gson.annotations.SerializedName;

public class ArtistCreditModel
{
    @SerializedName("name-credit")
    public NameCreditModel name_credit;
    
    @SerializedName("artist")
    public ArtistModel artist;
    
    public ArtistCreditModel(){}
}
