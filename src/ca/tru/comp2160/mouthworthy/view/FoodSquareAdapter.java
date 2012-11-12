package ca.tru.comp2160.mouthworthy.view;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import ca.tru.comp2160.mouthworthy.model.FoodSquareItem;
import ca.tru.comp2160.mouthworthy.*;

public class FoodSquareAdapter extends ArrayAdapter<FoodSquareItem> {
    private ArrayList<FoodSquareItem> items;

    public FoodSquareAdapter(Context context, int textViewResourceId, ArrayList<FoodSquareItem> items) {
            super(context, textViewResourceId, items);
            this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = vi.inflate(R.layout.food_square_item, null);
            }
            
            FoodSquareItem item = items.get(position);
            if (item != null) {
                    TextView lblTitle = (TextView)view.findViewById(R.id.lblFoodSquareTitle);
                   // REPLACE WITH IMAGE TextView lblPubDate = (TextView)view.findViewById(R.id.lblFoodSquarePubDate);
                    TextView lblLink = (TextView)view.findViewById(R.id.lblFoodSquareLink);
                    
                    if (lblTitle != null) {
                    	lblTitle.setText(item.getTitle());
                    }
                    
                    if (lblDescription != null) {
                    	lblDescription.setText(item.getDescription());
                    }
                    
                    if (lblPubDate != null){
                    	lblPubDate.setText(item.getPubDate());
                    }
                    
                    if (lblLink != null){
                    	lblLink.setText(item.getLink());
                    }
            }
            return view;
    }
}
