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

public class Person_setSalt_43529436348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19039;

    public Person_setSalt_43529436348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19039 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        setField(term19039, term19039.getClass(), "firstName", null);
        setField(term19039, term19039.getClass(), "lastName", null);
        setField(term19039, term19039.getClass(), "email", null);
        setField(term19039, term19039.getClass(), "username", null);
        setField(term19039, term19039.getClass(), "password", null);
        setField(term19039, term19039.getClass(), "profileImage", null);
        setField(term19039, term19039.getClass(), "status", null);
        setField(term19039, term19039.getClass(), "phone", null);
        setField(term19039, term19039.getClass(), "countryCode", null);
        setField(term19039, term19039.getClass(), "salt", null);
        setField(term19039, term19039.getClass(), "personRoles", null);
        setField(term19039, term19039.getClass(), "id", null);
        setField(term19039, term19039.getClass(), "createdAt", null);
        setField(term19039, term19039.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setSalt", argTypes, term19039, args);
    }

};


