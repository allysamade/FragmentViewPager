package com.allysa.fragmentwithviewpager;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {

     EditText inputMsg;

     SendMessage SM;

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(R.layout.fragment_chat, container, false);
        inputMsg = (EditText) viewFragment.findViewById(R.id.inputChat);
        Button btnSend = (Button) viewFragment.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                SM.sendData(inputMsg.getText().toString());
            }
        });
        return viewFragment;
    }
        interface SendMessage {
            void sendData(String message);
        }
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            SM = (SendMessage) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try adain");
        }
    }
}
