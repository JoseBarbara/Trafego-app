package com.rodrigoneves.trafegometro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class LinksAdapter extends ArrayAdapter {

    LinksAdapter(@NonNull Context context, ArrayList<Link> links) {
        super(context, 0, links);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_links, parent, false);
        }

        Link currentLink = (Link) getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.link_title);
        titleTextView.setText(Objects.requireNonNull(currentLink).getmTitle());

        TextView linkTextView = listItemView.findViewById(R.id.link);
        linkTextView.setText(currentLink.getmLink());

        return listItemView;
    }
}
