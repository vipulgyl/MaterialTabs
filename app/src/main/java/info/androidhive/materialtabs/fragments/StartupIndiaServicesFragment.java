package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

import static info.androidhive.materialtabs.fragments.DownloadFragment.net;


public class StartupIndiaServicesFragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_startup_india_services, container, false);

        final URLassignment urla = new URLassignment();

        CardView cv1 = (CardView)view.findViewById(R.id.card1);
        CardView cv2 = (CardView)view.findViewById(R.id.card2);
        CardView cv3 = (CardView)view.findViewById(R.id.card3);
        final CardView cv4 = (CardView)view.findViewById(R.id.card4);

        ImageView next1 = (ImageView)view.findViewById(R.id.next1);
        ImageView next2 = (ImageView)view.findViewById(R.id.next2);
        ImageView next3 = (ImageView)view.findViewById(R.id.next3);
        ImageView next4 = (ImageView)view.findViewById(R.id.next4);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StartUpIndiaServicesParts.class);
                urla.setId(v.getId());
                startActivity(intent);
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cManager = (ConnectivityManager) getActivity().getSystemService(getActivity().CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                if (nInfo != null && (nInfo.isConnected())) {
                    net = true;
                    Toast.makeText(getActivity(), "Web_View displaying webpages", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), WebViewActivity.class);
                    urla.setId(v.getId());
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Check your Internet Connection", Toast.LENGTH_SHORT).show();
                    net = false;
                }
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StartUpIndiaServicesParts.class);
                urla.setId(v.getId());
                startActivity(intent);
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StartUpIndiaServicesParts.class);
                urla.setId(v.getId());
                startActivity(intent);
            }
        });


        return view;
    }

}
