package com.alergiasprontuario.model.query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
    @NamedNativeQuery(
        name = "QueryUtils.getDateTime",
        query ="select to_char(sysdate,'dd/mm/yyyy hh24:mi') as date_time "
        		+ "from dual", resultClass = QueryUtils.class )
    })


public class QueryUtils {
  @Id
  String dateTime;

public String getDateTime() {
	return dateTime;
}

public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}


  
  
}
