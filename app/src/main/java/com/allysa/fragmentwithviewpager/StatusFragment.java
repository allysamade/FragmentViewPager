package com.allysa.fragmentwithviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {

    TextView txtPesan;

    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFragment =  inflater.inflate(R.layout.fragment_status, container, false);
        txtPesan = (TextView) viewFragment.findViewById(R.id.txtMsg);
        return viewFragment;
    }
    protected void displayReceivedData(String message)
    {
        txtPesan.setText("Data Received :" +message);
    }
}



 /*
         //txtMsg = (TextView) viewFragment.findViewById(R.id.txtPesan);

        //Bundle Data
        Bundle data = getArguments();

        String chat = data.getString("msg");
        TextView ps = (TextView) viewFragment.findViewById(R.id.txtPesan);
        ps.setText(chat);

        // Inflate the layout for this fragment

  */