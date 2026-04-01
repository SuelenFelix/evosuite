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

public class PasswordDto_setOldPassword_12609913392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004;

    public PasswordDto_setOldPassword_12609913392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.PasswordDto"));
        setField(term4004, term4004.getClass(), "oldPassword", "rLHAoqXgPh");
        setField(term4004, term4004.getClass(), "token", "zUlRdimJtU");
        setField(term4004, term4004.getClass(), "newPassword", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.PasswordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xtftXXMbem";
        callMethod(klass, "setOldPassword", argTypes, term4004, args);
    }

};


