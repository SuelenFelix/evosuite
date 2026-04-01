package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_setUser_14010682208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;
     Object term923;

    public ConfirmationToken_setUser_14010682208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term858 = new Integer(691577392);
        Integer term875 = new Integer(-893623680);
        Integer term878 = new Integer(-1963434938);
        HashMap term893 = new HashMap();
        Set<Object> term993 =  ((Map) term893).keySet();
        HashSet term892 = new HashSet((Collection<? extends Object>) term993);
        term857 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term872 = newInstance(Class.forName("java.util.Date"));
        Object term874 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term877 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term857, term857.getClass(), "id", term858);
        setField(term857, term857.getClass(), "confirmationToken", "ekxGuOYIwi");
        setLongField(term872, term872.getClass(), "fastTime", 1645834034896L);
        setField(term872, term872.getClass(), "cdate", null);
        setField(term857, term857.getClass(), "createdDate", term872);
        setField(term874, term874.getClass(), "id", term875);
        setField(term877, term877.getClass(), "id", term878);
        setField(term877, term877.getClass(), "role", "RbVQXSpxXy");
        setField(term877, term877.getClass(), "users", term892);
        setField(term874, term874.getClass(), "authority", term877);
        setField(term874, term874.getClass(), "email", "tlzpzIjMib");
        setField(term874, term874.getClass(), "password", "AZdLeSugwv");
        setBooleanField(term874, term874.getClass(), "enabled", true);
        setField(term857, term857.getClass(), "user", term874);
        Integer term924 = new Integer(-2015854073);
        Integer term927 = new Integer(538259104);
        HashMap term942 = new HashMap();
        Set<Object> term1024 =  ((Map) term942).keySet();
        HashSet term941 = new HashSet((Collection<? extends Object>) term1024);
        term923 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term926 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term923, term923.getClass(), "id", term924);
        setField(term926, term926.getClass(), "id", term927);
        setField(term926, term926.getClass(), "role", "RMsXuyzKJV");
        setField(term926, term926.getClass(), "users", term941);
        setField(term923, term923.getClass(), "authority", term926);
        setField(term923, term923.getClass(), "email", "OIHoJeysUi");
        setField(term923, term923.getClass(), "password", "WXMWFDGcLB");
        setBooleanField(term923, term923.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term923;
        callMethod(klass, "setUser", argTypes, term857, args);
    }

};


