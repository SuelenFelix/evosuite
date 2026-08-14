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

public class GatchaUser_GatchaUserBuilder_email_19162243923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;

    public GatchaUser_GatchaUserBuilder_email_19162243923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1684 = new Integer(-2003192918);
        Integer term1687 = new Integer(-1362856620);
        HashMap term1702 = new HashMap();
        Set<Object> term1755 =  ((Map) term1702).keySet();
        HashSet term1701 = new HashSet((Collection<? extends Object>) term1755);
        term1683 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1686 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1683, term1683.getClass(), "id", term1684);
        setField(term1686, term1686.getClass(), "id", term1687);
        setField(term1686, term1686.getClass(), "role", "qphdrqUtNx");
        setField(term1686, term1686.getClass(), "users", term1701);
        setField(term1683, term1683.getClass(), "authority", term1686);
        setField(term1683, term1683.getClass(), "email", "GeddnXjHGy");
        setField(term1683, term1683.getClass(), "password", "vLTbaoAxBm");
        setBooleanField(term1683, term1683.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BXTjEyEZxD";
        callMethod(klass, "email", argTypes, term1683, args);
    }

};


