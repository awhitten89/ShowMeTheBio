package showmethebio.alan.com.showmethebio;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView bachImage;
    private ImageView mozartImage;
    private String BachBio = "Bach was born in Eisenach, Saxe-Eisenach, into a great musical family. " +
            "His father, Johann Ambrosius Bach, was the director of the town musicians," +
            " and all of his uncles were professional musicians. His father probably taught him to play the violin" +
            " and harpsichord, and his brother, Johann Christoph Bach, taught him the clavichord and exposed him to much" +
            " contemporary music";

    private String MozartBio = "Mozart showed prodigious ability from his earliest childhood. " +
            "Already competent on keyboard and violin, he composed from the age of five and performed before European royalty. " +
            "At 17, he was engaged as a court musician in Salzburg, but grew restless and travelled in search of a better position, " +
            "always composing abundantly.";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bachImage = (ImageView) findViewById(R.id.imageBach);
        mozartImage = (ImageView) findViewById(R.id.imageMozart);

        bachImage.setOnClickListener(this);
        mozartImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.imageBach:

                Intent bachIntent = new Intent(MainActivity.this, DetailsActivity.class);
                bachIntent.putExtra("Bach", BachBio);
                bachIntent.putExtra("name", "Bach");
                startActivity(bachIntent);
                break;

            case R.id.imageMozart:

                Intent mozartIntent = new Intent(MainActivity.this, DetailsActivity.class);
                mozartIntent.putExtra("Mozart", MozartBio);
                mozartIntent.putExtra("name", "Mozart");
                startActivity(mozartIntent);
                break;
        }
    }
}
