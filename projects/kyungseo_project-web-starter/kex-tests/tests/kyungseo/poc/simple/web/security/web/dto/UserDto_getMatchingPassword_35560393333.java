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

public class UserDto_getMatchingPassword_35560393333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3905;

    public UserDto_getMatchingPassword_35560393333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3905 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3905, term3905.getClass(), "membername", null);
        setField(term3905, term3905.getClass(), "password", null);
        setField(term3905, term3905.getClass(), "matchingPassword", null);
        setField(term3905, term3905.getClass(), "email", null);
        setField(term3905, term3905.getClass(), "enabled", null);
        setField(term3905, term3905.getClass(), "age", null);
        setField(term3905, term3905.getClass(), "phoneNumber", null);
        setField(term3905, term3905.getClass(), "country", null);
        setField(term3905, term3905.getClass(), "birthdate", null);
        setBooleanField(term3905, term3905.getClass(), "isUsing2FA", false);
        setField(term3905, term3905.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchingPassword", argTypes, term3905, args);
    }

};


