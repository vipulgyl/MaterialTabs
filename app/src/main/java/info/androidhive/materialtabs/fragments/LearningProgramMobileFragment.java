package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import info.androidhive.materialtabs.R;


public class LearningProgramMobileFragment extends Fragment{

    public LearningProgramMobileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learning_program_mobile, container, false);
        WebView browser;

        browser = (WebView) view.findViewById(R.id.webView);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("https://play.google.com/store/apps/details?id=com.upgrad.student.startupindia&hl=en");

        return view;
    }

}
