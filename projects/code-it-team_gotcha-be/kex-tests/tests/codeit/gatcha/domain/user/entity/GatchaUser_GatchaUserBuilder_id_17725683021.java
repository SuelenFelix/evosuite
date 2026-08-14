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

public class GatchaUser_GatchaUserBuilder_id_17725683021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480;
     Object term1530;

    public GatchaUser_GatchaUserBuilder_id_17725683021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1481 = new Integer(-945116798);
        Integer term1484 = new Integer(1593461795);
        HashMap term1499 = new HashMap();
        Set<Object> term1542 =  ((Map) term1499).keySet();
        HashSet term1498 = new HashSet((Collection<? extends Object>) term1542);
        term1480 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1483 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1480, term1480.getClass(), "id", term1481);
        setField(term1483, term1483.getClass(), "id", term1484);
        setField(term1483, term1483.getClass(), "role", "UimMMORkzd");
        setField(term1483, term1483.getClass(), "users", term1498);
        setField(term1480, term1480.getClass(), "authority", term1483);
        setField(term1480, term1480.getClass(), "email", "JisaWUxcNb");
        setField(term1480, term1480.getClass(), "password", "NxgmYPzWCI");
        setBooleanField(term1480, term1480.getClass(), "enabled", false);
        term1530 = new Integer(474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1530;
        callMethod(klass, "id", argTypes, term1480, args);
    }

};


