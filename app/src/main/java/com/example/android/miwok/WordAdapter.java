package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // global value for the activity color values
    private int localActivityColor;

    WordAdapter(Context context, ArrayList<Word> words, int activityColor) {
        super(context, 0, words);
        localActivityColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View customView = convertView;
        if (customView == null) {
            customView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get {@link Word item} at this position in the list
        Word arrayListItem = getItem(position);

        // Find the views from the list_item.xml layout
        TextView miwokWord = (TextView) customView.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) customView.findViewById(R.id.default_word);
        ImageView imageV = (ImageView) customView.findViewById(R.id.image);
        LinearLayout listWordSection = (LinearLayout) customView.findViewById(R.id.list_word_section);

        // Find the color that the resource id maps to
        int activityColor = ContextCompat.getColor(getContext(),localActivityColor);

        /*
            Set the values in the list_item.xml to the values from the
            current {@link Word item} in the list, after checking that arrayListItem
            is not null
        */
        if (arrayListItem != null) {
            miwokWord.setText(arrayListItem.getMiwokWord());
            defaultWord.setText(arrayListItem.getDefaultWord());
            listWordSection.setBackgroundColor(activityColor);
            if (arrayListItem.hasImage()) {
                imageV.setImageResource(arrayListItem.getImageResourceID());
                imageV.setVisibility(View.VISIBLE);
            } else {
                imageV.setVisibility(View.GONE);
            }

        }

        // Return the updated list_item view to it can be included in the list view
        return customView;
    }
}
