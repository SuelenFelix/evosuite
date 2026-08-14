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

public class ByteSlice_of_1869261927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;

    public ByteSlice_of_1869261927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608 = (byte[]) newByteArray(7);
        setByteElement(term608, 0, (byte) -25);
        setByteElement(term608, 1, (byte) 114);
        setByteElement(term608, 2, (byte) 105);
        setByteElement(term608, 3, (byte) -95);
        setByteElement(term608, 4, (byte) -6);
        setByteElement(term608, 5, (byte) 51);
        setByteElement(term608, 6, (byte) 122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.ByteSlice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term608;
        callMethod(klass, "of", argTypes, null, args);
    }

};


