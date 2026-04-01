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

public class Crud_CrudBuilder_body_4974492463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public Crud_CrudBuilder_body_4974492463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term650 = newInstance(Class.forName("java.net.URI"));
        setField(term650, term650.getClass(), "scheme", "");
        setField(term650, term650.getClass(), "fragment", null);
        setField(term650, term650.getClass(), "authority", "");
        setField(term650, term650.getClass(), "userInfo", null);
        setField(term650, term650.getClass(), "host", "");
        setIntField(term650, term650.getClass(), "port", 80);
        setField(term650, term650.getClass(), "path", "");
        setField(term650, term650.getClass(), "query", null);
        setField(term650, term650.getClass(), "schemeSpecificPart", null);
        setIntField(term650, term650.getClass(), "hash", 0);
        setField(term650, term650.getClass(), "decodedUserInfo", null);
        setField(term650, term650.getClass(), "decodedAuthority", null);
        setField(term650, term650.getClass(), "decodedPath", null);
        setField(term650, term650.getClass(), "decodedQuery", null);
        setField(term650, term650.getClass(), "decodedFragment", null);
        setField(term650, term650.getClass(), "decodedSchemeSpecificPart", null);
        setField(term650, term650.getClass(), "string", "");
        Object term658 = newInstance(Class.forName("java.net.URI"));
        setField(term658, term658.getClass(), "scheme", "");
        setField(term658, term658.getClass(), "fragment", null);
        setField(term658, term658.getClass(), "authority", "");
        setField(term658, term658.getClass(), "userInfo", null);
        setField(term658, term658.getClass(), "host", "");
        setIntField(term658, term658.getClass(), "port", -1);
        setField(term658, term658.getClass(), "path", "");
        setField(term658, term658.getClass(), "query", null);
        setField(term658, term658.getClass(), "schemeSpecificPart", null);
        setIntField(term658, term658.getClass(), "hash", 0);
        setField(term658, term658.getClass(), "decodedUserInfo", null);
        setField(term658, term658.getClass(), "decodedAuthority", null);
        setField(term658, term658.getClass(), "decodedPath", null);
        setField(term658, term658.getClass(), "decodedQuery", null);
        setField(term658, term658.getClass(), "decodedFragment", null);
        setField(term658, term658.getClass(), "decodedSchemeSpecificPart", null);
        setField(term658, term658.getClass(), "string", "");
        Object term666 = newInstance(Class.forName("java.net.URI"));
        setField(term666, term666.getClass(), "scheme", "");
        setField(term666, term666.getClass(), "fragment", null);
        setField(term666, term666.getClass(), "authority", "");
        setField(term666, term666.getClass(), "userInfo", null);
        setField(term666, term666.getClass(), "host", "");
        setIntField(term666, term666.getClass(), "port", -1);
        setField(term666, term666.getClass(), "path", "");
        setField(term666, term666.getClass(), "query", null);
        setField(term666, term666.getClass(), "schemeSpecificPart", null);
        setIntField(term666, term666.getClass(), "hash", 0);
        setField(term666, term666.getClass(), "decodedUserInfo", null);
        setField(term666, term666.getClass(), "decodedAuthority", null);
        setField(term666, term666.getClass(), "decodedPath", null);
        setField(term666, term666.getClass(), "decodedQuery", null);
        setField(term666, term666.getClass(), "decodedFragment", null);
        setField(term666, term666.getClass(), "decodedSchemeSpecificPart", null);
        setField(term666, term666.getClass(), "string", "");
        ArrayList term648 = new ArrayList();
        ((ArrayList) term648).add(term650);
        ((ArrayList) term648).add(term658);
        ((ArrayList) term648).add(term666);
        term622 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term622, term622.getClass(), "id", -8400487765614892086L);
        setField(term622, term622.getClass(), "title", "eZFUvlxvGV");
        setField(term622, term622.getClass(), "body", "BYqFIqCKAV");
        setField(term622, term622.getClass(), "tagUris", term648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "body", argTypes, term622, args);
    }

};


