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

public class Position_changeColor_61165903210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1630;

    public Position_changeColor_61165903210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1630 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term1630, term1630.getClass(), "x", -1772434990);
        setIntField(term1630, term1630.getClass(), "y", -1845499264);
        setBooleanField(term1630, term1630.getClass(), "filled", true);
        setField(term1630, term1630.getClass(), "color", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "changeColor", argTypes, term1630, args);
    }

};


