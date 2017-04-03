package com.example.MusicBrainz_API;

import com.google.gson.annotations.SerializedName;

public class ReleaseModel
{
    @SerializedName("id")
    public String id;
    
    @SerializedName("title")
    public String title;
    
    @SerializedName("release-group")
    public ReleaseGroupModel release_group;
    
    public ReleaseModel(){}
}
