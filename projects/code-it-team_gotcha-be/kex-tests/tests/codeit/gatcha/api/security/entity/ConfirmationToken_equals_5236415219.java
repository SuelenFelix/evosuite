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

public class ConfirmationToken_equals_5236415219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045;
     Object term1111;

    public ConfirmationToken_equals_5236415219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1046 = new Integer(-1222006000);
        Integer term1063 = new Integer(2095798786);
        Integer term1066 = new Integer(-1565502840);
        HashMap term1081 = new HashMap();
        Set<Object> term1132 =  ((Map) term1081).keySet();
        HashSet term1080 = new HashSet((Collection<? extends Object>) term1132);
        term1045 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term1060 = newInstance(Class.forName("java.util.Date"));
        Object term1062 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1065 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1045, term1045.getClass(), "id", term1046);
        setField(term1045, term1045.getClass(), "confirmationToken", "wKWbJssZuG");
        setLongField(term1060, term1060.getClass(), "fastTime", 1500721068023L);
        setField(term1060, term1060.getClass(), "cdate", null);
        setField(term1045, term1045.getClass(), "createdDate", term1060);
        setField(term1062, term1062.getClass(), "id", term1063);
        setField(term1065, term1065.getClass(), "id", term1066);
        setField(term1065, term1065.getClass(), "role", "NzBMMhkhpT");
        setField(term1065, term1065.getClass(), "users", term1080);
        setField(term1062, term1062.getClass(), "authority", term1065);
        setField(term1062, term1062.getClass(), "email", "NTlKJDDWlk");
        setField(term1062, term1062.getClass(), "password", "vOuMEpOQAg");
        setBooleanField(term1062, term1062.getClass(), "enabled", true);
        setField(term1045, term1045.getClass(), "user", term1062);
        term1111 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1111;
        callMethod(klass, "equals", argTypes, term1045, args);
    }

};


