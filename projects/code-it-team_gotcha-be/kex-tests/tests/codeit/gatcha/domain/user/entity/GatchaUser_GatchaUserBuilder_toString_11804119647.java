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

public class GatchaUser_GatchaUserBuilder_toString_11804119647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;

    public GatchaUser_GatchaUserBuilder_toString_11804119647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2050 = new Integer(1272542218);
        Integer term2053 = new Integer(1209799204);
        HashMap term2068 = new HashMap();
        Set<Object> term2109 =  ((Map) term2068).keySet();
        HashSet term2067 = new HashSet((Collection<? extends Object>) term2109);
        term2049 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        Object term2052 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term2049, term2049.getClass(), "id", term2050);
        setField(term2052, term2052.getClass(), "id", term2053);
        setField(term2052, term2052.getClass(), "role", "QZBHZqZope");
        setField(term2052, term2052.getClass(), "users", term2067);
        setField(term2049, term2049.getClass(), "authority", term2052);
        setField(term2049, term2049.getClass(), "email", "PaCpFXGzdX");
        setField(term2049, term2049.getClass(), "password", "FftYCNbnks");
        setBooleanField(term2049, term2049.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2049, args);
    }

};


