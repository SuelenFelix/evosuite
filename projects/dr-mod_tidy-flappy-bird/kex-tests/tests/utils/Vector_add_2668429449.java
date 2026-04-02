package utils;

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
import static utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vector_add_2668429449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term51;

    public Vector_add_2668429449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term48, term48.getClass(), "x", 0.20144695F);
        setFloatField(term48, term48.getClass(), "y", 0.7031006F);
        term51 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term51, term51.getClass(), "x", 0.9431611F);
        setFloatField(term51, term51.getClass(), "y", 0.95272815F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("utils.Vector");
        argTypes[1] = Class.forName("utils.Vector");
        Object[] args = new Object[2];
        args[0] = term48;
        args[1] = term51;
        callMethod(klass, "add", argTypes, null, args);
    }

};


