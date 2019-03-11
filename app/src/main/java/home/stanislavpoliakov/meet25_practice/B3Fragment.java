package home.stanislavpoliakov.meet25_practice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class B3Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b3, container, false);
        NavController navController = Navigation.findNavController(getActivity(), R.id.host_fragment);
        view.setOnLongClickListener(v -> {
            navController.navigate(R.id.action_global_viewPager);
            return true;
        });
        return view;
    }

}
