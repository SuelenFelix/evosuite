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

public class UserDto_getAge_9195967713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;

    public UserDto_getAge_9195967713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2086 = new Boolean(true);
        Integer term2088 = new Integer(1135664017);
        Integer term2127 = new Integer(590364439);
        term2037 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2037, term2037.getClass(), "membername", "PkWMRdJcBb");
        setField(term2037, term2037.getClass(), "password", "jSpAteRute");
        setField(term2037, term2037.getClass(), "matchingPassword", "swZVeJAxjt");
        setField(term2037, term2037.getClass(), "email", "xOcJIiQQDu");
        setField(term2037, term2037.getClass(), "enabled", term2086);
        setField(term2037, term2037.getClass(), "age", term2088);
        setField(term2037, term2037.getClass(), "phoneNumber", "GVizqqzXpy");
        setField(term2037, term2037.getClass(), "country", "JqXGgAhZPl");
        setField(term2037, term2037.getClass(), "birthdate", "jiKYgYHqIS");
        setBooleanField(term2037, term2037.getClass(), "isUsing2FA", false);
        setField(term2037, term2037.getClass(), "role", term2127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term2037, args);
    }

};


