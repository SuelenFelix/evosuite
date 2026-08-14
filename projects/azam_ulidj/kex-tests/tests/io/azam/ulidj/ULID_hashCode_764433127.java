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

public class ULID_hashCode_764433127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public ULID_hashCode_764433127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("io.azam.ulidj.ULID"));
        byte[] term80 = (byte[]) newByteArray(7);
        setByteElement(term80, 0, (byte) 98);
        setByteElement(term80, 1, (byte) 67);
        setByteElement(term80, 2, (byte) 66);
        setByteElement(term80, 3, (byte) -121);
        setByteElement(term80, 4, (byte) -119);
        setByteElement(term80, 5, (byte) 71);
        setByteElement(term80, 6, (byte) 80);
        setField(term79, term79.getClass(), "binary", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.azam.ulidj.ULID");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term79, args);
    }

};


