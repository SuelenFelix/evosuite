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
import java.lang.Integer;

public class ExponentialMovingAverage_Builder_length_21193690816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;
     Object term542;

    public ExponentialMovingAverage_Builder_length_21193690816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539 = newInstance(Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder"));
        setField(term539, term539.getClass(), "ts", null);
        setIntField(term539, term539.getClass(), "length", 0);
        setField(term539, term539.getClass(), "source", null);
        setDoubleField(term539, term539.getClass(), "smoothing", 0.0);
        term542 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term542;
        callMethod(klass, "length", argTypes, term539, args);
    }

};


