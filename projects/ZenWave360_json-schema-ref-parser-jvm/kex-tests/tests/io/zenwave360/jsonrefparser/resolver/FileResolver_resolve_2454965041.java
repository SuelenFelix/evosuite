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

public class FileResolver_resolve_2454965041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public FileResolver_resolve_2454965041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.zenwave360.jsonrefparser.resolver.FileResolver"));
        Class<? extends Object> term231 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term230 = ((Class) term231).getDeclaredField((String) "CLASSPATH");
        ((Field) term230).setAccessible(true);
        Object enum0 = ((Field) term230).get((Object) null);
        term2 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term28 = newInstance(Class.forName("java.net.URI"));
        Object term106 = newInstance(Class.forName("java.net.URI"));
        setField(term2, term2.getClass(), "ref", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "refFormat", enum0);
        setField(term28, term28.getClass(), "scheme", "telnet");
        setField(term28, term28.getClass(), "fragment", null);
        setField(term28, term28.getClass(), "authority", "192.0.2.16:80");
        setField(term28, term28.getClass(), "userInfo", null);
        setField(term28, term28.getClass(), "host", "192.0.2.16");
        setIntField(term28, term28.getClass(), "port", 80);
        setField(term28, term28.getClass(), "path", "/");
        setField(term28, term28.getClass(), "query", null);
        setField(term28, term28.getClass(), "schemeSpecificPart", null);
        setIntField(term28, term28.getClass(), "hash", 0);
        setField(term28, term28.getClass(), "decodedUserInfo", null);
        setField(term28, term28.getClass(), "decodedAuthority", null);
        setField(term28, term28.getClass(), "decodedPath", null);
        setField(term28, term28.getClass(), "decodedQuery", null);
        setField(term28, term28.getClass(), "decodedFragment", null);
        setField(term28, term28.getClass(), "decodedSchemeSpecificPart", null);
        setField(term28, term28.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term2, term2.getClass(), "uri", term28);
        setField(term2, term2.getClass(), "path", "sjlJAEtRrb");
        setField(term106, term106.getClass(), "scheme", "mailto");
        setField(term106, term106.getClass(), "fragment", null);
        setField(term106, term106.getClass(), "authority", null);
        setField(term106, term106.getClass(), "userInfo", null);
        setField(term106, term106.getClass(), "host", null);
        setIntField(term106, term106.getClass(), "port", -1);
        setField(term106, term106.getClass(), "path", null);
        setField(term106, term106.getClass(), "query", null);
        setField(term106, term106.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term106, term106.getClass(), "hash", 0);
        setField(term106, term106.getClass(), "decodedUserInfo", null);
        setField(term106, term106.getClass(), "decodedAuthority", null);
        setField(term106, term106.getClass(), "decodedPath", null);
        setField(term106, term106.getClass(), "decodedQuery", null);
        setField(term106, term106.getClass(), "decodedFragment", null);
        setField(term106, term106.getClass(), "decodedSchemeSpecificPart", null);
        setField(term106, term106.getClass(), "string", "mailto:John.Doe@example.com");
        setField(term2, term2.getClass(), "referencingFileURI", term106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.resolver.FileResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "resolve", argTypes, term1, args);
    }

};


