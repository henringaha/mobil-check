package com.masterarbeit.mobilcheck.service;

public class medium {
	public   class  kontostand {	
		private String id;
		private double saldo;
		private double betrag;
		public kontostand(String i, double b) {
			setId(i);
			saldo = b;
			}
		public void anzahlung(double betrag) {
			this.saldo += betrag;
			}
		public double getkontostand() {
			return saldo;
			}
		public void auszahlung  (double betrag) {
			if (betrag <= saldo + grenzwert) {
				saldo -= betrag;
			   } else {
		System.out.println("Ungenügender Betrag..!!");
			}
			}
		private double grenzwert;
		public double getgrenzwert() {
			return grenzwert;
			}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public double getBetrag() {
			return betrag;
		}
		public void setBetrag(double betrag) {
			this.betrag = betrag;
		}
			}

	}

