package Assignment24_8;

public class Electronic11 {
		private int id;
		private String semiConductorType;
		private String dateOfmanifacturing;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSemiConductorType() {
			return semiConductorType;
		}

		public void setSemiConductorType(String semiConductorType) {
			this.semiConductorType = semiConductorType;
		}

		public String getDateOfmanifacturing() {
			return dateOfmanifacturing;
		}

		public void setDateOfmanifacturing(String dateOfmanifacturing) {
			this.dateOfmanifacturing = dateOfmanifacturing;
		}

		@Override
		public String toString() {
			return "Electronics [id=" + id + ", semiConductorType=" + semiConductorType + ", dateOfmanifacturing="
					+ dateOfmanifacturing + "]";
		}


		public Electronic11(int id, String semiConductorType, String dateOfmanifacturing) {
			super();
			this.id = id;
			this.semiConductorType = semiConductorType;
			this.dateOfmanifacturing = dateOfmanifacturing;
		}

		public Electronic11() {
			super();
			
		}

	}

	class Mobile extends Electronic11 {

		public Mobile() {
			super();
			
		}

		public Mobile(int id, String semiConductorType, String dateOfmanifacturing) {
			super(id, semiConductorType, dateOfmanifacturing);
			
		}

	}

	class LCD extends Electronic11 {

		public LCD() {
			super();

		}

		public LCD(int id, String semiConductorType, String dateOfmanifacturing) {
			super(id, semiConductorType, dateOfmanifacturing);

		}

	}

	class Laptop extends Electronic11 {

		public Laptop() {
			super();
			
		}

		public Laptop(int id, String semiConductorType, String dateOfmanifacturing) {
			super(id, semiConductorType, dateOfmanifacturing);
	
		}

	}
