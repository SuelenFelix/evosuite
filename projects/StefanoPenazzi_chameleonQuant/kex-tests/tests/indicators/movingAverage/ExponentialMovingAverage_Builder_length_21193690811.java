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

public class ExponentialMovingAverage_Builder_length_21193690811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term428;

    public ExponentialMovingAverage_Builder_length_21193690811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413 = newInstance(Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder"));
        setField(term413, term413.getClass(), "ts", null);
        setIntField(term413, term413.getClass(), "length", 1193880199);
        setField(term413, term413.getClass(), "source", "oVcInYnLWB");
        setDoubleField(term413, term413.getClass(), "smoothing", 0.3455959125047594);
        term428 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term428;
        callMethod(klass, "length", argTypes, term413, args);
    }

};


