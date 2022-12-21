package tutorial.codegen2.xtend;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import tutorial.BasicItemType;
import tutorial.BlockShape;
import tutorial.ComplexItemType;
import tutorial.CylinderShape;
import tutorial.ItemType;
import tutorial.Shape;

@SuppressWarnings("all")
public class TestGenerator {
  public String ws(final String str) {
    return str.replace(" ", "");
  }

  protected CharSequence _shapeCode(final CylinderShape shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _shapeCode(final BlockShape shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generate(final String packageName, final BasicItemType itemType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Packages declaration");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//import statements");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Class statements");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//class body");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generate(final String packageName, final ComplexItemType itemType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Packages declaration");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//import statements");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Class statements");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//class body");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }

  public CharSequence shapeCode(final Shape shape) {
    if (shape instanceof BlockShape) {
      return _shapeCode((BlockShape)shape);
    } else if (shape instanceof CylinderShape) {
      return _shapeCode((CylinderShape)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }

  public CharSequence generate(final String packageName, final ItemType itemType) {
    if (itemType instanceof BasicItemType) {
      return _generate(packageName, (BasicItemType)itemType);
    } else if (itemType instanceof ComplexItemType) {
      return _generate(packageName, (ComplexItemType)itemType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(packageName, itemType).toString());
    }
  }
}
