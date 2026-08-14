package pikaparser.clause.nonterminal;

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
import static pikaparser.clause.nonterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class OneOrMore_determineWhetherCanMatchZeroChars_11584364201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1769;

    public OneOrMore_determineWhetherCanMatchZeroChars_11584364201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1939 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1938 = ((Class) term1939).getDeclaredField((String) "RIGHT");
        ((Field) term1938).setAccessible(true);
        Object enum5 = ((Field) term1938).get((Object) null);
        Object term1838 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1843 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1838, term1838.getClass(), "ruleName", "");
        setIntField(term1838, term1838.getClass(), "precedence", -203030934);
        setField(term1838, term1838.getClass(), "associativity", enum5);
        setField(term1843, term1843.getClass(), "clause", null);
        setField(term1843, term1843.getClass(), "astNodeLabel", null);
        setField(term1838, term1838.getClass(), "labeledClause", term1843);
        Object term1844 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1847 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1844, term1844.getClass(), "ruleName", "");
        setIntField(term1844, term1844.getClass(), "precedence", -1179120542);
        setField(term1844, term1844.getClass(), "associativity", enum5);
        setField(term1847, term1847.getClass(), "clause", null);
        setField(term1847, term1847.getClass(), "astNodeLabel", null);
        setField(term1844, term1844.getClass(), "labeledClause", term1847);
        Object term1848 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1851 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1848, term1848.getClass(), "ruleName", "");
        setIntField(term1848, term1848.getClass(), "precedence", -73683645);
        setField(term1848, term1848.getClass(), "associativity", enum5);
        setField(term1851, term1851.getClass(), "clause", null);
        setField(term1851, term1851.getClass(), "astNodeLabel", null);
        setField(term1848, term1848.getClass(), "labeledClause", term1851);
        Object term1852 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1855 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1852, term1852.getClass(), "ruleName", "");
        setIntField(term1852, term1852.getClass(), "precedence", -226514366);
        setField(term1852, term1852.getClass(), "associativity", enum5);
        setField(term1855, term1855.getClass(), "clause", null);
        setField(term1855, term1855.getClass(), "astNodeLabel", null);
        setField(term1852, term1852.getClass(), "labeledClause", term1855);
        ArrayList term1836 = new ArrayList();
        ((ArrayList) term1836).add(term1838);
        ((ArrayList) term1836).add(term1844);
        ((ArrayList) term1836).add(term1848);
        ((ArrayList) term1836).add(term1852);
        ArrayList term1858 = new ArrayList();
        ((ArrayList) term1858).add((Object)null);
        term1769 = newInstance(Class.forName("pikaparser.clause.nonterminal.OneOrMore"));
        Object[] term1770 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term1771 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term1784 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term1797 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term1810 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term1823 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1771, term1771.getClass(), "clause", null);
        setField(term1771, term1771.getClass(), "astNodeLabel", "eqJfYWRaEL");
        setElement(term1770, 0, term1771);
        setField(term1784, term1784.getClass(), "clause", null);
        setField(term1784, term1784.getClass(), "astNodeLabel", "fhkbdRViHi");
        setElement(term1770, 1, term1784);
        setField(term1797, term1797.getClass(), "clause", null);
        setField(term1797, term1797.getClass(), "astNodeLabel", "uWHnvSvaPl");
        setElement(term1770, 2, term1797);
        setField(term1810, term1810.getClass(), "clause", null);
        setField(term1810, term1810.getClass(), "astNodeLabel", "kBdSllIBVz");
        setElement(term1770, 3, term1810);
        setField(term1823, term1823.getClass(), "clause", null);
        setField(term1823, term1823.getClass(), "astNodeLabel", "TJmVBGfTML");
        setElement(term1770, 4, term1823);
        setField(term1769, term1769.getClass(), "labeledSubClauses", term1770);
        setField(term1769, term1769.getClass(), "rules", term1836);
        setField(term1769, term1769.getClass(), "seedParentClauses", term1858);
        setBooleanField(term1769, term1769.getClass(), "canMatchZeroChars", true);
        setIntField(term1769, term1769.getClass(), "clauseIdx", 1193880199);
        setField(term1769, term1769.getClass(), "toStringCached", "HqBOwkVqjD");
        setField(term1769, term1769.getClass(), "toStringWithRuleNameCached", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.OneOrMore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1769, args);
    }

};


