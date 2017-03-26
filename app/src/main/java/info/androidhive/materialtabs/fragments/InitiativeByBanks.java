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

public class InitiativeByBanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initiative_by_banks);

        Toolbar mytoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);
        mytoolbar.setTitleTextColor(0xFFFFFFFF);
        getSupportActionBar().setTitle("Initiative by Banks");

        CardView cardView1 = (CardView)findViewById(R.id.card_ubi1);
        CardView cardView2 = (CardView)findViewById(R.id.card_ubi2);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myurl="http://www.startupindia.gov.in/uploads/pdf/bank_UnionStart_upScheme_OnePager.pdf";

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
                String myurl="http://www.startupindia.gov.in/uploads/pdf/bank_UnionStart_upScheme_OnePager.pdf";

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
