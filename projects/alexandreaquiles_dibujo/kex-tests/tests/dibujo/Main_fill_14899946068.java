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

public class Main_fill_14899946068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;
     Object term1384;
     Object term1386;

    public Main_fill_14899946068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = newInstance(Class.forName("dibujo.Main"));
        setIntField(term1381, term1381.getClass(), "canvasWidth", 0);
        setIntField(term1381, term1381.getClass(), "canvasHeight", 0);
        setField(term1381, term1381.getClass(), "canvasPositions", null);
        term1384 = new Integer(0);
        term1386 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Main");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 0).getClass();
        argTypes[3] = Class.forName("dibujo.Position");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.Set");
        Object[] args = new Object[6];
        args[0] = term1384;
        args[1] = term1386;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "fill", argTypes, term1381, args);
    }

};


