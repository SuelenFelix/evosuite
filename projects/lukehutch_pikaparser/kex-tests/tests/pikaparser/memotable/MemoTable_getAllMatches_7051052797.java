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

public class MemoTable_getAllMatches_7051052797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;

    public MemoTable_getAllMatches_7051052797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term812 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term812, term812.getClass(), "ruleName", null);
        setIntField(term812, term812.getClass(), "precedence", 1072005683);
        setField(term812, term812.getClass(), "associativity", null);
        setField(term812, term812.getClass(), "labeledClause", null);
        ArrayList term810 = new ArrayList();
        ((ArrayList) term810).add(term812);
        HashMap term816 = new HashMap();
        ArrayList term824 = new ArrayList();
        ((ArrayList) term824).add((Object)null);
        ((ArrayList) term824).add((Object)null);
        ((ArrayList) term824).add((Object)null);
        ((ArrayList) term824).add((Object)null);
        ((ArrayList) term824).add((Object)null);
        term808 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term809 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term840 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term842 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term808, term808.getClass(), "memoTable", null);
        setField(term809, term809.getClass(), "allRules", term810);
        setField(term809, term809.getClass(), "ruleNameWithPrecedenceToRule", term816);
        setField(term809, term809.getClass(), "allClauses", term824);
        setField(term808, term808.getClass(), "grammar", term809);
        setField(term808, term808.getClass(), "input", "eqJfYWRaEL");
        setIntField(term840, term840.getClass(), "value", 1725571209);
        setField(term808, term808.getClass(), "numMatchObjectsCreated", term840);
        setIntField(term842, term842.getClass(), "value", -522618178);
        setField(term808, term808.getClass(), "numMatchObjectsMemoized", term842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAllMatches", argTypes, term808, args);
    }

};


