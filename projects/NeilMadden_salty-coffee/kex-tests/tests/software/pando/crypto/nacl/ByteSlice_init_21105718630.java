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
import java.lang.Integer;

public class ByteSlice_init_21105718630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;
     Object term501;
     Object term503;

    public ByteSlice_init_21105718630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494 = (byte[]) newByteArray(6);
        setByteElement(term494, 0, (byte) -75);
        setByteElement(term494, 1, (byte) 69);
        setByteElement(term494, 2, (byte) -6);
        setByteElement(term494, 3, (byte) 107);
        setByteElement(term494, 4, (byte) -109);
        setByteElement(term494, 5, (byte) 122);
        term501 = new Integer(-1145578966);
        term503 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term494;
        args[1] = term501;
        args[2] = term503;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


