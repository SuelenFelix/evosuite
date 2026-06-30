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

public class Crud_getId_13750696523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1658;

    public Crud_getId_13750696523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1686 = newInstance(Class.forName("java.net.URI"));
        setField(term1686, term1686.getClass(), "scheme", "");
        setField(term1686, term1686.getClass(), "fragment", null);
        setField(term1686, term1686.getClass(), "authority", "");
        setField(term1686, term1686.getClass(), "userInfo", null);
        setField(term1686, term1686.getClass(), "host", "");
        setIntField(term1686, term1686.getClass(), "port", -1);
        setField(term1686, term1686.getClass(), "path", "");
        setField(term1686, term1686.getClass(), "query", null);
        setField(term1686, term1686.getClass(), "schemeSpecificPart", null);
        setIntField(term1686, term1686.getClass(), "hash", 0);
        setField(term1686, term1686.getClass(), "decodedUserInfo", null);
        setField(term1686, term1686.getClass(), "decodedAuthority", null);
        setField(term1686, term1686.getClass(), "decodedPath", null);
        setField(term1686, term1686.getClass(), "decodedQuery", null);
        setField(term1686, term1686.getClass(), "decodedFragment", null);
        setField(term1686, term1686.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1686, term1686.getClass(), "string", "");
        ArrayList term1684 = new ArrayList();
        ((ArrayList) term1684).add(term1686);
        term1658 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term1658, term1658.getClass(), "id", -2813493605142626659L);
        setField(term1658, term1658.getClass(), "title", "nGKItKLYNC");
        setField(term1658, term1658.getClass(), "body", "UiUYnPrcCi");
        setField(term1658, term1658.getClass(), "tagUris", term1684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1658, args);
    }

};


