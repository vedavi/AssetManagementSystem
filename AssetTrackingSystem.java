package SourceCode;

import java.util.Scanner;

public class AssetTrackingSystem {

	public static void main(String[] args){
		
		AssignmentManager assignmentManager = new AssignmentManager();
		Scanner scan = new Scanner(System.in);
		Boolean moreOperation;
		String operation;
		
		System.out.println("************ Assignment Tracking System *************");
		
		do{
			String userName, assetName, assetID, holder, asker;			
			System.out.println(" Provide operation ");
			operation = scan.nextLine();
			
			switch(operation){
			
			case "ListUsers":
				assignmentManager.listUsers();
				break;
				
			case "ListAssets":
				assignmentManager.listAssets();
				break;
			
			case "ListUserAssets":
				System.out.println("Enter user name: ");
				userName = scan.nextLine();
				assignmentManager.listUserAsset(userName);
				break;
				
			case "AddUser":
				System.out.println("Enter user name: ");
				userName = scan.nextLine();
				assignmentManager.addUser(userName);
				break;
			
			case "AddAsset":
				System.out.println("Enter Asset name and Name: ");
				userName = scan.nextLine();
				assetName = scan.nextLine();
				assignmentManager.addAsset(userName,assetName);
				break;
				
			case "RemoveUser":
				System.out.println("Enter user name: ");
				userName = scan.nextLine();
				assignmentManager.removeUser(userName);
				break;
			
			case "RemoveAsset":
				System.out.println("Enter Asset ID: ");
				assetID = scan.nextLine();
				assignmentManager.removeAsset(assetID);
				break;
				
			case "Assign":
				System.out.println("Enter User name: ");
				userName = scan.nextLine();
				System.out.println("Enter Asset name: ");
				assetName = scan.nextLine();
				assignmentManager.assign(userName,assetName);
				break;
				
			case "Unassign":
				System.out.println("Enter User name: ");
				userName = scan.nextLine();
				System.out.println("Enter Asset name: ");
				assetName = scan.nextLine();
				assignmentManager.unassign(userName,assetName);
				break;
				
			case "PassOver":
				System.out.println("Enter Holding user name: ");
				holder = scan.nextLine();
				
				System.out.println("Enter Requesting user name: ");
				asker = scan.nextLine();
				
				System.out.println("Enter Asset name: ");
				assetName = scan.nextLine();
				assignmentManager.update(holder, asker, assetName);
				break;
			
			default:
				System.out.println("Incorrect option!");
			}
			
			System.out.println("Do you wish to continue? (Y/N)");
		
			if(scan.nextLine().charAt(0) == 'Y'){
				moreOperation = true;
			}
			
			else{
				moreOperation = false;
			}
			
		}while(moreOperation == true);
		
		System.out.println("Terminating Asset Tracking System.");
		scan.close();
	}
	
}
