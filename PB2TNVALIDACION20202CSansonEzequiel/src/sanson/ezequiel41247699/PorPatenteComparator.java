package sanson.ezequiel41247699;

import java.util.Comparator;

public class PorPatenteComparator implements Comparator<Camion>{
		
		public int compare(Camion camion1,Camion camion2) {
			
			return camion1.getPatente().compareTo(camion2.getPatente());
		}

	}
