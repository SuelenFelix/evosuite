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

public class ULID_compareTo_6646127875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term52;

    public ULID_compareTo_6646127875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("io.azam.ulidj.ULID"));
        byte[] term45 = (byte[]) newByteArray(6);
        setByteElement(term45, 0, (byte) 67);
        setByteElement(term45, 1, (byte) 78);
        setByteElement(term45, 2, (byte) 87);
        setByteElement(term45, 3, (byte) 121);
        setByteElement(term45, 4, (byte) -99);
        setByteElement(term45, 5, (byte) -2);
        setField(term44, term44.getClass(), "binary", term45);
        term52 = newInstance(Class.forName("io.azam.ulidj.ULID"));
        byte[] term53 = (byte[]) newByteArray(2);
        setByteElement(term53, 0, (byte) -16);
        setByteElement(term53, 1, (byte) -112);
        setField(term52, term52.getClass(), "binary", term53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.azam.ulidj.ULID");
        Object[] args = new Object[1];
        args[0] = term52;
        callMethod(klass, "compareTo", argTypes, term44, args);
    }

};


