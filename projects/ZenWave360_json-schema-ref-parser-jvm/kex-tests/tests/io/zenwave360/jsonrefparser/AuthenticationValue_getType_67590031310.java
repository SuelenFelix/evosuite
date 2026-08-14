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

public class AuthenticationValue_getType_67590031310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16483;

    public AuthenticationValue_getType_67590031310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16545 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term16544 = ((Class) term16545).getDeclaredField((String) "HEADER");
        ((Field) term16544).setAccessible(true);
        Object enum38 = ((Field) term16544).get((Object) null);
        term16483 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term16518 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term16519 = (Object[]) newArray("java.lang.String", 1);
        setField(term16483, term16483.getClass(), "key", "dEnhdmILtU");
        setField(term16483, term16483.getClass(), "value", "hoicvmsovO");
        setField(term16483, term16483.getClass(), "type", enum38);
        setElement(term16519, 0, "*");
        setField(term16518, term16518.getClass(), "a", term16519);
        setIntField(term16518, term16518.getClass(), "modCount", 0);
        setField(term16483, term16483.getClass(), "urlPatterns", term16518);
        setField(term16483, term16483.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term16483, args);
    }

};


