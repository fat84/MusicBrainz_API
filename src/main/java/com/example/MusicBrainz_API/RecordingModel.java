/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.MusicBrainz_API;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RecordingModel
{
    @SerializedName("id")
    public String id;
    
    @SerializedName("title")
    public String title;
    
    @SerializedName("length")
    public long length;
    
    @SerializedName("artist-credit")
    public List<ArtistCreditModel> artist_credit = new ArrayList<ArtistCreditModel>();
    
    @SerializedName("releases")
    public List<ReleaseModel> release_list = new ArrayList<ReleaseModel>();
    
    public RecordingModel(){}
}
