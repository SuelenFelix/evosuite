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
import java.util.LinkedList;

public class Crud_setTagUris_7738658507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2028;
     Object term2074;

    public Crud_setTagUris_7738658507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2056 = newInstance(Class.forName("java.net.URI"));
        setField(term2056, term2056.getClass(), "scheme", "");
        setField(term2056, term2056.getClass(), "fragment", null);
        setField(term2056, term2056.getClass(), "authority", "");
        setField(term2056, term2056.getClass(), "userInfo", null);
        setField(term2056, term2056.getClass(), "host", "");
        setIntField(term2056, term2056.getClass(), "port", -1);
        setField(term2056, term2056.getClass(), "path", "");
        setField(term2056, term2056.getClass(), "query", null);
        setField(term2056, term2056.getClass(), "schemeSpecificPart", null);
        setIntField(term2056, term2056.getClass(), "hash", 0);
        setField(term2056, term2056.getClass(), "decodedUserInfo", null);
        setField(term2056, term2056.getClass(), "decodedAuthority", null);
        setField(term2056, term2056.getClass(), "decodedPath", null);
        setField(term2056, term2056.getClass(), "decodedQuery", null);
        setField(term2056, term2056.getClass(), "decodedFragment", null);
        setField(term2056, term2056.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2056, term2056.getClass(), "string", "");
        Object term2064 = newInstance(Class.forName("java.net.URI"));
        setField(term2064, term2064.getClass(), "scheme", "");
        setField(term2064, term2064.getClass(), "fragment", null);
        setField(term2064, term2064.getClass(), "authority", "");
        setField(term2064, term2064.getClass(), "userInfo", null);
        setField(term2064, term2064.getClass(), "host", "");
        setIntField(term2064, term2064.getClass(), "port", -1);
        setField(term2064, term2064.getClass(), "path", "");
        setField(term2064, term2064.getClass(), "query", null);
        setField(term2064, term2064.getClass(), "schemeSpecificPart", null);
        setIntField(term2064, term2064.getClass(), "hash", 0);
        setField(term2064, term2064.getClass(), "decodedUserInfo", null);
        setField(term2064, term2064.getClass(), "decodedAuthority", null);
        setField(term2064, term2064.getClass(), "decodedPath", null);
        setField(term2064, term2064.getClass(), "decodedQuery", null);
        setField(term2064, term2064.getClass(), "decodedFragment", null);
        setField(term2064, term2064.getClass(), "decodedSchemeSpecificPart", null);
        setField(term2064, term2064.getClass(), "string", "");
        ArrayList term2054 = new ArrayList();
        ((ArrayList) term2054).add(term2056);
        ((ArrayList) term2054).add(term2064);
        term2028 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term2028, term2028.getClass(), "id", -872011222785455006L);
        setField(term2028, term2028.getClass(), "title", "ieCtQFdkii");
        setField(term2028, term2028.getClass(), "body", "dEnhdmILtU");
        setField(term2028, term2028.getClass(), "tagUris", term2054);
        term2074 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2074;
        callMethod(klass, "setTagUris", argTypes, term2028, args);
    }

};


