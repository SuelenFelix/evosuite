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

public class GatchaUser_setPassword_179530767712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;

    public GatchaUser_setPassword_179530767712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term889 = new Integer(344323424);
        Integer term892 = new Integer(9726679);
        HashMap term907 = new HashMap();
        Set<Object> term960 =  ((Map) term907).keySet();
        HashSet term906 = new HashSet((Collection<? extends Object>) term960);
        term888 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term891 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term888, term888.getClass(), "id", term889);
        setField(term891, term891.getClass(), "id", term892);
        setField(term891, term891.getClass(), "role", "wKWbJssZuG");
        setField(term891, term891.getClass(), "users", term906);
        setField(term888, term888.getClass(), "authority", term891);
        setField(term888, term888.getClass(), "email", "UKAReurpHG");
        setField(term888, term888.getClass(), "password", "WVRMUmrljA");
        setBooleanField(term888, term888.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setPassword", argTypes, term888, args);
    }

};


