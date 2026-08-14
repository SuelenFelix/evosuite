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

public class HttpResolver_resolve_17212101562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2403;
     Object term2409;

    public HttpResolver_resolve_17212101562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2405 = new ArrayList();
        term2403 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver"));
        Object term2404 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver$4"));
        setField(term2404, term2404.getClass(), "this$0", term2403);
        setField(term2403, term2403.getClass(), "CONNECTION_CONFIGURATOR", term2404);
        setField(term2403, term2403.getClass(), "authenticationValues", term2405);
        Class<? extends Object> term2633 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term2632 = ((Class) term2633).getDeclaredField((String) "FILE");
        ((Field) term2632).setAccessible(true);
        Object enum7 = ((Field) term2632).get((Object) null);
        term2409 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term2430 = newInstance(Class.forName("java.net.URI"));
        Object term2532 = newInstance(Class.forName("java.net.URI"));
        setField(term2409, term2409.getClass(), "ref", "SzjVpOQTyS");
        setField(term2409, term2409.getClass(), "refFormat", enum7);
        setField(term2430, term2430.getClass(), "scheme", "ftp");
        setField(term2430, term2430.getClass(), "fragment", null);
        setField(term2430, term2430.getClass(), "authority", "ftp.is.co.za");
        setField(term2430, term2430.getClass(), "userInfo", null);
        setField(term2430, term2430.getClass(), "host", "ftp.is.co.za");
        setIntField(term2430, term2430.getClass(), "port", -1);
        setField(term2430, term2430.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term2430, term2430.getClass(), "query", null);
        setField(term2430, term2430.getClass(), "schemeSpecificPart", null);
        setIntField(term2430, term2430.getClass(), "hash", 0);
        setField(term2430, term2430.getClass(), "decodedUserInfo", null);
        setField(term2430, term2430.getClass(), "decodedAuthority", null);
        setField(term2430, term2430.getClass(), "decodedPath", null);
        setField(term2430, term2430.getClass(), "decodedQuery", null);
        setField(term2430, term2430.getClass(), "decodedFragment", null);
        setField(term2430, term2430.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2430, term2430.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
        setField(term2409, term2409.getClass(), "uri", term2430);
        setField(term2409, term2409.getClass(), "path", "MjGYSRKTNF");
        setField(term2532, term2532.getClass(), "scheme", "ftp");
        setField(term2532, term2532.getClass(), "fragment", null);
        setField(term2532, term2532.getClass(), "authority", "ftp.is.co.za");
        setField(term2532, term2532.getClass(), "userInfo", null);
        setField(term2532, term2532.getClass(), "host", "ftp.is.co.za");
        setIntField(term2532, term2532.getClass(), "port", -1);
        setField(term2532, term2532.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term2532, term2532.getClass(), "query", null);
        setField(term2532, term2532.getClass(), "schemeSpecificPart", null);
        setIntField(term2532, term2532.getClass(), "hash", 0);
        setField(term2532, term2532.getClass(), "decodedUserInfo", null);
        setField(term2532, term2532.getClass(), "decodedAuthority", null);
        setField(term2532, term2532.getClass(), "decodedPath", null);
        setField(term2532, term2532.getClass(), "decodedQuery", null);
        setField(term2532, term2532.getClass(), "decodedFragment", null);
        setField(term2532, term2532.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2532, term2532.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
        setField(term2409, term2409.getClass(), "referencingFileURI", term2532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.HttpResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Object[] args = new Object[1];
        args[0] = term2409;
        callMethod(klass, "resolve", argTypes, term2403, args);
    }

};


