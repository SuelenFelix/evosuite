package pikaparser.clause.aux;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static pikaparser.clause.aux.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ASTNodeLabel_match_10561222392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;
     Object term571;
     Object term623;

    public ASTNodeLabel_match_10561222392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term537 = new ArrayList();
        ArrayList term541 = new ArrayList();
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        term458 = newInstance(Class.forName("pikaparser.clause.aux.ASTNodeLabel"));
        Object[] term471 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term472 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term485 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term498 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term511 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term524 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term458, term458.getClass(), "astNodeLabel", "aJlieCFVtF");
        setField(term472, term472.getClass(), "clause", null);
        setField(term472, term472.getClass(), "astNodeLabel", "ZiaGIbnzTs");
        setElement(term471, 0, term472);
        setField(term485, term485.getClass(), "clause", null);
        setField(term485, term485.getClass(), "astNodeLabel", "tbcdzjIfER");
        setElement(term471, 1, term485);
        setField(term498, term498.getClass(), "clause", null);
        setField(term498, term498.getClass(), "astNodeLabel", "HyxfbSQYBe");
        setElement(term471, 2, term498);
        setField(term511, term511.getClass(), "clause", null);
        setField(term511, term511.getClass(), "astNodeLabel", "pCTimMblYc");
        setElement(term471, 3, term511);
        setField(term524, term524.getClass(), "clause", null);
        setField(term524, term524.getClass(), "astNodeLabel", "hNxWaHcfhY");
        setElement(term471, 4, term524);
        setField(term458, term458.getClass(), "labeledSubClauses", term471);
        setField(term458, term458.getClass(), "rules", term537);
        setField(term458, term458.getClass(), "seedParentClauses", term541);
        setBooleanField(term458, term458.getClass(), "canMatchZeroChars", false);
        setIntField(term458, term458.getClass(), "clauseIdx", -616727354);
        setField(term458, term458.getClass(), "toStringCached", "RkybSrpybU");
        setField(term458, term458.getClass(), "toStringWithRuleNameCached", "xOEqzGAmDU");
        Object term575 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term575, term575.getClass(), "ruleName", null);
        setIntField(term575, term575.getClass(), "precedence", 1725571209);
        setField(term575, term575.getClass(), "associativity", null);
        setField(term575, term575.getClass(), "labeledClause", null);
        Object term577 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term577, term577.getClass(), "ruleName", null);
        setIntField(term577, term577.getClass(), "precedence", -522618178);
        setField(term577, term577.getClass(), "associativity", null);
        setField(term577, term577.getClass(), "labeledClause", null);
        Object term579 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term579, term579.getClass(), "ruleName", null);
        setIntField(term579, term579.getClass(), "precedence", 1134449235);
        setField(term579, term579.getClass(), "associativity", null);
        setField(term579, term579.getClass(), "labeledClause", null);
        Object term581 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term581, term581.getClass(), "ruleName", null);
        setIntField(term581, term581.getClass(), "precedence", -883034806);
        setField(term581, term581.getClass(), "associativity", null);
        setField(term581, term581.getClass(), "labeledClause", null);
        Object term583 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term583, term583.getClass(), "ruleName", null);
        setIntField(term583, term583.getClass(), "precedence", 1585847225);
        setField(term583, term583.getClass(), "associativity", null);
        setField(term583, term583.getClass(), "labeledClause", null);
        Object term585 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term585, term585.getClass(), "ruleName", null);
        setIntField(term585, term585.getClass(), "precedence", 597278769);
        setField(term585, term585.getClass(), "associativity", null);
        setField(term585, term585.getClass(), "labeledClause", null);
        Object term587 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term587, term587.getClass(), "ruleName", null);
        setIntField(term587, term587.getClass(), "precedence", -1685132342);
        setField(term587, term587.getClass(), "associativity", null);
        setField(term587, term587.getClass(), "labeledClause", null);
        Object term589 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term589, term589.getClass(), "ruleName", null);
        setIntField(term589, term589.getClass(), "precedence", -1456670397);
        setField(term589, term589.getClass(), "associativity", null);
        setField(term589, term589.getClass(), "labeledClause", null);
        Object term591 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term591, term591.getClass(), "ruleName", null);
        setIntField(term591, term591.getClass(), "precedence", 1622346318);
        setField(term591, term591.getClass(), "associativity", null);
        setField(term591, term591.getClass(), "labeledClause", null);
        ArrayList term573 = new ArrayList();
        ((ArrayList) term573).add(term575);
        ((ArrayList) term573).add(term577);
        ((ArrayList) term573).add(term579);
        ((ArrayList) term573).add(term581);
        ((ArrayList) term573).add(term583);
        ((ArrayList) term573).add(term585);
        ((ArrayList) term573).add(term587);
        ((ArrayList) term573).add(term589);
        ((ArrayList) term573).add(term591);
        HashMap term595 = new HashMap();
        ArrayList term603 = new ArrayList();
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        term571 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term572 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term619 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term621 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term571, term571.getClass(), "memoTable", null);
        setField(term572, term572.getClass(), "allRules", term573);
        setField(term572, term572.getClass(), "ruleNameWithPrecedenceToRule", term595);
        setField(term572, term572.getClass(), "allClauses", term603);
        setField(term571, term571.getClass(), "grammar", term572);
        setField(term571, term571.getClass(), "input", "IDCWpPLRkE");
        setIntField(term619, term619.getClass(), "value", 568599855);
        setField(term571, term571.getClass(), "numMatchObjectsCreated", term619);
        setIntField(term621, term621.getClass(), "value", 1162663216);
        setField(term571, term571.getClass(), "numMatchObjectsMemoized", term621);
        term623 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term623, term623.getClass(), "clause", null);
        setIntField(term623, term623.getClass(), "startPos", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.ASTNodeLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term571;
        args[1] = term623;
        args[2] = "nyiiPDVjAc";
        callMethod(klass, "match", argTypes, term458, args);
    }

};


