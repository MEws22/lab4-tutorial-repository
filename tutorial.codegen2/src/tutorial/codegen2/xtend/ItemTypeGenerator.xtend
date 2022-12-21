package tutorial.codegen2.xtend

import tutorial.BasicItemType
import tutorial.BlockShape
import tutorial.ComplexItemType
import tutorial.CylinderShape

class ItemTypeGenerator {
	
	def ws(String str) {
		return str.replace(" ", "")
	}
	
	def dispatch shapeCode(CylinderShape shape)
	'''
	private double radius = «shape.radius»;
	'''
	
	def dispatch shapeCode(BlockShape shape)
	'''
	private double width = «shape.width»;
	private double height = «shape.heigth»;
	'''
	
	def dispatch generate(String packageName, BasicItemType itemType)
	'''
	package «packageName»;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class «ws(itemType.name)» {
	
		private double length = «itemType.shape.length»;
		«shapeCode(itemType.shape)»
		
		private List<String> markers;
		
		public «ws(itemType.name)»() {
			markers = new ArrayList<>();
			«FOR m : itemType.markers»
			markers.add("«m.name»");
			«ENDFOR»
		}
				
		public double getLength() {
			return length;
		}
		
		public List<String> getMarkers() {
			return markers;
		}
	
		@Override
		public String toString() {
			return "«itemType.name»(«itemType.material.name()»)";
		}
	}
	'''
	
	def dispatch generate(String packageName, ComplexItemType itemType)
	'''
	package «packageName»;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class «ws(itemType.name)» {
	
		«FOR c : itemType.components»
		private «ws(c.itemType.name)» «ws(c.name).toFirstLower»;
		«ENDFOR»
		
		private List<String> markers;
		
		
		public «itemType.name»() {
			«FOR c : itemType.components»
			«ws(c.name).toFirstLower» = new «ws(c.itemType.name)»();
			«ENDFOR»
			markers = new ArrayList<>();
		}
		
		@Override
		public String toString() {
			return "«itemType.name»(«FOR c : itemType.components SEPARATOR ','»«c.name»«ENDFOR»)";
		}
	}
	
	'''
}