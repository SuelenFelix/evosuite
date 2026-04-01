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

public class GatchaUser_GatchaUserBuilder_build_21314111016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1964;

    public GatchaUser_GatchaUserBuilder_build_21314111016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1965 = new Integer(1048271679);
        Integer term1968 = new Integer(-1529797673);
        HashMap term1983 = new HashMap();
        Set<Object> term2024 =  ((Map) term1983).keySet();
        HashSet term1982 = new HashSet((Collection<? extends Object>) term2024);
        term1964 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1967 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1964, term1964.getClass(), "id", term1965);
        setField(term1967, term1967.getClass(), "id", term1968);
        setField(term1967, term1967.getClass(), "role", "bHHjfDCntT");
        setField(term1967, term1967.getClass(), "users", term1982);
        setField(term1964, term1964.getClass(), "authority", term1967);
        setField(term1964, term1964.getClass(), "email", "nrQjODRMLD");
        setField(term1964, term1964.getClass(), "password", "PNoWXrsFic");
        setBooleanField(term1964, term1964.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1964, args);
    }

};


