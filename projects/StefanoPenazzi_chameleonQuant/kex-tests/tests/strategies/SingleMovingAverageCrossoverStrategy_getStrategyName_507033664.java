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

public class SingleMovingAverageCrossoverStrategy_getStrategyName_507033664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8440;

    public SingleMovingAverageCrossoverStrategy_getStrategyName_507033664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8440 = newInstance(Class.forName("strategies.SingleMovingAverageCrossoverStrategy"));
        setField(term8440, term8440.getClass(), "itsRef", null);
        setField(term8440, term8440.getClass(), "ma", null);
        setField(term8440, term8440.getClass(), "source", null);
        setField(term8440, term8440.getClass(), "positions", null);
        setField(term8440, term8440.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStrategyName", argTypes, term8440, args);
    }

};


