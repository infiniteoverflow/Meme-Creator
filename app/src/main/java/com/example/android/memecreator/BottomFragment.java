package com.example.android.memecreator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends android.support.v4.app.Fragment {
    private static TextView topText;
    private static TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        topText = view.findViewById(R.id.topText);
        bottomText = view.findViewById(R.id.bottomText);
        return view;
    }

    public void setMemeText(String s, String r) {
        topText.setText(s);
        bottomText.setText(r);
    }
}
