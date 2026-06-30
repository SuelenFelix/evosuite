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

public class Crud_getBody_3202831682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1554;

    public Crud_getBody_3202831682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1582 = newInstance(Class.forName("java.net.URI"));
        setField(term1582, term1582.getClass(), "scheme", "");
        setField(term1582, term1582.getClass(), "fragment", null);
        setField(term1582, term1582.getClass(), "authority", "");
        setField(term1582, term1582.getClass(), "userInfo", null);
        setField(term1582, term1582.getClass(), "host", "");
        setIntField(term1582, term1582.getClass(), "port", -1);
        setField(term1582, term1582.getClass(), "path", "");
        setField(term1582, term1582.getClass(), "query", null);
        setField(term1582, term1582.getClass(), "schemeSpecificPart", null);
        setIntField(term1582, term1582.getClass(), "hash", 0);
        setField(term1582, term1582.getClass(), "decodedUserInfo", null);
        setField(term1582, term1582.getClass(), "decodedAuthority", null);
        setField(term1582, term1582.getClass(), "decodedPath", null);
        setField(term1582, term1582.getClass(), "decodedQuery", null);
        setField(term1582, term1582.getClass(), "decodedFragment", null);
        setField(term1582, term1582.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1582, term1582.getClass(), "string", "");
        Object term1590 = newInstance(Class.forName("java.net.URI"));
        setField(term1590, term1590.getClass(), "scheme", "");
        setField(term1590, term1590.getClass(), "fragment", null);
        setField(term1590, term1590.getClass(), "authority", "");
        setField(term1590, term1590.getClass(), "userInfo", null);
        setField(term1590, term1590.getClass(), "host", "");
        setIntField(term1590, term1590.getClass(), "port", -1);
        setField(term1590, term1590.getClass(), "path", "");
        setField(term1590, term1590.getClass(), "query", null);
        setField(term1590, term1590.getClass(), "schemeSpecificPart", null);
        setIntField(term1590, term1590.getClass(), "hash", 0);
        setField(term1590, term1590.getClass(), "decodedUserInfo", null);
        setField(term1590, term1590.getClass(), "decodedAuthority", null);
        setField(term1590, term1590.getClass(), "decodedPath", null);
        setField(term1590, term1590.getClass(), "decodedQuery", null);
        setField(term1590, term1590.getClass(), "decodedFragment", null);
        setField(term1590, term1590.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1590, term1590.getClass(), "string", "");
        Object term1598 = newInstance(Class.forName("java.net.URI"));
        setField(term1598, term1598.getClass(), "scheme", "");
        setField(term1598, term1598.getClass(), "fragment", null);
        setField(term1598, term1598.getClass(), "authority", "");
        setField(term1598, term1598.getClass(), "userInfo", null);
        setField(term1598, term1598.getClass(), "host", "");
        setIntField(term1598, term1598.getClass(), "port", -1);
        setField(term1598, term1598.getClass(), "path", "");
        setField(term1598, term1598.getClass(), "query", null);
        setField(term1598, term1598.getClass(), "schemeSpecificPart", null);
        setIntField(term1598, term1598.getClass(), "hash", 0);
        setField(term1598, term1598.getClass(), "decodedUserInfo", null);
        setField(term1598, term1598.getClass(), "decodedAuthority", null);
        setField(term1598, term1598.getClass(), "decodedPath", null);
        setField(term1598, term1598.getClass(), "decodedQuery", null);
        setField(term1598, term1598.getClass(), "decodedFragment", null);
        setField(term1598, term1598.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1598, term1598.getClass(), "string", "");
        Object term1606 = newInstance(Class.forName("java.net.URI"));
        setField(term1606, term1606.getClass(), "scheme", "");
        setField(term1606, term1606.getClass(), "fragment", null);
        setField(term1606, term1606.getClass(), "authority", "");
        setField(term1606, term1606.getClass(), "userInfo", null);
        setField(term1606, term1606.getClass(), "host", "");
        setIntField(term1606, term1606.getClass(), "port", -1);
        setField(term1606, term1606.getClass(), "path", "");
        setField(term1606, term1606.getClass(), "query", null);
        setField(term1606, term1606.getClass(), "schemeSpecificPart", null);
        setIntField(term1606, term1606.getClass(), "hash", 0);
        setField(term1606, term1606.getClass(), "decodedUserInfo", null);
        setField(term1606, term1606.getClass(), "decodedAuthority", null);
        setField(term1606, term1606.getClass(), "decodedPath", null);
        setField(term1606, term1606.getClass(), "decodedQuery", null);
        setField(term1606, term1606.getClass(), "decodedFragment", null);
        setField(term1606, term1606.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1606, term1606.getClass(), "string", "");
        Object term1614 = newInstance(Class.forName("java.net.URI"));
        setField(term1614, term1614.getClass(), "scheme", "");
        setField(term1614, term1614.getClass(), "fragment", null);
        setField(term1614, term1614.getClass(), "authority", null);
        setField(term1614, term1614.getClass(), "userInfo", null);
        setField(term1614, term1614.getClass(), "host", null);
        setIntField(term1614, term1614.getClass(), "port", -1);
        setField(term1614, term1614.getClass(), "path", null);
        setField(term1614, term1614.getClass(), "query", null);
        setField(term1614, term1614.getClass(), "schemeSpecificPart", "");
        setIntField(term1614, term1614.getClass(), "hash", 0);
        setField(term1614, term1614.getClass(), "decodedUserInfo", null);
        setField(term1614, term1614.getClass(), "decodedAuthority", null);
        setField(term1614, term1614.getClass(), "decodedPath", null);
        setField(term1614, term1614.getClass(), "decodedQuery", null);
        setField(term1614, term1614.getClass(), "decodedFragment", null);
        setField(term1614, term1614.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1614, term1614.getClass(), "string", "");
        Object term1620 = newInstance(Class.forName("java.net.URI"));
        setField(term1620, term1620.getClass(), "scheme", "");
        setField(term1620, term1620.getClass(), "fragment", null);
        setField(term1620, term1620.getClass(), "authority", "");
        setField(term1620, term1620.getClass(), "userInfo", null);
        setField(term1620, term1620.getClass(), "host", "");
        setIntField(term1620, term1620.getClass(), "port", -1);
        setField(term1620, term1620.getClass(), "path", "");
        setField(term1620, term1620.getClass(), "query", null);
        setField(term1620, term1620.getClass(), "schemeSpecificPart", null);
        setIntField(term1620, term1620.getClass(), "hash", 0);
        setField(term1620, term1620.getClass(), "decodedUserInfo", null);
        setField(term1620, term1620.getClass(), "decodedAuthority", null);
        setField(term1620, term1620.getClass(), "decodedPath", null);
        setField(term1620, term1620.getClass(), "decodedQuery", null);
        setField(term1620, term1620.getClass(), "decodedFragment", null);
        setField(term1620, term1620.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1620, term1620.getClass(), "string", "");
        Object term1628 = newInstance(Class.forName("java.net.URI"));
        setField(term1628, term1628.getClass(), "scheme", "");
        setField(term1628, term1628.getClass(), "fragment", null);
        setField(term1628, term1628.getClass(), "authority", "");
        setField(term1628, term1628.getClass(), "userInfo", null);
        setField(term1628, term1628.getClass(), "host", "");
        setIntField(term1628, term1628.getClass(), "port", -1);
        setField(term1628, term1628.getClass(), "path", "");
        setField(term1628, term1628.getClass(), "query", null);
        setField(term1628, term1628.getClass(), "schemeSpecificPart", null);
        setIntField(term1628, term1628.getClass(), "hash", 0);
        setField(term1628, term1628.getClass(), "decodedUserInfo", null);
        setField(term1628, term1628.getClass(), "decodedAuthority", null);
        setField(term1628, term1628.getClass(), "decodedPath", null);
        setField(term1628, term1628.getClass(), "decodedQuery", null);
        setField(term1628, term1628.getClass(), "decodedFragment", null);
        setField(term1628, term1628.getClass(), "decodedSchemeSpecificPart", null);
        setField(term1628, term1628.getClass(), "string", "");
        ArrayList term1580 = new ArrayList();
        ((ArrayList) term1580).add(term1582);
        ((ArrayList) term1580).add(term1590);
        ((ArrayList) term1580).add(term1598);
        ((ArrayList) term1580).add(term1606);
        ((ArrayList) term1580).add(term1614);
        ((ArrayList) term1580).add(term1620);
        ((ArrayList) term1580).add(term1628);
        term1554 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud"));
        setLongField(term1554, term1554.getClass(), "id", 6967924379644551255L);
        setField(term1554, term1554.getClass(), "title", "xLbjWUgOIL");
        setField(term1554, term1554.getClass(), "body", "jDtqGUpnZN");
        setField(term1554, term1554.getClass(), "tagUris", term1580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term1554, args);
    }

};


