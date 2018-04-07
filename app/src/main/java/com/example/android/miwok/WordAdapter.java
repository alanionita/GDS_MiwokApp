package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by alanionita on 04/04/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
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

        // Find the TextViews from the list_item.xml layout
        TextView miwokWord = (TextView) customView.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) customView.findViewById(R.id.default_word);

        /*
            Set the values in the list_item.xml to the values from the
            current {@link Word item} in the list, after checking that arrayListItem
            is not null
        */
        if (arrayListItem != null) {
            miwokWord.setText(arrayListItem.getMiwokWord());
            defaultWord.setText(arrayListItem.getDefaultWord());
        }

        // Return the updated list_item view to it can be included in the list view
        return customView;
    }
}
