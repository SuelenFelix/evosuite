package software.pando.crypto.nacl;

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
import static software.pando.crypto.nacl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Subtle_scalarMultiplication_18804736241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9849;
     Object term9858;

    public Subtle_scalarMultiplication_18804736241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9849 = (byte[]) newByteArray(8);
        setByteElement(term9849, 0, (byte) -57);
        setByteElement(term9849, 1, (byte) -68);
        setByteElement(term9849, 2, (byte) 111);
        setByteElement(term9849, 3, (byte) -38);
        setByteElement(term9849, 4, (byte) 52);
        setByteElement(term9849, 5, (byte) 42);
        setByteElement(term9849, 6, (byte) -4);
        setByteElement(term9849, 7, (byte) 70);
        term9858 = (byte[]) newByteArray(2);
        setByteElement(term9858, 1, (byte) -79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9849;
        args[1] = term9858;
        callMethod(klass, "scalarMultiplication", argTypes, null, args);
    }

};


