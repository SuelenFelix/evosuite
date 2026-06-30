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

public class GatchaUser_GatchaUserBuilder_password_10139995434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1782;

    public GatchaUser_GatchaUserBuilder_password_10139995434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1783 = new Integer(278355793);
        Integer term1786 = new Integer(-310648604);
        HashMap term1801 = new HashMap();
        Set<Object> term1854 =  ((Map) term1801).keySet();
        HashSet term1800 = new HashSet((Collection<? extends Object>) term1854);
        term1782 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1785 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1782, term1782.getClass(), "id", term1783);
        setField(term1785, term1785.getClass(), "id", term1786);
        setField(term1785, term1785.getClass(), "role", "oKhVzOKUFW");
        setField(term1785, term1785.getClass(), "users", term1800);
        setField(term1782, term1782.getClass(), "authority", term1785);
        setField(term1782, term1782.getClass(), "email", "ceCWHUTQUM");
        setField(term1782, term1782.getClass(), "password", "LrqwfrKKtS");
        setBooleanField(term1782, term1782.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZUdnQXfzCI";
        callMethod(klass, "password", argTypes, term1782, args);
    }

};


