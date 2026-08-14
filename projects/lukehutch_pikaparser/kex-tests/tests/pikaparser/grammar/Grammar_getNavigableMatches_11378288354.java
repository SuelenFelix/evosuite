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

public class Grammar_getNavigableMatches_11378288354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2072;
     Object term2120;

    public Grammar_getNavigableMatches_11378288354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2167 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2166 = ((Class) term2167).getDeclaredField((String) "LEFT");
        ((Field) term2166).setAccessible(true);
        Object enum7 = ((Field) term2166).get((Object) null);
        Object term2075 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2080 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2075, term2075.getClass(), "ruleName", "");
        setIntField(term2075, term2075.getClass(), "precedence", -2095575670);
        setField(term2075, term2075.getClass(), "associativity", enum7);
        setField(term2080, term2080.getClass(), "clause", null);
        setField(term2080, term2080.getClass(), "astNodeLabel", null);
        setField(term2075, term2075.getClass(), "labeledClause", term2080);
        Class<? extends Object> term2371 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2370 = ((Class) term2371).getDeclaredField((String) "RIGHT");
        ((Field) term2370).setAccessible(true);
        Object enum8 = ((Field) term2370).get((Object) null);
        Object term2081 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2086 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2081, term2081.getClass(), "ruleName", "");
        setIntField(term2081, term2081.getClass(), "precedence", 1225272962);
        setField(term2081, term2081.getClass(), "associativity", enum8);
        setField(term2086, term2086.getClass(), "clause", null);
        setField(term2086, term2086.getClass(), "astNodeLabel", null);
        setField(term2081, term2081.getClass(), "labeledClause", term2086);
        Object term2087 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2090 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2087, term2087.getClass(), "ruleName", "");
        setIntField(term2087, term2087.getClass(), "precedence", 1324040357);
        setField(term2087, term2087.getClass(), "associativity", enum8);
        setField(term2090, term2090.getClass(), "clause", null);
        setField(term2090, term2090.getClass(), "astNodeLabel", null);
        setField(term2087, term2087.getClass(), "labeledClause", term2090);
        ArrayList term2073 = new ArrayList();
        ((ArrayList) term2073).add(term2075);
        ((ArrayList) term2073).add(term2081);
        ((ArrayList) term2073).add(term2087);
        HashMap term2093 = new HashMap();
        ArrayList term2104 = new ArrayList();
        ((ArrayList) term2104).add((Object)null);
        ((ArrayList) term2104).add((Object)null);
        ((ArrayList) term2104).add((Object)null);
        ((ArrayList) term2104).add((Object)null);
        ((ArrayList) term2104).add((Object)null);
        term2072 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term2072, term2072.getClass(), "allRules", term2073);
        setField(term2072, term2072.getClass(), "ruleNameWithPrecedenceToRule", term2093);
        setField(term2072, term2072.getClass(), "allClauses", term2104);
        Object term2124 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2124, term2124.getClass(), "ruleName", null);
        setIntField(term2124, term2124.getClass(), "precedence", -1465035361);
        setField(term2124, term2124.getClass(), "associativity", enum7);
        setField(term2124, term2124.getClass(), "labeledClause", null);
        Object term2126 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2126, term2126.getClass(), "ruleName", null);
        setIntField(term2126, term2126.getClass(), "precedence", 1090617576);
        setField(term2126, term2126.getClass(), "associativity", enum8);
        setField(term2126, term2126.getClass(), "labeledClause", null);
        Object term2128 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2128, term2128.getClass(), "ruleName", null);
        setIntField(term2128, term2128.getClass(), "precedence", -1547384488);
        setField(term2128, term2128.getClass(), "associativity", enum8);
        setField(term2128, term2128.getClass(), "labeledClause", null);
        Object term2130 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2130, term2130.getClass(), "ruleName", null);
        setIntField(term2130, term2130.getClass(), "precedence", 1442160736);
        setField(term2130, term2130.getClass(), "associativity", enum8);
        setField(term2130, term2130.getClass(), "labeledClause", null);
        Object term2132 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2132, term2132.getClass(), "ruleName", null);
        setIntField(term2132, term2132.getClass(), "precedence", 1114000454);
        setField(term2132, term2132.getClass(), "associativity", enum8);
        setField(term2132, term2132.getClass(), "labeledClause", null);
        Object term2134 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2134, term2134.getClass(), "ruleName", null);
        setIntField(term2134, term2134.getClass(), "precedence", -556405712);
        setField(term2134, term2134.getClass(), "associativity", enum8);
        setField(term2134, term2134.getClass(), "labeledClause", null);
        ArrayList term2122 = new ArrayList();
        ((ArrayList) term2122).add(term2124);
        ((ArrayList) term2122).add(term2126);
        ((ArrayList) term2122).add(term2128);
        ((ArrayList) term2122).add(term2130);
        ((ArrayList) term2122).add(term2132);
        ((ArrayList) term2122).add(term2134);
        HashMap term2138 = new HashMap();
        ArrayList term2146 = new ArrayList();
        ((ArrayList) term2146).add((Object)null);
        ((ArrayList) term2146).add((Object)null);
        term2120 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term2121 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term2162 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term2164 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term2120, term2120.getClass(), "memoTable", null);
        setField(term2121, term2121.getClass(), "allRules", term2122);
        setField(term2121, term2121.getClass(), "ruleNameWithPrecedenceToRule", term2138);
        setField(term2121, term2121.getClass(), "allClauses", term2146);
        setField(term2120, term2120.getClass(), "grammar", term2121);
        setField(term2120, term2120.getClass(), "input", "xOcJIiQQDu");
        setIntField(term2162, term2162.getClass(), "value", 1484323161);
        setField(term2120, term2120.getClass(), "numMatchObjectsCreated", term2162);
        setIntField(term2164, term2164.getClass(), "value", 391863371);
        setField(term2120, term2120.getClass(), "numMatchObjectsMemoized", term2164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Grammar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[2];
        args[0] = "jUbSRrkrYZ";
        args[1] = term2120;
        callMethod(klass, "getNavigableMatches", argTypes, term2072, args);
    }

};


