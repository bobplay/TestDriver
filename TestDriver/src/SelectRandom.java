

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectRandom extends Select {

	public SelectRandom(WebElement element) {
		super(element);
		// TODO Auto-generated constructor stub
	}
	public void getOptions(WebElement element){
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		/**
		 * �ж��������Ƿ������ݣ��������������
		 */
		if(options.size()>0 && options != null){
			Random random = new Random();
			int random_select = random.nextInt(options.size());
			System.out.println(options);
			sel.selectByIndex(random_select);
		}
	}
	/**
	 * ��Ĭ�ϵ���Чֵȥ����������ѡ��
	 * @param element
	 * @param index
	 */
	public void getChange(WebElement element ,int index){
		Select sel = new Select(element);
		 List<WebElement> options = sel.getOptions();
		 if(options.size()>0 && options != null){
			 Random random = new Random();
			int random_select = random.nextInt(options.size()-index)+index;
			sel.selectByIndex(random_select);
		 }
	}
}
