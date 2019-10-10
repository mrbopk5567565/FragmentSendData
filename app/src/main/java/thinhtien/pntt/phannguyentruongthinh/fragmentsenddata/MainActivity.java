package thinhtien.pntt.phannguyentruongthinh.fragmentsenddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
                Fragment fragment = null;
                Bundle bundle;
                switch (i){
                    case R.id.radioBad:
                        fragment = new RatingFragment();
                        bundle = new Bundle();
                        bundle.putInt("numstar",1);
                        fragment.setArguments(bundle);
                        break;
                    case R.id.radioLike:
                        fragment = new RatingFragment();
                        bundle = new Bundle();
                        bundle.putInt("numstar",3);
                        fragment.setArguments(bundle);

                        break;
                    case R.id.radioEnjoy:
                        fragment = new RatingFragment();
                        bundle = new Bundle();
                        bundle.putInt("numstar",5);
                        fragment.setArguments(bundle);
                        break;
                }

                fragmentTransaction.add(R.id.linearContainer,fragment);
                fragmentTransaction.commit();
            }
        });



        // 2 : Fragment da nam trong Activity
    }
}
