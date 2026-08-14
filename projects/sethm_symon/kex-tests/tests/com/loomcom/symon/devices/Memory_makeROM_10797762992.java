package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class Memory_makeROM_10797762992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23649;
     Object term23651;
     Object term23653;

    public Memory_makeROM_10797762992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23649 = new Integer(-1414233013);
        term23651 = new Integer(-1174440096);
        Class<? extends Object> term23689 = Class.forName((String) "java.io.File$PathStatus");
        Field term23688 = ((Class) term23689).getDeclaredField((String) "INVALID");
        ((Field) term23688).setAccessible(true);
        Object enum64 = ((Field) term23688).get((Object) null);
        term23653 = newInstance(Class.forName("java.io.File"));
        setField(term23653, term23653.getClass(), "path", "PHvxnGHptP");
        setField(term23653, term23653.getClass(), "status", enum64);
        setIntField(term23653, term23653.getClass(), "prefixLength", -679614653);
        setField(term23653, term23653.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.File");
        Object[] args = new Object[3];
        args[0] = term23649;
        args[1] = term23651;
        args[2] = term23653;
        callMethod(klass, "makeROM", argTypes, null, args);
    }

};


