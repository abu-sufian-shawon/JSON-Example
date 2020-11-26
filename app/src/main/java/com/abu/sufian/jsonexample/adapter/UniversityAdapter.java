package com.abu.sufian.jsonexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abu.sufian.jsonexample.R;
import com.abu.sufian.jsonexample.datamodel.ResponseModel;

import java.util.List;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.ViewHolder> {
    private final List<ResponseModel> universityModels;

    public UniversityAdapter(List<ResponseModel> universityModels) {
        this.universityModels = universityModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_university_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvUniversityName.setText(universityModels.get(position).getUniversityName());
        holder.tvUniversityAddress.setText(universityModels.get(position).getPermanentCampus());
    }

    @Override
    public int getItemCount() {
        return universityModels.size();
    }


    /**
     * ViewHolder Class
     */
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvUniversityName, tvUniversityAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUniversityName = itemView.findViewById(R.id.tvUniversityName);
            tvUniversityAddress = itemView.findViewById(R.id.tvUniversityAddress);
        }
    }
}
