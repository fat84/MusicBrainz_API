package com.example.MusicBrainz_API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

public class API_MusicBrainz_JSON
{
    private static final String ENDPOINT_URL = "http://musicbrainz.org";
    private static final String ENDPOINT_RECORDING_GET = "/ws/2/recording/";

    public static List<RecordingModel> SearchRecordingComplete(String szArtist, String szAlbum, String szTrack, long lDuration) throws Exception
    {
        long small_v = 30000;
        URL url = new URL
        (
            ENDPOINT_URL + ENDPOINT_RECORDING_GET + "?query=" + URLEncoder.encode(
                "artist:\"" + szArtist + "\"" +
                " AND " + 
                "release:\"" + szAlbum + "\"" +
                " AND " + 
                "recording:\"" + szTrack + "\"" +
                (
                    lDuration > 0 ?
                    (
                        " AND " +
                        "dur:[" + (lDuration - small_v) + " TO " + (lDuration + small_v) + "]"
                    ) : ""
                ), "UTF-8") +
            "&limit=100&fmt=json"
        );
        System.out.println(url.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if(conn.getResponseCode() != HttpURLConnection.HTTP_OK)
            return null;
        BufferedReader rr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder buffer = new StringBuilder();
        int read;
        char[] chars = new char[1024];
        while ((read = rr.read(chars)) != -1)
            buffer.append(chars, 0, read);
        String szJSON = buffer.toString();
        System.out.println(szJSON);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        JsonObject jo = new JsonParser().parse(szJSON).getAsJsonObject();
        List<RecordingModel> ret = gson.fromJson(jo.getAsJsonArray("recordings"), new TypeToken<List<RecordingModel>>(){}.getType());
        return ret;
    }
    
    public static List<RecordingModel> SearchRecordingByArtist(String szArtist, String szTrack, long lDuration) throws Exception
    {
        long small_v = 30000;
        URL url = new URL
        (
            ENDPOINT_URL + ENDPOINT_RECORDING_GET + "?query=" + URLEncoder.encode(
                "artist:\"" + szArtist + "\"" +
                " AND " + 
                "recording:\"" + szTrack + "\"" +
                (
                    lDuration > 0 ?
                    (
                        " AND " +
                        "dur:[" + (lDuration - small_v) + " TO " + (lDuration + small_v) + "]"
                    ) : ""
                ), "UTF-8") +
            "&limit=100&fmt=json"
        );
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if(conn.getResponseCode() != HttpURLConnection.HTTP_OK)
            return null;
        BufferedReader rr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder buffer = new StringBuilder();
        int read;
        char[] chars = new char[1024];
        while ((read = rr.read(chars)) != -1)
            buffer.append(chars, 0, read);
        String szJSON = buffer.toString();
        System.out.println(szJSON);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        JsonObject jo = new JsonParser().parse(szJSON).getAsJsonObject();
        List<RecordingModel> ret = gson.fromJson(jo.getAsJsonArray("recordings"), new TypeToken<List<RecordingModel>>(){}.getType());
        return ret;
    }

    public static List<RecordingModel> SearchRecordingByAlbum(String szAlbum, String szTrack, long lDuration) throws Exception
    {
        long small_v = 30000;
        URL url = new URL
        (
            ENDPOINT_URL + ENDPOINT_RECORDING_GET + "?query=" + URLEncoder.encode(
                "release:\"" + szAlbum + "\"" +
                " AND " + 
                "recording:\"" + szTrack + "\"" +
                (
                    lDuration > 0 ?
                    (
                        " AND " +
                        "dur:[" + (lDuration - small_v) + " TO " + (lDuration + small_v) + "]"
                    ) : ""
                ), "UTF-8") +
            "&limit=100&fmt=json"
        );
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if(conn.getResponseCode() != HttpURLConnection.HTTP_OK)
            return null;
        BufferedReader rr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder buffer = new StringBuilder();
        int read;
        char[] chars = new char[1024];
        while ((read = rr.read(chars)) != -1)
            buffer.append(chars, 0, read);
        String szJSON = buffer.toString();
        System.out.println(szJSON);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        JsonObject jo = new JsonParser().parse(szJSON).getAsJsonObject();
        List<RecordingModel> ret = gson.fromJson(jo.getAsJsonArray("recordings"), new TypeToken<List<RecordingModel>>(){}.getType());
        return ret;
    }

    public static List<RecordingModel> SearchRecording(String szTrack, long lDuration) throws Exception
    {
        long small_v = 30000;
        URL url = new URL
        (
            ENDPOINT_URL + ENDPOINT_RECORDING_GET + "?query=" + URLEncoder.encode(
                "recording:\"" + szTrack + "\"" +
                (
                    lDuration > 0 ?
                    (
                        " AND " +
                        "dur:[" + (lDuration - small_v) + " TO " + (lDuration + small_v) + "]"
                    ) : ""
                ), "UTF-8") +
            "&limit=100&fmt=json"
        );
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        if(conn.getResponseCode() != HttpURLConnection.HTTP_OK)
            return null;
        BufferedReader rr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder buffer = new StringBuilder();
        int read;
        char[] chars = new char[1024];
        while ((read = rr.read(chars)) != -1)
            buffer.append(chars, 0, read);
        String szJSON = buffer.toString();
        System.out.println(szJSON);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        JsonObject jo = new JsonParser().parse(szJSON).getAsJsonObject();
        List<RecordingModel> ret = gson.fromJson(jo.getAsJsonArray("recordings"), new TypeToken<List<RecordingModel>>(){}.getType());
        return ret;
    }
}
