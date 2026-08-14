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

public class SimpleMovingAverage_Builder_offset_17328413243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term360;

    public SimpleMovingAverage_Builder_offset_17328413243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("indicators.movingAverage.SimpleMovingAverage$Builder"));
        setField(term345, term345.getClass(), "ts", null);
        setIntField(term345, term345.getClass(), "length", -244121226);
        setField(term345, term345.getClass(), "source", "MxlszYVzRf");
        setIntField(term345, term345.getClass(), "offset", -203030934);
        term360 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("indicators.movingAverage.SimpleMovingAverage$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term360;
        callMethod(klass, "offset", argTypes, term345, args);
    }

};


