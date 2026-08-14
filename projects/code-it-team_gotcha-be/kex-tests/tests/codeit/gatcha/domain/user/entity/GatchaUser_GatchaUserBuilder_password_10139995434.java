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
     Object term1786;

    public GatchaUser_GatchaUserBuilder_password_10139995434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1787 = new Integer(278355793);
        Integer term1790 = new Integer(-310648604);
        HashMap term1805 = new HashMap();
        Set<Object> term1858 =  ((Map) term1805).keySet();
        HashSet term1804 = new HashSet((Collection<? extends Object>) term1858);
        term1786 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term1789 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1786, term1786.getClass(), "id", term1787);
        setField(term1789, term1789.getClass(), "id", term1790);
        setField(term1789, term1789.getClass(), "role", "oKhVzOKUFW");
        setField(term1789, term1789.getClass(), "users", term1804);
        setField(term1786, term1786.getClass(), "authority", term1789);
        setField(term1786, term1786.getClass(), "email", "ceCWHUTQUM");
        setField(term1786, term1786.getClass(), "password", "LrqwfrKKtS");
        setBooleanField(term1786, term1786.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZUdnQXfzCI";
        callMethod(klass, "password", argTypes, term1786, args);
    }

};


