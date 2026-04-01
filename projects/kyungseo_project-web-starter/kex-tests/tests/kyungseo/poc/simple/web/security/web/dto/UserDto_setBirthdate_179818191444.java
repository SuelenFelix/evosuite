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

public class UserDto_setBirthdate_179818191444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3927;

    public UserDto_setBirthdate_179818191444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3927 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3927, term3927.getClass(), "membername", null);
        setField(term3927, term3927.getClass(), "password", null);
        setField(term3927, term3927.getClass(), "matchingPassword", null);
        setField(term3927, term3927.getClass(), "email", null);
        setField(term3927, term3927.getClass(), "enabled", null);
        setField(term3927, term3927.getClass(), "age", null);
        setField(term3927, term3927.getClass(), "phoneNumber", null);
        setField(term3927, term3927.getClass(), "country", null);
        setField(term3927, term3927.getClass(), "birthdate", null);
        setBooleanField(term3927, term3927.getClass(), "isUsing2FA", false);
        setField(term3927, term3927.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBirthdate", argTypes, term3927, args);
    }

};


