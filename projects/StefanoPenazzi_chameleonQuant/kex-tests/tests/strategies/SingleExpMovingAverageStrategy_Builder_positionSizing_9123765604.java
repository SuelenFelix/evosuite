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

public class SingleExpMovingAverageStrategy_Builder_positionSizing_9123765604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;

    public SingleExpMovingAverageStrategy_Builder_positionSizing_9123765604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term102, term102.getClass(), "ts", null);
        setIntField(term102, term102.getClass(), "length", -1922583790);
        setField(term102, term102.getClass(), "source", "jJCZpVmanW");
        setDoubleField(term102, term102.getClass(), "smoothing", 0.28570734989730284);
        setField(term102, term102.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term102, args);
    }

};


