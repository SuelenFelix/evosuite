package indicators.movingAverage;

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
import static indicators.movingAverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExponentialMovingAverage_Builder_source_18332693037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;

    public ExponentialMovingAverage_Builder_source_18332693037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = newInstance(Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder"));
        setField(term544, term544.getClass(), "ts", null);
        setIntField(term544, term544.getClass(), "length", 0);
        setField(term544, term544.getClass(), "source", null);
        setDoubleField(term544, term544.getClass(), "smoothing", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "source", argTypes, term544, args);
    }

};


