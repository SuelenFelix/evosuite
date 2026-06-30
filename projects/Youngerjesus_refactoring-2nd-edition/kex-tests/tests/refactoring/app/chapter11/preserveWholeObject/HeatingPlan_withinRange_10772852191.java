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
import java.lang.Object;

public class HeatingPlan_withinRange_10772852191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term15;

    public HeatingPlan_withinRange_10772852191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.HeatingPlan"));
        Object term12 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Range"));
        setIntField(term12, term12.getClass(), "low", -1922583790);
        setIntField(term12, term12.getClass(), "high", -616727354);
        setField(term11, term11.getClass(), "temperatureRange", term12);
        term15 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Range"));
        setIntField(term15, term15.getClass(), "low", -1955890973);
        setIntField(term15, term15.getClass(), "high", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.preserveWholeObject.HeatingPlan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter11.preserveWholeObject.Range");
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "withinRange", argTypes, term11, args);
    }

};


