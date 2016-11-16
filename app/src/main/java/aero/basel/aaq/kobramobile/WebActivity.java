package aero.basel.aaq.kobramobile;

import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        webView = (WebView) findViewById(R.id.WebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setPadding(0, 0, 0, 0);
        webView.setScrollbarFadingEnabled(true);
        webView.setInitialScale(1);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        webView.setWebViewClient(new mWebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        String url = getIntent().getStringExtra("URL");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView,true);
        }
        else {
            CookieManager.getInstance().setAcceptCookie(true);
        }

        webView.loadUrl(url);
    }

    public void onBackPressed()
    {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Выход!")
                    .setMessage("Выйти?")
                    .setPositiveButton("Да", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                CookieManager.getInstance().removeAllCookies(null);
                            }
                            else {
                                CookieManager.getInstance().removeAllCookie();
                            }
                            finish();
                        }

                    })
                    .setNegativeButton("Нет", null)
                    .show();
        }
    }

    public void onRefreshClick (View button)
    {
        webView.reload();
    }

    public void onLegendClick (View button)
    {
        final String[] SSR_Codes = getResources().getStringArray(R.array.SSR_codes);

        ListAdapter ssr_adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, SSR_Codes);

        new AlertDialog.Builder(this)
                .setAdapter(ssr_adapter,null)
                .setNegativeButton("Выход", null)
                .show();
    }
}


