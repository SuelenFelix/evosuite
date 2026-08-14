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

public class _Ref_toString_7526813697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7927;

    public _Ref_toString_7526813697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8113 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term8112 = ((Class) term8113).getDeclaredField((String) "CLASSPATH");
        ((Field) term8112).setAccessible(true);
        Object enum17 = ((Field) term8112).get((Object) null);
        term7927 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term7953 = newInstance(Class.forName("java.net.URI"));
        Object term8027 = newInstance(Class.forName("java.net.URI"));
        setField(term7927, term7927.getClass(), "ref", "OclPbYPkcH");
        setField(term7927, term7927.getClass(), "refFormat", enum17);
        setField(term7953, term7953.getClass(), "scheme", "mailto");
        setField(term7953, term7953.getClass(), "fragment", null);
        setField(term7953, term7953.getClass(), "authority", null);
        setField(term7953, term7953.getClass(), "userInfo", null);
        setField(term7953, term7953.getClass(), "host", null);
        setIntField(term7953, term7953.getClass(), "port", -1);
        setField(term7953, term7953.getClass(), "path", null);
        setField(term7953, term7953.getClass(), "query", null);
        setField(term7953, term7953.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term7953, term7953.getClass(), "hash", 0);
        setField(term7953, term7953.getClass(), "decodedUserInfo", null);
        setField(term7953, term7953.getClass(), "decodedAuthority", null);
        setField(term7953, term7953.getClass(), "decodedPath", null);
        setField(term7953, term7953.getClass(), "decodedQuery", null);
        setField(term7953, term7953.getClass(), "decodedFragment", null);
        setField(term7953, term7953.getClass(), "decodedSchemeSpecificPart", null);
        setField(term7953, term7953.getClass(), "string", "mailto:John.Doe@example.com");
        setField(term7927, term7927.getClass(), "uri", term7953);
        setField(term7927, term7927.getClass(), "path", "IoAlmYsBwc");
        setField(term8027, term8027.getClass(), "scheme", "http");
        setField(term8027, term8027.getClass(), "fragment", null);
        setField(term8027, term8027.getClass(), "authority", "www.wikipedia.org");
        setField(term8027, term8027.getClass(), "userInfo", null);
        setField(term8027, term8027.getClass(), "host", "www.wikipedia.org");
        setIntField(term8027, term8027.getClass(), "port", -1);
        setField(term8027, term8027.getClass(), "path", "");
        setField(term8027, term8027.getClass(), "query", null);
        setField(term8027, term8027.getClass(), "schemeSpecificPart", null);
        setIntField(term8027, term8027.getClass(), "hash", 0);
        setField(term8027, term8027.getClass(), "decodedUserInfo", null);
        setField(term8027, term8027.getClass(), "decodedAuthority", null);
        setField(term8027, term8027.getClass(), "decodedPath", null);
        setField(term8027, term8027.getClass(), "decodedQuery", null);
        setField(term8027, term8027.getClass(), "decodedFragment", null);
        setField(term8027, term8027.getClass(), "decodedSchemeSpecificPart", null);
        setField(term8027, term8027.getClass(), "string", "http://www.wikipedia.org");
        setField(term7927, term7927.getClass(), "referencingFileURI", term8027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7927, args);
    }

};


