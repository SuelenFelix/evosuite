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

public class _Ref_equals_2067649968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8501;
     Object term8705;

    public _Ref_equals_2067649968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8717 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term8716 = ((Class) term8717).getDeclaredField((String) "INTERNAL");
        ((Field) term8716).setAccessible(true);
        Object enum18 = ((Field) term8716).get((Object) null);
        term8501 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term8526 = newInstance(Class.forName("java.net.URI"));
        Object term8613 = newInstance(Class.forName("java.net.URI"));
        setField(term8501, term8501.getClass(), "ref", "TEParAifyi");
        setField(term8501, term8501.getClass(), "refFormat", enum18);
        setField(term8526, term8526.getClass(), "scheme", "http");
        setField(term8526, term8526.getClass(), "fragment", null);
        setField(term8526, term8526.getClass(), "authority", "www.wikipedia.org");
        setField(term8526, term8526.getClass(), "userInfo", null);
        setField(term8526, term8526.getClass(), "host", "www.wikipedia.org");
        setIntField(term8526, term8526.getClass(), "port", -1);
        setField(term8526, term8526.getClass(), "path", "");
        setField(term8526, term8526.getClass(), "query", null);
        setField(term8526, term8526.getClass(), "schemeSpecificPart", null);
        setIntField(term8526, term8526.getClass(), "hash", 0);
        setField(term8526, term8526.getClass(), "decodedUserInfo", null);
        setField(term8526, term8526.getClass(), "decodedAuthority", null);
        setField(term8526, term8526.getClass(), "decodedPath", null);
        setField(term8526, term8526.getClass(), "decodedQuery", null);
        setField(term8526, term8526.getClass(), "decodedFragment", null);
        setField(term8526, term8526.getClass(), "decodedSchemeSpecificPart", null);
        setField(term8526, term8526.getClass(), "string", "http://www.wikipedia.org");
        setField(term8501, term8501.getClass(), "uri", term8526);
        setField(term8501, term8501.getClass(), "path", "OWDIEULEFu");
        setField(term8613, term8613.getClass(), "scheme", "http");
        setField(term8613, term8613.getClass(), "fragment", null);
        setField(term8613, term8613.getClass(), "authority", "www.ietf.org");
        setField(term8613, term8613.getClass(), "userInfo", null);
        setField(term8613, term8613.getClass(), "host", "www.ietf.org");
        setIntField(term8613, term8613.getClass(), "port", -1);
        setField(term8613, term8613.getClass(), "path", "/rfc/rfc2396.txt");
        setField(term8613, term8613.getClass(), "query", null);
        setField(term8613, term8613.getClass(), "schemeSpecificPart", null);
        setIntField(term8613, term8613.getClass(), "hash", 0);
        setField(term8613, term8613.getClass(), "decodedUserInfo", null);
        setField(term8613, term8613.getClass(), "decodedAuthority", null);
        setField(term8613, term8613.getClass(), "decodedPath", null);
        setField(term8613, term8613.getClass(), "decodedQuery", null);
        setField(term8613, term8613.getClass(), "decodedFragment", null);
        setField(term8613, term8613.getClass(), "decodedSchemeSpecificPart", null);
        setField(term8613, term8613.getClass(), "string", "http://www.ietf.org/rfc/rfc2396.txt");
        setField(term8501, term8501.getClass(), "referencingFileURI", term8613);
        term8705 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8705;
        callMethod(klass, "equals", argTypes, term8501, args);
    }

};


