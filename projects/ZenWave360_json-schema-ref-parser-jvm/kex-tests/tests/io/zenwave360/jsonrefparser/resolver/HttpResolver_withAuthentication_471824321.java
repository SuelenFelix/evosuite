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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class HttpResolver_withAuthentication_471824321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1961;
     Object term1967;

    public HttpResolver_withAuthentication_471824321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1963 = new ArrayList();
        term1961 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver"));
        Object term1962 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$4"));
        setField(term1962, term1962.getClass(), "this$0", term1961);
        setField(term1961, term1961.getClass(), "CONNECTION_CONFIGURATOR", term1962);
        setField(term1961, term1961.getClass(), "authenticationValues", term1963);
        Class<? extends Object> term2048 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term2047 = ((Class) term2048).getDeclaredField((String) "HEADER");
        ((Field) term2047).setAccessible(true);
        Object enum6 = ((Field) term2047).get((Object) null);
        term1967 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term2002 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2003 = (Object[]) newArray("java.lang.String", 1);
        setField(term1967, term1967.getClass(), "key", "jJCZpVmanW");
        setField(term1967, term1967.getClass(), "value", "EGtDIRbSSb");
        setField(term1967, term1967.getClass(), "type", enum6);
        setElement(term2003, 0, "*");
        setField(term2002, term2002.getClass(), "a", term2003);
        setIntField(term2002, term2002.getClass(), "modCount", 0);
        setField(term1967, term1967.getClass(), "urlPatterns", term2002);
        setField(term1967, term1967.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Object[] args = new Object[1];
        args[0] = term1967;
        callMethod(klass, "withAuthentication", argTypes, term1961, args);
    }

};


