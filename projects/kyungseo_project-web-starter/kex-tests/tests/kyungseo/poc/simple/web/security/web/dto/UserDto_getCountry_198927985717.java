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

public class UserDto_getCountry_198927985717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2709;

    public UserDto_getCountry_198927985717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2758 = new Boolean(true);
        Integer term2760 = new Integer(1193880199);
        Integer term2799 = new Integer(-1087774327);
        term2709 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2709, term2709.getClass(), "membername", "XylxrMBraH");
        setField(term2709, term2709.getClass(), "password", "pORebkoRdD");
        setField(term2709, term2709.getClass(), "matchingPassword", "mXGCWJDOqA");
        setField(term2709, term2709.getClass(), "email", "dpNsDgfPso");
        setField(term2709, term2709.getClass(), "enabled", term2758);
        setField(term2709, term2709.getClass(), "age", term2760);
        setField(term2709, term2709.getClass(), "phoneNumber", "hCWPJQKpdc");
        setField(term2709, term2709.getClass(), "country", "WzMEhMXkKx");
        setField(term2709, term2709.getClass(), "birthdate", "XOiDvlDhdc");
        setBooleanField(term2709, term2709.getClass(), "isUsing2FA", true);
        setField(term2709, term2709.getClass(), "role", term2799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term2709, args);
    }

};


