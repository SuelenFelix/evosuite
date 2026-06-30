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

public class GatchaUser_getAuthority_19379075605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;

    public GatchaUser_getAuthority_19379075605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term255 = new Integer(-1016503459);
        Integer term258 = new Integer(-1968847291);
        HashMap term273 = new HashMap();
        Set<Object> term314 =  ((Map) term273).keySet();
        HashSet term272 = new HashSet((Collection<? extends Object>) term314);
        term254 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term257 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term254, term254.getClass(), "id", term255);
        setField(term257, term257.getClass(), "id", term258);
        setField(term257, term257.getClass(), "role", "oVgzLbrsFr");
        setField(term257, term257.getClass(), "users", term272);
        setField(term254, term254.getClass(), "authority", term257);
        setField(term254, term254.getClass(), "email", "jSpAteRute");
        setField(term254, term254.getClass(), "password", "swZVeJAxjt");
        setBooleanField(term254, term254.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthority", argTypes, term254, args);
    }

};


