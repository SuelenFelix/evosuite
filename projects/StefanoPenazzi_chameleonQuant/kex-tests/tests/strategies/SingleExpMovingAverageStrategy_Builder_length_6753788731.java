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

public class SingleExpMovingAverageStrategy_Builder_length_6753788731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;

    public SingleExpMovingAverageStrategy_Builder_length_6753788731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("strategies.SingleExpMovingAverageStrategy$Builder"));
        setField(term1, term1.getClass(), "ts", null);
        setIntField(term1, term1.getClass(), "length", 568599855);
        setField(term1, term1.getClass(), "source", "PAEBtnZtTD");
        setDoubleField(term1, term1.getClass(), "smoothing", 0.13238746331190498);
        setField(term1, term1.getClass(), "ps", null);
        term16 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16;
        callMethod(klass, "length", argTypes, term1, args);
    }

};


