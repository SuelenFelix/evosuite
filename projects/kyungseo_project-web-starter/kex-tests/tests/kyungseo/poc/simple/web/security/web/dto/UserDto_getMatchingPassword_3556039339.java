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

public class UserDto_getMatchingPassword_3556039339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1365;

    public UserDto_getMatchingPassword_3556039339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1414 = new Boolean(false);
        Integer term1416 = new Integer(-1456670397);
        Integer term1455 = new Integer(1622346318);
        term1365 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1365, term1365.getClass(), "membername", "nHXjMycHlU");
        setField(term1365, term1365.getClass(), "password", "ieCtQFdkii");
        setField(term1365, term1365.getClass(), "matchingPassword", "dEnhdmILtU");
        setField(term1365, term1365.getClass(), "email", "hoicvmsovO");
        setField(term1365, term1365.getClass(), "enabled", term1414);
        setField(term1365, term1365.getClass(), "age", term1416);
        setField(term1365, term1365.getClass(), "phoneNumber", "eqJfYWRaEL");
        setField(term1365, term1365.getClass(), "country", "fhkbdRViHi");
        setField(term1365, term1365.getClass(), "birthdate", "uWHnvSvaPl");
        setBooleanField(term1365, term1365.getClass(), "isUsing2FA", false);
        setField(term1365, term1365.getClass(), "role", term1455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchingPassword", argTypes, term1365, args);
    }

};


