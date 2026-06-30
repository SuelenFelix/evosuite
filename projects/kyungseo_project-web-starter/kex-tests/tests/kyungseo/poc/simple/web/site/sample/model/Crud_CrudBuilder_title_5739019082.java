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

public class Crud_CrudBuilder_title_5739019082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518;

    public Crud_CrudBuilder_title_5739019082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term546 = newInstance(Class.forName("java.net.URI"));
        setField(term546, term546.getClass(), "scheme", "");
        setField(term546, term546.getClass(), "fragment", null);
        setField(term546, term546.getClass(), "authority", "");
        setField(term546, term546.getClass(), "userInfo", null);
        setField(term546, term546.getClass(), "host", "");
        setIntField(term546, term546.getClass(), "port", -1);
        setField(term546, term546.getClass(), "path", "");
        setField(term546, term546.getClass(), "query", null);
        setField(term546, term546.getClass(), "schemeSpecificPart", null);
        setIntField(term546, term546.getClass(), "hash", 0);
        setField(term546, term546.getClass(), "decodedUserInfo", null);
        setField(term546, term546.getClass(), "decodedAuthority", null);
        setField(term546, term546.getClass(), "decodedPath", null);
        setField(term546, term546.getClass(), "decodedQuery", null);
        setField(term546, term546.getClass(), "decodedFragment", null);
        setField(term546, term546.getClass(), "decodedSchemeSpecificPart", null);
        setField(term546, term546.getClass(), "string", "");
        Object term554 = newInstance(Class.forName("java.net.URI"));
        setField(term554, term554.getClass(), "scheme", "");
        setField(term554, term554.getClass(), "fragment", null);
        setField(term554, term554.getClass(), "authority", "");
        setField(term554, term554.getClass(), "userInfo", null);
        setField(term554, term554.getClass(), "host", "");
        setIntField(term554, term554.getClass(), "port", -1);
        setField(term554, term554.getClass(), "path", "");
        setField(term554, term554.getClass(), "query", null);
        setField(term554, term554.getClass(), "schemeSpecificPart", null);
        setIntField(term554, term554.getClass(), "hash", 0);
        setField(term554, term554.getClass(), "decodedUserInfo", null);
        setField(term554, term554.getClass(), "decodedAuthority", null);
        setField(term554, term554.getClass(), "decodedPath", null);
        setField(term554, term554.getClass(), "decodedQuery", null);
        setField(term554, term554.getClass(), "decodedFragment", null);
        setField(term554, term554.getClass(), "decodedSchemeSpecificPart", null);
        setField(term554, term554.getClass(), "string", "");
        Object term562 = newInstance(Class.forName("java.net.URI"));
        setField(term562, term562.getClass(), "scheme", "");
        setField(term562, term562.getClass(), "fragment", null);
        setField(term562, term562.getClass(), "authority", "");
        setField(term562, term562.getClass(), "userInfo", null);
        setField(term562, term562.getClass(), "host", "");
        setIntField(term562, term562.getClass(), "port", -1);
        setField(term562, term562.getClass(), "path", "");
        setField(term562, term562.getClass(), "query", null);
        setField(term562, term562.getClass(), "schemeSpecificPart", null);
        setIntField(term562, term562.getClass(), "hash", 0);
        setField(term562, term562.getClass(), "decodedUserInfo", null);
        setField(term562, term562.getClass(), "decodedAuthority", null);
        setField(term562, term562.getClass(), "decodedPath", null);
        setField(term562, term562.getClass(), "decodedQuery", null);
        setField(term562, term562.getClass(), "decodedFragment", null);
        setField(term562, term562.getClass(), "decodedSchemeSpecificPart", null);
        setField(term562, term562.getClass(), "string", "");
        Object term570 = newInstance(Class.forName("java.net.URI"));
        setField(term570, term570.getClass(), "scheme", "");
        setField(term570, term570.getClass(), "fragment", null);
        setField(term570, term570.getClass(), "authority", "");
        setField(term570, term570.getClass(), "userInfo", null);
        setField(term570, term570.getClass(), "host", "");
        setIntField(term570, term570.getClass(), "port", 80);
        setField(term570, term570.getClass(), "path", "");
        setField(term570, term570.getClass(), "query", null);
        setField(term570, term570.getClass(), "schemeSpecificPart", null);
        setIntField(term570, term570.getClass(), "hash", 0);
        setField(term570, term570.getClass(), "decodedUserInfo", null);
        setField(term570, term570.getClass(), "decodedAuthority", null);
        setField(term570, term570.getClass(), "decodedPath", null);
        setField(term570, term570.getClass(), "decodedQuery", null);
        setField(term570, term570.getClass(), "decodedFragment", null);
        setField(term570, term570.getClass(), "decodedSchemeSpecificPart", null);
        setField(term570, term570.getClass(), "string", "");
        ArrayList term544 = new ArrayList();
        ((ArrayList) term544).add(term546);
        ((ArrayList) term544).add(term554);
        ((ArrayList) term544).add(term562);
        ((ArrayList) term544).add(term570);
        term518 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term518, term518.getClass(), "id", -8257434502486459194L);
        setField(term518, term518.getClass(), "title", "hNxWaHcfhY");
        setField(term518, term518.getClass(), "body", "RkybSrpybU");
        setField(term518, term518.getClass(), "tagUris", term544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "title", argTypes, term518, args);
    }

};


