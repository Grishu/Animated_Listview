package com.grishu.listviewanimations.itemmanipulationexamples;

import android.os.Bundle;
import android.widget.Toast;

import com.grishu.listviewanimations.ArrayAdapter;
import com.grishu.listviewanimations.MyListActivity;
import com.grishu.listviewanimations.R;
import com.grishu.listviewanimations.swinginadapters.prepared.AlphaInAnimationAdapter;
import com.grishu.listviewanimations.view.DynamicListView;

public class DragAndDropActivity extends MyListActivity {

	private DynamicListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draganddrop);

		mListView = (DynamicListView) findViewById(R.id.activity_draganddrop_listview);
		mListView.setDivider(null);

		ArrayAdapter<Integer> adapter = createListAdapter();
		AlphaInAnimationAdapter animAdapter = new AlphaInAnimationAdapter(adapter);
		animAdapter.setInitialDelayMillis(300);
		animAdapter.setAbsListView(mListView);
		mListView.setAdapter(animAdapter);

		Toast.makeText(this, "Long press an item to start dragging", Toast.LENGTH_LONG).show();
	}
}
