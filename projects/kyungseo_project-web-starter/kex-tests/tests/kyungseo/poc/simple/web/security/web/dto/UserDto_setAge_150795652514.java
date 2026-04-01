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

public class UserDto_setAge_150795652514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;
     Object term2291;

    public UserDto_setAge_150795652514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2248 = new Boolean(false);
        Integer term2250 = new Integer(865208305);
        Integer term2289 = new Integer(-1275173084);
        term2199 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2199, term2199.getClass(), "membername", "DfISiziTgG");
        setField(term2199, term2199.getClass(), "password", "XqgfKFvPSD");
        setField(term2199, term2199.getClass(), "matchingPassword", "JiVRgTZvKc");
        setField(term2199, term2199.getClass(), "email", "XPKmummaqg");
        setField(term2199, term2199.getClass(), "enabled", term2248);
        setField(term2199, term2199.getClass(), "age", term2250);
        setField(term2199, term2199.getClass(), "phoneNumber", "BKLfkLiZTH");
        setField(term2199, term2199.getClass(), "country", "SPpkrGcPRr");
        setField(term2199, term2199.getClass(), "birthdate", "sEccwbJKYE");
        setBooleanField(term2199, term2199.getClass(), "isUsing2FA", true);
        setField(term2199, term2199.getClass(), "role", term2289);
        term2291 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2291;
        callMethod(klass, "setAge", argTypes, term2199, args);
    }

};


