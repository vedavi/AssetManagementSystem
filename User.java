package SourceCode;

import java.util.ArrayList;

public class User {

	ArrayList<Asset> resources;
	Asset asset;
	String name;
	
	User(String name){
		
		this.name = name;
		resources = new ArrayList<Asset>();
	}
	
	void assignAsset(Asset newAsset){
		
		this.asset = newAsset;
		resources.add(this.asset);
		
		System.out.println("Asset "+ this.asset.Name + " assigned to " + this.name);
	}
	
	void unassignAsset(Asset oldAsset){
		
		this.asset = oldAsset;
		resources.remove(this.asset);
		
		System.out.println("Asset "+ this.asset.Name + " relieved from " + this.name);
	}
	
	void showAssets(){
		for(Asset x : resources){
			System.out.println(name+" - "+x.Name);
		}
	}
	
}
