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

public class UserDto_getPhoneNumber_15728667215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2363;

    public UserDto_getPhoneNumber_15728667215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2412 = new Boolean(false);
        Integer term2414 = new Integer(-203030934);
        Integer term2453 = new Integer(-1179120542);
        term2363 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2363, term2363.getClass(), "membername", "AWRooQKkdW");
        setField(term2363, term2363.getClass(), "password", "vjxIhXHxGR");
        setField(term2363, term2363.getClass(), "matchingPassword", "QXzGXbEXMu");
        setField(term2363, term2363.getClass(), "email", "qxSDVejjiY");
        setField(term2363, term2363.getClass(), "enabled", term2412);
        setField(term2363, term2363.getClass(), "age", term2414);
        setField(term2363, term2363.getClass(), "phoneNumber", "xBsXSDjXYK");
        setField(term2363, term2363.getClass(), "country", "sEnIVFtZuQ");
        setField(term2363, term2363.getClass(), "birthdate", "ZVecLZMLHF");
        setBooleanField(term2363, term2363.getClass(), "isUsing2FA", false);
        setField(term2363, term2363.getClass(), "role", term2453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term2363, args);
    }

};


