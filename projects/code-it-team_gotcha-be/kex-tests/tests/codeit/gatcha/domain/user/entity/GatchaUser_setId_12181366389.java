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

public class GatchaUser_setId_12181366389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580;
     Object term630;

    public GatchaUser_setId_12181366389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term581 = new Integer(-505439934);
        Integer term584 = new Integer(-344842608);
        HashMap term599 = new HashMap();
        Set<Object> term642 =  ((Map) term599).keySet();
        HashSet term598 = new HashSet((Collection<? extends Object>) term642);
        term580 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term583 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term580, term580.getClass(), "id", term581);
        setField(term583, term583.getClass(), "id", term584);
        setField(term583, term583.getClass(), "role", "EeBVbzjcCI");
        setField(term583, term583.getClass(), "users", term598);
        setField(term580, term580.getClass(), "authority", term583);
        setField(term580, term580.getClass(), "email", "aWYOWZFyaX");
        setField(term580, term580.getClass(), "password", "BRIVNtfUWU");
        setBooleanField(term580, term580.getClass(), "enabled", true);
        term630 = new Integer(-268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "setId", argTypes, term580, args);
    }

};


