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
     Object term175;

    public GatchaUser_getId_1968308004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term176 = new Integer(-73683645);
        Integer term179 = new Integer(-226514366);
        HashMap term194 = new HashMap();
        Set<Object> term235 =  ((Map) term194).keySet();
        HashSet term193 = new HashSet((Collection<? extends Object>) term235);
        term175 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term178 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term175, term175.getClass(), "id", term176);
        setField(term178, term178.getClass(), "id", term179);
        setField(term178, term178.getClass(), "role", "YRHGsAkhxb");
        setField(term178, term178.getClass(), "users", term193);
        setField(term175, term175.getClass(), "authority", term178);
        setField(term175, term175.getClass(), "email", "HqBOwkVqjD");
        setField(term175, term175.getClass(), "password", "MAcUBcBckh");
        setBooleanField(term175, term175.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term175, args);
    }

};


