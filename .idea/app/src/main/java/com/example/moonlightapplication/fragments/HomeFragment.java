package com.example.moonlightapplication.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.moonlightapplication.R;
import com.example.moonlightapplication.moonlight.CartsActivity;
import com.example.moonlightapplication.moonlight.DetailNew1Activity;
import com.example.moonlightapplication.moonlight.DetailNewActivity;
import com.example.moonlightapplication.moonlight.MemberInformationActivity;
import com.example.moonlightapplication.moonlight.MyCoupleActivity;
import com.example.moonlightapplication.moonlight.NotifyActivity;
import com.example.moonlightapplication.moonlight.PreferentialStoresActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button btnDetail1, btnDetail2;
    private ImageView imgCart, imgNotify, imgpoint, imgpoints, imgcoupon;
    private Fragment fragment = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        btnDetail1 = (Button)rootView.findViewById(R.id.btnDetail1);
        btnDetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailNewActivity.class);
                startActivity(intent);
            }
        });
        btnDetail2 = (Button)rootView.findViewById(R.id.btnDetail2);
        btnDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailNew1Activity.class);
                startActivity(intent);
            }
        });
        imgCart = (ImageView)rootView.findViewById(R.id.imgCart);
        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CartsActivity.class);
                startActivity(intent);
            }
        });
        imgNotify = (ImageView)rootView.findViewById(R.id.imgNotify);
        imgNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NotifyActivity.class);
                startActivity(intent);
            }
        });
        imgpoint = (ImageView)rootView.findViewById(R.id.points);
        imgpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MemberInformationActivity.class);
                startActivity(intent);
            }
        });
        imgpoints = (ImageView)rootView.findViewById(R.id.point);
        imgpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getActivity(), PreferentialStoresActivity.class);
               startActivity(intent);
            }
        });
        imgcoupon = (ImageView)rootView.findViewById(R.id.imgCoupon);
        imgcoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyCoupleActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}