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

public class UserDto_setPassword_3707581048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1181;

    public UserDto_setPassword_3707581048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1230 = new Boolean(true);
        Integer term1232 = new Integer(597278769);
        Integer term1271 = new Integer(-1685132342);
        term1181 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1181, term1181.getClass(), "membername", "UiUYnPrcCi");
        setField(term1181, term1181.getClass(), "password", "UoYtihxVaS");
        setField(term1181, term1181.getClass(), "matchingPassword", "JDswTTCZHV");
        setField(term1181, term1181.getClass(), "email", "onpbIeEKoi");
        setField(term1181, term1181.getClass(), "enabled", term1230);
        setField(term1181, term1181.getClass(), "age", term1232);
        setField(term1181, term1181.getClass(), "phoneNumber", "YRHGsAkhxb");
        setField(term1181, term1181.getClass(), "country", "ffYhPOzlUs");
        setField(term1181, term1181.getClass(), "birthdate", "MLqYREekMl");
        setBooleanField(term1181, term1181.getClass(), "isUsing2FA", true);
        setField(term1181, term1181.getClass(), "role", term1271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setPassword", argTypes, term1181, args);
    }

};


