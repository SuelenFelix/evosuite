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

public class Person_getUsername_104407083840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19031;

    public Person_getUsername_104407083840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19031 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        setField(term19031, term19031.getClass(), "firstName", null);
        setField(term19031, term19031.getClass(), "lastName", null);
        setField(term19031, term19031.getClass(), "email", null);
        setField(term19031, term19031.getClass(), "username", null);
        setField(term19031, term19031.getClass(), "password", null);
        setField(term19031, term19031.getClass(), "profileImage", null);
        setField(term19031, term19031.getClass(), "status", null);
        setField(term19031, term19031.getClass(), "phone", null);
        setField(term19031, term19031.getClass(), "countryCode", null);
        setField(term19031, term19031.getClass(), "salt", null);
        setField(term19031, term19031.getClass(), "personRoles", null);
        setField(term19031, term19031.getClass(), "id", null);
        setField(term19031, term19031.getClass(), "createdAt", null);
        setField(term19031, term19031.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term19031, args);
    }

};


