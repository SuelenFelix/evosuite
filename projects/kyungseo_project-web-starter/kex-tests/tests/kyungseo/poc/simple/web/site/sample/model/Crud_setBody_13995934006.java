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

public class Crud_setBody_13995934006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922;

    public Crud_setBody_13995934006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1950 = newInstance(Class.forName("java.net.URI"));
        setField(term1950, term1950.getClass(), "scheme", "");
        setField(term1950, term1950.getClass(), "fragment", null);
        setField(term1950, term1950.getClass(), "authority", "");
        setField(term1950, term1950.getClass(), "userInfo", null);
        setField(term1950, term1950.getClass(), "host", "");
        setIntField(term1950, term1950.getClass(), "port", -1);
        setField(term1950, term1950.getClass(), "path", "");
        setField(term1950, term1950.getClass(), "query", null);
        setField(term1950, term1950.getClass(), "schemeSpecificPart", null);
        setIntField(term1950, term1950.getClass(), "hash", 0);
        setField(term1950, term1950.getClass(), "decodedUserInfo", null);
        setField(term1950, term1950.getClass(), "decodedAuthority", null);
        setField(term1950, term1950.getClass(), "decodedPath", null);
        setField(term1950, term1950.getClass(), "decodedQuery", null);
        setField(term1950, term1950.getClass(), "decodedFragment", null);
        setField(term1950, term1950.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1950, term1950.getClass(), "string", "");
        Object term1958 = newInstance(Class.forName("java.net.URI"));
        setField(term1958, term1958.getClass(), "scheme", "");
        setField(term1958, term1958.getClass(), "fragment", null);
        setField(term1958, term1958.getClass(), "authority", null);
        setField(term1958, term1958.getClass(), "userInfo", null);
        setField(term1958, term1958.getClass(), "host", null);
        setIntField(term1958, term1958.getClass(), "port", -1);
        setField(term1958, term1958.getClass(), "path", null);
        setField(term1958, term1958.getClass(), "query", null);
        setField(term1958, term1958.getClass(), "schemeSpecificPart", "");
        setIntField(term1958, term1958.getClass(), "hash", 0);
        setField(term1958, term1958.getClass(), "decodedUserInfo", null);
        setField(term1958, term1958.getClass(), "decodedAuthority", null);
        setField(term1958, term1958.getClass(), "decodedPath", null);
        setField(term1958, term1958.getClass(), "decodedQuery", null);
        setField(term1958, term1958.getClass(), "decodedFragment", null);
        setField(term1958, term1958.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1958, term1958.getClass(), "string", "");
        Object term1964 = newInstance(Class.forName("java.net.URI"));
        setField(term1964, term1964.getClass(), "scheme", "");
        setField(term1964, term1964.getClass(), "fragment", null);
        setField(term1964, term1964.getClass(), "authority", null);
        setField(term1964, term1964.getClass(), "userInfo", null);
        setField(term1964, term1964.getClass(), "host", null);
        setIntField(term1964, term1964.getClass(), "port", -1);
        setField(term1964, term1964.getClass(), "path", null);
        setField(term1964, term1964.getClass(), "query", null);
        setField(term1964, term1964.getClass(), "schemeSpecificPart", "");
        setIntField(term1964, term1964.getClass(), "hash", 0);
        setField(term1964, term1964.getClass(), "decodedUserInfo", null);
        setField(term1964, term1964.getClass(), "decodedAuthority", null);
        setField(term1964, term1964.getClass(), "decodedPath", null);
        setField(term1964, term1964.getClass(), "decodedQuery", null);
        setField(term1964, term1964.getClass(), "decodedFragment", null);
        setField(term1964, term1964.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1964, term1964.getClass(), "string", "");
        Object term1970 = newInstance(Class.forName("java.net.URI"));
        setField(term1970, term1970.getClass(), "scheme", "");
        setField(term1970, term1970.getClass(), "fragment", null);
        setField(term1970, term1970.getClass(), "authority", null);
        setField(term1970, term1970.getClass(), "userInfo", null);
        setField(term1970, term1970.getClass(), "host", null);
        setIntField(term1970, term1970.getClass(), "port", -1);
        setField(term1970, term1970.getClass(), "path", null);
        setField(term1970, term1970.getClass(), "query", null);
        setField(term1970, term1970.getClass(), "schemeSpecificPart", "");
        setIntField(term1970, term1970.getClass(), "hash", 0);
        setField(term1970, term1970.getClass(), "decodedUserInfo", null);
        setField(term1970, term1970.getClass(), "decodedAuthority", null);
        setField(term1970, term1970.getClass(), "decodedPath", null);
        setField(term1970, term1970.getClass(), "decodedQuery", null);
        setField(term1970, term1970.getClass(), "decodedFragment", null);
        setField(term1970, term1970.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1970, term1970.getClass(), "string", "");
        Object term1976 = newInstance(Class.forName("java.net.URI"));
        setField(term1976, term1976.getClass(), "scheme", "");
        setField(term1976, term1976.getClass(), "fragment", null);
        setField(term1976, term1976.getClass(), "authority", "");
        setField(term1976, term1976.getClass(), "userInfo", null);
        setField(term1976, term1976.getClass(), "host", "");
        setIntField(term1976, term1976.getClass(), "port", 80);
        setField(term1976, term1976.getClass(), "path", "");
        setField(term1976, term1976.getClass(), "query", null);
        setField(term1976, term1976.getClass(), "schemeSpecificPart", null);
        setIntField(term1976, term1976.getClass(), "hash", 0);
        setField(term1976, term1976.getClass(), "decodedUserInfo", null);
        setField(term1976, term1976.getClass(), "decodedAuthority", null);
        setField(term1976, term1976.getClass(), "decodedPath", null);
        setField(term1976, term1976.getClass(), "decodedQuery", null);
        setField(term1976, term1976.getClass(), "decodedFragment", null);
        setField(term1976, term1976.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1976, term1976.getClass(), "string", "");
        ArrayList term1948 = new ArrayList();
        ((ArrayList) term1948).add(term1950);
        ((ArrayList) term1948).add(term1958);
        ((ArrayList) term1948).add(term1964);
        ((ArrayList) term1948).add(term1970);
        ((ArrayList) term1948).add(term1976);
        term1922 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term1922, term1922.getClass(), "id", -5476826692763582090L);
        setField(term1922, term1922.getClass(), "title", "MLqYREekMl");
        setField(term1922, term1922.getClass(), "body", "ytSBIKXogI");
        setField(term1922, term1922.getClass(), "tagUris", term1948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setBody", argTypes, term1922, args);
    }

};


