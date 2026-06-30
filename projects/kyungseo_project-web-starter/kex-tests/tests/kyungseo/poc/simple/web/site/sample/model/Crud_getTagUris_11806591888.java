package kyungseo.poc.simple.web.site.sample.model;

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
import static kyungseo.poc.simple.web.site.sample.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Crud_getTagUris_11806591888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2097;

    public Crud_getTagUris_11806591888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2125 = newInstance(Class.forName("java.net.URI"));
        setField(term2125, term2125.getClass(), "scheme", "");
        setField(term2125, term2125.getClass(), "fragment", null);
        setField(term2125, term2125.getClass(), "authority", "");
        setField(term2125, term2125.getClass(), "userInfo", null);
        setField(term2125, term2125.getClass(), "host", "");
        setIntField(term2125, term2125.getClass(), "port", 80);
        setField(term2125, term2125.getClass(), "path", "");
        setField(term2125, term2125.getClass(), "query", null);
        setField(term2125, term2125.getClass(), "schemeSpecificPart", null);
        setIntField(term2125, term2125.getClass(), "hash", 0);
        setField(term2125, term2125.getClass(), "decodedUserInfo", null);
        setField(term2125, term2125.getClass(), "decodedAuthority", null);
        setField(term2125, term2125.getClass(), "decodedPath", null);
        setField(term2125, term2125.getClass(), "decodedQuery", null);
        setField(term2125, term2125.getClass(), "decodedFragment", null);
        setField(term2125, term2125.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2125, term2125.getClass(), "string", "");
        Object term2133 = newInstance(Class.forName("java.net.URI"));
        setField(term2133, term2133.getClass(), "scheme", "");
        setField(term2133, term2133.getClass(), "fragment", null);
        setField(term2133, term2133.getClass(), "authority", "");
        setField(term2133, term2133.getClass(), "userInfo", null);
        setField(term2133, term2133.getClass(), "host", "");
        setIntField(term2133, term2133.getClass(), "port", -1);
        setField(term2133, term2133.getClass(), "path", "");
        setField(term2133, term2133.getClass(), "query", null);
        setField(term2133, term2133.getClass(), "schemeSpecificPart", null);
        setIntField(term2133, term2133.getClass(), "hash", 0);
        setField(term2133, term2133.getClass(), "decodedUserInfo", null);
        setField(term2133, term2133.getClass(), "decodedAuthority", null);
        setField(term2133, term2133.getClass(), "decodedPath", null);
        setField(term2133, term2133.getClass(), "decodedQuery", null);
        setField(term2133, term2133.getClass(), "decodedFragment", null);
        setField(term2133, term2133.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2133, term2133.getClass(), "string", "");
        ArrayList term2123 = new ArrayList();
        ((ArrayList) term2123).add(term2125);
        ((ArrayList) term2123).add(term2133);
        term2097 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term2097, term2097.getClass(), "id", -316468845751588286L);
        setField(term2097, term2097.getClass(), "title", "hoicvmsovO");
        setField(term2097, term2097.getClass(), "body", "eqJfYWRaEL");
        setField(term2097, term2097.getClass(), "tagUris", term2123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTagUris", argTypes, term2097, args);
    }

};


