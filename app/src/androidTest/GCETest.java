package androidTest;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import java.util.concurrent.ExecutionException;

public class GCETest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void test(){
        String result = null;
        try {
            result= new EndpointsAsyncTask().execute(new Pair<Context, String>(getContext(),"")).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);


    }
}
