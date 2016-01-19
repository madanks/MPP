package com.mpp.assignment5_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateRange {

	private GregorianCalendar startDate;
	private GregorianCalendar endDate;

	public DateRange(GregorianCalendar startDate, GregorianCalendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(GregorianCalendar date) {
		if (startDate.after(date) && startDate.before(date)) {
			return true;
		}
		return false;
	}

	public static GregorianCalendar getStartDate(GregorianCalendar date) {
		date.set(GregorianCalendar.DATE, 1);
		return date;
	}

	public static GregorianCalendar getEndDate(GregorianCalendar date) {

		date.set(GregorianCalendar.DATE,
				date.getActualMaximum(Calendar.DAY_OF_MONTH));
		return date;
	}

	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}

	public static void getFirstDayOfMonth(GregorianCalendar date) {

	}

	public static void getLastDayOfMonth(GregorianCalendar date) {

	}

}
