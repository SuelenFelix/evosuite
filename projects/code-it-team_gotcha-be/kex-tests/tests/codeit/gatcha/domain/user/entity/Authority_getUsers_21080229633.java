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

public class Authority_getUsers_21080229633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1175;

    public Authority_getUsers_21080229633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1176 = new Integer(114754804);
        HashMap term1191 = new HashMap();
        Set<Object> term1217 =  ((Map) term1191).keySet();
        HashSet term1190 = new HashSet((Collection<? extends Object>) term1217);
        term1175 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1175, term1175.getClass(), "id", term1176);
        setField(term1175, term1175.getClass(), "role", "dJGPlmSRnz");
        setField(term1175, term1175.getClass(), "users", term1190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsers", argTypes, term1175, args);
    }

};


