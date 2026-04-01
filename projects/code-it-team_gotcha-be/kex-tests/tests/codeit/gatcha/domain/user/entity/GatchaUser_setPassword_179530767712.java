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
     Object term884;

    public GatchaUser_setPassword_179530767712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term885 = new Integer(344323424);
        Integer term888 = new Integer(9726679);
        HashMap term903 = new HashMap();
        Set<Object> term956 =  ((Map) term903).keySet();
        HashSet term902 = new HashSet((Collection<? extends Object>) term956);
        term884 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term887 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term884, term884.getClass(), "id", term885);
        setField(term887, term887.getClass(), "id", term888);
        setField(term887, term887.getClass(), "role", "wKWbJssZuG");
        setField(term887, term887.getClass(), "users", term902);
        setField(term884, term884.getClass(), "authority", term887);
        setField(term884, term884.getClass(), "email", "UKAReurpHG");
        setField(term884, term884.getClass(), "password", "WVRMUmrljA");
        setBooleanField(term884, term884.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setPassword", argTypes, term884, args);
    }

};


