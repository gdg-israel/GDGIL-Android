package com.gdg.israel;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.google.analytics.tracking.android.EasyTracker;

/**
 * Created by Enigma on 2/3/14.
 */
public class GDGIsraelAboutFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String TAG = GDGIsraelAboutFragment.class.getSimpleName();

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GDGIsraelAboutFragment newInstance() {
        GDGIsraelAboutFragment fragment = new GDGIsraelAboutFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public GDGIsraelAboutFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gdg_israel_about, container, false);
        WebView webView = (WebView) rootView.findViewById(R.id.about_webview);
        webView.loadUrl("file:///android_asset/about.html");
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onStart() {
        super.onStart();
        EasyTracker.getInstance(getActivity()).activityStart(getActivity());
    }

    @Override
    public void onStop() {
        super.onStop();
        EasyTracker.getInstance(getActivity()).activityStop(getActivity());
    }
}
