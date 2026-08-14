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

public class Bytes_swap_8138917536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9610;
     Object term9620;
     Object term9622;

    public Bytes_swap_8138917536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9610 = (byte[]) newByteArray(9);
        setByteElement(term9610, 0, (byte) -125);
        setByteElement(term9610, 1, (byte) 12);
        setByteElement(term9610, 2, (byte) 21);
        setByteElement(term9610, 3, (byte) -45);
        setByteElement(term9610, 4, (byte) 55);
        setByteElement(term9610, 5, (byte) 55);
        setByteElement(term9610, 6, (byte) -116);
        setByteElement(term9610, 7, (byte) 23);
        setByteElement(term9610, 8, (byte) -16);
        term9620 = new Integer(1557431527);
        term9622 = new Integer(-1504890659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Bytes");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term9610;
        args[1] = term9620;
        args[2] = term9622;
        callMethod(klass, "swap", argTypes, null, args);
    }

};


