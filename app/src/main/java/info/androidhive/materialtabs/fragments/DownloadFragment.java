package info.androidhive.materialtabs.fragments;


import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadFragment extends Fragment {


    public DownloadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_download, container, false);
        String[] text={"For reservation of your company's name you need to fill INC-1 form and upload it online on Ministry of Corporate Affairs site or you can visit their office to submit your application.",
                       "For Incorporation of One Person Company you need to fill Spice MOA,Spice AOA and Spice New form but these forms are not available for time being as they hae been recently introduced so we are providing you form INC-7(Form for Companies other than OPC) and if you want Spice forms you can visit their office.",
                       "For Incorporation of Company(Part I Company and Company with more than Seven Subscribers) you need to fill INC-7 form and upload it online on Ministry of Corporate Affairs site or you can visit their office to submit your application.",
                       "For Particulars of appointment of Directors and the key managerial personnel and the changes among them you need to fill DIR-12 form and upload it online on Ministry of Corporate Affairs site or you can visit their office to submit your application."};
        TextView info=(TextView)layout.findViewById(R.id.forminfo);
        if(URLassignment.getCheckURL()==1)
        {
            info.setText(text[0]);
        }
        else if(URLassignment.getCheckURL()==2)
        {
            info.setText(text[1]);
        }
        else if(URLassignment.getCheckURL()==3)
        {
            info.setText(text[2]);
        }
        else if(URLassignment.getCheckURL()==4)
        {
            info.setText(text[3]);
        }
        else{}
        Button bt=(Button)layout.findViewById(R.id.downloadbutton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl=null;
                if(URLassignment.getCheckURL()==1)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-1/Form_INC-1_help.pdf";
                else if(URLassignment.getCheckURL()==2)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-7/Form_INC-7_help.pdf";
                else if(URLassignment.getCheckURL()==3)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-7/Form_INC-7_help.pdf";
                else if(URLassignment.getCheckURL()==4)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/DIR-12/Form_DIR-12_help.pdf";
                else{}
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        Button bt1=(Button)layout.findViewById(R.id.downloadbutton1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl=null;
                if(URLassignment.getCheckURL()==1)
                   myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-1/Form_INC-1_help.pdf";
                else if(URLassignment.getCheckURL()==2)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-7/Form_INC-7_help.pdf";
                else if(URLassignment.getCheckURL()==3)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/inc-7/Form_INC-7_help.pdf";
                else if(URLassignment.getCheckURL()==4)
                    myurl="https://raw.githubusercontent.com/techfreakworm/startupIndiaAppForms/master/DIR-12/Form_DIR-12_help.pdf";
                else{}
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        return layout;
    }
}
