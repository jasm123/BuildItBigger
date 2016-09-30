package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;

import com.example.user.android_lib.JokeViewActivity;
import com.example.user.myapplication.backend.myApi.MyApi;
import com.example.user.myapplication.backend.myApi.model.MyBean;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * An Async task to retrieve jokes.
 */
public class JokeAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi myApiService = null;
    private Context context;

    public JokeAsyncTask(Context context){
        this.context=context;
    }

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://animated-backup-144715.appspot.com/_ah/api/");

            myApiService = builder.build();
        }
        try{
            return myApiService.sendJoke(new MyBean()).execute().getData();
        }
        catch (IOException e){
            return e.getMessage();
        }

    }
    protected void onPostExecute(String result){
        Intent intent = new Intent(context, JokeViewActivity.class);
        intent.putExtra(JokeViewActivity.extraKey, result);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
