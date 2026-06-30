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

public class UserDto_getBirthdate_196093935419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055;

    public UserDto_getBirthdate_196093935419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3104 = new Boolean(false);
        Integer term3106 = new Integer(-1145578966);
        Integer term3145 = new Integer(679763016);
        term3055 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3055, term3055.getClass(), "membername", "xJgPlLxpgC");
        setField(term3055, term3055.getClass(), "password", "EYtfuJaxiM");
        setField(term3055, term3055.getClass(), "matchingPassword", "gCWtLVKVVe");
        setField(term3055, term3055.getClass(), "email", "fWKJoSoCwE");
        setField(term3055, term3055.getClass(), "enabled", term3104);
        setField(term3055, term3055.getClass(), "age", term3106);
        setField(term3055, term3055.getClass(), "phoneNumber", "wfaXBpWAUH");
        setField(term3055, term3055.getClass(), "country", "VMeAzAHwZj");
        setField(term3055, term3055.getClass(), "birthdate", "PznxWXsZME");
        setBooleanField(term3055, term3055.getClass(), "isUsing2FA", false);
        setField(term3055, term3055.getClass(), "role", term3145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthdate", argTypes, term3055, args);
    }

};


