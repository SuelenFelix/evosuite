package kyungseo.poc.simple.web.security.dto.response;

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
import static kyungseo.poc.simple.web.security.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JwtResponse_setExpiryDuration_76624782411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;
     Object term1299;

    public JwtResponse_setExpiryDuration_76624782411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1297 = new Long(-8885298608300233488L);
        term1239 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term1239, term1239.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term1239, term1239.getClass(), "accessToken", "LvtrsXUliU");
        setField(term1239, term1239.getClass(), "refreshToken", "xLbjWUgOIL");
        setField(term1239, term1239.getClass(), "tokenType", "jDtqGUpnZN");
        setField(term1239, term1239.getClass(), "roles", "nGKItKLYNC");
        setField(term1239, term1239.getClass(), "expiryDuration", term1297);
        term1299 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1299;
        callMethod(klass, "setExpiryDuration", argTypes, term1239, args);
    }

};


