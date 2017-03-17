package org.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.model.Students;
import org.model.StudentsId;
import org.model.Activity;
import org.util.JsonTools;

public class Test1 extends BaseActionSupport {
	
	public void getBanner() throws IOException{
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Activity activity1 = new Activity();
		activity1.setRId(1);
		activity1.setRPicture("http://127.0.0.1:8080/ShangDeShuYuan/images/1.jpg");
		
		Activity activity2 = new Activity();
		activity2.setRId(2);
		activity2.setRPicture("http://127.0.0.1:8080/ShangDeShuYuan/images/2.jpg");
		
		Activity activity3 = new Activity();
		activity3.setRId(3);
		activity3.setRPicture("http://127.0.0.1:8080/ShangDeShuYuan/images/3.jpg");
	
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",activity1.getRId());
		map.put("picture_url", activity1.getRPicture());
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("id",activity2.getRId());
		map2.put("picture_url", activity1.getRPicture());
		Map<String,Object> map3 = new HashMap<String,Object>();
		map3.put("id",activity3.getRId());
		map3.put("picture_url", activity1.getRPicture());
				
		list.add(map);
		list.add(map2);
		list.add(map3);

		String s = JsonTools.createJsonString("getBanner", list);
		System.out.print(s);
		post(s);
	}


	
}
