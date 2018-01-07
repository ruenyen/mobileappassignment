package my.edu.tarc.care4life;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ruenyenchin on 6/1/2018.
 */

public class LoginFragment extends Fragment {
    public LoginFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        Button buttonRegister = (Button) view.findViewById(R.id.buttonRegister);
        Button buttonForgotPassword = (Button) view.findViewById(R.id.buttonForgot);

        //register button
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterFragment rf = new RegisterFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frame_container, rf);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        //forgot password button
        buttonForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ForgotPasswordFragment fpf = new ForgotPasswordFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frame_container, fpf);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return view;
    }
}
