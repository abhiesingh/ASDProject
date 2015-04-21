/**
 * 
 */
package edu.mum.asd.report;

import edu.mum.asd.account.IAccount;

/**
 * @author AbhieS
 *
 */
public class ReportManager {
	
	private IReport iReport;
	
	public IReport getiReport() {
		return iReport;
	}

	public void setiReport(IReport iReport) {
		this.iReport = iReport;
	}

	//Default implementation of Report
	public void generateReport(IAccount account){
		iReport.generateReport(account);
	}

}
