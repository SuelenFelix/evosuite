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

public class UserDto_getRole_10860165443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;

    public UserDto_getRole_10860165443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term396 = new Boolean(false);
        Integer term398 = new Integer(-1922583790);
        Integer term437 = new Integer(-616727354);
        term347 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term347, term347.getClass(), "membername", "aJlieCFVtF");
        setField(term347, term347.getClass(), "password", "ZiaGIbnzTs");
        setField(term347, term347.getClass(), "matchingPassword", "tbcdzjIfER");
        setField(term347, term347.getClass(), "email", "HyxfbSQYBe");
        setField(term347, term347.getClass(), "enabled", term396);
        setField(term347, term347.getClass(), "age", term398);
        setField(term347, term347.getClass(), "phoneNumber", "pCTimMblYc");
        setField(term347, term347.getClass(), "country", "hNxWaHcfhY");
        setField(term347, term347.getClass(), "birthdate", "RkybSrpybU");
        setBooleanField(term347, term347.getClass(), "isUsing2FA", false);
        setField(term347, term347.getClass(), "role", term437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term347, args);
    }

};


