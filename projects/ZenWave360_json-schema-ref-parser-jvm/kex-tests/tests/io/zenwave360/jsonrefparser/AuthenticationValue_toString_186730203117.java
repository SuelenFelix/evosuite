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

public class AuthenticationValue_toString_186730203117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19832;

    public AuthenticationValue_toString_186730203117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19894 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term19893 = ((Class) term19894).getDeclaredField((String) "HEADER");
        ((Field) term19893).setAccessible(true);
        Object enum46 = ((Field) term19893).get((Object) null);
        term19832 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term19867 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term19868 = (Object[]) newArray("java.lang.String", 1);
        setField(term19832, term19832.getClass(), "key", "OWKQODBLzb");
        setField(term19832, term19832.getClass(), "value", "wGmYcqUkgE");
        setField(term19832, term19832.getClass(), "type", enum46);
        setElement(term19868, 0, "*");
        setField(term19867, term19867.getClass(), "a", term19868);
        setIntField(term19867, term19867.getClass(), "modCount", 0);
        setField(term19832, term19832.getClass(), "urlPatterns", term19867);
        setField(term19832, term19832.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19832, args);
    }

};


