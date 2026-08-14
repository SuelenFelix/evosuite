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

public class SingleExpMovingAverageStrategy_Builder_smoothing_11344627803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term90;

    public SingleExpMovingAverageStrategy_Builder_smoothing_11344627803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term75, term75.getClass(), "ts", null);
        setIntField(term75, term75.getClass(), "length", 391863371);
        setField(term75, term75.getClass(), "source", "xxtlPwDYFs");
        setDoubleField(term75, term75.getClass(), "smoothing", 0.5523635872663106);
        setField(term75, term75.getClass(), "ps", null);
        term90 = new Double(0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "smoothing", argTypes, term75, args);
    }

};


