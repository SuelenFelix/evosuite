package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MemoTable_getNonOverlappingMatches_14989003108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public MemoTable_getNonOverlappingMatches_14989003108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term858 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term858, term858.getClass(), "ruleName", null);
        setIntField(term858, term858.getClass(), "precedence", -1565502840);
        setField(term858, term858.getClass(), "associativity", null);
        setField(term858, term858.getClass(), "labeledClause", null);
        ArrayList term856 = new ArrayList();
        ((ArrayList) term856).add(term858);
        HashMap term862 = new HashMap();
        ArrayList term870 = new ArrayList();
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        ((ArrayList) term870).add((Object)null);
        term854 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term855 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term886 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term888 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term854, term854.getClass(), "memoTable", null);
        setField(term855, term855.getClass(), "allRules", term856);
        setField(term855, term855.getClass(), "ruleNameWithPrecedenceToRule", term862);
        setField(term855, term855.getClass(), "allClauses", term870);
        setField(term854, term854.getClass(), "grammar", term855);
        setField(term854, term854.getClass(), "input", "TJmVBGfTML");
        setIntField(term886, term886.getClass(), "value", 1134449235);
        setField(term854, term854.getClass(), "numMatchObjectsCreated", term886);
        setIntField(term888, term888.getClass(), "value", -883034806);
        setField(term854, term854.getClass(), "numMatchObjectsMemoized", term888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNonOverlappingMatches", argTypes, term854, args);
    }

};


