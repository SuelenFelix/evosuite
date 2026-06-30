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
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class CrudMockServiceImpl_update_13429005794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term91;

    public CrudMockServiceImpl_update_13429005794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = new Long(6375119433582206027L);
        Object term119 = newInstance(Class.forName("java.net.URI"));
        setField(term119, term119.getClass(), "scheme", "");
        setField(term119, term119.getClass(), "fragment", null);
        setField(term119, term119.getClass(), "authority", "");
        setField(term119, term119.getClass(), "userInfo", null);
        setField(term119, term119.getClass(), "host", "");
        setIntField(term119, term119.getClass(), "port", -1);
        setField(term119, term119.getClass(), "path", "");
        setField(term119, term119.getClass(), "query", null);
        setField(term119, term119.getClass(), "schemeSpecificPart", null);
        setIntField(term119, term119.getClass(), "hash", 0);
        setField(term119, term119.getClass(), "decodedUserInfo", null);
        setField(term119, term119.getClass(), "decodedAuthority", null);
        setField(term119, term119.getClass(), "decodedPath", null);
        setField(term119, term119.getClass(), "decodedQuery", null);
        setField(term119, term119.getClass(), "decodedFragment", null);
        setField(term119, term119.getClass(), "decodedSchemeSpecificPart", null);
        setField(term119, term119.getClass(), "string", "");
        Object term127 = newInstance(Class.forName("java.net.URI"));
        setField(term127, term127.getClass(), "scheme", "");
        setField(term127, term127.getClass(), "fragment", null);
        setField(term127, term127.getClass(), "authority", "");
        setField(term127, term127.getClass(), "userInfo", null);
        setField(term127, term127.getClass(), "host", "");
        setIntField(term127, term127.getClass(), "port", -1);
        setField(term127, term127.getClass(), "path", "");
        setField(term127, term127.getClass(), "query", null);
        setField(term127, term127.getClass(), "schemeSpecificPart", null);
        setIntField(term127, term127.getClass(), "hash", 0);
        setField(term127, term127.getClass(), "decodedUserInfo", null);
        setField(term127, term127.getClass(), "decodedAuthority", null);
        setField(term127, term127.getClass(), "decodedPath", null);
        setField(term127, term127.getClass(), "decodedQuery", null);
        setField(term127, term127.getClass(), "decodedFragment", null);
        setField(term127, term127.getClass(), "decodedSchemeSpecificPart", null);
        setField(term127, term127.getClass(), "string", "");
        Object term135 = newInstance(Class.forName("java.net.URI"));
        setField(term135, term135.getClass(), "scheme", "");
        setField(term135, term135.getClass(), "fragment", null);
        setField(term135, term135.getClass(), "authority", "");
        setField(term135, term135.getClass(), "userInfo", null);
        setField(term135, term135.getClass(), "host", "");
        setIntField(term135, term135.getClass(), "port", -1);
        setField(term135, term135.getClass(), "path", "");
        setField(term135, term135.getClass(), "query", null);
        setField(term135, term135.getClass(), "schemeSpecificPart", null);
        setIntField(term135, term135.getClass(), "hash", 0);
        setField(term135, term135.getClass(), "decodedUserInfo", null);
        setField(term135, term135.getClass(), "decodedAuthority", null);
        setField(term135, term135.getClass(), "decodedPath", null);
        setField(term135, term135.getClass(), "decodedQuery", null);
        setField(term135, term135.getClass(), "decodedFragment", null);
        setField(term135, term135.getClass(), "decodedSchemeSpecificPart", null);
        setField(term135, term135.getClass(), "string", "");
        Object term143 = newInstance(Class.forName("java.net.URI"));
        setField(term143, term143.getClass(), "scheme", "");
        setField(term143, term143.getClass(), "fragment", null);
        setField(term143, term143.getClass(), "authority", "");
        setField(term143, term143.getClass(), "userInfo", null);
        setField(term143, term143.getClass(), "host", "");
        setIntField(term143, term143.getClass(), "port", 80);
        setField(term143, term143.getClass(), "path", "");
        setField(term143, term143.getClass(), "query", null);
        setField(term143, term143.getClass(), "schemeSpecificPart", null);
        setIntField(term143, term143.getClass(), "hash", 0);
        setField(term143, term143.getClass(), "decodedUserInfo", null);
        setField(term143, term143.getClass(), "decodedAuthority", null);
        setField(term143, term143.getClass(), "decodedPath", null);
        setField(term143, term143.getClass(), "decodedQuery", null);
        setField(term143, term143.getClass(), "decodedFragment", null);
        setField(term143, term143.getClass(), "decodedSchemeSpecificPart", null);
        setField(term143, term143.getClass(), "string", "");
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add(term119);
        ((ArrayList) term117).add(term127);
        ((ArrayList) term117).add(term135);
        ((ArrayList) term117).add(term143);
        term91 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term91, term91.getClass(), "id", 6375119433582206027L);
        setField(term91, term91.getClass(), "title", "MuLcgQHgqz");
        setField(term91, term91.getClass(), "body", "xxtlPwDYFs");
        setField(term91, term91.getClass(), "tagUris", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.service.CrudMockServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Object[] args = new Object[2];
        args[0] = term89;
        args[1] = term91;
        callMethod(klass, "update", argTypes, null, args);
    }

};


