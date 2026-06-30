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

public class Version_equals_62152401014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public Version_equals_62152401014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("utg.Version"));
        setIntField(term179, term179.getClass(), "major", 0);
        setIntField(term179, term179.getClass(), "minor", 0);
        setIntField(term179, term179.getClass(), "patch", 0);
        setField(term179, term179.getClass(), "deprecateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utg.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term179, args);
    }

};


