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
		if (date.after(startDate) && date.before(endDate)) {
			return true;
		}
		return false;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public static GregorianCalendar getStartDate(GregorianCalendar date) {
		return new GregorianCalendar(date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH), 1);
	}

	public static GregorianCalendar getEndDate(GregorianCalendar date) {
		return new GregorianCalendar(date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH),
				date.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	public static void getFirstDayOfMonth(GregorianCalendar date) {

	}

	public static void getLastDayOfMonth(GregorianCalendar date) {

	}

}
