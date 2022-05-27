package com.example.contact_in_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.contact_in_recyclerview.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {


    private Contact[] localDataSet;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = view.findViewById(R.id.textView);
            textView2 = view.findViewById(R.id.textView2);
            textView3 = view.findViewById(R.id.textView3);
            imageView = view.findViewById(R.id.imageView2);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public CustomAdapter(Contact[] dataSet, Context context) {
        localDataSet = dataSet;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new CustomAdapter.ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.setText(localDataSet[position].sno + "");
        viewHolder.textView2.setText(localDataSet[position].pno + "");
        viewHolder.textView3.setText(localDataSet[position].Name);
        Glide.with(context).
                load(localDataSet[position].image_path).
                placeholder(R.drawable.img_1).
                into(viewHolder.imageView);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
