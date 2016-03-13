package cnhalo;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 *
 *
 * @author	HuangYijie
 * @date	Mar 13, 2016 9:49:43 PM
 * 
 */
public class CHApp extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return IndexPage.class;
	}

}
