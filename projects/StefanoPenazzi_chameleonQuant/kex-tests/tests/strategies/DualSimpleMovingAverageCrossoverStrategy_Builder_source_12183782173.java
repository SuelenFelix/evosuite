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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_source_12183782173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11331;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_source_12183782173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11331 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11331, term11331.getClass(), "ts", null);
        setIntField(term11331, term11331.getClass(), "lengthStma", 318591690);
        setIntField(term11331, term11331.getClass(), "lengthLtma", -165587447);
        setField(term11331, term11331.getClass(), "source", "AKNapTAfmD");
        setIntField(term11331, term11331.getClass(), "offsetStma", -1347358701);
        setIntField(term11331, term11331.getClass(), "offsetLtma", 806595993);
        setField(term11331, term11331.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "source", argTypes, term11331, args);
    }

};


