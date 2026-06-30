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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;

public class Connection_init_6279346412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2763;
     Object term2765;
     Object term2767;

    public Connection_init_6279346412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2763 = new Integer(0);
        term2765 = new Boolean(false);
        term2767 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("nn.model.Node");
        argTypes[1] = Class.forName("nn.model.Node");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = float.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term2763;
        args[3] = term2765;
        args[4] = term2767;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


