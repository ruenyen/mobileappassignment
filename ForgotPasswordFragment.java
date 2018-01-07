package my.edu.tarc.care4life;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ruenyenchin on 7/1/2018.
 */

public class ForgotPasswordFragment extends Fragment {
    public ForgotPasswordFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.fragment_forgotpassword, container, false);
        return view;
    }
}
