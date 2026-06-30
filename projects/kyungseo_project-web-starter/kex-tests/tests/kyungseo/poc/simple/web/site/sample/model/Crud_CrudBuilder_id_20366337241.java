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
import java.lang.Long;

public class Crud_CrudBuilder_id_20366337241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;
     Object term496;

    public Crud_CrudBuilder_id_20366337241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term458 = newInstance(Class.forName("java.net.URI"));
        setField(term458, term458.getClass(), "scheme", "");
        setField(term458, term458.getClass(), "fragment", null);
        setField(term458, term458.getClass(), "authority", "");
        setField(term458, term458.getClass(), "userInfo", null);
        setField(term458, term458.getClass(), "host", "");
        setIntField(term458, term458.getClass(), "port", 80);
        setField(term458, term458.getClass(), "path", "");
        setField(term458, term458.getClass(), "query", null);
        setField(term458, term458.getClass(), "schemeSpecificPart", null);
        setIntField(term458, term458.getClass(), "hash", 0);
        setField(term458, term458.getClass(), "decodedUserInfo", null);
        setField(term458, term458.getClass(), "decodedAuthority", null);
        setField(term458, term458.getClass(), "decodedPath", null);
        setField(term458, term458.getClass(), "decodedQuery", null);
        setField(term458, term458.getClass(), "decodedFragment", null);
        setField(term458, term458.getClass(), "decodedSchemeSpecificPart", null);
        setField(term458, term458.getClass(), "string", "");
        Object term466 = newInstance(Class.forName("java.net.URI"));
        setField(term466, term466.getClass(), "scheme", "");
        setField(term466, term466.getClass(), "fragment", null);
        setField(term466, term466.getClass(), "authority", null);
        setField(term466, term466.getClass(), "userInfo", null);
        setField(term466, term466.getClass(), "host", null);
        setIntField(term466, term466.getClass(), "port", -1);
        setField(term466, term466.getClass(), "path", null);
        setField(term466, term466.getClass(), "query", null);
        setField(term466, term466.getClass(), "schemeSpecificPart", "");
        setIntField(term466, term466.getClass(), "hash", 0);
        setField(term466, term466.getClass(), "decodedUserInfo", null);
        setField(term466, term466.getClass(), "decodedAuthority", null);
        setField(term466, term466.getClass(), "decodedPath", null);
        setField(term466, term466.getClass(), "decodedQuery", null);
        setField(term466, term466.getClass(), "decodedFragment", null);
        setField(term466, term466.getClass(), "decodedSchemeSpecificPart", null);
        setField(term466, term466.getClass(), "string", "");
        Object term472 = newInstance(Class.forName("java.net.URI"));
        setField(term472, term472.getClass(), "scheme", "");
        setField(term472, term472.getClass(), "fragment", null);
        setField(term472, term472.getClass(), "authority", "");
        setField(term472, term472.getClass(), "userInfo", null);
        setField(term472, term472.getClass(), "host", "");
        setIntField(term472, term472.getClass(), "port", -1);
        setField(term472, term472.getClass(), "path", "");
        setField(term472, term472.getClass(), "query", null);
        setField(term472, term472.getClass(), "schemeSpecificPart", null);
        setIntField(term472, term472.getClass(), "hash", 0);
        setField(term472, term472.getClass(), "decodedUserInfo", null);
        setField(term472, term472.getClass(), "decodedAuthority", null);
        setField(term472, term472.getClass(), "decodedPath", null);
        setField(term472, term472.getClass(), "decodedQuery", null);
        setField(term472, term472.getClass(), "decodedFragment", null);
        setField(term472, term472.getClass(), "decodedSchemeSpecificPart", null);
        setField(term472, term472.getClass(), "string", "");
        Object term480 = newInstance(Class.forName("java.net.URI"));
        setField(term480, term480.getClass(), "scheme", "");
        setField(term480, term480.getClass(), "fragment", null);
        setField(term480, term480.getClass(), "authority", "");
        setField(term480, term480.getClass(), "userInfo", null);
        setField(term480, term480.getClass(), "host", "");
        setIntField(term480, term480.getClass(), "port", -1);
        setField(term480, term480.getClass(), "path", "");
        setField(term480, term480.getClass(), "query", null);
        setField(term480, term480.getClass(), "schemeSpecificPart", null);
        setIntField(term480, term480.getClass(), "hash", 0);
        setField(term480, term480.getClass(), "decodedUserInfo", null);
        setField(term480, term480.getClass(), "decodedAuthority", null);
        setField(term480, term480.getClass(), "decodedPath", null);
        setField(term480, term480.getClass(), "decodedQuery", null);
        setField(term480, term480.getClass(), "decodedFragment", null);
        setField(term480, term480.getClass(), "decodedSchemeSpecificPart", null);
        setField(term480, term480.getClass(), "string", "");
        Object term488 = newInstance(Class.forName("java.net.URI"));
        setField(term488, term488.getClass(), "scheme", "");
        setField(term488, term488.getClass(), "fragment", null);
        setField(term488, term488.getClass(), "authority", null);
        setField(term488, term488.getClass(), "userInfo", null);
        setField(term488, term488.getClass(), "host", null);
        setIntField(term488, term488.getClass(), "port", -1);
        setField(term488, term488.getClass(), "path", null);
        setField(term488, term488.getClass(), "query", null);
        setField(term488, term488.getClass(), "schemeSpecificPart", "");
        setIntField(term488, term488.getClass(), "hash", 0);
        setField(term488, term488.getClass(), "decodedUserInfo", null);
        setField(term488, term488.getClass(), "decodedAuthority", null);
        setField(term488, term488.getClass(), "decodedPath", null);
        setField(term488, term488.getClass(), "decodedQuery", null);
        setField(term488, term488.getClass(), "decodedFragment", null);
        setField(term488, term488.getClass(), "decodedSchemeSpecificPart", null);
        setField(term488, term488.getClass(), "string", "");
        ArrayList term456 = new ArrayList();
        ((ArrayList) term456).add(term458);
        ((ArrayList) term456).add(term466);
        ((ArrayList) term456).add(term472);
        ((ArrayList) term456).add(term480);
        ((ArrayList) term456).add(term488);
        term430 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term430, term430.getClass(), "id", 2442117782898005296L);
        setField(term430, term430.getClass(), "title", "HyxfbSQYBe");
        setField(term430, term430.getClass(), "body", "pCTimMblYc");
        setField(term430, term430.getClass(), "tagUris", term456);
        term496 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term496;
        callMethod(klass, "id", argTypes, term430, args);
    }

};


