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
			for (FSTNode v : getChildren(nonTerminal,"Any")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		throw new RuntimeException("Unknown Non Terminal in FST "+nonTerminal);
	}
	protected boolean isSubtype(String type, String expectedType) {
		if (type.equals(expectedType)) return true;
		if (type.equals("Any14") && expectedType.equals("Any")) return true;
		if (type.equals("Any13") && expectedType.equals("Any")) return true;
		if (type.equals("Any12") && expectedType.equals("Any")) return true;
		if (type.equals("Any4") && expectedType.equals("Any")) return true;
		if (type.equals("Any3") && expectedType.equals("Any")) return true;
		if (type.equals("Any2") && expectedType.equals("Any")) return true;
		if (type.equals("Any1") && expectedType.equals("Any")) return true;
		if (type.equals("Any8") && expectedType.equals("Any")) return true;
		if (type.equals("Any7") && expectedType.equals("Any")) return true;
		if (type.equals("Any6") && expectedType.equals("Any")) return true;
		if (type.equals("Any5") && expectedType.equals("Any")) return true;
		if (type.equals("Any11") && expectedType.equals("Any")) return true;
		if (type.equals("Any10") && expectedType.equals("Any")) return true;
		if (type.equals("Any9") && expectedType.equals("Any")) return true;
		return false;
	}
}
