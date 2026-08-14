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

public class SingleSimpleMovingAverageStrategy_Builder_build_32002295411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003;

    public SingleSimpleMovingAverageStrategy_Builder_build_32002295411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2003 = newInstance(Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder"));
        setField(term2003, term2003.getClass(), "ts", null);
        setIntField(term2003, term2003.getClass(), "length", 0);
        setField(term2003, term2003.getClass(), "source", null);
        setIntField(term2003, term2003.getClass(), "offset", 0);
        setField(term2003, term2003.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2003, args);
    }

};


