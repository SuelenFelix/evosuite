package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Person_addRole_196040057546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19037;

    public Person_addRole_196040057546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19037 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        setField(term19037, term19037.getClass(), "firstName", null);
        setField(term19037, term19037.getClass(), "lastName", null);
        setField(term19037, term19037.getClass(), "email", null);
        setField(term19037, term19037.getClass(), "username", null);
        setField(term19037, term19037.getClass(), "password", null);
        setField(term19037, term19037.getClass(), "profileImage", null);
        setField(term19037, term19037.getClass(), "status", null);
        setField(term19037, term19037.getClass(), "phone", null);
        setField(term19037, term19037.getClass(), "countryCode", null);
        setField(term19037, term19037.getClass(), "salt", null);
        setField(term19037, term19037.getClass(), "personRoles", null);
        setField(term19037, term19037.getClass(), "id", null);
        setField(term19037, term19037.getClass(), "createdAt", null);
        setField(term19037, term19037.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addRole", argTypes, term19037, args);
    }

};


