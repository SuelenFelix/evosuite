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

public class AuthenticationValue_setKey_31109141011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16900;

    public AuthenticationValue_setKey_31109141011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16974 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term16973 = ((Class) term16974).getDeclaredField((String) "HEADER");
        ((Field) term16973).setAccessible(true);
        Object enum39 = ((Field) term16973).get((Object) null);
        term16900 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term16935 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term16936 = (Object[]) newArray("java.lang.String", 1);
        setField(term16900, term16900.getClass(), "key", "eqJfYWRaEL");
        setField(term16900, term16900.getClass(), "value", "fhkbdRViHi");
        setField(term16900, term16900.getClass(), "type", enum39);
        setElement(term16936, 0, "*");
        setField(term16935, term16935.getClass(), "a", term16936);
        setIntField(term16935, term16935.getClass(), "modCount", 0);
        setField(term16900, term16900.getClass(), "urlPatterns", term16935);
        setField(term16900, term16900.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setKey", argTypes, term16900, args);
    }

};


