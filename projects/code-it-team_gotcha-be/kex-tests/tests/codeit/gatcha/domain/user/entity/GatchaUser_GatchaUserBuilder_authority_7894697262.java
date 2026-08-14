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
     Object term1563;
     Object term1613;

    public GatchaUser_GatchaUserBuilder_authority_7894697262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1564 = new Integer(-1656687479);
        Integer term1567 = new Integer(-249614216);
        HashMap term1582 = new HashMap();
        Set<Object> term1651 =  ((Map) term1582).keySet();
        HashSet term1581 = new HashSet((Collection<? extends Object>) term1651);
        term1563 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1566 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1563, term1563.getClass(), "id", term1564);
        setField(term1566, term1566.getClass(), "id", term1567);
        setField(term1566, term1566.getClass(), "role", "SqjyKmayBx");
        setField(term1566, term1566.getClass(), "users", term1581);
        setField(term1563, term1563.getClass(), "authority", term1566);
        setField(term1563, term1563.getClass(), "email", "yevIIoVYHq");
        setField(term1563, term1563.getClass(), "password", "UuYWMTqWTV");
        setBooleanField(term1563, term1563.getClass(), "enabled", true);
        Integer term1614 = new Integer(-1467089634);
        HashMap term1629 = new HashMap();
        Set<Object> term1682 =  ((Map) term1629).keySet();
        HashSet term1628 = new HashSet((Collection<? extends Object>) term1682);
        term1613 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1613, term1613.getClass(), "id", term1614);
        setField(term1613, term1613.getClass(), "role", "DSFGlcaXUb");
        setField(term1613, term1613.getClass(), "users", term1628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Object[] args = new Object[1];
        args[0] = term1613;
        callMethod(klass, "authority", argTypes, term1563, args);
    }

};


