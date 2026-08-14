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

public class _Ref_init_19109024970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum11;
     Object term4315;
     Object term4419;

    public _Ref_init_19109024970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4505 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term4504 = ((Class) term4505).getDeclaredField((String) "FILE");
        ((Field) term4504).setAccessible(true);
        enum11 = ((Field) term4504).get((Object) null);
        term4315 = newInstance(Class.forName("java.net.URI"));
        setField(term4315, term4315.getClass(), "scheme", "http");
        setField(term4315, term4315.getClass(), "fragment", null);
        setField(term4315, term4315.getClass(), "authority", "www.ietf.org");
        setField(term4315, term4315.getClass(), "userInfo", null);
        setField(term4315, term4315.getClass(), "host", "www.ietf.org");
        setIntField(term4315, term4315.getClass(), "port", -1);
        setField(term4315, term4315.getClass(), "path", "/rfc/rfc2396.txt");
        setField(term4315, term4315.getClass(), "query", null);
        setField(term4315, term4315.getClass(), "schemeSpecificPart", null);
        setIntField(term4315, term4315.getClass(), "hash", 0);
        setField(term4315, term4315.getClass(), "decodedUserInfo", null);
        setField(term4315, term4315.getClass(), "decodedAuthority", null);
        setField(term4315, term4315.getClass(), "decodedPath", null);
        setField(term4315, term4315.getClass(), "decodedQuery", null);
        setField(term4315, term4315.getClass(), "decodedFragment", null);
        setField(term4315, term4315.getClass(), "decodedSchemeSpecificPart", null);
        setField(term4315, term4315.getClass(), "string", "http://www.ietf.org/rfc/rfc2396.txt");
        term4419 = newInstance(Class.forName("java.net.URI"));
        setField(term4419, term4419.getClass(), "scheme", "http");
        setField(term4419, term4419.getClass(), "fragment", null);
        setField(term4419, term4419.getClass(), "authority", "www.wikipedia.org");
        setField(term4419, term4419.getClass(), "userInfo", null);
        setField(term4419, term4419.getClass(), "host", "www.wikipedia.org");
        setIntField(term4419, term4419.getClass(), "port", -1);
        setField(term4419, term4419.getClass(), "path", "");
        setField(term4419, term4419.getClass(), "query", null);
        setField(term4419, term4419.getClass(), "schemeSpecificPart", null);
        setIntField(term4419, term4419.getClass(), "hash", 0);
        setField(term4419, term4419.getClass(), "decodedUserInfo", null);
        setField(term4419, term4419.getClass(), "decodedAuthority", null);
        setField(term4419, term4419.getClass(), "decodedPath", null);
        setField(term4419, term4419.getClass(), "decodedQuery", null);
        setField(term4419, term4419.getClass(), "decodedFragment", null);
        setField(term4419, term4419.getClass(), "decodedSchemeSpecificPart", null);
        setField(term4419, term4419.getClass(), "string", "http://www.wikipedia.org");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.zenwave360.jsonrefparser.resolver.RefFormat");
        argTypes[2] = Class.forName("java.net.URI");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.net.URI");
        Object[] args = new Object[5];
        args[0] = "oVcInYnLWB";
        args[1] = enum11;
        args[2] = term4315;
        args[3] = "aJlieCFVtF";
        args[4] = term4419;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


