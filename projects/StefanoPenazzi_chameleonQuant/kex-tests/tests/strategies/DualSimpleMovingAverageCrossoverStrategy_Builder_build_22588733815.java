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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_build_22588733815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11530;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_build_22588733815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11530 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11530, term11530.getClass(), "ts", null);
        setIntField(term11530, term11530.getClass(), "lengthStma", 0);
        setIntField(term11530, term11530.getClass(), "lengthLtma", 0);
        setField(term11530, term11530.getClass(), "source", null);
        setIntField(term11530, term11530.getClass(), "offsetStma", 0);
        setIntField(term11530, term11530.getClass(), "offsetLtma", 0);
        setField(term11530, term11530.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11530, args);
    }

};


