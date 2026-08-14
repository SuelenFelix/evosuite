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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_build_2258873387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11465;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_build_2258873387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11465 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11465, term11465.getClass(), "ts", null);
        setIntField(term11465, term11465.getClass(), "lengthStma", 388157121);
        setIntField(term11465, term11465.getClass(), "lengthLtma", 1684998508);
        setField(term11465, term11465.getClass(), "source", "wfaXBpWAUH");
        setIntField(term11465, term11465.getClass(), "offsetStma", -1476644457);
        setIntField(term11465, term11465.getClass(), "offsetLtma", 1270666529);
        setField(term11465, term11465.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11465, args);
    }

};


