package cnhalo;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 *
 * @author	HuangYijie
 * @date	Mar 13, 2016 9:51:10 PM
 * 
 */
public class IndexPage extends WebPage {

	private static final long serialVersionUID = -2856887644490684320L;
	
	public IndexPage() {
		add(new Label("helloworld", "Wicket Hello World")); // ��IndexPage.html�ж�wicket:id="helloworld"���������ƥ��
	}
	
}
