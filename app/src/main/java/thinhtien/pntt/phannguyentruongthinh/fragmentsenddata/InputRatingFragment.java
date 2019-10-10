package thinhtien.pntt.phannguyentruongthinh.fragmentsenddata;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputRatingFragment extends Fragment {

    View view;
    EditText edtInput;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_input_rating, container, false);

        edtInput = view.findViewById(R.id.edittextInput);

        // kiem tra RatingFragment co ton tai khong

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RatingFragment ratingFragment = (RatingFragment) getActivity()
                .getSupportFragmentManager()
                .findFragmentById(R.id.fragmentRating);

        if (ratingFragment != null) {
            ratingFragment.setOnListenerRatingBar(new OnListenerRatingBar() {
                @Override
                public void onChange(float rating) {
                    edtInput.setText(rating + "");
                }
            });
        }
    }
}
