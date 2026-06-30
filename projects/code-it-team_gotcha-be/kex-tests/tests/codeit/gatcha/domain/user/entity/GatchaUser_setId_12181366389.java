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
     Object term578;
     Object term628;

    public GatchaUser_setId_12181366389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term579 = new Integer(-505439934);
        Integer term582 = new Integer(-344842608);
        HashMap term597 = new HashMap();
        Set<Object> term640 =  ((Map) term597).keySet();
        HashSet term596 = new HashSet((Collection<? extends Object>) term640);
        term578 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term581 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term578, term578.getClass(), "id", term579);
        setField(term581, term581.getClass(), "id", term582);
        setField(term581, term581.getClass(), "role", "EeBVbzjcCI");
        setField(term581, term581.getClass(), "users", term596);
        setField(term578, term578.getClass(), "authority", term581);
        setField(term578, term578.getClass(), "email", "aWYOWZFyaX");
        setField(term578, term578.getClass(), "password", "BRIVNtfUWU");
        setBooleanField(term578, term578.getClass(), "enabled", true);
        term628 = new Integer(-268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term628;
        callMethod(klass, "setId", argTypes, term578, args);
    }

};


