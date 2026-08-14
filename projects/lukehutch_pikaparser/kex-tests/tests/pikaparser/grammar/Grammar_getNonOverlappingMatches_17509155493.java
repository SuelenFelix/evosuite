package pikaparser.grammar;

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
import static pikaparser.grammar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Grammar_getNonOverlappingMatches_17509155493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;
     Object term1809;

    public Grammar_getNonOverlappingMatches_17509155493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1846 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1845 = ((Class) term1846).getDeclaredField((String) "RIGHT");
        ((Field) term1845).setAccessible(true);
        Object enum6 = ((Field) term1845).get((Object) null);
        Object term1774 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1779 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1774, term1774.getClass(), "ruleName", "");
        setIntField(term1774, term1774.getClass(), "precedence", -817164822);
        setField(term1774, term1774.getClass(), "associativity", enum6);
        setField(term1779, term1779.getClass(), "clause", null);
        setField(term1779, term1779.getClass(), "astNodeLabel", null);
        setField(term1774, term1774.getClass(), "labeledClause", term1779);
        ArrayList term1772 = new ArrayList();
        ((ArrayList) term1772).add(term1774);
        HashMap term1782 = new HashMap();
        ArrayList term1793 = new ArrayList();
        ((ArrayList) term1793).add((Object)null);
        ((ArrayList) term1793).add((Object)null);
        term1771 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term1771, term1771.getClass(), "allRules", term1772);
        setField(term1771, term1771.getClass(), "ruleNameWithPrecedenceToRule", term1782);
        setField(term1771, term1771.getClass(), "allClauses", term1793);
        Object term1813 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1813, term1813.getClass(), "ruleName", null);
        setIntField(term1813, term1813.getClass(), "precedence", 97029295);
        setField(term1813, term1813.getClass(), "associativity", enum6);
        setField(term1813, term1813.getClass(), "labeledClause", null);
        ArrayList term1811 = new ArrayList();
        ((ArrayList) term1811).add(term1813);
        HashMap term1817 = new HashMap();
        ArrayList term1825 = new ArrayList();
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        ((ArrayList) term1825).add((Object)null);
        term1809 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term1810 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term1841 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1843 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term1809, term1809.getClass(), "memoTable", null);
        setField(term1810, term1810.getClass(), "allRules", term1811);
        setField(term1810, term1810.getClass(), "ruleNameWithPrecedenceToRule", term1817);
        setField(term1810, term1810.getClass(), "allClauses", term1825);
        setField(term1809, term1809.getClass(), "grammar", term1810);
        setField(term1809, term1809.getClass(), "input", "JUmudUmaaV");
        setIntField(term1841, term1841.getClass(), "value", 568599855);
        setField(term1809, term1809.getClass(), "numMatchObjectsCreated", term1841);
        setIntField(term1843, term1843.getClass(), "value", 1162663216);
        setField(term1809, term1809.getClass(), "numMatchObjectsMemoized", term1843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Grammar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[2];
        args[0] = "tPlsykYBqO";
        args[1] = term1809;
        callMethod(klass, "getNonOverlappingMatches", argTypes, term1771, args);
    }

};


