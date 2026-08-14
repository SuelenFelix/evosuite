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

public class DualExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12011120099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11766;
     Object term11771;

    public DualExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12011120099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11766 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11766, term11766.getClass(), "ts", null);
        setIntField(term11766, term11766.getClass(), "lengthStma", 0);
        setIntField(term11766, term11766.getClass(), "lengthLtma", 0);
        setField(term11766, term11766.getClass(), "source", null);
        setDoubleField(term11766, term11766.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11766, term11766.getClass(), "smoothingLtma", 0.0);
        setField(term11766, term11766.getClass(), "ps", null);
        term11771 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11771;
        callMethod(klass, "lengthShortTermMA", argTypes, term11766, args);
    }

};


