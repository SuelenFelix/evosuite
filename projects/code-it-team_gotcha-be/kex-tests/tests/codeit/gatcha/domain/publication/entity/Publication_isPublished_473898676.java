package codeit.gatcha.domain.publication.entity;

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
import static codeit.gatcha.domain.publication.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Publication_isPublished_473898676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public Publication_isPublished_473898676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1292 = new Integer(229204365);
        Integer term1295 = new Integer(-461771056);
        Integer term1298 = new Integer(-243422082);
        HashMap term1313 = new HashMap();
        Set<Object> term1368 =  ((Map) term1313).keySet();
        HashSet term1312 = new HashSet((Collection<? extends Object>) term1368);
        term1291 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication"));
        Object term1294 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1297 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term1343 = newInstance(Class.forName("java.util.Date"));
        setField(term1291, term1291.getClass(), "id", term1292);
        setField(term1294, term1294.getClass(), "id", term1295);
        setField(term1297, term1297.getClass(), "id", term1298);
        setField(term1297, term1297.getClass(), "role", "beAMpkroCQ");
        setField(term1297, term1297.getClass(), "users", term1312);
        setField(term1294, term1294.getClass(), "authority", term1297);
        setField(term1294, term1294.getClass(), "email", "TtGbVmKcnX");
        setField(term1294, term1294.getClass(), "password", "GJVkUrCVdD");
        setBooleanField(term1294, term1294.getClass(), "enabled", true);
        setField(term1291, term1291.getClass(), "gatchaUser", term1294);
        setLongField(term1343, term1343.getClass(), "fastTime", 1745462962080L);
        setField(term1343, term1343.getClass(), "cdate", null);
        setField(term1291, term1291.getClass(), "publicationDate", term1343);
        setBooleanField(term1291, term1291.getClass(), "published", false);
        setField(term1291, term1291.getClass(), "linkUniqueString", "zNdorvdUgu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPublished", argTypes, term1291, args);
    }

};


