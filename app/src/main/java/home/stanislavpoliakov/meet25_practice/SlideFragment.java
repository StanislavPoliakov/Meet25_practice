package home.stanislavpoliakov.meet25_practice;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SlideFragment extends Fragment {

    public static SlideFragment newInstance(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        SlideFragment fragment = new SlideFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slide, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView slideLabel = view.findViewById(R.id.slideLabel);
        String label = "Step " + getArguments().getInt("position");
        slideLabel.setText(label);
    }
}
