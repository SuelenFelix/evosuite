package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_getUser_11763797904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public ConfirmationToken_getUser_11763797904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term404 = new Integer(-1371869594);
        Integer term421 = new Integer(-2095575670);
        Integer term424 = new Integer(1225272962);
        HashMap term439 = new HashMap();
        Set<Object> term489 =  ((Map) term439).keySet();
        HashSet term438 = new HashSet((Collection<? extends Object>) term489);
        term403 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term418 = newInstance(Class.forName("java.util.Date"));
        Object term420 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term423 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term403, term403.getClass(), "id", term404);
        setField(term403, term403.getClass(), "confirmationToken", "XPKmummaqg");
        setLongField(term418, term418.getClass(), "fastTime", 1606045635837L);
        setField(term418, term418.getClass(), "cdate", null);
        setField(term403, term403.getClass(), "createdDate", term418);
        setField(term420, term420.getClass(), "id", term421);
        setField(term423, term423.getClass(), "id", term424);
        setField(term423, term423.getClass(), "role", "BKLfkLiZTH");
        setField(term423, term423.getClass(), "users", term438);
        setField(term420, term420.getClass(), "authority", term423);
        setField(term420, term420.getClass(), "email", "WzMEhMXkKx");
        setField(term420, term420.getClass(), "password", "XOiDvlDhdc");
        setBooleanField(term420, term420.getClass(), "enabled", true);
        setField(term403, term403.getClass(), "user", term420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term403, args);
    }

};


