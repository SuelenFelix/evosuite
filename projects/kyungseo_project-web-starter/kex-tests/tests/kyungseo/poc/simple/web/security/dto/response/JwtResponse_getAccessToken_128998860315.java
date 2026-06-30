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

public class JwtResponse_getAccessToken_128998860315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;

    public JwtResponse_getAccessToken_128998860315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1349 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term1349, term1349.getClass(), "TOKEN_PREFIX", null);
        setField(term1349, term1349.getClass(), "accessToken", null);
        setField(term1349, term1349.getClass(), "refreshToken", null);
        setField(term1349, term1349.getClass(), "tokenType", null);
        setField(term1349, term1349.getClass(), "roles", null);
        setField(term1349, term1349.getClass(), "expiryDuration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessToken", argTypes, term1349, args);
    }

};


