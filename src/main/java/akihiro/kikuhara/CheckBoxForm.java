package akihiro.kikuhara;

import java.util.Collections;
import java.util.List;

public class CheckBoxForm {
	private List<String> checkAry;

	public List<String> getCheckAry() {
		if(checkAry == null){
			checkAry = Collections.emptyList();
		}
		return checkAry;
	}

	public void setCheckAry(List<String> checkAry) {
		this.checkAry = checkAry;
	}
}
