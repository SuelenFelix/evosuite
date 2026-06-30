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

public class Person_setCountryCode_193579227755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19046;

    public Person_setCountryCode_193579227755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19046 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        setField(term19046, term19046.getClass(), "firstName", null);
        setField(term19046, term19046.getClass(), "lastName", null);
        setField(term19046, term19046.getClass(), "email", null);
        setField(term19046, term19046.getClass(), "username", null);
        setField(term19046, term19046.getClass(), "password", null);
        setField(term19046, term19046.getClass(), "profileImage", null);
        setField(term19046, term19046.getClass(), "status", null);
        setField(term19046, term19046.getClass(), "phone", null);
        setField(term19046, term19046.getClass(), "countryCode", null);
        setField(term19046, term19046.getClass(), "salt", null);
        setField(term19046, term19046.getClass(), "personRoles", null);
        setField(term19046, term19046.getClass(), "id", null);
        setField(term19046, term19046.getClass(), "createdAt", null);
        setField(term19046, term19046.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountryCode", argTypes, term19046, args);
    }

};


