package com.birthdayplanner.birthdayplanner;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Vikas on 24/01/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private String POSITION = "position";
    private String TAG = ImageAdapter.class.getSimpleName();

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent packageIntent = new Intent(mContext, PackageActivity.class);
                packageIntent.putExtra(POSITION, position);
                Log.e(TAG, " position is " + position + 1);
                mContext.startActivity(packageIntent);
            }
        });
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.add_text1, R.drawable.add_text2,
            R.drawable.add_text3, R.drawable.add_text4,
            R.drawable.add_text5, R.drawable.add_text6


    };
}
