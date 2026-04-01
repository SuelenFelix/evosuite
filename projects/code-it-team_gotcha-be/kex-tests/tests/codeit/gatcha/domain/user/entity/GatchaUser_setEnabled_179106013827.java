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
import java.lang.Boolean;

public class GatchaUser_setEnabled_179106013827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;
     Object term1096;

    public GatchaUser_setEnabled_179106013827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1094 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        setField(term1094, term1094.getClass(), "id", null);
        setField(term1094, term1094.getClass(), "authority", null);
        setField(term1094, term1094.getClass(), "email", null);
        setField(term1094, term1094.getClass(), "password", null);
        setBooleanField(term1094, term1094.getClass(), "enabled", false);
        term1096 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1096;
        callMethod(klass, "setEnabled", argTypes, term1094, args);
    }

};


