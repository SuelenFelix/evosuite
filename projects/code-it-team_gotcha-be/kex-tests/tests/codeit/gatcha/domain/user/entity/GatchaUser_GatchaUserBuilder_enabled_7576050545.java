package codeit.gatcha.domain.user.entity;

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
import static codeit.gatcha.domain.user.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class GatchaUser_GatchaUserBuilder_enabled_7576050545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1885;
     Object term1935;

    public GatchaUser_GatchaUserBuilder_enabled_7576050545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1886 = new Integer(-1972436591);
        Integer term1889 = new Integer(68922753);
        HashMap term1904 = new HashMap();
        Set<Object> term1947 =  ((Map) term1904).keySet();
        HashSet term1903 = new HashSet((Collection<? extends Object>) term1947);
        term1885 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1888 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1885, term1885.getClass(), "id", term1886);
        setField(term1888, term1888.getClass(), "id", term1889);
        setField(term1888, term1888.getClass(), "role", "EULDrUNQvw");
        setField(term1888, term1888.getClass(), "users", term1903);
        setField(term1885, term1885.getClass(), "authority", term1888);
        setField(term1885, term1885.getClass(), "email", "lQFkjJUPAR");
        setField(term1885, term1885.getClass(), "password", "BsuVlGUUjV");
        setBooleanField(term1885, term1885.getClass(), "enabled", true);
        term1935 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1935;
        callMethod(klass, "enabled", argTypes, term1885, args);
    }

};


