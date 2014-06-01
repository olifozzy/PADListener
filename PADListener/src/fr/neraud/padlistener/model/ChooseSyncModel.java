
package fr.neraud.padlistener.model;

import java.io.Serializable;
import java.util.List;

/**
 * ChooseSync model
 * 
 * @author Neraud
 */
public class ChooseSyncModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private ChooseSyncModelContainer<SyncedUserInfoModel> syncedUserInfoToUpdate;
	private List<ChooseSyncModelContainer<SyncedMaterialModel>> syncedMaterialsToUpdate;
	private List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToUpdate;
	private List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToCreate;
	private List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToDelete;

	public ChooseSyncModelContainer<SyncedUserInfoModel> getSyncedUserInfoToUpdate() {
		return syncedUserInfoToUpdate;
	}

	public void setSyncedUserInfoToUpdate(ChooseSyncModelContainer<SyncedUserInfoModel> syncedUserInfoToUpdate) {
		this.syncedUserInfoToUpdate = syncedUserInfoToUpdate;
	}

	public List<ChooseSyncModelContainer<SyncedMaterialModel>> getSyncedMaterialsToUpdate() {
		return syncedMaterialsToUpdate;
	}

	public void setSyncedMaterialsToUpdate(List<ChooseSyncModelContainer<SyncedMaterialModel>> syncedMaterialsToUpdate) {
		this.syncedMaterialsToUpdate = syncedMaterialsToUpdate;
	}

	public List<ChooseSyncModelContainer<SyncedMonsterModel>> getSyncedMonstersToUpdate() {
		return syncedMonstersToUpdate;
	}

	public void setSyncedMonstersToUpdate(List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToUpdate) {
		this.syncedMonstersToUpdate = syncedMonstersToUpdate;
	}

	public List<ChooseSyncModelContainer<SyncedMonsterModel>> getSyncedMonstersToCreate() {
		return syncedMonstersToCreate;
	}

	public void setSyncedMonstersToCreate(List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToCreate) {
		this.syncedMonstersToCreate = syncedMonstersToCreate;
	}

	public List<ChooseSyncModelContainer<SyncedMonsterModel>> getSyncedMonstersToDelete() {
		return syncedMonstersToDelete;
	}

	public void setSyncedMonstersToDelete(List<ChooseSyncModelContainer<SyncedMonsterModel>> syncedMonstersToDelete) {
		this.syncedMonstersToDelete = syncedMonstersToDelete;
	}

}
