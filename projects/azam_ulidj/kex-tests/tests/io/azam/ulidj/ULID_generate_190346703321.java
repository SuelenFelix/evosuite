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
import java.lang.Long;

public class ULID_generate_190346703321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;
     Object term145;

    public ULID_generate_190346703321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = new Long(-2813493605142626659L);
        term145 = (byte[]) newByteArray(5);
        setByteElement(term145, 0, (byte) -22);
        setByteElement(term145, 1, (byte) 93);
        setByteElement(term145, 2, (byte) 69);
        setByteElement(term145, 3, (byte) -74);
        setByteElement(term145, 4, (byte) -123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term143;
        args[1] = term145;
        callMethod(klass, "generate", argTypes, null, args);
    }

};


