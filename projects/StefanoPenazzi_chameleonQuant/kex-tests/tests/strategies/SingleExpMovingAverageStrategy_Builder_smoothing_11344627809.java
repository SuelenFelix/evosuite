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
import java.lang.Double;

public class SingleExpMovingAverageStrategy_Builder_smoothing_11344627809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;
     Object term163;

    public SingleExpMovingAverageStrategy_Builder_smoothing_11344627809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term160, term160.getClass(), "ts", null);
        setIntField(term160, term160.getClass(), "length", 0);
        setField(term160, term160.getClass(), "source", null);
        setDoubleField(term160, term160.getClass(), "smoothing", 0.0);
        setField(term160, term160.getClass(), "ps", null);
        term163 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term163;
        callMethod(klass, "smoothing", argTypes, term160, args);
    }

};


