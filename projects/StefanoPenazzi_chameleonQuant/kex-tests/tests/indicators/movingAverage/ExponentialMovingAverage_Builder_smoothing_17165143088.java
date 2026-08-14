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
import java.lang.Double;

public class ExponentialMovingAverage_Builder_smoothing_17165143088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;
     Object term550;

    public ExponentialMovingAverage_Builder_smoothing_17165143088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder"));
        setField(term547, term547.getClass(), "ts", null);
        setIntField(term547, term547.getClass(), "length", 0);
        setField(term547, term547.getClass(), "source", null);
        setDoubleField(term547, term547.getClass(), "smoothing", 0.0);
        term550 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.ExponentialMovingAverage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term550;
        callMethod(klass, "smoothing", argTypes, term547, args);
    }

};


