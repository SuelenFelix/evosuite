package codeit.gatcha.api.security.service;

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
import static codeit.gatcha.api.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class API_SignUpService_init_4532420051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public API_SignUpService_init_4532420051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.service.API_SignUpService");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.service.signUp.SignUpService");
        argTypes[1] = Class.forName("codeit.gatcha.domain.user.service.signUp.EmailConfirmationService");
        argTypes[2] = Class.forName("codeit.gatcha.domain.user.service.signUp.UserService");
        argTypes[3] = Class.forName("codeit.gatcha.api.security.service.ConfirmationTokenService");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


