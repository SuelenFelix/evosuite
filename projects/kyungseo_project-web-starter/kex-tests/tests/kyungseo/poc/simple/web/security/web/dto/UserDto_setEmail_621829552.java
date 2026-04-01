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

public class UserDto_setEmail_621829552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;

    public UserDto_setEmail_621829552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term212 = new Boolean(false);
        Integer term214 = new Integer(1484323161);
        Integer term253 = new Integer(391863371);
        term163 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term163, term163.getClass(), "membername", "MjGYSRKTNF");
        setField(term163, term163.getClass(), "password", "hRNSzYYIrc");
        setField(term163, term163.getClass(), "matchingPassword", "RMFIsYGgne");
        setField(term163, term163.getClass(), "email", "NRdvgJlhkX");
        setField(term163, term163.getClass(), "enabled", term212);
        setField(term163, term163.getClass(), "age", term214);
        setField(term163, term163.getClass(), "phoneNumber", "uuaPigETmJ");
        setField(term163, term163.getClass(), "country", "MxlszYVzRf");
        setField(term163, term163.getClass(), "birthdate", "LQFpaHEwXR");
        setBooleanField(term163, term163.getClass(), "isUsing2FA", false);
        setField(term163, term163.getClass(), "role", term253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "setEmail", argTypes, term163, args);
    }

};


