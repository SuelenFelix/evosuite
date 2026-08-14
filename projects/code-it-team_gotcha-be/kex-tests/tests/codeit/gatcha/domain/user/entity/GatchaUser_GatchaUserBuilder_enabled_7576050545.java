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
     Object term1889;
     Object term1939;

    public GatchaUser_GatchaUserBuilder_enabled_7576050545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1890 = new Integer(-1972436591);
        Integer term1893 = new Integer(68922753);
        HashMap term1908 = new HashMap();
        Set<Object> term1951 =  ((Map) term1908).keySet();
        HashSet term1907 = new HashSet((Collection<? extends Object>) term1951);
        term1889 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1892 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1889, term1889.getClass(), "id", term1890);
        setField(term1892, term1892.getClass(), "id", term1893);
        setField(term1892, term1892.getClass(), "role", "EULDrUNQvw");
        setField(term1892, term1892.getClass(), "users", term1907);
        setField(term1889, term1889.getClass(), "authority", term1892);
        setField(term1889, term1889.getClass(), "email", "lQFkjJUPAR");
        setField(term1889, term1889.getClass(), "password", "BsuVlGUUjV");
        setBooleanField(term1889, term1889.getClass(), "enabled", true);
        term1939 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1939;
        callMethod(klass, "enabled", argTypes, term1889, args);
    }

};


