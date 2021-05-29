package com.masterarbeit.mobilcheck.service;

public class standard {

	public class kontostand {
		private String id;
		private double saldo;
		private double betrag;

		public kontostand(String i, double b) {
			setId(i);
			saldo = b;
		}

		public kontostand() {
		}

		public void anzahlung(double betrag) {
			this.saldo += betrag;
		}

		public double getkontostand() {
			return saldo;
		}

		public void auszahlung(double kontostand) {
			if (betrag <= saldo) {
				saldo -= betrag;
			} else {
				System.out.println("Ungenügender Betrag..!!");
			}
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}
}
