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

public class UserDto_setPhoneNumber_26033748816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2525;

    public UserDto_setPhoneNumber_26033748816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2574 = new Boolean(true);
        Integer term2576 = new Integer(-73683645);
        Integer term2615 = new Integer(-226514366);
        term2525 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2525, term2525.getClass(), "membername", "fztQhjqwdP");
        setField(term2525, term2525.getClass(), "password", "eVpkWxjuki");
        setField(term2525, term2525.getClass(), "matchingPassword", "SJiQaLvSKv");
        setField(term2525, term2525.getClass(), "email", "OEXDRUKcFl");
        setField(term2525, term2525.getClass(), "enabled", term2574);
        setField(term2525, term2525.getClass(), "age", term2576);
        setField(term2525, term2525.getClass(), "phoneNumber", "RYdKCNNMBR");
        setField(term2525, term2525.getClass(), "country", "yGtHPyvYiQ");
        setField(term2525, term2525.getClass(), "birthdate", "MvRIxilFMJ");
        setBooleanField(term2525, term2525.getClass(), "isUsing2FA", false);
        setField(term2525, term2525.getClass(), "role", term2615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setPhoneNumber", argTypes, term2525, args);
    }

};


