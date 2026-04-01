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
import java.lang.Integer;

public class UserDto_setBirthdate_179818191420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3217;

    public UserDto_setBirthdate_179818191420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3266 = new Boolean(true);
        Integer term3268 = new Integer(1962444399);
        Integer term3307 = new Integer(767834723);
        term3217 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3217, term3217.getClass(), "membername", "ZzIujlwVsw");
        setField(term3217, term3217.getClass(), "password", "LWyEaeIyAo");
        setField(term3217, term3217.getClass(), "matchingPassword", "yVMkkQhvmN");
        setField(term3217, term3217.getClass(), "email", "mvrkADEgpp");
        setField(term3217, term3217.getClass(), "enabled", term3266);
        setField(term3217, term3217.getClass(), "age", term3268);
        setField(term3217, term3217.getClass(), "phoneNumber", "pXOkjyeIRb");
        setField(term3217, term3217.getClass(), "country", "GgZWSjxjyE");
        setField(term3217, term3217.getClass(), "birthdate", "EeBVbzjcCI");
        setBooleanField(term3217, term3217.getClass(), "isUsing2FA", false);
        setField(term3217, term3217.getClass(), "role", term3307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UfQtPRyWRC";
        callMethod(klass, "setBirthdate", argTypes, term3217, args);
    }

};


