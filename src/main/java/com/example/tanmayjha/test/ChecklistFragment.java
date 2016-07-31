package com.example.tanmayjha.test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChecklistFragment extends Fragment implements View.OnClickListener {
    ImageButton b1,b2,b3,b4,b5,b6,b7;
    View view;
    public ChecklistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_checklist, container, false);
    }

    @Override
    public void onStart()
    {
        view=getView();
        super.onStart();
        b1=(ImageButton)view.findViewById(R.id.mattress_id);
        b2=(ImageButton)view.findViewById(R.id.bucket_id);
        b3=(ImageButton)view.findViewById(R.id.simcard_id);
        b4=(ImageButton)view.findViewById(R.id.books_id);
        b5=(ImageButton)view.findViewById(R.id.lock_id);
        b6=(ImageButton)view.findViewById(R.id.laundary_bag_id);
        b7=(ImageButton)view.findViewById(R.id.rope_id);
        b1.setOnClickListener(ChecklistFragment.this);
        b2.setOnClickListener(ChecklistFragment.this);
        b3.setOnClickListener(ChecklistFragment.this);
        b4.setOnClickListener(ChecklistFragment.this);
        b5.setOnClickListener(ChecklistFragment.this);
        b6.setOnClickListener(ChecklistFragment.this);
        b7.setOnClickListener(ChecklistFragment.this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.mattress_id:
                AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
                builder.setCancelable(true);
                builder.setMessage("Mattress can be bought from the stalls outside M,N,P blocks\nOr can also be bought from Allmart,near gate no.2");
                AlertDialog alertDialog=builder.create();
                alertDialog.setTitle("Where to buy?");
                alertDialog.show();
                break;
            case R.id.bucket_id:
                AlertDialog.Builder builder1=new AlertDialog.Builder(getContext());
                builder1.setCancelable(true);
                builder1.setMessage("Bucket can be bought from the stalls outside M,N,P blocks\nOr can also be bought from Allmart,near gate no.2");
                AlertDialog alertDialog1=builder1.create();
                alertDialog1.setTitle("Where to buy?");
                alertDialog1.show();
                break;
            case R.id.simcard_id:
                AlertDialog.Builder builder2=new AlertDialog.Builder(getContext());
                builder2.setCancelable(true);
                builder2.setMessage("Bucket can be bought from the stalls outside M,N,P blocks or you also buy around gate number 2.");
                AlertDialog alertDialog2=builder2.create();
                alertDialog2.setTitle("Where to buy?");
                alertDialog2.show();
                break;
            case R.id.books_id:
                AlertDialog.Builder builder3=new AlertDialog.Builder(getContext());
                builder3.setCancelable(true);
                builder3.setMessage("Books can be bought various shops near maingate and gate number 3.\n" +
                        "You may also contact seniors using our resail option to buy books directly from them ");
                AlertDialog alertDialog3=builder3.create();
                alertDialog3.setTitle("Where to buy?");
                alertDialog3.show();
                break;
            case R.id.lock_id:
                AlertDialog.Builder builder4=new AlertDialog.Builder(getContext());
                builder4.setCancelable(true);
                builder4.setMessage("Lock can be bought from the stalls outside M,N,P blocks or you also buy from Allmart.");
                AlertDialog alertDialog4=builder4.create();
                alertDialog4.setTitle("Where to buy?");
                alertDialog4.show();
                break;
            case R.id.laundary_bag_id:
                AlertDialog.Builder builder5=new AlertDialog.Builder(getContext());
                builder5.setCancelable(true);
                builder5.setMessage("You can buy from Allmart");
                AlertDialog alertDialog5=builder5.create();
                alertDialog5.setTitle("Where to buy?");
                alertDialog5.show();
                break;
            case R.id.rope_id:
                AlertDialog.Builder builder6=new AlertDialog.Builder(getContext());
                builder6.setCancelable(true);
                builder6.setMessage("Rope can be bought from the stalls outside M,N,P blocks or you also buy from Allmart.");
                AlertDialog alertDialog6=builder6.create();
                alertDialog6.setTitle("Where to buy?");
                alertDialog6.show();
                break;
        }

    }

}
