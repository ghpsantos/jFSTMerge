package br.ufpe.cin.generated;

import java.util.*;
import cide.gast.*;

import java.io.PrintStream;

import cide.languages.*;

import de.ovgu.cide.fstgen.ast.*;

public class SimplePrintVisitor extends AbstractFSTPrintVisitor  {
	public SimplePrintVisitor(PrintStream out) {
		super(out); generateSpaces=true;
	}
	public SimplePrintVisitor() {
		super(); generateSpaces=true;
	}
	public boolean visit(FSTNonTerminal nonTerminal) {
		if (nonTerminal.getType().equals("CompilationUnit")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"attrib")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		throw new RuntimeException("Unknown Non Terminal in FST "+nonTerminal);
	}
	protected boolean isSubtype(String type, String expectedType) {
		if (type.equals(expectedType)) return true;
		if (type.equals("inner_selector2") && expectedType.equals("inner_selector")) return true;
		if (type.equals("innerAttrib11") && expectedType.equals("innerAttrib1")) return true;
		if (type.equals("innerPseudo2") && expectedType.equals("innerPseudo")) return true;
		if (type.equals("inner_import1") && expectedType.equals("inner_import")) return true;
		if (type.equals("innerAttrib1") && expectedType.equals("innerAttrib")) return true;
		if (type.equals("innerAttrib13") && expectedType.equals("innerAttrib1")) return true;
		if (type.equals("combinator1") && expectedType.equals("combinator")) return true;
		if (type.equals("innerTermNumerals6") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("simple_selector2") && expectedType.equals("simple_selector")) return true;
		if (type.equals("inner_simple_selector1") && expectedType.equals("inner_simple_selector")) return true;
		if (type.equals("term5") && expectedType.equals("term")) return true;
		if (type.equals("innerTermNumerals4") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("inner_simple_selector3") && expectedType.equals("inner_simple_selector")) return true;
		if (type.equals("operator2") && expectedType.equals("operator")) return true;
		if (type.equals("innerTermNumerals2") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("term1") && expectedType.equals("term")) return true;
		if (type.equals("term3") && expectedType.equals("term")) return true;
		if (type.equals("element_name1") && expectedType.equals("element_name")) return true;
		if (type.equals("unary_operator1") && expectedType.equals("unary_operator")) return true;
		if (type.equals("inner_selector1") && expectedType.equals("inner_selector")) return true;
		if (type.equals("innerPseudo1") && expectedType.equals("innerPseudo")) return true;
		if (type.equals("inner_import2") && expectedType.equals("inner_import")) return true;
		if (type.equals("innerAttrib2") && expectedType.equals("innerAttrib")) return true;
		if (type.equals("innerAttrib12") && expectedType.equals("innerAttrib1")) return true;
		if (type.equals("inner_simple_selector4") && expectedType.equals("inner_simple_selector")) return true;
		if (type.equals("combinator2") && expectedType.equals("combinator")) return true;
		if (type.equals("innerTermNumerals8") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("simple_selector1") && expectedType.equals("simple_selector")) return true;
		if (type.equals("term6") && expectedType.equals("term")) return true;
		if (type.equals("innerTermNumerals7") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("inner_simple_selector2") && expectedType.equals("inner_simple_selector")) return true;
		if (type.equals("innerTermNumerals5") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("term2") && expectedType.equals("term")) return true;
		if (type.equals("operator1") && expectedType.equals("operator")) return true;
		if (type.equals("innerTermNumerals3") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("term4") && expectedType.equals("term")) return true;
		if (type.equals("innerTermNumerals1") && expectedType.equals("innerTermNumerals")) return true;
		if (type.equals("element_name2") && expectedType.equals("element_name")) return true;
		if (type.equals("unary_operator2") && expectedType.equals("unary_operator")) return true;
		return false;
	}
}
