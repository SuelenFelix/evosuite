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

public class JwtUserResponse_getToken_12672569367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public JwtUserResponse_getToken_12672569367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse"));
        setField(term409, term409.getClass(), "token", null);
        setField(term409, term409.getClass(), "username", null);
        setField(term409, term409.getClass(), "avatar", null);
        setField(term409, term409.getClass(), "fullName", null);
        setField(term409, term409.getClass(), "email", null);
        setField(term409, term409.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term409, args);
    }

};


