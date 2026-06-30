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
     Object term1476;
     Object term1526;

    public GatchaUser_GatchaUserBuilder_id_17725683021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1477 = new Integer(-945116798);
        Integer term1480 = new Integer(1593461795);
        HashMap term1495 = new HashMap();
        Set<Object> term1538 =  ((Map) term1495).keySet();
        HashSet term1494 = new HashSet((Collection<? extends Object>) term1538);
        term1476 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1479 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1476, term1476.getClass(), "id", term1477);
        setField(term1479, term1479.getClass(), "id", term1480);
        setField(term1479, term1479.getClass(), "role", "UimMMORkzd");
        setField(term1479, term1479.getClass(), "users", term1494);
        setField(term1476, term1476.getClass(), "authority", term1479);
        setField(term1476, term1476.getClass(), "email", "JisaWUxcNb");
        setField(term1476, term1476.getClass(), "password", "NxgmYPzWCI");
        setBooleanField(term1476, term1476.getClass(), "enabled", false);
        term1526 = new Integer(474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1526;
        callMethod(klass, "id", argTypes, term1476, args);
    }

};


