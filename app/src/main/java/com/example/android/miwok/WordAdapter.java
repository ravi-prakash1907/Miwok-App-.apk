package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    private MediaPlayer mediaPlayer;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param word A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }



        //final Button play = (Button) findViewById(R.id.play);
        //listItemView.setText("Play");

        //Button pause = (Button) findViewById(R.id.pause);

        //if(mediaPlayer.isPlaying()) {

        // Get the {@link WordAdapter} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the miwok text view from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current Word object and
        // set this text on the default_text_view TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());


        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.app_icon);

        if(currentWord.hasImage()) {
            // Get the version number from the current Word object and
            // set this text on the default_text_view TextView
            iconImage.setImageResource(currentWord.getIcon());
            iconImage.setVisibility(View.VISIBLE);
        }
        else {
            iconImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_cntainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);



        return listItemView;

    }
}
