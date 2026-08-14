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

public class MemoTable_getAllNonOverlappingMatches_28814550313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947;

    public MemoTable_getAllNonOverlappingMatches_28814550313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        setField(term947, term947.getClass(), "memoTable", null);
        setField(term947, term947.getClass(), "grammar", null);
        setField(term947, term947.getClass(), "input", null);
        setField(term947, term947.getClass(), "numMatchObjectsCreated", null);
        setField(term947, term947.getClass(), "numMatchObjectsMemoized", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNonOverlappingMatches", argTypes, term947, args);
    }

};


