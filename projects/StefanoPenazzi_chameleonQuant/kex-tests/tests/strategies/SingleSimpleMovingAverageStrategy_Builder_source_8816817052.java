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

public class SingleSimpleMovingAverageStrategy_Builder_source_8816817052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;

    public SingleSimpleMovingAverageStrategy_Builder_source_8816817052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1863 = newInstance(Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder"));
        setField(term1863, term1863.getClass(), "ts", null);
        setIntField(term1863, term1863.getClass(), "length", -1275173084);
        setField(term1863, term1863.getClass(), "source", "IoAlmYsBwc");
        setIntField(term1863, term1863.getClass(), "offset", -244121226);
        setField(term1863, term1863.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "source", argTypes, term1863, args);
    }

};


