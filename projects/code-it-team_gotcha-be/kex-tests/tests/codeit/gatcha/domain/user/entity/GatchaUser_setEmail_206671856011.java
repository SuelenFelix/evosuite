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
     Object term783;

    public GatchaUser_setEmail_206671856011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term784 = new Integer(-343325701);
        Integer term787 = new Integer(107945604);
        HashMap term802 = new HashMap();
        Set<Object> term855 =  ((Map) term802).keySet();
        HashSet term801 = new HashSet((Collection<? extends Object>) term855);
        term783 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term786 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term783, term783.getClass(), "id", term784);
        setField(term786, term786.getClass(), "id", term787);
        setField(term786, term786.getClass(), "role", "AZdLeSugwv");
        setField(term786, term786.getClass(), "users", term801);
        setField(term783, term783.getClass(), "authority", term786);
        setField(term783, term783.getClass(), "email", "GZdcJyZntS");
        setField(term783, term783.getClass(), "password", "OIHoJeysUi");
        setBooleanField(term783, term783.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        callMethod(klass, "setEmail", argTypes, term783, args);
    }

};


