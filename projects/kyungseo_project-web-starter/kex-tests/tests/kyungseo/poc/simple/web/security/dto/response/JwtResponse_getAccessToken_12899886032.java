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

public class JwtResponse_getAccessToken_12899886032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public JwtResponse_getAccessToken_12899886032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246 = new Long(-8257434502486459194L);
        term188 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term188, term188.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term188, term188.getClass(), "accessToken", "MjGYSRKTNF");
        setField(term188, term188.getClass(), "refreshToken", "hRNSzYYIrc");
        setField(term188, term188.getClass(), "tokenType", "RMFIsYGgne");
        setField(term188, term188.getClass(), "roles", "NRdvgJlhkX");
        setField(term188, term188.getClass(), "expiryDuration", term246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessToken", argTypes, term188, args);
    }

};


