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
     Object term1881;
     Object term1931;

    public GatchaUser_GatchaUserBuilder_enabled_7576050545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1882 = new Integer(-1972436591);
        Integer term1885 = new Integer(68922753);
        HashMap term1900 = new HashMap();
        Set<Object> term1943 =  ((Map) term1900).keySet();
        HashSet term1899 = new HashSet((Collection<? extends Object>) term1943);
        term1881 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1884 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1881, term1881.getClass(), "id", term1882);
        setField(term1884, term1884.getClass(), "id", term1885);
        setField(term1884, term1884.getClass(), "role", "EULDrUNQvw");
        setField(term1884, term1884.getClass(), "users", term1899);
        setField(term1881, term1881.getClass(), "authority", term1884);
        setField(term1881, term1881.getClass(), "email", "lQFkjJUPAR");
        setField(term1881, term1881.getClass(), "password", "BsuVlGUUjV");
        setBooleanField(term1881, term1881.getClass(), "enabled", true);
        term1931 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1931;
        callMethod(klass, "enabled", argTypes, term1881, args);
    }

};


