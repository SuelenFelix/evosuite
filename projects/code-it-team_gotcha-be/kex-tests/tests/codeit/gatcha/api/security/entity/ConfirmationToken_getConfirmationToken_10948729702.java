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

public class ConfirmationToken_getConfirmationToken_10948729702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public ConfirmationToken_getConfirmationToken_10948729702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term190 = new Integer(-1275173084);
        Integer term207 = new Integer(-244121226);
        Integer term210 = new Integer(-203030934);
        HashMap term225 = new HashMap();
        Set<Object> term275 =  ((Map) term225).keySet();
        HashSet term224 = new HashSet((Collection<? extends Object>) term275);
        term189 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term204 = newInstance(Class.forName("java.util.Date"));
        Object term206 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term209 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term189, term189.getClass(), "id", term190);
        setField(term189, term189.getClass(), "confirmationToken", "BndsHwAFMv");
        setLongField(term204, term204.getClass(), "fastTime", 1480438351369L);
        setField(term204, term204.getClass(), "cdate", null);
        setField(term189, term189.getClass(), "createdDate", term204);
        setField(term206, term206.getClass(), "id", term207);
        setField(term209, term209.getClass(), "id", term210);
        setField(term209, term209.getClass(), "role", "GzFkzHGYFt");
        setField(term209, term209.getClass(), "users", term224);
        setField(term206, term206.getClass(), "authority", term209);
        setField(term206, term206.getClass(), "email", "bLPjGVBhlX");
        setField(term206, term206.getClass(), "password", "whBvTVIIlC");
        setBooleanField(term206, term206.getClass(), "enabled", true);
        setField(term189, term189.getClass(), "user", term206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmationToken", argTypes, term189, args);
    }

};


