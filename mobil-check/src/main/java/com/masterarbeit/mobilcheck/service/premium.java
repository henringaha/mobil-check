package com.masterarbeit.mobilcheck.service;

public class premium {
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
		public void auszahlung(double kontostand) {
						if (betrag <= saldo) {
							saldo -= betrag;
						} else {
		System.out.println("Ungenügender Betrag..!!");
						}
					}
		private double waehrung;
		public kontostand(String i, double b, double w) {
					 setId(i);
					 saldo=b;
					 waehrung=w; 
				 }	
		public double getwaehrung() {
					 return waehrung;
				}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
				}


		}

