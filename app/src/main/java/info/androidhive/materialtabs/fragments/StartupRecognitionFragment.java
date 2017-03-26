package info.androidhive.materialtabs.fragments;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class StartupRecognitionFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_startup_recognition, container, false);

        CardView cardView1 = (CardView)view.findViewById(R.id.card1);
        CardView cardView2 = (CardView)view.findViewById(R.id.card2);
        CardView cardView3 = (CardView)view.findViewById(R.id.card3);
        CardView cardView4 = (CardView)view.findViewById(R.id.card4);
        CardView cardView5 = (CardView)view.findViewById(R.id.card5);
        CardView cardView6 = (CardView)view.findViewById(R.id.card6);
        CardView cardView7 = (CardView)view.findViewById(R.id.card7);
        CardView cardView8 = (CardView)view.findViewById(R.id.card8);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/other/format_of_letter_of_funding_of_not_less_than_20_in_equity_from_incubation_fund_private_equity_fund_acceleratorangel_network.pdf";

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
                String myurl = "http://www.startupindia.gov.in/uploads/other/format_of_the_recommendation_letter_from_any_incubator_established_in_a_post_graduate_college_in_india.pdf";

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
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/other/format_of_the_recommendation_letter_from_any_incubator_recognised_by_government_of_india_(goi).pdf";

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
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/other/format_of_the_letter_of_support_from_any_incubator_which_is_funded_from_government_of_india_(goi)_or_any_state_government.pdf";

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
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/other/format_of_the_recommendation_letter_from_industry_association.pdf";

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
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl = "http://www.startupindia.gov.in/uploads/other/click_here_to_view_entities_recognised_by_dipp_as_startup.pdf";

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

        return view;
    }
}