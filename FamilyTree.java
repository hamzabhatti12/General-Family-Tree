//Family tree
//Start date 3/11/2019

import java.util.Collections;						// Will be used with arraylists
import java.util.Scanner; 							//to allow us to take inputs
import java.util.*;


import java.lang.Object;
import java.lang.Math;

import java.io.File;								//for file manipulation
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FamilyTree {								//class name
	public static void main(String[] args) {		//main declaration
	//Create the Tree and add All family Members
	Tree FT = new Tree();
	//Root1
	FT.add("Person01");
	FT.add("Person02");
	//1.1
	FT.add("Person03");
	FT.add("Person04");
	//1.1.1
	FT.add("Person05");
	FT.add("Person06");
	//1.1.1.1
	FT.add("Person07");
	FT.add("Person08");
	FT.add("Person09");
	FT.add("Person10");
	FT.add("Person11");
	FT.add("Person12");
	//1.1.2
	FT.add("Person13");
	FT.add("Person14");
	//1.1.2.1
	FT.add("Person15");
	FT.add("Person16");
	//1.1.3
	FT.add("Person17");
	FT.add("Person18");
	//1.1.3.1
	FT.add("Person19");
	FT.add("Person20");
	FT.add("Person21");
	FT.add("Person22");
	FT.add("Person23");
	//1.1.4
	FT.add("Person24");
	FT.add("Person25");
	//1.1.4.1
	FT.add("Person26");
	//1.1.5
	FT.add("Person27");
	FT.add("Person28");
	//1.1.5.1
	FT.add("Person29");
	FT.add("Person30");
	//1.2
	FT.add("Person31");
	FT.add("Person32");
	//1.2.2
	FT.add("Person33");
	FT.add("Person34");
	//1.2.2.1
	FT.add("Person35");
	FT.add("Person36");
	//1.2.3
	FT.add("Person37");
	FT.add("Person38");
	//1.2.3.1
	FT.add("Person39");
	FT.add("Person40");
	FT.add("Person41");
	
	//Connect all family member nodes
	//Gen0
	FT.setRelations("Person01", null, null, "Person02", "Person03", null);
	FT.setRelations("Person02", null, null, "Person01", "Person03", null);
	//Gen1
	FT.setRelations("Person03", "Person02", "Person01", "Person04", "Person05", "Person31");
	FT.setRelations("Person04", null, null, "Person03", "Person05", null);
	FT.setRelations("Person31", "Person02", "Person01", "Person32", "Person06", null);
	FT.setRelations("Person32", null, null, "Person31", "Person06", null);
	//Gen2
	FT.setRelations("Person05", "Person03", "Person04", "Person06", "Person07", "Person13");
	FT.setRelations("Person06", "Person31", "Person32", "Person05", "Person07", "Person33");	
	FT.setRelations("Person13", "Person03", "Person04", "Person14", "Person15", "Person17");
	FT.setRelations("Person14", null, null, "Person13", "Person15", null);	
	FT.setRelations("Person17", "Person03", "Person04", "Person18", "Person19", "Person24");
	FT.setRelations("Person18", null, null, "Person17", "Person19", null);	
	FT.setRelations("Person24", "Person03", "Person04", "Person25", "Person26", "Person27");
	FT.setRelations("Person25", null, null, "Person24", "Person26", null);	
	FT.setRelations("Person27", "Person03", "Person04", "Person28", "Person29", null);
	FT.setRelations("Person28", null, null, "Person27", "Person29", null);	
	FT.setRelations("Person33", "Person31", "Person32", "Person34", "Person35", "Person37");
	FT.setRelations("Person34", null, null, "Person33", "Person35", null);	
	FT.setRelations("Person37", "Person31", "Person32", "Person38", "Person39", null);
	FT.setRelations("Person38", null, null, "Person37", "Person39", null);
	//Gen3
	FT.setRelations("Person07", "Person05", "Person06", null, null, "Person08");
	FT.setRelations("Person08", "Person05", "Person06", null, null, "Person09");
	FT.setRelations("Person09", "Person05", "Person06", null, null, "Person10");
	FT.setRelations("Person10", "Person05", "Person06", null, null, "Person11");
	FT.setRelations("Person11", "Person05", "Person06", null, null, "Person12");
	FT.setRelations("Person12", "Person05", "Person06", null, null, null);
	FT.setRelations("Person15", "Person13", "Person14", null, null, "Person16");
	FT.setRelations("Person16", "Person13", "Person14", null, null, null);
	FT.setRelations("Person19", "Person17", "Person18", null, null, "Person20");
	FT.setRelations("Person20", "Person17", "Person18", null, null, "Person21");
	FT.setRelations("Person21", "Person17", "Person18", null, null, "Person22");
	FT.setRelations("Person22", "Person17", "Person18", null, null, "Person23");
	FT.setRelations("Person23", "Person17", "Person18", null, null, null);
	FT.setRelations("Person26", "Person24", "Person25", null, null, null);
	FT.setRelations("Person29", "Person28", "Person27", null, null, "Person30");
	FT.setRelations("Person30", "Person28", "Person27", null, null, null);
	FT.setRelations("Person35", "Person33", "Person34", null, null, "Person36");
	FT.setRelations("Person36", "Person33", "Person34", null, null, null);
	FT.setRelations("Person39", "Person38", "Person37", null, null, "Person40");
	FT.setRelations("Person40", "Person38", "Person37", null, null, "Person41");
	FT.setRelations("Person41", "Person38", "Person37", null, null, null);
	
	FT.setRoots("Person01");
	FT.printRoot1();
	}
}

class Tree{
	
	static class node{
		private String name;
		private node mother;
		private node father;
		private node spouse;
		private node firstChild;
		private node nextSibling;
		public int gen;
		
		node(){
			name = "TBA";
			mother = null;
			father = null;
			spouse = null;
			firstChild = null;
			nextSibling = null;
			gen = 0;
		}
		
		node(String Name){
			name = Name;
			mother = null;
			father = null;
			spouse = null;
			firstChild = null;
			nextSibling = null;
			gen = 0;
		}
		
		public void setRelations(node Mother, node Father, node Spouse, node FirstChild, node NextSibling){
			mother = Mother;
			father = Father;
			spouse = Spouse;
			firstChild = FirstChild;
			nextSibling = NextSibling;
			if (Mother != null || Father != null){
				gen = Math.max(Mother.gen,Father.gen) + 1;
			}
			else{
				gen = 0;
			}
		}
		
		public String getName(){
			return name;
		}
		
		public node getSpouse(){
			return spouse;
		}
		
		public node getFirstChild(){
			return firstChild;
		}
		
		public node getNextSibling(){
			return nextSibling;
		}
		
		public String getSpouseName(){
			return spouse.getName();
		}
		
		public String getFirstChildName(){
			return firstChild.getName();
		}
		
		public String getNextSiblingName(){
			return nextSibling.getName();
		}
		

	}
	public node temp;
	public node temp1;
	public node temp2;
	public node temp3;
	public node temp4;
	public node temp5;
	public int count;
	
	private node root1;
	private node root2;
	private node root3;
	private node root4;
	private int height;
	private int size;
	ArrayList<node> nodes = new ArrayList<node>();
	
	public node getNode(String Name){
		boolean found = false;
		int i = 0;
		while (found == false & nodes.get(i)!= null){
			if(nodes.get(i).getName() == Name){
				found = true;
				return nodes.get(i);
			}
			i++;
		}
		return null;
	}
	
	void setRoots(String Root1/*, String Root2*/){

		root1 = getNode(Root1);
		/*root2 = getNode(Root2);
		
		root3 = null;
		root4 = null;
		size = 0;
		height = 0;*/
	}
	
	public void add(String Name){
		
		nodes.add(new node(Name));
	}
	
	public void setRelations(String Name, String Mother, String Father, String Spouse, String FirstChild, String NextSibling){
		temp = getNode(Name);
		temp1 = null;
		temp2 = null;
		temp3 = null;
		temp4 = null;
		temp5 = null;
		
		if (Mother != null){
			temp1 = getNode(Mother);
		}
		if (Father != null){
			temp2 = getNode(Father);
		}
		if (Spouse != null){
			temp3 = getNode(Spouse);
		}
		if (FirstChild!= null){
			temp4 = getNode(FirstChild);
		}
		if (NextSibling != null){
			temp5 = getNode(NextSibling);
		}
		
		temp.setRelations(temp1, temp2, temp3, temp4, temp5);
	}
	
	public void printRoot1(){
		printTree(getRoot1());
		
	}
	
	public void printTree(node Node){
		int i = 0;
		while(Node.gen != i){
			System.out.print("|  ");
			i++;
		}
		System.out.print(Node.getName());
		if(Node.getSpouse() != null){
			System.out.print(" + " + Node.getSpouseName());
		}
		System.out.println();
		if(Node.getFirstChild() != null){
			printTree(Node.getFirstChild());
		}
		if(Node.getNextSibling() != null){
			printTree(Node.getNextSibling());
		}
	}
	
	public node getRoot1(){
		return root1;
	}
	public node getRoot2(){
		return root2;
	}
	public node getRoot3(){
		return root3;
	}
	public node getRoot4(){
		return root4;
	}
	
	
}