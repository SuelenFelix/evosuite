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

public class Position_getColor_5302495469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1604;

    public Position_getColor_5302495469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1604 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term1604, term1604.getClass(), "x", 1114000454);
        setIntField(term1604, term1604.getClass(), "y", -556405712);
        setBooleanField(term1604, term1604.getClass(), "filled", true);
        setField(term1604, term1604.getClass(), "color", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term1604, args);
    }

};


