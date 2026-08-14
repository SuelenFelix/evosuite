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

public class AuthenticationValue_withHeader_2165597613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13398;

    public AuthenticationValue_withHeader_2165597613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13472 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term13471 = ((Class) term13472).getDeclaredField((String) "HEADER");
        ((Field) term13471).setAccessible(true);
        Object enum31 = ((Field) term13471).get((Object) null);
        term13398 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term13433 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term13434 = (Object[]) newArray("java.lang.String", 1);
        setField(term13398, term13398.getClass(), "key", "hxCBltsObl");
        setField(term13398, term13398.getClass(), "value", "BndsHwAFMv");
        setField(term13398, term13398.getClass(), "type", enum31);
        setElement(term13434, 0, "*");
        setField(term13433, term13433.getClass(), "a", term13434);
        setIntField(term13433, term13433.getClass(), "modCount", 0);
        setField(term13398, term13398.getClass(), "urlPatterns", term13433);
        setField(term13398, term13398.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GzFkzHGYFt";
        callMethod(klass, "withHeader", argTypes, term13398, args);
    }

};


