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

public class SingleSimpleMovingAverageStrategy_Builder_length_5393527931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;
     Object term1851;

    public SingleSimpleMovingAverageStrategy_Builder_length_5393527931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = newInstance(Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder"));
        setField(term1836, term1836.getClass(), "ts", null);
        setIntField(term1836, term1836.getClass(), "length", 1135664017);
        setField(term1836, term1836.getClass(), "source", "OclPbYPkcH");
        setIntField(term1836, term1836.getClass(), "offset", 590364439);
        setField(term1836, term1836.getClass(), "ps", null);
        term1851 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1851;
        callMethod(klass, "length", argTypes, term1836, args);
    }

};


