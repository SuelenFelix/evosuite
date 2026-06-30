package io.basquiat.interfacebbuljit.noodle.code;

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
import static io.basquiat.interfacebbuljit.noodle.code.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoodleType_getType_8927064654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public NoodleType_getType_8927064654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term851 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        Field term850 = ((Class) term851).getDeclaredField((String) "PASTA");
        ((Field) term850).setAccessible(true);
        enum2 = ((Field) term850).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, enum2, args);
    }

};


