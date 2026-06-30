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

public class GatchaUser_setAuthority_61325772210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661;
     Object term711;

    public GatchaUser_setAuthority_61325772210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term662 = new Integer(-1210583429);
        Integer term665 = new Integer(-663691365);
        HashMap term680 = new HashMap();
        Set<Object> term751 =  ((Map) term680).keySet();
        HashSet term679 = new HashSet((Collection<? extends Object>) term751);
        term661 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term664 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term661, term661.getClass(), "id", term662);
        setField(term664, term664.getClass(), "id", term665);
        setField(term664, term664.getClass(), "role", "DbiCVtPPCT");
        setField(term664, term664.getClass(), "users", term679);
        setField(term661, term661.getClass(), "authority", term664);
        setField(term661, term661.getClass(), "email", "igCAtimmYB");
        setField(term661, term661.getClass(), "password", "DyiXbeYIaN");
        setBooleanField(term661, term661.getClass(), "enabled", true);
        Integer term712 = new Integer(-1963434938);
        HashMap term727 = new HashMap();
        Set<Object> term782 =  ((Map) term727).keySet();
        HashSet term726 = new HashSet((Collection<? extends Object>) term782);
        term711 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term711, term711.getClass(), "id", term712);
        setField(term711, term711.getClass(), "role", "VGizxZnyHX");
        setField(term711, term711.getClass(), "users", term726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Object[] args = new Object[1];
        args[0] = term711;
        callMethod(klass, "setAuthority", argTypes, term661, args);
    }

};


