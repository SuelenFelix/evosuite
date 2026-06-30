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
import java.lang.Boolean;

public class GatchaUser_init_18154342793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;
     Object term90;
     Object term140;

    public GatchaUser_init_18154342793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = new Integer(-1685132342);
        Integer term91 = new Integer(-1456670397);
        HashMap term106 = new HashMap();
        Set<Object> term152 =  ((Map) term106).keySet();
        HashSet term105 = new HashSet((Collection<? extends Object>) term152);
        term90 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term90, term90.getClass(), "id", term91);
        setField(term90, term90.getClass(), "role", "IoAlmYsBwc");
        setField(term90, term90.getClass(), "users", term105);
        term140 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term88;
        args[1] = term90;
        args[2] = "JDswTTCZHV";
        args[3] = "onpbIeEKoi";
        args[4] = term140;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


