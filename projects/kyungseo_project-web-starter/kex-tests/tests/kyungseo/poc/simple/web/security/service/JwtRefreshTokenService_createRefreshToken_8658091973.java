package kyungseo.poc.simple.web.security.service;

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
import static kyungseo.poc.simple.web.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JwtRefreshTokenService_createRefreshToken_8658091973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338;

    public JwtRefreshTokenService_createRefreshToken_8658091973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtRefreshTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term338;
        callMethod(klass, "createRefreshToken", argTypes, null, args);
    }

};


