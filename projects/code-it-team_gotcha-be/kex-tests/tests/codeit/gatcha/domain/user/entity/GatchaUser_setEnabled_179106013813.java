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
     Object term987;
     Object term1037;

    public GatchaUser_setEnabled_179106013813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term988 = new Integer(1953277050);
        Integer term991 = new Integer(1283079251);
        HashMap term1006 = new HashMap();
        Set<Object> term1049 =  ((Map) term1006).keySet();
        HashSet term1005 = new HashSet((Collection<? extends Object>) term1049);
        term987 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term990 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term987, term987.getClass(), "id", term988);
        setField(term990, term990.getClass(), "id", term991);
        setField(term990, term990.getClass(), "role", "vOuMEpOQAg");
        setField(term990, term990.getClass(), "users", term1005);
        setField(term987, term987.getClass(), "authority", term990);
        setField(term987, term987.getClass(), "email", "bnsyeQXFdu");
        setField(term987, term987.getClass(), "password", "BwtdjiefJn");
        setBooleanField(term987, term987.getClass(), "enabled", true);
        term1037 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1037;
        callMethod(klass, "setEnabled", argTypes, term987, args);
    }

};


