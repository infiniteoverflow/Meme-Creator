package com.example.android.memecreator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends android.support.v4.app.Fragment {

    private static EditText topEditText;
    private static EditText bottomEditText;
    private static Button submit;
    TopFragmentListener activitycommander;

    public interface TopFragmentListener {
         void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activitycommander = (TopFragmentListener) getActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topEditText = view.findViewById(R.id.topText);
        bottomEditText = view.findViewById(R.id.bottomText);
        submit = view.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }

    public void buttonClicked(View view) {
        activitycommander.createMeme(topEditText.getText().toString(), bottomEditText.getText().toString());
    }
}
