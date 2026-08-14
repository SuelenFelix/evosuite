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
import java.util.HashMap;

public class OneOrMore_match_12241167982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;
     Object term2312;
     Object term2350;

    public OneOrMore_match_12241167982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2274 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2274, term2274.getClass(), "ruleName", null);
        setIntField(term2274, term2274.getClass(), "precedence", 0);
        setField(term2274, term2274.getClass(), "associativity", null);
        setField(term2274, term2274.getClass(), "labeledClause", null);
        Object term2276 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2276, term2276.getClass(), "ruleName", null);
        setIntField(term2276, term2276.getClass(), "precedence", 0);
        setField(term2276, term2276.getClass(), "associativity", null);
        setField(term2276, term2276.getClass(), "labeledClause", null);
        Object term2278 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2278, term2278.getClass(), "ruleName", null);
        setIntField(term2278, term2278.getClass(), "precedence", 0);
        setField(term2278, term2278.getClass(), "associativity", null);
        setField(term2278, term2278.getClass(), "labeledClause", null);
        ArrayList term2272 = new ArrayList();
        ((ArrayList) term2272).add(term2274);
        ((ArrayList) term2272).add(term2276);
        ((ArrayList) term2272).add(term2278);
        ArrayList term2282 = new ArrayList();
        ((ArrayList) term2282).add((Object)null);
        ((ArrayList) term2282).add((Object)null);
        ((ArrayList) term2282).add((Object)null);
        ((ArrayList) term2282).add((Object)null);
        ((ArrayList) term2282).add((Object)null);
        term2165 = newInstance(Class.forName("pikaparser.clause.nonterminal.OneOrMore"));
        Object[] term2166 = (Object[]) newArray("pikaparser.ast.LabeledClause", 9);
        Object term2167 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2180 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2193 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2206 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2219 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2232 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2245 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2258 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2271 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2167, term2167.getClass(), "clause", null);
        setField(term2167, term2167.getClass(), "astNodeLabel", "oVgzLbrsFr");
        setElement(term2166, 0, term2167);
        setField(term2180, term2180.getClass(), "clause", null);
        setField(term2180, term2180.getClass(), "astNodeLabel", "vQVyKLdtaz");
        setElement(term2166, 1, term2180);
        setField(term2193, term2193.getClass(), "clause", null);
        setField(term2193, term2193.getClass(), "astNodeLabel", "OWKQODBLzb");
        setElement(term2166, 2, term2193);
        setField(term2206, term2206.getClass(), "clause", null);
        setField(term2206, term2206.getClass(), "astNodeLabel", "wGmYcqUkgE");
        setElement(term2166, 3, term2206);
        setField(term2219, term2219.getClass(), "clause", null);
        setField(term2219, term2219.getClass(), "astNodeLabel", "idgaQsnJpQ");
        setElement(term2166, 4, term2219);
        setField(term2232, term2232.getClass(), "clause", null);
        setField(term2232, term2232.getClass(), "astNodeLabel", "VgZnGoIFwQ");
        setElement(term2166, 5, term2232);
        setField(term2245, term2245.getClass(), "clause", null);
        setField(term2245, term2245.getClass(), "astNodeLabel", "jUbSRrkrYZ");
        setElement(term2166, 6, term2245);
        setField(term2258, term2258.getClass(), "clause", null);
        setField(term2258, term2258.getClass(), "astNodeLabel", "bWWfajKbEX");
        setElement(term2166, 7, term2258);
        setField(term2271, term2271.getClass(), "clause", null);
        setField(term2271, term2271.getClass(), "astNodeLabel", null);
        setElement(term2166, 8, term2271);
        setField(term2165, term2165.getClass(), "labeledSubClauses", term2166);
        setField(term2165, term2165.getClass(), "rules", term2272);
        setField(term2165, term2165.getClass(), "seedParentClauses", term2282);
        setBooleanField(term2165, term2165.getClass(), "canMatchZeroChars", true);
        setIntField(term2165, term2165.getClass(), "clauseIdx", -1087774327);
        setField(term2165, term2165.getClass(), "toStringCached", "cAPeiZHKGJ");
        setField(term2165, term2165.getClass(), "toStringWithRuleNameCached", "LvJFtLBaxj");
        Object term2316 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2316, term2316.getClass(), "ruleName", null);
        setIntField(term2316, term2316.getClass(), "precedence", 579005622);
        setField(term2316, term2316.getClass(), "associativity", null);
        setField(term2316, term2316.getClass(), "labeledClause", null);
        Object term2318 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term2318, term2318.getClass(), "ruleName", null);
        setIntField(term2318, term2318.getClass(), "precedence", -14890619);
        setField(term2318, term2318.getClass(), "associativity", null);
        setField(term2318, term2318.getClass(), "labeledClause", null);
        ArrayList term2314 = new ArrayList();
        ((ArrayList) term2314).add(term2316);
        ((ArrayList) term2314).add(term2318);
        HashMap term2322 = new HashMap();
        ArrayList term2330 = new ArrayList();
        ((ArrayList) term2330).add((Object)null);
        ((ArrayList) term2330).add((Object)null);
        ((ArrayList) term2330).add((Object)null);
        ((ArrayList) term2330).add((Object)null);
        ((ArrayList) term2330).add((Object)null);
        ((ArrayList) term2330).add((Object)null);
        term2312 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term2313 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term2346 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term2348 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term2312, term2312.getClass(), "memoTable", null);
        setField(term2313, term2313.getClass(), "allRules", term2314);
        setField(term2313, term2313.getClass(), "ruleNameWithPrecedenceToRule", term2322);
        setField(term2313, term2313.getClass(), "allClauses", term2330);
        setField(term2312, term2312.getClass(), "grammar", term2313);
        setField(term2312, term2312.getClass(), "input", "swZVeJAxjt");
        setIntField(term2346, term2346.getClass(), "value", 1484323161);
        setField(term2312, term2312.getClass(), "numMatchObjectsCreated", term2346);
        setIntField(term2348, term2348.getClass(), "value", 391863371);
        setField(term2312, term2312.getClass(), "numMatchObjectsMemoized", term2348);
        term2350 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term2350, term2350.getClass(), "clause", null);
        setIntField(term2350, term2350.getClass(), "startPos", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.OneOrMore");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term2312;
        args[1] = term2350;
        args[2] = "xOcJIiQQDu";
        callMethod(klass, "match", argTypes, term2165, args);
    }

};


