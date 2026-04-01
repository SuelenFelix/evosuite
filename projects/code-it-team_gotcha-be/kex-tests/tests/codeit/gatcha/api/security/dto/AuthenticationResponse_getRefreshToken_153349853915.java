package codeit.gatcha.api.security.dto;

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
import static codeit.gatcha.api.security.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthenticationResponse_getRefreshToken_153349853915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;

    public AuthenticationResponse_getRefreshToken_153349853915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("codeit.gatcha.api.security.dto.AuthenticationResponse"));
        setField(term560, term560.getClass(), "refreshToken", null);
        setField(term560, term560.getClass(), "accessToken", null);
        setField(term560, term560.getClass(), "userName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.dto.AuthenticationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term560, args);
    }

};


