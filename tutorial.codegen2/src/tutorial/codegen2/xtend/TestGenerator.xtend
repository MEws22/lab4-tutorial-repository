package tutorial.codegen2.xtend

import tutorial.BasicItemType
import tutorial.BlockShape
import tutorial.ComplexItemType
import tutorial.CylinderShape

class TestGenerator {
	
	def ws(String str) {
		return str.replace(" ", "")
	}
	
	def dispatch shapeCode(CylinderShape shape)
	'''
	
	'''
	
	def dispatch shapeCode(BlockShape shape)
	'''
	
	'''
	
	def dispatch generate(String packageName, BasicItemType itemType)
	'''
	//Packages declaration
	
	//import statements
	
	//Class statements
	
		//class body
		
	'''
	
	def dispatch generate(String packageName, ComplexItemType itemType)
		'''
	//Packages declaration
	
	//import statements
	
	//Class statements
	
		//class body
		
	'''
}