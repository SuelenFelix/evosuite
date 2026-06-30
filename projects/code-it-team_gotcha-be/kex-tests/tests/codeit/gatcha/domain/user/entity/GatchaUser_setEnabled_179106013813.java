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
     Object term989;
     Object term1039;

    public GatchaUser_setEnabled_179106013813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term990 = new Integer(1953277050);
        Integer term993 = new Integer(1283079251);
        HashMap term1008 = new HashMap();
        Set<Object> term1051 =  ((Map) term1008).keySet();
        HashSet term1007 = new HashSet((Collection<? extends Object>) term1051);
        term989 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term992 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term989, term989.getClass(), "id", term990);
        setField(term992, term992.getClass(), "id", term993);
        setField(term992, term992.getClass(), "role", "vOuMEpOQAg");
        setField(term992, term992.getClass(), "users", term1007);
        setField(term989, term989.getClass(), "authority", term992);
        setField(term989, term989.getClass(), "email", "bnsyeQXFdu");
        setField(term989, term989.getClass(), "password", "BwtdjiefJn");
        setBooleanField(term989, term989.getClass(), "enabled", true);
        term1039 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1039;
        callMethod(klass, "setEnabled", argTypes, term989, args);
    }

};


