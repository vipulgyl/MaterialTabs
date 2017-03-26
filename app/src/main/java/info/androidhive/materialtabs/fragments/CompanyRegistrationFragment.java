package info.androidhive.materialtabs.fragments;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

import info.androidhive.materialtabs.R;

public class CompanyRegistrationFragment extends Fragment {
    private static final String TAG="MainActivity";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_company_registration, container, false);
        firebase();

        String token= FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"token : "+token);
        Toast.makeText(getActivity(), token, Toast.LENGTH_SHORT).show();
        FragmentManager fm=getChildFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ChildCompanyRegistrationFragment ccrf = new ChildCompanyRegistrationFragment();
        ft.replace(R.id.contain, ccrf);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
        
	return layout;
    }

    public void firebase()
   {
       String token=FirebaseInstanceId.getInstance().getToken();
       Log.d(TAG,"Token :"+token);
   }
}