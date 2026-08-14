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
import java.util.LinkedList;

public class AuthenticationValue_setUrlPatterns_205934216816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19412;
     Object term19453;

    public AuthenticationValue_setUrlPatterns_205934216816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19477 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term19476 = ((Class) term19477).getDeclaredField((String) "HEADER");
        ((Field) term19476).setAccessible(true);
        Object enum45 = ((Field) term19476).get((Object) null);
        term19412 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term19447 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term19448 = (Object[]) newArray("java.lang.String", 1);
        setField(term19412, term19412.getClass(), "key", "oVgzLbrsFr");
        setField(term19412, term19412.getClass(), "value", "vQVyKLdtaz");
        setField(term19412, term19412.getClass(), "type", enum45);
        setElement(term19448, 0, "*");
        setField(term19447, term19447.getClass(), "a", term19448);
        setIntField(term19447, term19447.getClass(), "modCount", 0);
        setField(term19412, term19412.getClass(), "urlPatterns", term19447);
        setField(term19412, term19412.getClass(), "urlMatcher", null);
        term19453 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19453;
        callMethod(klass, "setUrlPatterns", argTypes, term19412, args);
    }

};


