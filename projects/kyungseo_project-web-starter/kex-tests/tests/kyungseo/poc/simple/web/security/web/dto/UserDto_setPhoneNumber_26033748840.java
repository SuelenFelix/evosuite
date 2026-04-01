package kyungseo.poc.simple.web.security.web.dto;

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
import static kyungseo.poc.simple.web.security.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDto_setPhoneNumber_26033748840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3919;

    public UserDto_setPhoneNumber_26033748840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3919 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3919, term3919.getClass(), "membername", null);
        setField(term3919, term3919.getClass(), "password", null);
        setField(term3919, term3919.getClass(), "matchingPassword", null);
        setField(term3919, term3919.getClass(), "email", null);
        setField(term3919, term3919.getClass(), "enabled", null);
        setField(term3919, term3919.getClass(), "age", null);
        setField(term3919, term3919.getClass(), "phoneNumber", null);
        setField(term3919, term3919.getClass(), "country", null);
        setField(term3919, term3919.getClass(), "birthdate", null);
        setBooleanField(term3919, term3919.getClass(), "isUsing2FA", false);
        setField(term3919, term3919.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhoneNumber", argTypes, term3919, args);
    }

};


