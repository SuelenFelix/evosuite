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

public class Node_init_2257284830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum72;
     Object term11229;

    public Node_init_2257284830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11232 = Class.forName((String) "nn.model.Type");
        Field term11231 = ((Class) term11232).getDeclaredField((String) "OUTPUT");
        ((Field) term11231).setAccessible(true);
        enum72 = ((Field) term11231).get((Object) null);
        term11229 = new Integer(1309545946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Type");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum72;
        args[1] = term11229;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


