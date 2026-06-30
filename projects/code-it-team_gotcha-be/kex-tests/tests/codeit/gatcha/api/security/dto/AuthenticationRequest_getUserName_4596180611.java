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

public class AuthenticationRequest_getUserName_4596180611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;

    public AuthenticationRequest_getUserName_4596180611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653 = newInstance(Class.forName("codeit.gatcha.api.security.dto.AuthenticationRequest"));
        setField(term653, term653.getClass(), "userName", "TEParAifyi");
        setField(term653, term653.getClass(), "password", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.dto.AuthenticationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term653, args);
    }

};


