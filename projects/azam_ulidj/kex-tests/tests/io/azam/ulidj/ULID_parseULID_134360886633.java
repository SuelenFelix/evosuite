package io.azam.ulidj;

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
import static io.azam.ulidj.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ULID_parseULID_134360886633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;

    public ULID_parseULID_134360886633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = (byte[]) newByteArray(8);
        setByteElement(term192, 0, (byte) -118);
        setByteElement(term192, 1, (byte) -126);
        setByteElement(term192, 2, (byte) -91);
        setByteElement(term192, 3, (byte) -104);
        setByteElement(term192, 4, (byte) -89);
        setByteElement(term192, 5, (byte) 13);
        setByteElement(term192, 6, (byte) 44);
        setByteElement(term192, 7, (byte) -63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term192;
        callMethod(klass, "parseULID", argTypes, null, args);
    }

};


