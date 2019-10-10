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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_rating, container, false);

        ratingBar = view.findViewById(R.id.ratingbar);

        Bundle bundle = getArguments();
        int numstar = bundle.getInt("numstart");

        ratingBar.setNumStars(numstar);
        return view;
    }

}
