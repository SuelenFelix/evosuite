package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class Nothing_match_6588266222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1642;
     Object term1694;
     Object term1732;

    public Nothing_match_6588266222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1747 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1746 = ((Class) term1747).getDeclaredField((String) "RIGHT");
        ((Field) term1746).setAccessible(true);
        Object enum6 = ((Field) term1746).get((Object) null);
        Object term1646 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1651 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1646, term1646.getClass(), "ruleName", "");
        setIntField(term1646, term1646.getClass(), "precedence", -157887805);
        setField(term1646, term1646.getClass(), "associativity", enum6);
        setField(term1651, term1651.getClass(), "clause", null);
        setField(term1651, term1651.getClass(), "astNodeLabel", null);
        setField(term1646, term1646.getClass(), "labeledClause", term1651);
        Class<? extends Object> term1954 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1953 = ((Class) term1954).getDeclaredField((String) "LEFT");
        ((Field) term1953).setAccessible(true);
        Object enum7 = ((Field) term1953).get((Object) null);
        Object term1652 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1657 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1652, term1652.getClass(), "ruleName", "");
        setIntField(term1652, term1652.getClass(), "precedence", 1876565163);
        setField(term1652, term1652.getClass(), "associativity", enum7);
        setField(term1657, term1657.getClass(), "clause", null);
        setField(term1657, term1657.getClass(), "astNodeLabel", null);
        setField(term1652, term1652.getClass(), "labeledClause", term1657);
        Object term1658 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1661 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1658, term1658.getClass(), "ruleName", "");
        setIntField(term1658, term1658.getClass(), "precedence", -817164822);
        setField(term1658, term1658.getClass(), "associativity", enum7);
        setField(term1661, term1661.getClass(), "clause", null);
        setField(term1661, term1661.getClass(), "astNodeLabel", null);
        setField(term1658, term1658.getClass(), "labeledClause", term1661);
        ArrayList term1644 = new ArrayList();
        ((ArrayList) term1644).add(term1646);
        ((ArrayList) term1644).add(term1652);
        ((ArrayList) term1644).add(term1658);
        ArrayList term1664 = new ArrayList();
        term1642 = newInstance(Class.forName("pikaparser.clause.terminal.Nothing"));
        Object[] term1643 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term1642, term1642.getClass(), "labeledSubClauses", term1643);
        setField(term1642, term1642.getClass(), "rules", term1644);
        setField(term1642, term1642.getClass(), "seedParentClauses", term1664);
        setBooleanField(term1642, term1642.getClass(), "canMatchZeroChars", true);
        setIntField(term1642, term1642.getClass(), "clauseIdx", -1016503459);
        setField(term1642, term1642.getClass(), "toStringCached", "MLqYREekMl");
        setField(term1642, term1642.getClass(), "toStringWithRuleNameCached", "ytSBIKXogI");
        Object term1698 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1698, term1698.getClass(), "ruleName", null);
        setIntField(term1698, term1698.getClass(), "precedence", -1048298087);
        setField(term1698, term1698.getClass(), "associativity", enum7);
        setField(term1698, term1698.getClass(), "labeledClause", null);
        Object term1700 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1700, term1700.getClass(), "ruleName", null);
        setIntField(term1700, term1700.getClass(), "precedence", 292681826);
        setField(term1700, term1700.getClass(), "associativity", enum6);
        setField(term1700, term1700.getClass(), "labeledClause", null);
        ArrayList term1696 = new ArrayList();
        ((ArrayList) term1696).add(term1698);
        ((ArrayList) term1696).add(term1700);
        HashMap term1704 = new HashMap();
        ArrayList term1712 = new ArrayList();
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        ((ArrayList) term1712).add((Object)null);
        term1694 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term1695 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term1728 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1730 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term1694, term1694.getClass(), "memoTable", null);
        setField(term1695, term1695.getClass(), "allRules", term1696);
        setField(term1695, term1695.getClass(), "ruleNameWithPrecedenceToRule", term1704);
        setField(term1695, term1695.getClass(), "allClauses", term1712);
        setField(term1694, term1694.getClass(), "grammar", term1695);
        setField(term1694, term1694.getClass(), "input", "uWHnvSvaPl");
        setIntField(term1728, term1728.getClass(), "value", 1484323161);
        setField(term1694, term1694.getClass(), "numMatchObjectsCreated", term1728);
        setIntField(term1730, term1730.getClass(), "value", 391863371);
        setField(term1694, term1694.getClass(), "numMatchObjectsMemoized", term1730);
        term1732 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term1732, term1732.getClass(), "clause", null);
        setIntField(term1732, term1732.getClass(), "startPos", -184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Nothing");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1694;
        args[1] = term1732;
        args[2] = "kBdSllIBVz";
        callMethod(klass, "match", argTypes, term1642, args);
    }

};


