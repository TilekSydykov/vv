package kg.flaterlab.vv.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.flaterlab.vv.R;
import kg.flaterlab.vv.databinding.UserProfileBinding;
import kg.flaterlab.vv.models.User;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {
    }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        UserProfileBinding binding = DataBindingUtil.inflate(inflater, R.layout.user_profile, container, false);
        User user = new User("Tilek", "Sydykov", "s", "TilekFromkg@gmail.com",true);
        binding.setUser(user);
        return binding.getRoot();
    }
}
