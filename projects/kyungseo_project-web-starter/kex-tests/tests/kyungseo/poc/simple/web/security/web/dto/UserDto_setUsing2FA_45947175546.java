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
import java.lang.Boolean;

public class UserDto_setUsing2FA_45947175546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3931;
     Object term3933;

    public UserDto_setUsing2FA_45947175546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3931 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3931, term3931.getClass(), "membername", null);
        setField(term3931, term3931.getClass(), "password", null);
        setField(term3931, term3931.getClass(), "matchingPassword", null);
        setField(term3931, term3931.getClass(), "email", null);
        setField(term3931, term3931.getClass(), "enabled", null);
        setField(term3931, term3931.getClass(), "age", null);
        setField(term3931, term3931.getClass(), "phoneNumber", null);
        setField(term3931, term3931.getClass(), "country", null);
        setField(term3931, term3931.getClass(), "birthdate", null);
        setBooleanField(term3931, term3931.getClass(), "isUsing2FA", false);
        setField(term3931, term3931.getClass(), "role", null);
        term3933 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3933;
        callMethod(klass, "setUsing2FA", argTypes, term3931, args);
    }

};


