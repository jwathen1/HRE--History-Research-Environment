package org.historyresearchenvironment.sample.providers;

import java.sql.SQLException;

import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;

/**
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleModelProvider extends AbstractHreProvider {

	/**
	 * Constructor
	 *
	 * @throws SQLException
	 */
	public SampleModelProvider() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param perNo
	 */
	public void readFromH2(int perNo) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return
	 */
	public String getIdentity() {
		// TODO Auto-generated method stub
		return null;
	}
}
