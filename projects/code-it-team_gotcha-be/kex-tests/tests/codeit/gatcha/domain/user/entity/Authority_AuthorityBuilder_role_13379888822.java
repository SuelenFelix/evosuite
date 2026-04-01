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

public class Authority_AuthorityBuilder_role_13379888822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304;

    public Authority_AuthorityBuilder_role_13379888822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1305 = new Integer(1045547089);
        HashMap term1320 = new HashMap();
        Set<Object> term1347 =  ((Map) term1320).keySet();
        HashSet term1319 = new HashSet((Collection<? extends Object>) term1347);
        term1304 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder"));
        setField(term1304, term1304.getClass(), "id", term1305);
        setField(term1304, term1304.getClass(), "role", "sUEeHQTWkA");
        setField(term1304, term1304.getClass(), "users", term1319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BDIRCxAWLA";
        callMethod(klass, "role", argTypes, term1304, args);
    }

};


