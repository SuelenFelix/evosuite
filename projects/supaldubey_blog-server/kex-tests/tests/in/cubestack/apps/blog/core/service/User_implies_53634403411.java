package in.cubestack.apps.blog.core.service;

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
import static in.cubestack.apps.blog.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_implies_53634403411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655;

    public User_implies_53634403411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term655, term655.getClass(), "personId", null);
        setField(term655, term655.getClass(), "userName", null);
        setField(term655, term655.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.security.auth.Subject");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "implies", argTypes, term655, args);
    }

};


