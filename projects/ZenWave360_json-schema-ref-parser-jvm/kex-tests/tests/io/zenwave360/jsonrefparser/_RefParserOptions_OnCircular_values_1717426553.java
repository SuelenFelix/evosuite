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

public class _RefParserOptions_OnCircular_values_1717426553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum27;

    public _RefParserOptions_OnCircular_values_1717426553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11913 = Class.forName((String) "io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Field term11912 = ((Class) term11913).getDeclaredField((String) "RESOLVE");
        ((Field) term11912).setAccessible(true);
        enum27 = ((Field) term11912).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions$OnCircular");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum27, args);
    }

};


