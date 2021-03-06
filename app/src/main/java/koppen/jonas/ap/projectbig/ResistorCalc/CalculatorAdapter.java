package koppen.jonas.ap.projectbig.ResistorCalc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import koppen.jonas.ap.projectbig.R;

/**
 * Created by Viktor on 13-12-2017.
 */

public class CalculatorAdapter extends ArrayAdapter<Calculator> {
    public CalculatorAdapter(Context context, List<Calculator> appointments)  {
        super(context, -1, appointments);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.main_listview, null);


        ImageView imageView = (ImageView)view.findViewById(R.id.icon);
        TextView textView = (TextView)view.findViewById(R.id.name);


        imageView.setImageResource(getItem(position).getImage());
        textView.setText(getItem(position).getName());

        return view;
    }
}
