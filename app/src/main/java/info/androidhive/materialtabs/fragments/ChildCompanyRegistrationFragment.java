package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import info.androidhive.materialtabs.R;

public class ChildCompanyRegistrationFragment extends Fragment implements View.OnClickListener{
    WebView browser;
    String check=null;
    static int chk=0;
    int flag=0;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_child_company_registration, container,false);
        Button bt=(Button)layout.findViewById(R.id.button);
        bt.setOnClickListener(this);
        final Spinner spinner =(Spinner)layout.findViewById(R.id.spin);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String check = spinner.getSelectedItem().toString();
                URLassignment url=new URLassignment();
                FragmentManager fm=getChildFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                AppointtDirectorFragment adf=new AppointtDirectorFragment();
                CompanyFragment cf=new CompanyFragment();
                ExtraFragment e=new ExtraFragment();
                ExtraaFragment ee=new ExtraaFragment();
                if(check.equals("Company Name Registration"))
                {
                    ft.replace(R.id.container,cf);
                    ft.addToBackStack(null);
                    ft.replace(R.id.downloadcontainer,e);
                    ft.addToBackStack(null);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                    if(flag==0)
                        flag=1;
                }
                if(check.equals("Appoint Director"))
                {
                    ft.replace(R.id.container,adf);
                    ft.addToBackStack(null);
                    ft.replace(R.id.downloadcontainer,e);
                    ft.addToBackStack(null);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                    if(flag==0)
                        flag=1;
                }
                if(check.equals("Company Name Approval")){
                    url.setCheckURL(1);
                    if(flag==1)
                     {
                        ft.replace(R.id.container,e);
                        ft.addToBackStack(null);
                        ft.replace(R.id.downloadcontainer,ee);
                        ft.addToBackStack(null);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        ft.commit();
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return layout;
    }
    @Override
    public void onClick(View v) {
        FragmentTransaction ft=getChildFragmentManager().beginTransaction();
        DownloadFragment df=new DownloadFragment();
        ft.replace(R.id.downloadcontainer,df);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
        chk=1;
    }
}