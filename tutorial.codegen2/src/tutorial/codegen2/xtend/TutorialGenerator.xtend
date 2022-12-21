package tutorial.codegen2.xtend

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import tutorial.Factory

class TutorialGenerator extends AbstractGenerator {
	
	
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val factory = input.allContents.filter(Factory).next
		val generator = new ItemTypeGenerator
		
		factory.itemTypes.forEach[ itemType |
			fsa.generateFile(
				factory.name.replace(" ", "") + "/" + itemType.name.replace(" ", "") + ".java",
				generator.generate(factory.name, itemType)
			)
		]
		
	}
	
}