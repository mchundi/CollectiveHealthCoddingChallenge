/**
 * Given a string of costs for each procedure. Expected to find the average cost of a particular procedure
 */


public class ProcedureCost {

//	public static void main(String args[]){
//		String procedureCosts = "PRO-A:10||PRO-B:15||PRO-A:5||PRO-C:125||PRO-B:50||PRO-B:25";
//		String procedureCode = "PRO-B";
//		float averageCost = new ProcedureCost().getAverageCostForProcedure(procedureCosts,procedureCode);
//		System.out.println("Average cost of the procedure "+procedureCode+":"+averageCost);
//	}

	public float getAverageCostForProcedure(String procedureCosts, String procedureCode){
		float res=0;
		String costValues[] = procedureCosts.split(procedureCode+":");
		for(int i=1;i<costValues.length;i++){
			res += Float.parseFloat(costValues[i].split("\\|")[0]);
		}
		return res/(costValues.length-1);
	}

}
