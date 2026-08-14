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
import java.lang.Integer;

public class SingleSimpleMovingAverageStrategy_Builder_offset_10632283089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;
     Object term1998;

    public SingleSimpleMovingAverageStrategy_Builder_offset_10632283089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1995 = newInstance(Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder"));
        setField(term1995, term1995.getClass(), "ts", null);
        setIntField(term1995, term1995.getClass(), "length", 0);
        setField(term1995, term1995.getClass(), "source", null);
        setIntField(term1995, term1995.getClass(), "offset", 0);
        setField(term1995, term1995.getClass(), "ps", null);
        term1998 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1998;
        callMethod(klass, "offset", argTypes, term1995, args);
    }

};


