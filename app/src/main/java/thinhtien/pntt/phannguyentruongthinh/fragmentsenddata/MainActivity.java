package thinhtien.pntt.phannguyentruongthinh.fragmentsenddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        // 1: Fragment chua ton tai trong activity

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                switch (i){
                    case R.id.radioBad:
                        break;
                    case R.id.radioLike:
                        break;
                    case R.id.radioEnjoy:
                        break;
                }

                RatingFragment ratingFragment = new RatingFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("numstar",1);
                ratingFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.linearContainer,ratingFragment);
                fragmentTransaction.commit();
            }
        });



        // 2 : Fragment da nam trong Activity
    }
}
