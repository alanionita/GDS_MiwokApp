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
        super(context, R.layout.list_item, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.list_item, parent, false);

        Word arrayListItem = getItem(position);
        TextView miwokWord = (TextView) customView.findViewById(R.id.miwok_word);
        TextView defaultWord = (TextView) customView.findViewById(R.id.default_word);

        miwokWord.setText(arrayListItem.getMiwokWord());
        defaultWord.setText(arrayListItem.getDefaultWord());

        return customView;
    }
}
