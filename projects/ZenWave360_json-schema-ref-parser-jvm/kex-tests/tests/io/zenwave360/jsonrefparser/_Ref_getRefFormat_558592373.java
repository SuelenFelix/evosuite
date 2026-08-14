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

public class _Ref_getRefFormat_558592373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5619;

    public _Ref_getRefFormat_558592373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5803 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term5802 = ((Class) term5803).getDeclaredField((String) "URL");
        ((Field) term5802).setAccessible(true);
        Object enum13 = ((Field) term5802).get((Object) null);
        term5619 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term5639 = newInstance(Class.forName("java.net.URI"));
        Object term5726 = newInstance(Class.forName("java.net.URI"));
        setField(term5619, term5619.getClass(), "ref", "pCTimMblYc");
        setField(term5619, term5619.getClass(), "refFormat", enum13);
        setField(term5639, term5639.getClass(), "scheme", "http");
        setField(term5639, term5639.getClass(), "fragment", null);
        setField(term5639, term5639.getClass(), "authority", "www.wikipedia.org");
        setField(term5639, term5639.getClass(), "userInfo", null);
        setField(term5639, term5639.getClass(), "host", "www.wikipedia.org");
        setIntField(term5639, term5639.getClass(), "port", -1);
        setField(term5639, term5639.getClass(), "path", "");
        setField(term5639, term5639.getClass(), "query", null);
        setField(term5639, term5639.getClass(), "schemeSpecificPart", null);
        setIntField(term5639, term5639.getClass(), "hash", 0);
        setField(term5639, term5639.getClass(), "decodedUserInfo", null);
        setField(term5639, term5639.getClass(), "decodedAuthority", null);
        setField(term5639, term5639.getClass(), "decodedPath", null);
        setField(term5639, term5639.getClass(), "decodedQuery", null);
        setField(term5639, term5639.getClass(), "decodedFragment", null);
        setField(term5639, term5639.getClass(), "decodedSchemeSpecificPart", null);
        setField(term5639, term5639.getClass(), "string", "http://www.wikipedia.org");
        setField(term5619, term5619.getClass(), "uri", term5639);
        setField(term5619, term5619.getClass(), "path", "hNxWaHcfhY");
        setField(term5726, term5726.getClass(), "scheme", "telnet");
        setField(term5726, term5726.getClass(), "fragment", null);
        setField(term5726, term5726.getClass(), "authority", "192.0.2.16:80");
        setField(term5726, term5726.getClass(), "userInfo", null);
        setField(term5726, term5726.getClass(), "host", "192.0.2.16");
        setIntField(term5726, term5726.getClass(), "port", 80);
        setField(term5726, term5726.getClass(), "path", "/");
        setField(term5726, term5726.getClass(), "query", null);
        setField(term5726, term5726.getClass(), "schemeSpecificPart", null);
        setIntField(term5726, term5726.getClass(), "hash", 0);
        setField(term5726, term5726.getClass(), "decodedUserInfo", null);
        setField(term5726, term5726.getClass(), "decodedAuthority", null);
        setField(term5726, term5726.getClass(), "decodedPath", null);
        setField(term5726, term5726.getClass(), "decodedQuery", null);
        setField(term5726, term5726.getClass(), "decodedFragment", null);
        setField(term5726, term5726.getClass(), "decodedSchemeSpecificPart", null);
        setField(term5726, term5726.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term5619, term5619.getClass(), "referencingFileURI", term5726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefFormat", argTypes, term5619, args);
    }

};


