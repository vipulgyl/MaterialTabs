package info.androidhive.materialtabs.fragments;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class OtherInitiativesFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other_initiatives, container, false);

        CardView cardView1 = (CardView) view.findViewById(R.id.card1);
        CardView cardView2 = (CardView) view.findViewById(R.id.card2);
        CardView cardView3 = (CardView) view.findViewById(R.id.card3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/pdf/SIDBI_in_the_States_Conference.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getActivity(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InitiativeByBanks.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
