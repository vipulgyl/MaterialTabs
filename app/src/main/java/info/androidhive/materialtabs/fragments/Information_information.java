package info.androidhive.materialtabs.fragments;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Information_information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_information);

        Toolbar mytoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);
        mytoolbar.setTitleTextColor(0xFFFFFFFF);
        getSupportActionBar().setTitle("Information");


        CardView cardView1 = (CardView)findViewById(R.id.card1);
        CardView cardView2 = (CardView)findViewById(R.id.card2);
        CardView cardView3 = (CardView)findViewById(R.id.card3);
        CardView cardView4 = (CardView)findViewById(R.id.card4);
        CardView cardView5 = (CardView)findViewById(R.id.card5);
        CardView cardView6 = (CardView)findViewById(R.id.card6);
        CardView cardView7 = (CardView)findViewById(R.id.card7);
        CardView cardView8 = (CardView)findViewById(R.id.card8);
        CardView cardView9 = (CardView)findViewById(R.id.card9);
        CardView cardView10 = (CardView)findViewById(R.id.card10);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_incubators.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.ipcindia.nic.in/writereaddata/images/pdf/startups_IPRFacilitation_22April2016.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/pdf/Startup_India_FAQs.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_facilitators_for_trademarks.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_facilitators_for_patents.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_sebi_registered_funds.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_central_government_clearances.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/list_of_state_government_clearances.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/application_form_for_financial_assistance_for_organising_startup_events.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/other/guidelines_for_corporates_to_set_up_incubators.pdf";

                DownloadManager.Request request=new DownloadManager.Request(Uri.parse(myurl));
                request.setTitle("File Download");
                Toast.makeText(getApplicationContext(), "File is being downloaded", Toast.LENGTH_SHORT).show();
                request.setDescription("File is being Downloaded..");
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                String nameOfFile= URLUtil.guessFileName(myurl,null, MimeTypeMap.getFileExtensionFromUrl(myurl));
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,nameOfFile);
                DownloadManager dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                dm.enqueue(request);
            }
        });
    }
}
