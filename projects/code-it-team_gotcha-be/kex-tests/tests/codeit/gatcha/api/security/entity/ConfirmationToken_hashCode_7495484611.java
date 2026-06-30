package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_hashCode_7495484611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261;

    public ConfirmationToken_hashCode_7495484611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1262 = new Integer(-601863069);
        Integer term1279 = new Integer(663292551);
        Integer term1282 = new Integer(-1885090354);
        HashMap term1297 = new HashMap();
        Set<Object> term1347 =  ((Map) term1297).keySet();
        HashSet term1296 = new HashSet((Collection<? extends Object>) term1347);
        term1261 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term1276 = newInstance(Class.forName("java.util.Date"));
        Object term1278 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1281 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1261, term1261.getClass(), "id", term1262);
        setField(term1261, term1261.getClass(), "confirmationToken", "pXdglvyrQe");
        setLongField(term1276, term1276.getClass(), "fastTime", 1589457921030L);
        setField(term1276, term1276.getClass(), "cdate", null);
        setField(term1261, term1261.getClass(), "createdDate", term1276);
        setField(term1278, term1278.getClass(), "id", term1279);
        setField(term1281, term1281.getClass(), "id", term1282);
        setField(term1281, term1281.getClass(), "role", "OcfNzHYdki");
        setField(term1281, term1281.getClass(), "users", term1296);
        setField(term1278, term1278.getClass(), "authority", term1281);
        setField(term1278, term1278.getClass(), "email", "PXdVZyoJyC");
        setField(term1278, term1278.getClass(), "password", "vLerpqavFM");
        setBooleanField(term1278, term1278.getClass(), "enabled", true);
        setField(term1261, term1261.getClass(), "user", term1278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1261, args);
    }

};


