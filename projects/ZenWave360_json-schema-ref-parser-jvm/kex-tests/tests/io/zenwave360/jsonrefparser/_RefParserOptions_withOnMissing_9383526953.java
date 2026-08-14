package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class _RefParserOptions_withOnMissing_9383526953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10467;
     Object enum25;

    public _RefParserOptions_withOnMissing_9383526953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10496 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Field term10495 = ((Class) term10496).getDeclaredField((String) "RESOLVE");
        ((Field) term10495).setAccessible(true);
        Object enum23 = ((Field) term10495).get((Object) null);
        Class<? extends Object> term10804 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnMissing");
        Field term10803 = ((Class) term10804).getDeclaredField((String) "FAIL");
        ((Field) term10803).setAccessible(true);
        Object enum24 = ((Field) term10803).get((Object) null);
        term10467 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions"));
        setField(term10467, term10467.getClass(), "onCircular", enum23);
        setField(term10467, term10467.getClass(), "onMissing", enum24);
        Class<? extends Object> term11098 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnMissing");
        Field term11097 = ((Class) term11098).getDeclaredField((String) "SKIP");
        ((Field) term11097).setAccessible(true);
        enum25 = ((Field) term11097).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions$OnMissing");
        Object[] args = new Object[1];
        args[0] = enum25;
        callMethod(klass, "withOnMissing", argTypes, term10467, args);
    }

};


