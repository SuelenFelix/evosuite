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

public class GatchaUser_GatchaUserBuilder_toString_118041196415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2144;

    public GatchaUser_GatchaUserBuilder_toString_118041196415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2144 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder"));
        setField(term2144, term2144.getClass(), "id", null);
        setField(term2144, term2144.getClass(), "authority", null);
        setField(term2144, term2144.getClass(), "email", null);
        setField(term2144, term2144.getClass(), "password", null);
        setBooleanField(term2144, term2144.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser$GatchaUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2144, args);
    }

};


