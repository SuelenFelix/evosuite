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
     Object term886;

    public GatchaUser_setPassword_179530767712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term887 = new Integer(344323424);
        Integer term890 = new Integer(9726679);
        HashMap term905 = new HashMap();
        Set<Object> term958 =  ((Map) term905).keySet();
        HashSet term904 = new HashSet((Collection<? extends Object>) term958);
        term886 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term889 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term886, term886.getClass(), "id", term887);
        setField(term889, term889.getClass(), "id", term890);
        setField(term889, term889.getClass(), "role", "wKWbJssZuG");
        setField(term889, term889.getClass(), "users", term904);
        setField(term886, term886.getClass(), "authority", term889);
        setField(term886, term886.getClass(), "email", "UKAReurpHG");
        setField(term886, term886.getClass(), "password", "WVRMUmrljA");
        setBooleanField(term886, term886.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setPassword", argTypes, term886, args);
    }

};


