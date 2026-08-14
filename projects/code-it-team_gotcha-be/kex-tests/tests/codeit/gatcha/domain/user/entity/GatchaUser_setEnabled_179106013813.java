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
import java.lang.Boolean;

public class GatchaUser_setEnabled_179106013813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term1041;

    public GatchaUser_setEnabled_179106013813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term992 = new Integer(1953277050);
        Integer term995 = new Integer(1283079251);
        HashMap term1010 = new HashMap();
        Set<Object> term1053 =  ((Map) term1010).keySet();
        HashSet term1009 = new HashSet((Collection<? extends Object>) term1053);
        term991 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term994 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term991, term991.getClass(), "id", term992);
        setField(term994, term994.getClass(), "id", term995);
        setField(term994, term994.getClass(), "role", "vOuMEpOQAg");
        setField(term994, term994.getClass(), "users", term1009);
        setField(term991, term991.getClass(), "authority", term994);
        setField(term991, term991.getClass(), "email", "bnsyeQXFdu");
        setField(term991, term991.getClass(), "password", "BwtdjiefJn");
        setBooleanField(term991, term991.getClass(), "enabled", true);
        term1041 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1041;
        callMethod(klass, "setEnabled", argTypes, term991, args);
    }

};


