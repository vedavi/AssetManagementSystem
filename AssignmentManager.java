package SourceCode;

import java.util.ArrayList;

public class AssignmentManager {
	
	User user;
	Asset asset;
	
	ArrayList<User> Users;
	ArrayList<Asset> Assets;
	
	String _user, _asset;
	
	AssignmentManager(){
		
		Users = new ArrayList<User>();
		Assets = new ArrayList<Asset>();
		
	}
	
	void listUsers(){
		
		for(User x : Users){
			System.out.println(x.name);
		}
		
	}
	
	void listAssets(){
		
		for(Asset x : Assets){
			System.out.println(x.Name+" - "+x.UniqueID);
		}
		
	}
	
	void listUserAsset(String userName){
		
		this._user = userName;
		
		for(User x : Users){
			if(x.name == this._user){
				this.user = x;
			}
		}
		
		user.showAssets();
	}
	
	void addUser(String userName){
		
		this.user = new User(userName);
		Users.add(this.user);
		
	}
	
	void addAsset(String assetName,String assetID){
		
		this.asset = new Asset(assetName,assetID);
		Assets.add(this.asset);
		
	}
	
	void removeUser(String userName){
		
		this.user.name = userName;
		for(User x: Users){
			if(this.user.name == x.name){
				Users.remove(x);
				break;}
		}
	}
	
	void removeAsset(String assetID){
		
		this.asset.UniqueID = assetID;
		for(Asset x: Assets){
			if(this.asset.UniqueID == x.UniqueID){
				Assets.remove(x);
				break;}
		}
	}
	
		
	void assign(String user,String asset){
		
		this._user = user;
		this._asset = asset;
				
		for(User x : Users){
			if(x.name == this._user){
				this.user = x;		
				break;}
		}
		
		for(Asset x : Assets){
			if(x.Name == this._asset){
				this.asset = x;			
				break;}
		}
		
		this.user.assignAsset(this.asset);
		
	}
	
    void unassign(String user,String asset){
		
		this._user = user;
		this._asset = asset;
		
		for(User x : Users){
			if(x.name == this._user){
				this.user = x;		
				break;}
		}
		
		for(Asset x : Assets){
			if(x.Name == this._asset){
				this.asset = x;			
				break;}
		}
		
		this.user.unassignAsset(this.asset);
		
	}
    
    void update(String holder, String borrower, String asset){
    	
    	this._user = holder;
		this._asset = asset;
		
		for(User x : Users){
			if(x.name == this._user){
				this.user = x;		
				break;}
		}
		
		for(Asset x : Assets){
			if(x.Name == this._asset){
				this.asset = x;			
				break;}
		}
    	    	   	
    	
    	for(User x: Users){
    		if(x.name == user.name)
   				user.unassignAsset(this.asset);
   		}
    		
   		this._user = borrower;
   		    		
    	for(User x : Users){
   			if(x.name == this._user){
   				this.user = x;		
   				break;}
    	}
    		
    	for(User x: Users){			
    		if(x.name == user.name)
    			user.assignAsset(this.asset);
    	}  	
    	
    }

}