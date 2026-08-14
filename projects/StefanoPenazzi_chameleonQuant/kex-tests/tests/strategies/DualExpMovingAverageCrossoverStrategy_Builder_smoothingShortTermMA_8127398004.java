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

public class DualExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_8127398004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11654;
     Object term11671;

    public DualExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_8127398004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11654 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11654, term11654.getClass(), "ts", null);
        setIntField(term11654, term11654.getClass(), "lengthStma", -1692331299);
        setIntField(term11654, term11654.getClass(), "lengthLtma", 479531250);
        setField(term11654, term11654.getClass(), "source", "yVMkkQhvmN");
        setDoubleField(term11654, term11654.getClass(), "smoothingStma", 0.5329919447422633);
        setDoubleField(term11654, term11654.getClass(), "smoothingLtma", 0.7046974927834232);
        setField(term11654, term11654.getClass(), "ps", null);
        term11671 = new Double(0.6896952303224777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11671;
        callMethod(klass, "smoothingShortTermMA", argTypes, term11654, args);
    }

};


