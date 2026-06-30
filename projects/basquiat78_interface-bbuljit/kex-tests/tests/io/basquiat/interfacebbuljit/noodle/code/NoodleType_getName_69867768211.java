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

public class NoodleType_getName_69867768211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum8;

    public NoodleType_getName_69867768211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2657 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        Field term2656 = ((Class) term2657).getDeclaredField((String) "LAMYEON");
        ((Field) term2656).setAccessible(true);
        enum8 = ((Field) term2656).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, enum8, args);
    }

};


