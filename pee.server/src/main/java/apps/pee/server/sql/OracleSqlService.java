package apps.pee.server.sql;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.config.CONFIG;
import org.eclipse.scout.rt.server.jdbc.oracle.AbstractOracleSqlService;

import apps.pee.server.sql.DatabaseProperties.JdbcMappingNameProperty;
import apps.pee.server.sql.DatabaseProperties.JdbcPasswordProperty;
import apps.pee.server.sql.DatabaseProperties.JdbcUserNameProperty;

@Order(1950)
//tag::service[]
public class OracleSqlService extends AbstractOracleSqlService {

	@Override
	protected String getConfiguredJdbcMappingName() {
		String mappingName = CONFIG.getPropertyValue(JdbcMappingNameProperty.class);

		return mappingName;
	}
	// end::service[]
//tag::service[]
	@Override
	protected String getConfiguredUsername() {
		String userName = CONFIG.getPropertyValue(JdbcUserNameProperty.class);

		return userName;
	}
	// end::service[]
//tag::service[]
	@Override
	protected String getConfiguredPassword() {
		String passWord = CONFIG.getPropertyValue(JdbcPasswordProperty.class);

		return passWord;
	}
}
//end::service[]
