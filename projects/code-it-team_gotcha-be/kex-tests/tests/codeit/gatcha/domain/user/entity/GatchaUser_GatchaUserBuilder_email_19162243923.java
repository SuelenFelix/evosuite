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
     Object term1679;

    public GatchaUser_GatchaUserBuilder_email_19162243923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1680 = new Integer(-2003192918);
        Integer term1683 = new Integer(-1362856620);
        HashMap term1698 = new HashMap();
        Set<Object> term1751 =  ((Map) term1698).keySet();
        HashSet term1697 = new HashSet((Collection<? extends Object>) term1751);
        term1679 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1682 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1679, term1679.getClass(), "id", term1680);
        setField(term1682, term1682.getClass(), "id", term1683);
        setField(term1682, term1682.getClass(), "role", "qphdrqUtNx");
        setField(term1682, term1682.getClass(), "users", term1697);
        setField(term1679, term1679.getClass(), "authority", term1682);
        setField(term1679, term1679.getClass(), "email", "GeddnXjHGy");
        setField(term1679, term1679.getClass(), "password", "vLTbaoAxBm");
        setBooleanField(term1679, term1679.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BXTjEyEZxD";
        callMethod(klass, "email", argTypes, term1679, args);
    }

};


