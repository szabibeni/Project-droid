package hu.divide.android.quitesetter.adapter;

import hu.divide.android.quitesetter.R;
import hu.divide.android.quitesetter.data.Period;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class PeriodAdapter extends BaseAdapter {

	private final List<Period> periods;
	
	public PeriodAdapter(final Context context, final ArrayList<Period> aPeriod){
		periods = aPeriod;
	}
	
	public void addItem(Period p){
		periods.add(p);
	}

	
	@Override
	public int getCount() {
		return periods.size();
	}

	@Override
	public Object getItem(int pos) {
		return periods.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		final Period p = periods.get(pos);
		LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.periodrow, null);
		TextView name = (TextView) itemView.findViewById(R.id.nameView);
		name.setText(p.getName());
		CheckBox cb = (CheckBox) itemView.findViewById(R.id.checkBox);
		cb.setChecked(false);
		return itemView;
	}

}
