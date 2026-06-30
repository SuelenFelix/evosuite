package dibujo;

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
import static dibujo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Position_changeColor_61165903229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1926;

    public Position_changeColor_61165903229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1926 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term1926, term1926.getClass(), "x", 0);
        setIntField(term1926, term1926.getClass(), "y", 0);
        setBooleanField(term1926, term1926.getClass(), "filled", false);
        setField(term1926, term1926.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "changeColor", argTypes, term1926, args);
    }

};


