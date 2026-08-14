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

public class AuthenticationValue_setType_49338703513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17778;
     Object enum42;

    public AuthenticationValue_setType_49338703513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17849 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term17848 = ((Class) term17849).getDeclaredField((String) "HEADER");
        ((Field) term17848).setAccessible(true);
        Object enum41 = ((Field) term17848).get((Object) null);
        term17778 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term17813 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term17814 = (Object[]) newArray("java.lang.String", 1);
        setField(term17778, term17778.getClass(), "key", "bLPjGVBhlX");
        setField(term17778, term17778.getClass(), "value", "whBvTVIIlC");
        setField(term17778, term17778.getClass(), "type", enum41);
        setElement(term17814, 0, "*");
        setField(term17813, term17813.getClass(), "a", term17814);
        setIntField(term17813, term17813.getClass(), "modCount", 0);
        setField(term17778, term17778.getClass(), "urlPatterns", term17813);
        setField(term17778, term17778.getClass(), "urlMatcher", null);
        Class<? extends Object> term18205 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term18204 = ((Class) term18205).getDeclaredField((String) "QUERY");
        ((Field) term18204).setAccessible(true);
        enum42 = ((Field) term18204).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "setType", argTypes, term17778, args);
    }

};


