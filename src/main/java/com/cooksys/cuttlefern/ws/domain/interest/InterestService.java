package com.cooksys.cuttlefern.ws.domain.interest;

import java.util.List;

public interface InterestService {

	List<Interest> index();
	
	Interest create(Interest interest);

///////////////////////////////////////////////////////////////////////////////

	Interest read(Integer id);

	Interest update(Integer id, Interest interestToUpdate);

	Interest delete(Integer id);

}
