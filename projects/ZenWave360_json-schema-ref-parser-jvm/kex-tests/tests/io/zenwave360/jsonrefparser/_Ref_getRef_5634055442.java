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

public class _Ref_getRef_5634055442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5045;

    public _Ref_getRef_5634055442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5234 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term5233 = ((Class) term5234).getDeclaredField((String) "RELATIVE");
        ((Field) term5233).setAccessible(true);
        Object enum12 = ((Field) term5233).get((Object) null);
        term5045 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term5070 = newInstance(Class.forName("java.net.URI"));
        Object term5148 = newInstance(Class.forName("java.net.URI"));
        setField(term5045, term5045.getClass(), "ref", "tbcdzjIfER");
        setField(term5045, term5045.getClass(), "refFormat", enum12);
        setField(term5070, term5070.getClass(), "scheme", "telnet");
        setField(term5070, term5070.getClass(), "fragment", null);
        setField(term5070, term5070.getClass(), "authority", "192.0.2.16:80");
        setField(term5070, term5070.getClass(), "userInfo", null);
        setField(term5070, term5070.getClass(), "host", "192.0.2.16");
        setIntField(term5070, term5070.getClass(), "port", 80);
        setField(term5070, term5070.getClass(), "path", "/");
        setField(term5070, term5070.getClass(), "query", null);
        setField(term5070, term5070.getClass(), "schemeSpecificPart", null);
        setIntField(term5070, term5070.getClass(), "hash", 0);
        setField(term5070, term5070.getClass(), "decodedUserInfo", null);
        setField(term5070, term5070.getClass(), "decodedAuthority", null);
        setField(term5070, term5070.getClass(), "decodedPath", null);
        setField(term5070, term5070.getClass(), "decodedQuery", null);
        setField(term5070, term5070.getClass(), "decodedFragment", null);
        setField(term5070, term5070.getClass(), "decodedSchemeSpecificPart", null);
        setField(term5070, term5070.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term5045, term5045.getClass(), "uri", term5070);
        setField(term5045, term5045.getClass(), "path", "HyxfbSQYBe");
        setField(term5148, term5148.getClass(), "scheme", "http");
        setField(term5148, term5148.getClass(), "fragment", null);
        setField(term5148, term5148.getClass(), "authority", "www.wikipedia.org");
        setField(term5148, term5148.getClass(), "userInfo", null);
        setField(term5148, term5148.getClass(), "host", "www.wikipedia.org");
        setIntField(term5148, term5148.getClass(), "port", -1);
        setField(term5148, term5148.getClass(), "path", "");
        setField(term5148, term5148.getClass(), "query", null);
        setField(term5148, term5148.getClass(), "schemeSpecificPart", null);
        setIntField(term5148, term5148.getClass(), "hash", 0);
        setField(term5148, term5148.getClass(), "decodedUserInfo", null);
        setField(term5148, term5148.getClass(), "decodedAuthority", null);
        setField(term5148, term5148.getClass(), "decodedPath", null);
        setField(term5148, term5148.getClass(), "decodedQuery", null);
        setField(term5148, term5148.getClass(), "decodedFragment", null);
        setField(term5148, term5148.getClass(), "decodedSchemeSpecificPart", null);
        setField(term5148, term5148.getClass(), "string", "http://www.wikipedia.org");
        setField(term5045, term5045.getClass(), "referencingFileURI", term5148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRef", argTypes, term5045, args);
    }

};


