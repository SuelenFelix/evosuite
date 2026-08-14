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

public class GatchaUser_GatchaUserBuilder_toString_11804119647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2053;

    public GatchaUser_GatchaUserBuilder_toString_11804119647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2054 = new Integer(1272542218);
        Integer term2057 = new Integer(1209799204);
        HashMap term2072 = new HashMap();
        Set<Object> term2113 =  ((Map) term2072).keySet();
        HashSet term2071 = new HashSet((Collection<? extends Object>) term2113);
        term2053 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term2056 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term2053, term2053.getClass(), "id", term2054);
        setField(term2056, term2056.getClass(), "id", term2057);
        setField(term2056, term2056.getClass(), "role", "QZBHZqZope");
        setField(term2056, term2056.getClass(), "users", term2071);
        setField(term2053, term2053.getClass(), "authority", term2056);
        setField(term2053, term2053.getClass(), "email", "PaCpFXGzdX");
        setField(term2053, term2053.getClass(), "password", "FftYCNbnks");
        setBooleanField(term2053, term2053.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2053, args);
    }

};


