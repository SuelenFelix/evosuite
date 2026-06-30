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
     Object term497;

    public GatchaUser_isEnabled_14264657088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term498 = new Integer(1375330971);
        Integer term501 = new Integer(-478195677);
        HashMap term516 = new HashMap();
        Set<Object> term557 =  ((Map) term516).keySet();
        HashSet term515 = new HashSet((Collection<? extends Object>) term557);
        term497 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term500 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term497, term497.getClass(), "id", term498);
        setField(term500, term500.getClass(), "id", term501);
        setField(term500, term500.getClass(), "role", "AdxvLJhNLe");
        setField(term500, term500.getClass(), "users", term515);
        setField(term497, term497.getClass(), "authority", term500);
        setField(term497, term497.getClass(), "email", "pXOkjyeIRb");
        setField(term497, term497.getClass(), "password", "GgZWSjxjyE");
        setBooleanField(term497, term497.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term497, args);
    }

};


