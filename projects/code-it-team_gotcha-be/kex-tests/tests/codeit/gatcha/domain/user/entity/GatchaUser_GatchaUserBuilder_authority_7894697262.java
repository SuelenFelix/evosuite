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

public class GatchaUser_GatchaUserBuilder_authority_7894697262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;
     Object term1605;

    public GatchaUser_GatchaUserBuilder_authority_7894697262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1556 = new Integer(-1656687479);
        Integer term1559 = new Integer(-249614216);
        HashMap term1574 = new HashMap();
        Set<Object> term1643 =  ((Map) term1574).keySet();
        HashSet term1573 = new HashSet((Collection<? extends Object>) term1643);
        term1555 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1558 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1555, term1555.getClass(), "id", term1556);
        setField(term1558, term1558.getClass(), "id", term1559);
        setField(term1558, term1558.getClass(), "role", "SqjyKmayBx");
        setField(term1558, term1558.getClass(), "users", term1573);
        setField(term1555, term1555.getClass(), "authority", term1558);
        setField(term1555, term1555.getClass(), "email", "yevIIoVYHq");
        setField(term1555, term1555.getClass(), "password", "UuYWMTqWTV");
        setBooleanField(term1555, term1555.getClass(), "enabled", true);
        Integer term1606 = new Integer(-1467089634);
        HashMap term1621 = new HashMap();
        Set<Object> term1674 =  ((Map) term1621).keySet();
        HashSet term1620 = new HashSet((Collection<? extends Object>) term1674);
        term1605 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1605, term1605.getClass(), "id", term1606);
        setField(term1605, term1605.getClass(), "role", "DSFGlcaXUb");
        setField(term1605, term1605.getClass(), "users", term1620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Object[] args = new Object[1];
        args[0] = term1605;
        callMethod(klass, "authority", argTypes, term1555, args);
    }

};


