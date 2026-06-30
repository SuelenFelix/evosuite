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

public class UserDto_setEnabled_55169282112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1873;
     Object term1965;

    public UserDto_setEnabled_55169282112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1922 = new Boolean(true);
        Integer term1924 = new Integer(-117576464);
        Integer term1963 = new Integer(-1007160944);
        term1873 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1873, term1873.getClass(), "membername", "VgZnGoIFwQ");
        setField(term1873, term1873.getClass(), "password", "jUbSRrkrYZ");
        setField(term1873, term1873.getClass(), "matchingPassword", "bWWfajKbEX");
        setField(term1873, term1873.getClass(), "email", "cAPeiZHKGJ");
        setField(term1873, term1873.getClass(), "enabled", term1922);
        setField(term1873, term1873.getClass(), "age", term1924);
        setField(term1873, term1873.getClass(), "phoneNumber", "LvJFtLBaxj");
        setField(term1873, term1873.getClass(), "country", "PHvxnGHptP");
        setField(term1873, term1873.getClass(), "birthdate", "TimdotUuNC");
        setBooleanField(term1873, term1873.getClass(), "isUsing2FA", true);
        setField(term1873, term1873.getClass(), "role", term1963);
        term1965 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1965;
        callMethod(klass, "setEnabled", argTypes, term1873, args);
    }

};


