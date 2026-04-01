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

public class GatchaUser_getPassword_2089652377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public GatchaUser_getPassword_2089652377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term417 = new Integer(-112921587);
        Integer term420 = new Integer(933028652);
        HashMap term435 = new HashMap();
        Set<Object> term476 =  ((Map) term435).keySet();
        HashSet term434 = new HashSet((Collection<? extends Object>) term476);
        term416 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term419 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term416, term416.getClass(), "id", term417);
        setField(term419, term419.getClass(), "id", term420);
        setField(term419, term419.getClass(), "role", "fztQhjqwdP");
        setField(term419, term419.getClass(), "users", term434);
        setField(term416, term416.getClass(), "authority", term419);
        setField(term416, term416.getClass(), "email", "WzMEhMXkKx");
        setField(term416, term416.getClass(), "password", "XOiDvlDhdc");
        setBooleanField(term416, term416.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term416, args);
    }

};


