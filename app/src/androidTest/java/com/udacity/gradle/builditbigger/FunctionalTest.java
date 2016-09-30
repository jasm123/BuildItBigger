package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class FunctionalTest extends AndroidTestCase {
    public void runTest(){
        String joke = null;
        JokeAsyncTask jokesAsyncTask = new JokeAsyncTask(getContext());
        jokesAsyncTask.execute();
        try {
            joke = jokesAsyncTask.get();
            Log.d("FunctionalTest", "Retrieved a non-empty string successfully: " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(joke);
    }



}
