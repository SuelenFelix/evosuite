package es.joseluisgs.springdam.config.security.jwt.model;

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
import static es.joseluisgs.springdam.config.security.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginRequest_getUsername_18913915300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1562;

    public LoginRequest_getUsername_18913915300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1562 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.LoginRequest"));
        setField(term1562, term1562.getClass(), "username", "iNwOJRBEjp");
        setField(term1562, term1562.getClass(), "password", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.LoginRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1562, args);
    }

};


