package tw.org.iii.brad.brad15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private RequestQueue queue;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        queue = Volley.newRequestQueue(this);
    }

    public void test1(View view) {
        StringRequest request = new StringRequest(Request.Method.GET,
                "https://bradchao.com/wp",
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {
                        tv.setText(response);
                    }
                },null);
        queue.add(request);
    }
}
