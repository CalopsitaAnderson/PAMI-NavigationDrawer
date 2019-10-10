package br.com.etechoracio.navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CustomFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CustomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class CustomFragment extends Fragment {

    private String nome;
    private int idImagem;

    public static CustomFragment newInstance(String nome, int idImagem) {
        CustomFragment fragment = new CustomFragment();
        fragment.nome = nome;
        fragment.idImagem = idImagem;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_custom, container, false);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(idImagem);
        getActivity().setTitle(nome);

        return view;
    }

}
