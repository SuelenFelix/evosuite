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

public class AuthenticationValue_getValue_19211901449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16066;

    public AuthenticationValue_getValue_19211901449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16128 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term16127 = ((Class) term16128).getDeclaredField((String) "HEADER");
        ((Field) term16127).setAccessible(true);
        Object enum37 = ((Field) term16127).get((Object) null);
        term16066 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term16101 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term16102 = (Object[]) newArray("java.lang.String", 1);
        setField(term16066, term16066.getClass(), "key", "nHXjMycHlU");
        setField(term16066, term16066.getClass(), "value", "ieCtQFdkii");
        setField(term16066, term16066.getClass(), "type", enum37);
        setElement(term16102, 0, "*");
        setField(term16101, term16101.getClass(), "a", term16102);
        setIntField(term16101, term16101.getClass(), "modCount", 0);
        setField(term16066, term16066.getClass(), "urlPatterns", term16101);
        setField(term16066, term16066.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term16066, args);
    }

};


