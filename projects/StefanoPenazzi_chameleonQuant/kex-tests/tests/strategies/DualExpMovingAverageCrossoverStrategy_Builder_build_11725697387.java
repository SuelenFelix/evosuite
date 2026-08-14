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

public class DualExpMovingAverageCrossoverStrategy_Builder_build_11725697387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11739;

    public DualExpMovingAverageCrossoverStrategy_Builder_build_11725697387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11739 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11739, term11739.getClass(), "ts", null);
        setIntField(term11739, term11739.getClass(), "lengthStma", -209654048);
        setIntField(term11739, term11739.getClass(), "lengthLtma", 477625804);
        setField(term11739, term11739.getClass(), "source", "GgZWSjxjyE");
        setDoubleField(term11739, term11739.getClass(), "smoothingStma", 0.9090793968999221);
        setDoubleField(term11739, term11739.getClass(), "smoothingLtma", 0.25997329921466494);
        setField(term11739, term11739.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11739, args);
    }

};


