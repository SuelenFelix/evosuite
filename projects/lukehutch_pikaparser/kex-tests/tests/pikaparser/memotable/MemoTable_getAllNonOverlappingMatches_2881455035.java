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

public class MemoTable_getAllNonOverlappingMatches_2881455035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public MemoTable_getAllNonOverlappingMatches_2881455035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term704 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term704, term704.getClass(), "ruleName", null);
        setIntField(term704, term704.getClass(), "precedence", -894662986);
        setField(term704, term704.getClass(), "associativity", null);
        setField(term704, term704.getClass(), "labeledClause", null);
        Object term706 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term706, term706.getClass(), "ruleName", null);
        setIntField(term706, term706.getClass(), "precedence", 304775596);
        setField(term706, term706.getClass(), "associativity", null);
        setField(term706, term706.getClass(), "labeledClause", null);
        ArrayList term702 = new ArrayList();
        ((ArrayList) term702).add(term704);
        ((ArrayList) term702).add(term706);
        HashMap term710 = new HashMap();
        ArrayList term718 = new ArrayList();
        ((ArrayList) term718).add((Object)null);
        ((ArrayList) term718).add((Object)null);
        term700 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term701 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term734 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term736 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term700, term700.getClass(), "memoTable", null);
        setField(term701, term701.getClass(), "allRules", term702);
        setField(term701, term701.getClass(), "ruleNameWithPrecedenceToRule", term710);
        setField(term701, term701.getClass(), "allClauses", term718);
        setField(term700, term700.getClass(), "grammar", term701);
        setField(term700, term700.getClass(), "input", "BndsHwAFMv");
        setIntField(term734, term734.getClass(), "value", -1955890973);
        setField(term700, term700.getClass(), "numMatchObjectsCreated", term734);
        setIntField(term736, term736.getClass(), "value", -2038273078);
        setField(term700, term700.getClass(), "numMatchObjectsMemoized", term736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNonOverlappingMatches", argTypes, term700, args);
    }

};


