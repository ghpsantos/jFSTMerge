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
			{
				FSTNode v=getChild(nonTerminal, "stylesheet1");
				if (v!=null) {
					v.accept(this);
				}
			}
			for (FSTNode v : getChildren(nonTerminal,"stylesheet2")) {
				v.accept(this);
			}
			for (FSTNode v : getChildren(nonTerminal,"stylesheet3")) {
				v.accept(this);
			}
			for (FSTNode v : getChildren(nonTerminal,"stylesheet5")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("stylesheet41")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "ruleset");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("stylesheet5")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "stylesheet4");
				if (v!=null) {
					v.accept(this);
				}
			}
			for (FSTNode v : getChildren(nonTerminal,"stylesheet2")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("ruleset")) {
			printFeatures(nonTerminal,true);
			Iterator<FSTNode> listElements = getChildren(nonTerminal, "selector").iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				printToken(",");
				listElements.next().accept(this);
			}
			printToken("{");
			for (FSTNode v : getChildren(nonTerminal,"declarationList")) {
				v.accept(this);
			}
			hintIncIndent();
			hintNewLine();
			printToken("}");
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("declarationList")) {
			printFeatures(nonTerminal,true);
			Iterator<FSTNode> listElements = getChildren(nonTerminal, "declaration").iterator();
			if (listElements.hasNext()) {
				listElements.next().accept(this);
			}
			while (listElements.hasNext()) {
				listElements.next().accept(this);
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
		if (type.equals("stylesheet22") && expectedType.equals("stylesheet2")) return true;
		if (type.equals("stylesheet42") && expectedType.equals("stylesheet4")) return true;
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
		if (type.equals("stylesheet21") && expectedType.equals("stylesheet2")) return true;
		if (type.equals("stylesheet43") && expectedType.equals("stylesheet4")) return true;
		if (type.equals("stylesheet41") && expectedType.equals("stylesheet4")) return true;
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
