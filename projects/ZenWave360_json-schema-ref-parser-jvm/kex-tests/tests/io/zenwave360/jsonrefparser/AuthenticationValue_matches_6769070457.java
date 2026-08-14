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

public class AuthenticationValue_matches_6769070457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15154;
     Object term15195;

    public AuthenticationValue_matches_6769070457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15262 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term15261 = ((Class) term15262).getDeclaredField((String) "HEADER");
        ((Field) term15261).setAccessible(true);
        Object enum35 = ((Field) term15261).get((Object) null);
        term15154 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term15189 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term15190 = (Object[]) newArray("java.lang.String", 1);
        setField(term15154, term15154.getClass(), "key", "YRHGsAkhxb");
        setField(term15154, term15154.getClass(), "value", "ffYhPOzlUs");
        setField(term15154, term15154.getClass(), "type", enum35);
        setElement(term15190, 0, "*");
        setField(term15189, term15189.getClass(), "a", term15190);
        setIntField(term15189, term15189.getClass(), "modCount", 0);
        setField(term15154, term15154.getClass(), "urlPatterns", term15189);
        setField(term15154, term15154.getClass(), "urlMatcher", null);
        term15195 = newInstance(Class.forName("java.net.URL"));
        Object term15239 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term15195, term15195.getClass(), "protocol", "http");
        setField(term15195, term15195.getClass(), "host", "www.google.com");
        setIntField(term15195, term15195.getClass(), "port", -1);
        setField(term15195, term15195.getClass(), "file", "");
        setField(term15195, term15195.getClass(), "query", null);
        setField(term15195, term15195.getClass(), "authority", "www.google.com");
        setField(term15195, term15195.getClass(), "path", "");
        setField(term15195, term15195.getClass(), "userInfo", null);
        setField(term15195, term15195.getClass(), "ref", null);
        setField(term15195, term15195.getClass(), "hostAddress", null);
        setField(term15239, term15239.getClass(), "proxy", null);
        setIntField(term15239, term15239.getClass(), "proxyPort", -1);
        setField(term15195, term15195.getClass(), "handler", term15239);
        setField(term15195, term15195.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term15195;
        callMethod(klass, "matches", argTypes, term15154, args);
    }

};


