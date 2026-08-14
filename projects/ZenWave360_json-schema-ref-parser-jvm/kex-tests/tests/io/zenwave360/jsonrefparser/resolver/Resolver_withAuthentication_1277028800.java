package io.zenwave360.jsonrefparser.resolver;

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
import static io.zenwave360.jsonrefparser.resolver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Resolver_withAuthentication_1277028800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;

    public Resolver_withAuthentication_1277028800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3177 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term3176 = ((Class) term3177).getDeclaredField((String) "HEADER");
        ((Field) term3176).setAccessible(true);
        Object enum8 = ((Field) term3176).get((Object) null);
        term3115 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term3150 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term3151 = (Object[]) newArray("java.lang.String", 1);
        setField(term3115, term3115.getClass(), "key", "NRdvgJlhkX");
        setField(term3115, term3115.getClass(), "value", "uuaPigETmJ");
        setField(term3115, term3115.getClass(), "type", enum8);
        setElement(term3151, 0, "*");
        setField(term3150, term3150.getClass(), "a", term3151);
        setIntField(term3150, term3150.getClass(), "modCount", 0);
        setField(term3115, term3115.getClass(), "urlPatterns", term3150);
        setField(term3115, term3115.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.Resolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Object[] args = new Object[1];
        args[0] = term3115;
        callMethod(klass, "withAuthentication", argTypes, null, args);
    }

};


