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
     Object term1972;

    public GatchaUser_GatchaUserBuilder_build_21314111016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1973 = new Integer(1048271679);
        Integer term1976 = new Integer(-1529797673);
        HashMap term1991 = new HashMap();
        Set<Object> term2032 =  ((Map) term1991).keySet();
        HashSet term1990 = new HashSet((Collection<? extends Object>) term2032);
        term1972 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1975 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1972, term1972.getClass(), "id", term1973);
        setField(term1975, term1975.getClass(), "id", term1976);
        setField(term1975, term1975.getClass(), "role", "bHHjfDCntT");
        setField(term1975, term1975.getClass(), "users", term1990);
        setField(term1972, term1972.getClass(), "authority", term1975);
        setField(term1972, term1972.getClass(), "email", "nrQjODRMLD");
        setField(term1972, term1972.getClass(), "password", "PNoWXrsFic");
        setBooleanField(term1972, term1972.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1972, args);
    }

};


