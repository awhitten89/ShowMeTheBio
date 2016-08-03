package showmethebio.alan.com.showmethebio;

import android.app.Activity;
import android.app.IntentService;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    private ImageView profileImage;
    private TextView bioText;
    private Bundle extras;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        profileImage = (ImageView) findViewById(R.id.detailsImage);
        bioText = (TextView) findViewById(R.id.textBio);
        name = (TextView) findViewById(R.id.profileName);

        extras = getIntent().getExtras();

        if(extras != null){

            String name = extras.getString("name");

            showDetails(name);
        }
    }

    public void showDetails(String mName){

        if(mName.equals("Bach")){

            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.bach_profile));
            bioText.setText(extras.getString(mName));
            name.setText(mName);

        } else if (mName.equals("Mozart")) {

            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.mozart_profile));
            bioText.setText(extras.getString(mName));
            name.setText(mName);
        }
    }
}
