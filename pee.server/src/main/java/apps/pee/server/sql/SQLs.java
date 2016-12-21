package apps.pee.server.sql;

public interface SQLs {
	
	String RININPATIENT_PAGE_SELECT = ""
			  + "SELECT "
			  + "case_history as case_history_id"
			  + ", show_id "
			  + ",show_fullname "
			  + ",tempr_m "
			  + ",datein "
			  + ",description "
			  + ",name_ward "
			  + ",doctor "
			  + ",sost "
			  + ",dataoperation "
			  + "from "
			  + "priem.v_patient_in "
			  + "where "
			  + "(registry = 1) "
			  + "order by "
			  + "show_fullname ";
	  
	  String RININPATIENT_PAGE_SELECT_INTO = ""
			  + " INTO :{page.case_history_id}"
			  + ", :{page.show_id} "
			  + ", :{page.full_name} "
			  + ", :{page.tempr_m} "
			  + ", :{page.datein} "
			  + ", :{page.description} "
			  + ", :{page.name_ward} "
			  + ", :{page.doctor} "
			  + ", :{page.sost} "
			  + ", :{page.dataoperation} " ;
}
