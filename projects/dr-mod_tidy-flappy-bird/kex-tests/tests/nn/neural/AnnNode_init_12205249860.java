package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class AnnNode_init_12205249860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum7;
     Object term1051;
     Object term1053;

    public AnnNode_init_12205249860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1056 = Class.forName((String) "nn.neural.AnnType");
        Field term1055 = ((Class) term1056).getDeclaredField((String) "OUTPUT");
        ((Field) term1055).setAccessible(true);
        enum7 = ((Field) term1055).get((Object) null);
        term1051 = new Integer(458147407);
        term1053 = new Double(0.25937345430928016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.neural.AnnType");
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = enum7;
        args[1] = term1051;
        args[2] = term1053;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


