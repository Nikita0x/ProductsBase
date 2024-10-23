package com.example.productsbase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {

    private List<Product> productList; // Список объектов с данными

    public ViewPagerAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product data = productList.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewPosition;
        private TextView textViewPositionName;
        private TextView textViewWidthValue;
        private TextView textViewLengthValue;
        private TextView textViewGeneralFoldValue;
        private TextView textViewGeneralThicknessValue;
        private TextView textViewGeneralWeightOfFilmValue;
        private TextView textViewPackageOfPackagesValue;
        private TextView textViewAmountOfPacksValue;
        private TextView textViewPackagesInPacksValue;
        private TextView textViewWeightOfPackValue;
        private TextView textViewWeightOfBagValue;
        private Button actionButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewPosition = itemView.findViewById(R.id.positionNumber);
            textViewPositionName = itemView.findViewById(R.id.positionName);
            textViewWidthValue = itemView.findViewById(R.id.generalWidthValue);
            textViewLengthValue = itemView.findViewById(R.id.generalLengthValue);
            textViewGeneralFoldValue = itemView.findViewById(R.id.generalFoldValue);
            textViewGeneralThicknessValue = itemView.findViewById(R.id.generalThicknessValue);
            textViewGeneralWeightOfFilmValue = itemView.findViewById(R.id.generalWeightOfFilmValue);
            textViewPackageOfPackagesValue = itemView.findViewById(R.id.packageOfPackagesValue);
            textViewAmountOfPacksValue = itemView.findViewById(R.id.amountOfPacksValue);
            textViewPackagesInPacksValue = itemView.findViewById(R.id.packagesInPacksValue);
            textViewWeightOfPackValue = itemView.findViewById(R.id.weightOfPackValue);
            textViewWeightOfBagValue = itemView.findViewById(R.id.weightOfBagValue);
            actionButton = itemView.findViewById(R.id.action_button);
        }

        public void bind(Product data) {
            textViewPosition.setText(data.getPosition());
            textViewPositionName.setText(data.getPositionName());
            textViewWidthValue.setText(data.getWidthValue());
            textViewLengthValue.setText(data.getLengthValue());
            textViewGeneralFoldValue.setText(data.getGeneralFoldValue());
            textViewGeneralThicknessValue.setText(data.getGeneralThicknessValue());
            textViewGeneralWeightOfFilmValue.setText(data.getGeneralWeightOfFilmValue());
            textViewPackageOfPackagesValue.setText(data.getPackageOfPackagesValue());
            textViewAmountOfPacksValue.setText(data.getAmountOfPacksValue());
            textViewPackagesInPacksValue.setText(data.getPackagesInPacksValue());
            textViewWeightOfPackValue.setText(data.getWeightOfPackValue());
            textViewWeightOfBagValue.setText(data.getWeightOfBagValue());
            actionButton.setOnClickListener(data.getOnClickListener());
        }
    }
}
