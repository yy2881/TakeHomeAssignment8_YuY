package com.example.android.takehomeassignment8_yuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StatementsAdapter extends RecyclerView.Adapter<StatementViewHolder> {
    private List<Statement> statements;
    private Context context;

    public StatementsAdapter(List<Statement> statements,Context context){
        this.statements = statements;
        this.context = context;
    }

    @NonNull
    @Override
    public StatementViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_marvel,viewGroup,false);
        return new StatementViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull StatementViewHolder holder, int position) {
        Statement statement = statements.get(position);
        holder.statement_index.setText(statement.statementIndex);
        holder.statement_content.setText(statement.statementContent);
        holder.image_view.setImageResource(statement.photoId);
        holder.isTrue = statement.isTrue;
    }



    @Override
    public int getItemCount() {
        return statements.size();
    }
}
