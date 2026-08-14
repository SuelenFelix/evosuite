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

public class MemoTable_addMatch_149541668411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945;

    public MemoTable_addMatch_149541668411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        setField(term945, term945.getClass(), "memoTable", null);
        setField(term945, term945.getClass(), "grammar", null);
        setField(term945, term945.getClass(), "input", null);
        setField(term945, term945.getClass(), "numMatchObjectsCreated", null);
        setField(term945, term945.getClass(), "numMatchObjectsMemoized", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[1] = Class.forName("pikaparser.memotable.Match");
        argTypes[2] = Class.forName("java.util.PriorityQueue");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addMatch", argTypes, term945, args);
    }

};


