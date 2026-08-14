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

public class ULID_compare_12801116228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term98;

    public ULID_compare_12801116228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("io.azam.ulidj.ULID"));
        byte[] term96 = (byte[]) newByteArray(1);
        setByteElement(term96, 0, (byte) 42);
        setField(term95, term95.getClass(), "binary", term96);
        term98 = newInstance(Class.forName("io.azam.ulidj.ULID"));
        byte[] term99 = (byte[]) newByteArray(6);
        setByteElement(term99, 0, (byte) 72);
        setByteElement(term99, 1, (byte) 111);
        setByteElement(term99, 2, (byte) 99);
        setByteElement(term99, 3, (byte) -12);
        setByteElement(term99, 4, (byte) -61);
        setByteElement(term99, 5, (byte) -85);
        setField(term98, term98.getClass(), "binary", term99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.azam.ulidj.ULID");
        argTypes[1] = Class.forName("io.azam.ulidj.ULID");
        Object[] args = new Object[2];
        args[0] = term95;
        args[1] = term98;
        callMethod(klass, "compare", argTypes, null, args);
    }

};


