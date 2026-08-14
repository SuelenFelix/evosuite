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

public class DualExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12011120091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11547;
     Object term11564;

    public DualExpMovingAverageCrossoverStrategy_Builder_lengthShortTermMA_12011120091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11547 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11547, term11547.getClass(), "ts", null);
        setIntField(term11547, term11547.getClass(), "lengthStma", -1146679443);
        setIntField(term11547, term11547.getClass(), "lengthLtma", -860131894);
        setField(term11547, term11547.getClass(), "source", "VMeAzAHwZj");
        setDoubleField(term11547, term11547.getClass(), "smoothingStma", 0.9485929668765458);
        setDoubleField(term11547, term11547.getClass(), "smoothingLtma", 0.5179319342588155);
        setField(term11547, term11547.getClass(), "ps", null);
        term11564 = new Integer(-1022990421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11564;
        callMethod(klass, "lengthShortTermMA", argTypes, term11547, args);
    }

};


