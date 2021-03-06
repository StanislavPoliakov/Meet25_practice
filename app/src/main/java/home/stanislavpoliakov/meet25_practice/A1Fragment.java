package home.stanislavpoliakov.meet25_practice;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class A1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a1, container, false);
        ImageButton button = view.findViewById(R.id.nextButton);
        NavController navController = Navigation.findNavController(getActivity(), R.id.host_fragment);
        button.setOnClickListener(v -> {
            navController.navigate(R.id.action_a1Fragment_to_a2Fragment);
        });

        view.setOnLongClickListener(v -> {
            navController.navigate(R.id.action_global_viewPager);
            return true;
        });
        return view;
    }
}
