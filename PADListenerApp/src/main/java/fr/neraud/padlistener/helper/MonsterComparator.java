package fr.neraud.padlistener.helper;

import java.util.Comparator;

import fr.neraud.padlistener.model.BaseMonsterModel;

/**
 * BaseMonsterModel comparator.<br/>
 * Compares the fields in the following order :
 * <ul>
 * <li>exp</li>
 * <li>skillLevel</li>
 * <li>plusHp</li>
 * <li>plusAtk</li>
 * <li>plusRcv</li>
 * <li>awakenings</li>
 * </ul>
 *
 * @author Neraud
 */
public class MonsterComparator implements Comparator<BaseMonsterModel> {

	@Override
	public int compare(BaseMonsterModel a, BaseMonsterModel b) {
		int result = compareLong(a.getExp(), b.getExp());
		if (result != 0) {
			return result;
		}

		result = compareLong(a.getSkillLevel(), b.getSkillLevel());
		if (result != 0) {
			return result;
		}

		result = compareLong(a.getPlusHp(), b.getPlusHp());
		if (result != 0) {
			return result;
		}

		result = compareLong(a.getPlusAtk(), b.getPlusAtk());
		if (result != 0) {
			return result;
		}
		result = compareLong(a.getPlusRcv(), b.getPlusRcv());

		if (result != 0) {
			return result;
		}
		result = compareLong(a.getAwakenings(), b.getAwakenings());

		return result;
	}

	private int compareLong(long a, long b) {
		if (a < b) {
			return -1;
		} else if (a > b) {
			return 1;
		} else {
			return 0;
		}
	}

}
