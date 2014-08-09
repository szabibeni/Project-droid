package hu.divide.android.quitesetter;

import hu.divide.android.quitesetter.adapter.PeriodAdapter;
import hu.divide.android.quitesetter.data.Period;

import java.util.ArrayList;

import android.support.v4.app.ListFragment;

public class PeriodListFragment extends ListFragment {

	public static final String TAG = "PeriodListFragment";
	
	PeriodAdapter adapter;
	
    @Override
    public void onStart() {
    	ArrayList<Period> ps = new ArrayList<Period>();
    	
    	ps = addData(ps);
    	
    	adapter = new PeriodAdapter(getActivity(), ps);
    	setListAdapter(adapter);
    	super.onStart();
    }

	private ArrayList<Period> addData(ArrayList<Period> ps) {
		for(int i=1; i<=50; i++){
			ps.add(new Period("period"+i));
		}
		return ps;
	}
}