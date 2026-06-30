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

public class Person_deactivate_4586879941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19032;

    public Person_deactivate_4586879941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19032 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        setField(term19032, term19032.getClass(), "firstName", null);
        setField(term19032, term19032.getClass(), "lastName", null);
        setField(term19032, term19032.getClass(), "email", null);
        setField(term19032, term19032.getClass(), "username", null);
        setField(term19032, term19032.getClass(), "password", null);
        setField(term19032, term19032.getClass(), "profileImage", null);
        setField(term19032, term19032.getClass(), "status", null);
        setField(term19032, term19032.getClass(), "phone", null);
        setField(term19032, term19032.getClass(), "countryCode", null);
        setField(term19032, term19032.getClass(), "salt", null);
        setField(term19032, term19032.getClass(), "personRoles", null);
        setField(term19032, term19032.getClass(), "id", null);
        setField(term19032, term19032.getClass(), "createdAt", null);
        setField(term19032, term19032.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deactivate", argTypes, term19032, args);
    }

};


