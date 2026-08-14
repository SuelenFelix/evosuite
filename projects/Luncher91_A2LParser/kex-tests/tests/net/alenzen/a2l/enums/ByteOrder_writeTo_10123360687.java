package net.alenzen.a2l.enums;

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
import static net.alenzen.a2l.enums.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ByteOrder_writeTo_10123360687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum29;

    public ByteOrder_writeTo_10123360687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6856 = Class.forName((String) "net.alenzen.a2l.enums.ByteOrder");
        Field term6855 = ((Class) term6856).getDeclaredField((String) "BIG_ENDIAN");
        ((Field) term6855).setAccessible(true);
        enum29 = ((Field) term6855).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.enums.ByteOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeTo", argTypes, enum29, args);
    }

};


