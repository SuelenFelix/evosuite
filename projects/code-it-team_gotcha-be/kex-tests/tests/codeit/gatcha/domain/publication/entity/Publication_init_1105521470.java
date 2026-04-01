package codeit.gatcha.domain.publication.entity;

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
import static codeit.gatcha.domain.publication.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class Publication_init_1105521470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882;
     Object term932;
     Object term934;

    public Publication_init_1105521470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term883 = new Integer(1141317871);
        Integer term886 = new Integer(890669485);
        HashMap term901 = new HashMap();
        Set<Object> term946 =  ((Map) term901).keySet();
        HashSet term900 = new HashSet((Collection<? extends Object>) term946);
        term882 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term885 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term882, term882.getClass(), "id", term883);
        setField(term885, term885.getClass(), "id", term886);
        setField(term885, term885.getClass(), "role", "VGizxZnyHX");
        setField(term885, term885.getClass(), "users", term900);
        setField(term882, term882.getClass(), "authority", term885);
        setField(term882, term882.getClass(), "email", "YpJbIgJWWv");
        setField(term882, term882.getClass(), "password", "JppkknKVOw");
        setBooleanField(term882, term882.getClass(), "enabled", true);
        term932 = newInstance(Class.forName("java.util.Date"));
        setLongField(term932, term932.getClass(), "fastTime", 1645834034896L);
        setField(term932, term932.getClass(), "cdate", null);
        term934 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term882;
        args[1] = term932;
        args[2] = term934;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


