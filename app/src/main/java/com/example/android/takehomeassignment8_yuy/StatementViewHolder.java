package com.example.android.takehomeassignment8_yuy;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StatementViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    ImageView image_view;
    TextView statement_index;
    TextView statement_content;
    boolean isTrue;
    public StatementViewHolder(View itemView, final Context context){
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view);
        image_view= itemView.findViewById(R.id.hero_image);
        statement_index = itemView.findViewById(R.id.statement_index);
        statement_content = itemView.findViewById(R.id.statement_content);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,String.valueOf(isTrue),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
