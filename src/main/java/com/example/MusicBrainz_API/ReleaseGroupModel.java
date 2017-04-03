package com.example.MusicBrainz_API;

import com.google.gson.annotations.SerializedName;

public class ReleaseGroupModel
{
    @SerializedName("id")
    public String id;
    
    @SerializedName("type")
    public String type;
    
    @SerializedName("primary-type")
    public String primary_type;
    
    public ReleaseGroupModel(){}
}
