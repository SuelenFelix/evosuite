package kyungseo.poc.simple.web.site.sample.service;

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
import static kyungseo.poc.simple.web.site.sample.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class CrudMockServiceImpl_create_14431598103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public CrudMockServiceImpl_create_14431598103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31 = newInstance(Class.forName("java.net.URI"));
        setField(term31, term31.getClass(), "scheme", "");
        setField(term31, term31.getClass(), "fragment", null);
        setField(term31, term31.getClass(), "authority", "");
        setField(term31, term31.getClass(), "userInfo", null);
        setField(term31, term31.getClass(), "host", "");
        setIntField(term31, term31.getClass(), "port", 80);
        setField(term31, term31.getClass(), "path", "");
        setField(term31, term31.getClass(), "query", null);
        setField(term31, term31.getClass(), "schemeSpecificPart", null);
        setIntField(term31, term31.getClass(), "hash", 0);
        setField(term31, term31.getClass(), "decodedUserInfo", null);
        setField(term31, term31.getClass(), "decodedAuthority", null);
        setField(term31, term31.getClass(), "decodedPath", null);
        setField(term31, term31.getClass(), "decodedQuery", null);
        setField(term31, term31.getClass(), "decodedFragment", null);
        setField(term31, term31.getClass(), "decodedSchemeSpecificPart", null);
        setField(term31, term31.getClass(), "string", "");
        Object term39 = newInstance(Class.forName("java.net.URI"));
        setField(term39, term39.getClass(), "scheme", "");
        setField(term39, term39.getClass(), "fragment", null);
        setField(term39, term39.getClass(), "authority", null);
        setField(term39, term39.getClass(), "userInfo", null);
        setField(term39, term39.getClass(), "host", null);
        setIntField(term39, term39.getClass(), "port", -1);
        setField(term39, term39.getClass(), "path", null);
        setField(term39, term39.getClass(), "query", null);
        setField(term39, term39.getClass(), "schemeSpecificPart", "");
        setIntField(term39, term39.getClass(), "hash", 0);
        setField(term39, term39.getClass(), "decodedUserInfo", null);
        setField(term39, term39.getClass(), "decodedAuthority", null);
        setField(term39, term39.getClass(), "decodedPath", null);
        setField(term39, term39.getClass(), "decodedQuery", null);
        setField(term39, term39.getClass(), "decodedFragment", null);
        setField(term39, term39.getClass(), "decodedSchemeSpecificPart", null);
        setField(term39, term39.getClass(), "string", "");
        Object term45 = newInstance(Class.forName("java.net.URI"));
        setField(term45, term45.getClass(), "scheme", "");
        setField(term45, term45.getClass(), "fragment", null);
        setField(term45, term45.getClass(), "authority", "");
        setField(term45, term45.getClass(), "userInfo", null);
        setField(term45, term45.getClass(), "host", "");
        setIntField(term45, term45.getClass(), "port", -1);
        setField(term45, term45.getClass(), "path", "");
        setField(term45, term45.getClass(), "query", null);
        setField(term45, term45.getClass(), "schemeSpecificPart", null);
        setIntField(term45, term45.getClass(), "hash", 0);
        setField(term45, term45.getClass(), "decodedUserInfo", null);
        setField(term45, term45.getClass(), "decodedAuthority", null);
        setField(term45, term45.getClass(), "decodedPath", null);
        setField(term45, term45.getClass(), "decodedQuery", null);
        setField(term45, term45.getClass(), "decodedFragment", null);
        setField(term45, term45.getClass(), "decodedSchemeSpecificPart", null);
        setField(term45, term45.getClass(), "string", "");
        Object term53 = newInstance(Class.forName("java.net.URI"));
        setField(term53, term53.getClass(), "scheme", "");
        setField(term53, term53.getClass(), "fragment", null);
        setField(term53, term53.getClass(), "authority", "");
        setField(term53, term53.getClass(), "userInfo", null);
        setField(term53, term53.getClass(), "host", "");
        setIntField(term53, term53.getClass(), "port", -1);
        setField(term53, term53.getClass(), "path", "");
        setField(term53, term53.getClass(), "query", null);
        setField(term53, term53.getClass(), "schemeSpecificPart", null);
        setIntField(term53, term53.getClass(), "hash", 0);
        setField(term53, term53.getClass(), "decodedUserInfo", null);
        setField(term53, term53.getClass(), "decodedAuthority", null);
        setField(term53, term53.getClass(), "decodedPath", null);
        setField(term53, term53.getClass(), "decodedQuery", null);
        setField(term53, term53.getClass(), "decodedFragment", null);
        setField(term53, term53.getClass(), "decodedSchemeSpecificPart", null);
        setField(term53, term53.getClass(), "string", "");
        Object term61 = newInstance(Class.forName("java.net.URI"));
        setField(term61, term61.getClass(), "scheme", "");
        setField(term61, term61.getClass(), "fragment", null);
        setField(term61, term61.getClass(), "authority", null);
        setField(term61, term61.getClass(), "userInfo", null);
        setField(term61, term61.getClass(), "host", null);
        setIntField(term61, term61.getClass(), "port", -1);
        setField(term61, term61.getClass(), "path", null);
        setField(term61, term61.getClass(), "query", null);
        setField(term61, term61.getClass(), "schemeSpecificPart", "");
        setIntField(term61, term61.getClass(), "hash", 0);
        setField(term61, term61.getClass(), "decodedUserInfo", null);
        setField(term61, term61.getClass(), "decodedAuthority", null);
        setField(term61, term61.getClass(), "decodedPath", null);
        setField(term61, term61.getClass(), "decodedQuery", null);
        setField(term61, term61.getClass(), "decodedFragment", null);
        setField(term61, term61.getClass(), "decodedSchemeSpecificPart", null);
        setField(term61, term61.getClass(), "string", "");
        ArrayList term29 = new ArrayList();
        ((ArrayList) term29).add(term31);
        ((ArrayList) term29).add(term39);
        ((ArrayList) term29).add(term45);
        ((ArrayList) term29).add(term53);
        ((ArrayList) term29).add(term61);
        term3 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term3, term3.getClass(), "id", 2442117782898005296L);
        setField(term3, term3.getClass(), "title", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "body", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "tagUris", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.service.CrudMockServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "create", argTypes, null, args);
    }

};


