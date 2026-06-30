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
     Object term1559;
     Object term1609;

    public GatchaUser_GatchaUserBuilder_authority_7894697262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1560 = new Integer(-1656687479);
        Integer term1563 = new Integer(-249614216);
        HashMap term1578 = new HashMap();
        Set<Object> term1647 =  ((Map) term1578).keySet();
        HashSet term1577 = new HashSet((Collection<? extends Object>) term1647);
        term1559 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1562 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1559, term1559.getClass(), "id", term1560);
        setField(term1562, term1562.getClass(), "id", term1563);
        setField(term1562, term1562.getClass(), "role", "SqjyKmayBx");
        setField(term1562, term1562.getClass(), "users", term1577);
        setField(term1559, term1559.getClass(), "authority", term1562);
        setField(term1559, term1559.getClass(), "email", "yevIIoVYHq");
        setField(term1559, term1559.getClass(), "password", "UuYWMTqWTV");
        setBooleanField(term1559, term1559.getClass(), "enabled", true);
        Integer term1610 = new Integer(-1467089634);
        HashMap term1625 = new HashMap();
        Set<Object> term1678 =  ((Map) term1625).keySet();
        HashSet term1624 = new HashSet((Collection<? extends Object>) term1678);
        term1609 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1609, term1609.getClass(), "id", term1610);
        setField(term1609, term1609.getClass(), "role", "DSFGlcaXUb");
        setField(term1609, term1609.getClass(), "users", term1624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Object[] args = new Object[1];
        args[0] = term1609;
        callMethod(klass, "authority", argTypes, term1559, args);
    }

};


