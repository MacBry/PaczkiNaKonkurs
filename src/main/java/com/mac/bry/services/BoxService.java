package com.mac.bry.services;

import com.mac.bry.entity.Box;

public class BoxService {

	public int getFirstArea(Box box) {
		return box.getDeep() * box.getHight();
	}

	public int getSecondArea(Box box) {
		return box.getDeep() * box.getWidth();
	}

	public int getThirthArea(Box box) {
		return box.getHight() * box.getWidth();
	}

	public int getFullAreaOfBox(Box box) {
		return getFirstArea(box) * 2 + getSecondArea(box) * 2 + getThirthArea(box) * 2 + findSmalestArea(box);
	}

	public int findSmalestArea(Box box) {
		if (getFirstArea(box) <= getSecondArea(box) && getFirstArea(box) <= getThirthArea(box)) {
			return getFirstArea(box);
		} else if (getFirstArea(box) >= getSecondArea(box) && getSecondArea(box) <= getThirthArea(box)) {
			return getSecondArea(box);
		}
		return getThirthArea(box);
	}

}
