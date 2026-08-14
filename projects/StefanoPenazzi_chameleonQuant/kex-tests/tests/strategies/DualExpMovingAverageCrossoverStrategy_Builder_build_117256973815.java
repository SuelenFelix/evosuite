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

public class DualExpMovingAverageCrossoverStrategy_Builder_build_117256973815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11804;

    public DualExpMovingAverageCrossoverStrategy_Builder_build_117256973815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11804 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11804, term11804.getClass(), "ts", null);
        setIntField(term11804, term11804.getClass(), "lengthStma", 0);
        setIntField(term11804, term11804.getClass(), "lengthLtma", 0);
        setField(term11804, term11804.getClass(), "source", null);
        setDoubleField(term11804, term11804.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11804, term11804.getClass(), "smoothingLtma", 0.0);
        setField(term11804, term11804.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11804, args);
    }

};


