/*Modifiers:
 * Basically the accessability of datamembers and action to key restriction
 * Any class accessability is defined by modifiers
 * 
 * class level modifiers:
 * 1.public,default,abstract,final and strictfp
 * 2.Innerclass:public,default,abstract,final and strictfp(private,protected and static)
 * 
 * Member modifier:
 * i.12 modifiers are applicable for members
 * ii.If a member is public then it will acessable from anywhere
 * iii.recommended modifier for member is private and for method is public
 * iv.protected means same package and child class of outer package and 
 * 		we should child class reference only
 * private>default>protected>public
 * V.The  only applicable modifier for local variable are final
 * 
 * 
 * 
 * 1.public modifier
 * ---
 * modifiers can be applied in two levels method level and class level
 *  1.So when we use public  modifier in class level it can be accessed by other class in same package
 *  2.And also we can access in otherpackage class also..
 *  3.It works similar in both method level and class level 
 */
package com.accessmodifiers;

public class ModifiersScenario2 {
	
	public void show() {
		System.out.println("In public modifier class");
	}
}
