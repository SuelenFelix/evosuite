package utg;

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
import static utg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Version_getDeprecateTime_81391551610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;

    public Version_getDeprecateTime_81391551610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("utg.Version"));
        setIntField(term163, term163.getClass(), "major", 0);
        setIntField(term163, term163.getClass(), "minor", 0);
        setIntField(term163, term163.getClass(), "patch", 0);
        setField(term163, term163.getClass(), "deprecateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeprecateTime", argTypes, term163, args);
    }

};


