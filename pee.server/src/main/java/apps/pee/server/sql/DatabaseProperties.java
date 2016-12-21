package apps.pee.server.sql;

import javax.security.auth.Subject;

import org.eclipse.scout.rt.platform.config.AbstractStringConfigProperty;
import org.eclipse.scout.rt.platform.config.AbstractSubjectConfigProperty;

//tag::structure[]
public class DatabaseProperties {
	public static class JdbcMappingNameProperty extends AbstractStringConfigProperty {
		// defines default value and key
		// end::structure[]

		@Override
		protected String getDefaultValue() {
			return "jdbc:oracle:thin:@localhost:1521/orcl";
		}

		@Override
		public String getKey() {
			return "platform.database.jdbc.mapping.name";
		}
		// tag::structure[]
	}

	  public static class SuperUserSubjectProperty extends AbstractSubjectConfigProperty {
		    // defines default value and key
		    // end::structure[]

		    @Override
		    protected Subject getDefaultValue() {
		      return convertToSubject("system");
		    }

		    @Override
		    public String getKey() {
		      return "platform.superuser";
		    }
		    // tag::structure[]
		  }


	public static class JdbcUserNameProperty extends AbstractStringConfigProperty {
		// defines default value and key
		// end::structure[]

		@Override
		protected String getDefaultValue() {
			return "system";
		}

		@Override
		public String getKey() {
			return "platform.database.username";
		}
		// tag::structure[]
	}

	public static class JdbcPasswordProperty extends AbstractStringConfigProperty {
		// defines default value and key
		// end::structure[]

		@Override
		protected String getDefaultValue() {
			return "oracle";
		}

		@Override
		public String getKey() {
			return "platform.database.password";
		}
		// tag::structure[]
	}

}
// end::structure[]
