package com.example.moonlightapplication.fragments.fragment_tab;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moonlightapplication.R;

import java.io.InputStream;
import java.net.URI;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CommonFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommonFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    GridView gridView;
    String[] nameProduct = {"AMERICANO","CAPUCCINO","CARAMEL MACCHIATO","ESPRESSO","COLD BREW TRUYỀN THỐNG","BÁNH MỲ CHÀ BÔNG PHÔ MAI","BÁNH MỲ QUE", "BÔNG LAN TRỨNG MUỐI"};
    int[] imgproduct = {R.drawable.drink1,R.drawable.drink2,R.drawable.drink3,R.drawable.drink4,R.drawable.drink5,R.drawable.eat1,R.drawable.eat2, R.drawable.eat3};

    ImageView imgProduct, imgAddToCart;
    TextView txtNameProduct, txtPrice;

    private OnFragmentInteractionListener mListener;

    public CommonFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CommonFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CommonFragment newInstance(String param1, String param2) {
        CommonFragment fragment = new CommonFragment();
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
        View view = inflater.inflate(R.layout.fragment_common, container, false);
        return view;
    }

    public void onButtonPressed(Uri uri){
        if(mListener != null){
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.gridView);
        CommonAdapter commonAdapter = new CommonAdapter();
        gridView.setAdapter(commonAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
    private class CommonAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return imgproduct.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.card_view_grid, null);
            imgProduct = (ImageView)view1.findViewById(R.id.imgProduct);
            txtNameProduct = (TextView)view1.findViewById(R.id.txtNameProduct);
            imgAddToCart = (ImageView)view1.findViewById(R.id.imgAddToCart);
            txtPrice = (TextView)view1.findViewById(R.id.txtPrice);
            txtNameProduct.setText(nameProduct[i]);
            imgProduct.setImageResource(imgproduct[i]);

            imgAddToCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog();
                }
            });
            return view1;
        }
    }
    private void showDialog(){
        final Dialog dialog;
        dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.layout_dialog);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.setCancelable(true);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }

//    public static Drawable LoadImageFromWebOperations(String url){
//        try {
//            InputStream is = (InputStream) new URI(url).getContent();
//            Drawable d = Drawable.createFromStream(is, "src name");
//            return d;
//        }catch (Exception e){
//            return null;
//        }
//    }

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

    public interface OnFragmentInteractionListener{
        void onFragmentInteraction(Uri uri);
    }
}