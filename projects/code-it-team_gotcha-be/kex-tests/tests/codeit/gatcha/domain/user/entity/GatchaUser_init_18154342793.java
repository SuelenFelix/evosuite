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
     Object term90;
     Object term92;
     Object term142;

    public GatchaUser_init_18154342793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = new Integer(-1685132342);
        Integer term93 = new Integer(-1456670397);
        HashMap term108 = new HashMap();
        Set<Object> term154 =  ((Map) term108).keySet();
        HashSet term107 = new HashSet((Collection<? extends Object>) term154);
        term92 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term92, term92.getClass(), "id", term93);
        setField(term92, term92.getClass(), "role", "IoAlmYsBwc");
        setField(term92, term92.getClass(), "users", term107);
        term142 = new Boolean(false);
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
        args[0] = term90;
        args[1] = term92;
        args[2] = "JDswTTCZHV";
        args[3] = "onpbIeEKoi";
        args[4] = term142;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


