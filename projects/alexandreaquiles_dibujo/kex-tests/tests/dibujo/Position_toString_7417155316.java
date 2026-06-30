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

public class Position_toString_7417155316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1526;

    public Position_toString_7417155316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1526 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term1526, term1526.getClass(), "x", -481533957);
        setIntField(term1526, term1526.getClass(), "y", 1240914516);
        setBooleanField(term1526, term1526.getClass(), "filled", true);
        setField(term1526, term1526.getClass(), "color", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1526, args);
    }

};


