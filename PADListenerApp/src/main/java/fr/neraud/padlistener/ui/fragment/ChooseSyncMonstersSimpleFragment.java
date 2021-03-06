package fr.neraud.padlistener.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

import fr.neraud.log.MyLog;
import fr.neraud.padlistener.constant.SyncMode;
import fr.neraud.padlistener.model.ChooseModelContainer;
import fr.neraud.padlistener.model.ChooseSyncModel;
import fr.neraud.padlistener.model.SyncedMonsterModel;
import fr.neraud.padlistener.ui.adapter.ChooseSyncMonstersSimpleAdapter;
import fr.neraud.padlistener.ui.helper.ChooseSyncDataPagerHelper;
import fr.neraud.padlistener.ui.helper.ChooseSyncSimpleContextMenuHelper;

/**
 * ChooseSync fragment for Monsters set up as simple
 *
 * @author Neraud
 */
public class ChooseSyncMonstersSimpleFragment extends ListFragment {

	private ChooseSyncSimpleContextMenuHelper menuHelper;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		MyLog.entry();

		super.onCreate(savedInstanceState);

		final ChooseSyncModel result = (ChooseSyncModel) getArguments().getSerializable(
				ChooseSyncDataPagerHelper.ARGUMENT_SYNC_RESULT_NAME);
		final String modeName = getArguments().getString(ChooseSyncDataPagerHelper.ARGUMENT_SYNC_MODE_NAME);
		final SyncMode mode = SyncMode.valueOf(modeName);

		final List<ChooseModelContainer<SyncedMonsterModel>> monsters = result.getSyncedMonsters(mode);

		final ChooseSyncMonstersSimpleAdapter adapter = new ChooseSyncMonstersSimpleAdapter(getActivity().getApplicationContext(), monsters);
		menuHelper = new ChooseSyncSimpleContextMenuHelper(getActivity(), mode, adapter, result);
		setListAdapter(adapter);

		MyLog.exit();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		MyLog.entry();
		super.onViewCreated(view, savedInstanceState);
		registerForContextMenu(getListView());
		MyLog.exit();
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
		menuHelper.createContextMenu(menu, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		return menuHelper.contextItemSelected(item);
	}
}
