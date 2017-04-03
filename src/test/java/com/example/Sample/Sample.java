package com.example.Sample;

import com.example.MusicBrainz_API.*;
import java.util.List;

public class Sample
{

    
    public static void main(String[] args) throws Exception
    {
        List<RecordingModel> x = API_MusicBrainz_JSON.SearchRecordingComplete("Linkin Park", "Hybrid Theory", "In the End", 216000);
        System.out.println(x.get(0).id);
    }
}
