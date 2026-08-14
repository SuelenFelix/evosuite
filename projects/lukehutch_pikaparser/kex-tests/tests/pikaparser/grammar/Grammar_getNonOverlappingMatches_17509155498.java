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

public class Grammar_getNonOverlappingMatches_17509155498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;

    public Grammar_getNonOverlappingMatches_17509155498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2599 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term2599, term2599.getClass(), "allRules", null);
        setField(term2599, term2599.getClass(), "ruleNameWithPrecedenceToRule", null);
        setField(term2599, term2599.getClass(), "allClauses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Grammar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getNonOverlappingMatches", argTypes, term2599, args);
    }

};


