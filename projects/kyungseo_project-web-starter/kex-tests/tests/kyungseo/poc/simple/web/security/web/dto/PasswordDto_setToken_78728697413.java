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

public class PasswordDto_setToken_78728697413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4410;

    public PasswordDto_setToken_78728697413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4410 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.PasswordDto"));
        setField(term4410, term4410.getClass(), "oldPassword", null);
        setField(term4410, term4410.getClass(), "token", null);
        setField(term4410, term4410.getClass(), "newPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.PasswordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToken", argTypes, term4410, args);
    }

};


