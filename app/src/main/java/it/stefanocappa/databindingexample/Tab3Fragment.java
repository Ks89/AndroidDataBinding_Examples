package it.stefanocappa.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Tha same of Tab2, but with a custom Binding class name
 */
public class Tab3Fragment extends Fragment {

    @Bind(R.id.randomButton)
    Button randomButton;

    private User2 user;

    public static Tab3Fragment newInstance() {
        return new Tab3Fragment();
    }

    public Tab3Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment, container, false);

        ButterKnife.bind(this, view);

        //FragmentMainBinding is the layout name without "-" and in Pascal Style. With at the end the word "Binding"
        it.stefanocappa.databindingexample.CustomBindingNameTab3 binding = DataBindingUtil.bind(view);

        user = new User2("FirstName", "LastName", false);
        user.professor.set(new Random().nextBoolean());
        binding.setUser(user);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.randomButton)
    public void onClickRandom(View v) {
        boolean newBool = new Random().nextBoolean();
        Log.d("Tab2", "newBool is " + newBool);
        user.professor.set(newBool);
        //here it isn't necessary to bind the updated object (binding.setUser(user)), because i'm using an
        //ObservableBoolean in the model
    }
}