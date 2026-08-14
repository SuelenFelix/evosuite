package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class Node_init_12474774561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum73;
     Object term11328;
     Object term11330;

    public Node_init_12474774561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11333 = Class.forName((String) "nn.model.Type");
        Field term11332 = ((Class) term11333).getDeclaredField((String) "SENSOR");
        ((Field) term11332).setAccessible(true);
        enum73 = ((Field) term11332).get((Object) null);
        term11328 = new Integer(-1457812682);
        term11330 = new Double(0.8391459612166138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.Type");
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = enum73;
        args[1] = term11328;
        args[2] = term11330;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


