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

public class _Ref_getPath_18269693865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6757;

    public _Ref_getPath_18269693865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6946 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term6945 = ((Class) term6946).getDeclaredField((String) "INTERNAL");
        ((Field) term6945).setAccessible(true);
        Object enum15 = ((Field) term6945).get((Object) null);
        term6757 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term6782 = newInstance(Class.forName("java.net.URI"));
        Object term6869 = newInstance(Class.forName("java.net.URI"));
        setField(term6757, term6757.getClass(), "ref", "eZFUvlxvGV");
        setField(term6757, term6757.getClass(), "refFormat", enum15);
        setField(term6782, term6782.getClass(), "scheme", "http");
        setField(term6782, term6782.getClass(), "fragment", null);
        setField(term6782, term6782.getClass(), "authority", "www.wikipedia.org");
        setField(term6782, term6782.getClass(), "userInfo", null);
        setField(term6782, term6782.getClass(), "host", "www.wikipedia.org");
        setIntField(term6782, term6782.getClass(), "port", -1);
        setField(term6782, term6782.getClass(), "path", "");
        setField(term6782, term6782.getClass(), "query", null);
        setField(term6782, term6782.getClass(), "schemeSpecificPart", null);
        setIntField(term6782, term6782.getClass(), "hash", 0);
        setField(term6782, term6782.getClass(), "decodedUserInfo", null);
        setField(term6782, term6782.getClass(), "decodedAuthority", null);
        setField(term6782, term6782.getClass(), "decodedPath", null);
        setField(term6782, term6782.getClass(), "decodedQuery", null);
        setField(term6782, term6782.getClass(), "decodedFragment", null);
        setField(term6782, term6782.getClass(), "decodedSchemeSpecificPart", null);
        setField(term6782, term6782.getClass(), "string", "http://www.wikipedia.org");
        setField(term6757, term6757.getClass(), "uri", term6782);
        setField(term6757, term6757.getClass(), "path", "BYqFIqCKAV");
        setField(term6869, term6869.getClass(), "scheme", "telnet");
        setField(term6869, term6869.getClass(), "fragment", null);
        setField(term6869, term6869.getClass(), "authority", "192.0.2.16:80");
        setField(term6869, term6869.getClass(), "userInfo", null);
        setField(term6869, term6869.getClass(), "host", "192.0.2.16");
        setIntField(term6869, term6869.getClass(), "port", 80);
        setField(term6869, term6869.getClass(), "path", "/");
        setField(term6869, term6869.getClass(), "query", null);
        setField(term6869, term6869.getClass(), "schemeSpecificPart", null);
        setIntField(term6869, term6869.getClass(), "hash", 0);
        setField(term6869, term6869.getClass(), "decodedUserInfo", null);
        setField(term6869, term6869.getClass(), "decodedAuthority", null);
        setField(term6869, term6869.getClass(), "decodedPath", null);
        setField(term6869, term6869.getClass(), "decodedQuery", null);
        setField(term6869, term6869.getClass(), "decodedFragment", null);
        setField(term6869, term6869.getClass(), "decodedSchemeSpecificPart", null);
        setField(term6869, term6869.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term6757, term6757.getClass(), "referencingFileURI", term6869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term6757, args);
    }

};


