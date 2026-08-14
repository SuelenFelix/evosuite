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

public class MemoTable_getAllNavigableMatches_2389996212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term946;

    public MemoTable_getAllNavigableMatches_2389996212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term946 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        setField(term946, term946.getClass(), "memoTable", null);
        setField(term946, term946.getClass(), "grammar", null);
        setField(term946, term946.getClass(), "input", null);
        setField(term946, term946.getClass(), "numMatchObjectsCreated", null);
        setField(term946, term946.getClass(), "numMatchObjectsMemoized", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNavigableMatches", argTypes, term946, args);
    }

};


