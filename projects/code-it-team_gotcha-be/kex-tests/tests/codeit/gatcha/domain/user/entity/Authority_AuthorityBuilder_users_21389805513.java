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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Authority_AuthorityBuilder_users_21389805513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360;
     Object term1384;

    public Authority_AuthorityBuilder_users_21389805513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1361 = new Integer(-1122880881);
        HashMap term1376 = new HashMap();
        Set<Object> term1400 =  ((Map) term1376).keySet();
        HashSet term1375 = new HashSet((Collection<? extends Object>) term1400);
        term1360 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder"));
        setField(term1360, term1360.getClass(), "id", term1361);
        setField(term1360, term1360.getClass(), "role", "eOJfbiZLnb");
        setField(term1360, term1360.getClass(), "users", term1375);
        HashMap term1385 = new HashMap();
        Set<Object> term1401 =  ((Map) term1385).keySet();
        term1384 = new HashSet((Collection<? extends Object>) term1401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1384;
        callMethod(klass, "users", argTypes, term1360, args);
    }

};


