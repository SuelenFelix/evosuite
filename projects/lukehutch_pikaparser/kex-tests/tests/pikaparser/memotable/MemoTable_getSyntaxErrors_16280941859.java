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

public class MemoTable_getSyntaxErrors_16280941859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;
     Object term934;

    public MemoTable_getSyntaxErrors_16280941859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term902 = new ArrayList();
        HashMap term906 = new HashMap();
        ArrayList term914 = new ArrayList();
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        term900 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term901 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term930 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term932 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term900, term900.getClass(), "memoTable", null);
        setField(term901, term901.getClass(), "allRules", term902);
        setField(term901, term901.getClass(), "ruleNameWithPrecedenceToRule", term906);
        setField(term901, term901.getClass(), "allClauses", term914);
        setField(term900, term900.getClass(), "grammar", term901);
        setField(term900, term900.getClass(), "input", "whBvTVIIlC");
        setIntField(term930, term930.getClass(), "value", 1585847225);
        setField(term900, term900.getClass(), "numMatchObjectsCreated", term930);
        setIntField(term932, term932.getClass(), "value", 597278769);
        setField(term900, term900.getClass(), "numMatchObjectsMemoized", term932);
        term934 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term934;
        callMethod(klass, "getSyntaxErrors", argTypes, term900, args);
    }

};


