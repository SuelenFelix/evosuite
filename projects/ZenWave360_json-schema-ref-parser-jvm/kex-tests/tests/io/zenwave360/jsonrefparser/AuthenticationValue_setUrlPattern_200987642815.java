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

public class AuthenticationValue_setUrlPattern_200987642815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18973;

    public AuthenticationValue_setUrlPattern_200987642815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19047 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term19046 = ((Class) term19047).getDeclaredField((String) "HEADER");
        ((Field) term19046).setAccessible(true);
        Object enum44 = ((Field) term19046).get((Object) null);
        term18973 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term19008 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term19009 = (Object[]) newArray("java.lang.String", 1);
        setField(term18973, term18973.getClass(), "key", "KoyGrUJeJW");
        setField(term18973, term18973.getClass(), "value", "HqBOwkVqjD");
        setField(term18973, term18973.getClass(), "type", enum44);
        setElement(term19009, 0, "*");
        setField(term19008, term19008.getClass(), "a", term19009);
        setIntField(term19008, term19008.getClass(), "modCount", 0);
        setField(term18973, term18973.getClass(), "urlPatterns", term19008);
        setField(term18973, term18973.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MAcUBcBckh";
        callMethod(klass, "setUrlPattern", argTypes, term18973, args);
    }

};


