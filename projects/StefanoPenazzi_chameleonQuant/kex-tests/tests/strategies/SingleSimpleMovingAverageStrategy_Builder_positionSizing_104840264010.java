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

public class SingleSimpleMovingAverageStrategy_Builder_positionSizing_104840264010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000;

    public SingleSimpleMovingAverageStrategy_Builder_positionSizing_104840264010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000 = newInstance(Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder"));
        setField(term2000, term2000.getClass(), "ts", null);
        setIntField(term2000, term2000.getClass(), "length", 0);
        setField(term2000, term2000.getClass(), "source", null);
        setIntField(term2000, term2000.getClass(), "offset", 0);
        setField(term2000, term2000.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term2000, args);
    }

};


