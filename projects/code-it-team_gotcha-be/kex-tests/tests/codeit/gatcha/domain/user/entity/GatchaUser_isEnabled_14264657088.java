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

public class GatchaUser_isEnabled_14264657088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;

    public GatchaUser_isEnabled_14264657088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term500 = new Integer(1375330971);
        Integer term503 = new Integer(-478195677);
        HashMap term518 = new HashMap();
        Set<Object> term559 =  ((Map) term518).keySet();
        HashSet term517 = new HashSet((Collection<? extends Object>) term559);
        term499 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term502 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term499, term499.getClass(), "id", term500);
        setField(term502, term502.getClass(), "id", term503);
        setField(term502, term502.getClass(), "role", "AdxvLJhNLe");
        setField(term502, term502.getClass(), "users", term517);
        setField(term499, term499.getClass(), "authority", term502);
        setField(term499, term499.getClass(), "email", "pXOkjyeIRb");
        setField(term499, term499.getClass(), "password", "GgZWSjxjyE");
        setBooleanField(term499, term499.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term499, args);
    }

};


