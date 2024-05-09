package com.spring3.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring3.dto.Sample;
import com.spring3.dto.Store;
import com.spring3.service.SampleService;
import com.spring3.service.StoreService;
import com.spring3.vo.Maker;

//REST(REpresentation State Transfer) : 표현가능한 자원의 상태를 전송
//RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
//API(Application Programming Interface) : 프로그래밍시에 활용할 수 있는 애플리케이션 형태의 자원
//사용자가 요청하고 처리해야함, api는 
//RESTful API(Application Programming Interface REpresentation State Transfer) : 

@RestController //@ResponseBody + @Controller : JSON 으로 출력

@RequestMapping("/api/")
public class RestfulController {
	
	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@Autowired
	private StoreService storeService;
	
	//json 출력
	@GetMapping("api1.do")
	public int getApi1() {
		return 1004;
	}
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1,"EmArt");
		return store;
	}
	
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1,"EmArt");
		Store store2 = new Store(2,"Homeplus");
		Store store3 = new Store(3,"Costco");
		List<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		return storeList;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1,"EmArt");
		Store store2 = new Store(2,"Homeplus");
		Store store3 = new Store(3,"Costco");
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		Maker maker = new Maker("GrateMall",1,storeList);
		return maker;
	}
	
	//json 받아오기
	//요청할때 값을 받아오는 거 자바스크립트의 객체로 달라 : json : @RequestBody Store store
	@PostMapping("api5.do")
	public Store postApi5(@RequestBody Store store) {
//		String response = String.format("<상점정보>\n상점번호 : %d\n 상점이름 : %s", store.getStoreNum(), store.getStoreName());
		storeService.insStore(store);
		log.info("번호 : "+store.getStoreNum()); 
		log.info("번호 : "+store.getStoreName());
		return store;
	}
	
//	//json 받아오기
//	//요청할때 값을 받아오는 거 자바스크립트의 객체로 달라 : json : @RequestBody Store store
//	@PostMapping("api5.do")
//	public String postApi5(@RequestBody Store store) {
//		String response = String.format("<상점정보>\n상점번호 : %d\n 상점이름 : %s", store.getStoreNum(), store.getStoreName());
//		return response;
//	}
	
	@GetMapping("api6.do")
	public List<Sample> postApi6(){
		List<Sample> testList = sampleService.getSampleList();
		return testList;
	}
	
	

	
	
	
}
