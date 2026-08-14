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

public class GatchaUser_setEmail_206671856011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785;

    public GatchaUser_setEmail_206671856011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term786 = new Integer(-343325701);
        Integer term789 = new Integer(107945604);
        HashMap term804 = new HashMap();
        Set<Object> term857 =  ((Map) term804).keySet();
        HashSet term803 = new HashSet((Collection<? extends Object>) term857);
        term785 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term788 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term785, term785.getClass(), "id", term786);
        setField(term788, term788.getClass(), "id", term789);
        setField(term788, term788.getClass(), "role", "AZdLeSugwv");
        setField(term788, term788.getClass(), "users", term803);
        setField(term785, term785.getClass(), "authority", term788);
        setField(term785, term785.getClass(), "email", "GZdcJyZntS");
        setField(term785, term785.getClass(), "password", "OIHoJeysUi");
        setBooleanField(term785, term785.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        callMethod(klass, "setEmail", argTypes, term785, args);
    }

};


