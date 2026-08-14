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

public class DualExpMovingAverageCrossoverStrategy_Builder_source_6856307113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11605;

    public DualExpMovingAverageCrossoverStrategy_Builder_source_6856307113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11605 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11605, term11605.getClass(), "ts", null);
        setIntField(term11605, term11605.getClass(), "lengthStma", -1254072822);
        setIntField(term11605, term11605.getClass(), "lengthLtma", -1111249833);
        setField(term11605, term11605.getClass(), "source", "ZzIujlwVsw");
        setDoubleField(term11605, term11605.getClass(), "smoothingStma", 0.2440697646709713);
        setDoubleField(term11605, term11605.getClass(), "smoothingLtma", 0.7977455176064363);
        setField(term11605, term11605.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LWyEaeIyAo";
        callMethod(klass, "source", argTypes, term11605, args);
    }

};


