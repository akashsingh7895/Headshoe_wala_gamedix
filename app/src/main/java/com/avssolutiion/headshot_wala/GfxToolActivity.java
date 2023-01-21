package com.avssolutiion.headshot_wala;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.avssolutiion.headshot_wala.databinding.ActivityGfxToolBinding;

public class GfxToolActivity extends AppCompatActivity implements MaxAdListener {

    ActivityGfxToolBinding binding;

    public ProgressDialog dialog;

    //applovin ads
    private MaxInterstitialAd interstitialAd;
    private MaxNativeAdLoader nativeAdLoader;
    private MaxAd nativeAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGfxToolBinding.inflate(getLayoutInflater());
        setContentView( binding.getRoot());


        binding.applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd.isReady()){
                    interstitialAd.showAd();
                    dialog.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //todo: check if user is already is login
                            dialog.dismiss();
                            startActivity(new Intent(GfxToolActivity.this,SuccessActivity.class));

                        }
                    },4000);
                }else {
                    dialog.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //todo: check if user is already is login
                            dialog.dismiss();
                            Toast.makeText(GfxToolActivity.this, "Applied", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(GfxToolActivity.this,SuccessActivity.class));


                        }
                    },4000);
                }

            }
        });



        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);


        interstitialAd = new MaxInterstitialAd(getString(R.string.inter),this);
        interstitialAd.setListener(this);
        interstitialAd.loadAd();




        binding.tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv1.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv2.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv3.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv4.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv1.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv2.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv3.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv4.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv1.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv2.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv3.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv4.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv1.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv2.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv3.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv4.setBackground(getDrawable(R.drawable.rigt_conners));
            }
        });



        binding.tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv6.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv7.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv8.setBackground(getDrawable(R.drawable.blanck_back));

            }
        });
        binding.tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv6.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv7.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv8.setBackground(getDrawable(R.drawable.blanck_back));

            }
        });
        binding.tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv6.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv7.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv8.setBackground(getDrawable(R.drawable.rigt_conners));

            }
        });


        binding.tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv9.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv10.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv11.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv12.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });


        binding.tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv9.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv10.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv11.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv12.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv9.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv10.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv11.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv12.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv9.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv10.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv11.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv12.setBackground(getDrawable(R.drawable.rigt_conners));
            }
        });


        binding.tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv13.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv14.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv15.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv16.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });


        binding.tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv13.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv14.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv15.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv16.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });


        binding.tv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv13.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv14.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv15.setBackground(getDrawable(R.drawable.rigt_conners));
                binding.tv16.setBackground(getDrawable(R.drawable.blanck_back));
            }
        });

        binding.tv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv13.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv14.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv15.setBackground(getDrawable(R.drawable.blanck_back));
                binding.tv16.setBackground(getDrawable(R.drawable.rigt_conners));
            }
        });



        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });






    }

    @Override
    public void onAdLoaded(MaxAd ad) {

    }

    @Override
    public void onAdDisplayed(MaxAd ad) {

    }

    @Override
    public void onAdHidden(MaxAd ad) {

    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {

    }
}