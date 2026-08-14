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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_7288696864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11380;
     Object term11397;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_7288696864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11380 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11380, term11380.getClass(), "ts", null);
        setIntField(term11380, term11380.getClass(), "lengthStma", 548228925);
        setIntField(term11380, term11380.getClass(), "lengthLtma", -749861210);
        setField(term11380, term11380.getClass(), "source", "EYtfuJaxiM");
        setIntField(term11380, term11380.getClass(), "offsetStma", 1694224101);
        setIntField(term11380, term11380.getClass(), "offsetLtma", 937859191);
        setField(term11380, term11380.getClass(), "ps", null);
        term11397 = new Integer(-916584829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11397;
        callMethod(klass, "offsetShortTermMA", argTypes, term11380, args);
    }

};


