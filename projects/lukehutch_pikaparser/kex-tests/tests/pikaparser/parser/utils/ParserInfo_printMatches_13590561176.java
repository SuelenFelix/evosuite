package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class ParserInfo_printMatches_13590561176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;
     Object term3597;

    public ParserInfo_printMatches_13590561176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3565 = new ArrayList();
        HashMap term3569 = new HashMap();
        ArrayList term3577 = new ArrayList();
        ((ArrayList) term3577).add((Object)null);
        ((ArrayList) term3577).add((Object)null);
        ((ArrayList) term3577).add((Object)null);
        ((ArrayList) term3577).add((Object)null);
        ((ArrayList) term3577).add((Object)null);
        term3563 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3564 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3593 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3595 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3563, term3563.getClass(), "memoTable", null);
        setField(term3564, term3564.getClass(), "allRules", term3565);
        setField(term3564, term3564.getClass(), "ruleNameWithPrecedenceToRule", term3569);
        setField(term3564, term3564.getClass(), "allClauses", term3577);
        setField(term3563, term3563.getClass(), "grammar", term3564);
        setField(term3563, term3563.getClass(), "input", "cudZvLMQon");
        setIntField(term3593, term3593.getClass(), "value", -1922583790);
        setField(term3563, term3563.getClass(), "numMatchObjectsCreated", term3593);
        setIntField(term3595, term3595.getClass(), "value", -616727354);
        setField(term3563, term3563.getClass(), "numMatchObjectsMemoized", term3595);
        term3597 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3563;
        args[2] = term3597;
        callMethod(klass, "printMatches", argTypes, null, args);
    }

};


