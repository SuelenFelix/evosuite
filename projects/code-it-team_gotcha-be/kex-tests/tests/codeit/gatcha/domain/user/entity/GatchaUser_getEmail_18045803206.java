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
     Object term335;

    public GatchaUser_getEmail_18045803206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term336 = new Integer(458147407);
        Integer term339 = new Integer(-184153539);
        HashMap term354 = new HashMap();
        Set<Object> term395 =  ((Map) term354).keySet();
        HashSet term353 = new HashSet((Collection<? extends Object>) term395);
        term335 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term338 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term335, term335.getClass(), "id", term336);
        setField(term338, term338.getClass(), "id", term339);
        setField(term338, term338.getClass(), "role", "xOcJIiQQDu");
        setField(term338, term338.getClass(), "users", term353);
        setField(term335, term335.getClass(), "authority", term338);
        setField(term335, term335.getClass(), "email", "sEnIVFtZuQ");
        setField(term335, term335.getClass(), "password", "ZVecLZMLHF");
        setBooleanField(term335, term335.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term335, args);
    }

};


