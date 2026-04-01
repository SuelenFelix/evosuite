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
     Object term781;

    public GatchaUser_setEmail_206671856011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term782 = new Integer(-343325701);
        Integer term785 = new Integer(107945604);
        HashMap term800 = new HashMap();
        Set<Object> term853 =  ((Map) term800).keySet();
        HashSet term799 = new HashSet((Collection<? extends Object>) term853);
        term781 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term784 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term781, term781.getClass(), "id", term782);
        setField(term784, term784.getClass(), "id", term785);
        setField(term784, term784.getClass(), "role", "AZdLeSugwv");
        setField(term784, term784.getClass(), "users", term799);
        setField(term781, term781.getClass(), "authority", term784);
        setField(term781, term781.getClass(), "email", "GZdcJyZntS");
        setField(term781, term781.getClass(), "password", "OIHoJeysUi");
        setBooleanField(term781, term781.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        callMethod(klass, "setEmail", argTypes, term781, args);
    }

};


