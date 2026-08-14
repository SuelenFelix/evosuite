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
import java.lang.Double;

public class DualExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_81273980012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11785;
     Object term11790;

    public DualExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_81273980012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11785 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11785, term11785.getClass(), "ts", null);
        setIntField(term11785, term11785.getClass(), "lengthStma", 0);
        setIntField(term11785, term11785.getClass(), "lengthLtma", 0);
        setField(term11785, term11785.getClass(), "source", null);
        setDoubleField(term11785, term11785.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11785, term11785.getClass(), "smoothingLtma", 0.0);
        setField(term11785, term11785.getClass(), "ps", null);
        term11790 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11790;
        callMethod(klass, "smoothingShortTermMA", argTypes, term11785, args);
    }

};


