package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TripleExpMovingAverageCrossoverStrategy_Builder_source_8704018315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9879;

    public TripleExpMovingAverageCrossoverStrategy_Builder_source_8704018315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9879 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9879, term9879.getClass(), "ts", null);
        setIntField(term9879, term9879.getClass(), "lengthStma", 0);
        setIntField(term9879, term9879.getClass(), "lengthMtma", 0);
        setIntField(term9879, term9879.getClass(), "lengthLtma", 0);
        setField(term9879, term9879.getClass(), "source", null);
        setDoubleField(term9879, term9879.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9879, term9879.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9879, term9879.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9879, term9879.getClass(), "targetRange", 0.0);
        setField(term9879, term9879.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "source", argTypes, term9879, args);
    }

};


