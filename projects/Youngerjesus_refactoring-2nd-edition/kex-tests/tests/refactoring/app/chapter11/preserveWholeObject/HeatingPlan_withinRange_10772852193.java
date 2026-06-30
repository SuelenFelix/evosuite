package refactoring.app.chapter11.preserveWholeObject;

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
import static refactoring.app.chapter11.preserveWholeObject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HeatingPlan_withinRange_10772852193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;

    public HeatingPlan_withinRange_10772852193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.HeatingPlan"));
        setField(term18, term18.getClass(), "temperatureRange", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.preserveWholeObject.HeatingPlan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter11.preserveWholeObject.Range");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withinRange", argTypes, term18, args);
    }

};


