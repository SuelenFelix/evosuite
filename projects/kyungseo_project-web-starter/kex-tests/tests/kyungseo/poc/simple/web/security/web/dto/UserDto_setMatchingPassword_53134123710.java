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

public class UserDto_setMatchingPassword_53134123710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527;

    public UserDto_setMatchingPassword_53134123710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1576 = new Boolean(true);
        Integer term1578 = new Integer(1048535127);
        Integer term1617 = new Integer(-655067527);
        term1527 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1527, term1527.getClass(), "membername", "kBdSllIBVz");
        setField(term1527, term1527.getClass(), "password", "TJmVBGfTML");
        setField(term1527, term1527.getClass(), "matchingPassword", "tPlsykYBqO");
        setField(term1527, term1527.getClass(), "email", "bLPjGVBhlX");
        setField(term1527, term1527.getClass(), "enabled", term1576);
        setField(term1527, term1527.getClass(), "age", term1578);
        setField(term1527, term1527.getClass(), "phoneNumber", "whBvTVIIlC");
        setField(term1527, term1527.getClass(), "country", "IgRJUzaCwW");
        setField(term1527, term1527.getClass(), "birthdate", "JUmudUmaaV");
        setBooleanField(term1527, term1527.getClass(), "isUsing2FA", true);
        setField(term1527, term1527.getClass(), "role", term1617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setMatchingPassword", argTypes, term1527, args);
    }

};


