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
import java.lang.Integer;

public class Main_fill_17296317047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374;
     Object term1377;
     Object term1379;

    public Main_fill_17296317047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1374 = newInstance(Class.forName("dibujo.Main"));
        setIntField(term1374, term1374.getClass(), "canvasWidth", 0);
        setIntField(term1374, term1374.getClass(), "canvasHeight", 0);
        setField(term1374, term1374.getClass(), "canvasPositions", null);
        term1377 = new Integer(0);
        term1379 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Main");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 0).getClass();
        argTypes[3] = Class.forName("dibujo.Position");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1377;
        args[1] = term1379;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "fill", argTypes, term1374, args);
    }

};


