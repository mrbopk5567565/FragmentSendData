package thinhtien.pntt.phannguyentruongthinh.fragmentsenddata;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

public class RatingFragment extends Fragment {


    public RatingFragment() {
        // Required empty public constructor
    }

    View view;
    RatingBar ratingBar;
    // thang gui du lieu cho ratingbar la thang su dung interface
    OnListenerRatingBar onListenerRatingBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_rating, container, false);


//        // gui du lieu Activity qua Fragment
        ratingBar = view.findViewById(R.id.ratingbar);
//
//        Bundle bundle = getArguments();
//        int numstar = bundle.getInt("numstar");
//
//        ratingBar.setRating(numstar);
//        // finish

        // gui du lieu Fragment vs Fragment
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                onListenerRatingBar.onChange(v);
            }
        });

        return view;
    }

    public void setOnListenerRatingBar(OnListenerRatingBar onListenerRatingBar){
        this.onListenerRatingBar = onListenerRatingBar;
    }

}
