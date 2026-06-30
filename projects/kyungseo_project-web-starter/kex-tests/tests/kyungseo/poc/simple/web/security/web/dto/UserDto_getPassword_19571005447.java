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

public class UserDto_getPassword_19571005447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019;

    public UserDto_getPassword_19571005447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1068 = new Boolean(true);
        Integer term1070 = new Integer(-883034806);
        Integer term1109 = new Integer(1585847225);
        term1019 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1019, term1019.getClass(), "membername", "BndsHwAFMv");
        setField(term1019, term1019.getClass(), "password", "GzFkzHGYFt");
        setField(term1019, term1019.getClass(), "matchingPassword", "tShwQLRGNe");
        setField(term1019, term1019.getClass(), "email", "LvtrsXUliU");
        setField(term1019, term1019.getClass(), "enabled", term1068);
        setField(term1019, term1019.getClass(), "age", term1070);
        setField(term1019, term1019.getClass(), "phoneNumber", "xLbjWUgOIL");
        setField(term1019, term1019.getClass(), "country", "jDtqGUpnZN");
        setField(term1019, term1019.getClass(), "birthdate", "nGKItKLYNC");
        setBooleanField(term1019, term1019.getClass(), "isUsing2FA", true);
        setField(term1019, term1019.getClass(), "role", term1109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1019, args);
    }

};


