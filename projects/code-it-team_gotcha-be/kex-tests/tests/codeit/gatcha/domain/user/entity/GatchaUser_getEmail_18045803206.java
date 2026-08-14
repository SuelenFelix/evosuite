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

public class GatchaUser_getEmail_18045803206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;

    public GatchaUser_getEmail_18045803206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term338 = new Integer(458147407);
        Integer term341 = new Integer(-184153539);
        HashMap term356 = new HashMap();
        Set<Object> term397 =  ((Map) term356).keySet();
        HashSet term355 = new HashSet((Collection<? extends Object>) term397);
        term337 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term340 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term337, term337.getClass(), "id", term338);
        setField(term340, term340.getClass(), "id", term341);
        setField(term340, term340.getClass(), "role", "xOcJIiQQDu");
        setField(term340, term340.getClass(), "users", term355);
        setField(term337, term337.getClass(), "authority", term340);
        setField(term337, term337.getClass(), "email", "sEnIVFtZuQ");
        setField(term337, term337.getClass(), "password", "ZVecLZMLHF");
        setBooleanField(term337, term337.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term337, args);
    }

};


