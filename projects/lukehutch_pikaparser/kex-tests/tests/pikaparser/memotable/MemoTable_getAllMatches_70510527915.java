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

public class MemoTable_getAllMatches_70510527915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public MemoTable_getAllMatches_70510527915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        setField(term949, term949.getClass(), "memoTable", null);
        setField(term949, term949.getClass(), "grammar", null);
        setField(term949, term949.getClass(), "input", null);
        setField(term949, term949.getClass(), "numMatchObjectsCreated", null);
        setField(term949, term949.getClass(), "numMatchObjectsMemoized", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAllMatches", argTypes, term949, args);
    }

};


