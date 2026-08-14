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

public class SingleExpMovingAverageStrategy_Builder_build_12139193705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public SingleExpMovingAverageStrategy_Builder_build_12139193705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term127, term127.getClass(), "ts", null);
        setIntField(term127, term127.getClass(), "length", -616727354);
        setField(term127, term127.getClass(), "source", "EGtDIRbSSb");
        setDoubleField(term127, term127.getClass(), "smoothing", 0.40176586625454525);
        setField(term127, term127.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term127, args);
    }

};


