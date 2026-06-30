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

public class GatchaUser_getId_1968308004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public GatchaUser_getId_1968308004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term174 = new Integer(-73683645);
        Integer term177 = new Integer(-226514366);
        HashMap term192 = new HashMap();
        Set<Object> term233 =  ((Map) term192).keySet();
        HashSet term191 = new HashSet((Collection<? extends Object>) term233);
        term173 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term176 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term173, term173.getClass(), "id", term174);
        setField(term176, term176.getClass(), "id", term177);
        setField(term176, term176.getClass(), "role", "YRHGsAkhxb");
        setField(term176, term176.getClass(), "users", term191);
        setField(term173, term173.getClass(), "authority", term176);
        setField(term173, term173.getClass(), "email", "HqBOwkVqjD");
        setField(term173, term173.getClass(), "password", "MAcUBcBckh");
        setBooleanField(term173, term173.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term173, args);
    }

};


