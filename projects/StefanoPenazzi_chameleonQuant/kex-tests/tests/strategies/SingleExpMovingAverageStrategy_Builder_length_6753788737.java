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

public class SingleExpMovingAverageStrategy_Builder_length_6753788737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;
     Object term155;

    public SingleExpMovingAverageStrategy_Builder_length_6753788737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term152, term152.getClass(), "ts", null);
        setIntField(term152, term152.getClass(), "length", 0);
        setField(term152, term152.getClass(), "source", null);
        setDoubleField(term152, term152.getClass(), "smoothing", 0.0);
        setField(term152, term152.getClass(), "ps", null);
        term155 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term155;
        callMethod(klass, "length", argTypes, term152, args);
    }

};


