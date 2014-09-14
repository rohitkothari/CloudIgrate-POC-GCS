package com.cloudigrate.gcs;

import java.util.List;

import com.cloudigrate.gcs.StorageFacade;

public class StorageService {

	public static void main(String[] args) throws Exception {
		
		StorageFacade.createBucket("testcirk");
		
		StorageFacade.uploadFile("testcirk", "C:/Users/rkothari/Documents/useful-links.txt");
		
		StorageFacade.downloadFile("testcirk", "useful-links.txt", "C:/Users/rkothari/Downloads");
		
		List<String> buckets = StorageFacade.listBuckets();
		System.out.println("You have following buckets in your Google Cloud Storage account -");
		System.out.println(buckets.get(0));
		System.out.println(buckets.get(1));
		
		List<String> files = StorageFacade.listBucket("testcirk");
		System.out.println("Your bucket contains following files -");
		System.out.println(files.get(0));

	}
	
}
