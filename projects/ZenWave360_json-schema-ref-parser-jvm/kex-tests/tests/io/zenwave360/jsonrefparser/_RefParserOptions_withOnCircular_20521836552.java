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

public class _RefParserOptions_withOnCircular_20521836552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9538;
     Object enum22;

    public _RefParserOptions_withOnCircular_20521836552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9567 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Field term9566 = ((Class) term9567).getDeclaredField((String) "RESOLVE");
        ((Field) term9566).setAccessible(true);
        Object enum20 = ((Field) term9566).get((Object) null);
        Class<? extends Object> term9875 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnMissing");
        Field term9874 = ((Class) term9875).getDeclaredField((String) "FAIL");
        ((Field) term9874).setAccessible(true);
        Object enum21 = ((Field) term9874).get((Object) null);
        term9538 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions"));
        setField(term9538, term9538.getClass(), "onCircular", enum20);
        setField(term9538, term9538.getClass(), "onMissing", enum21);
        Class<? extends Object> term10169 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Field term10168 = ((Class) term10169).getDeclaredField((String) "FAIL");
        ((Field) term10168).setAccessible(true);
        enum22 = ((Field) term10168).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Object[] args = new Object[1];
        args[0] = enum22;
        callMethod(klass, "withOnCircular", argTypes, term9538, args);
    }

};


