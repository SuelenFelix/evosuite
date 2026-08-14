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

public class JwtUserResponse_JwtUserResponseBuilder_email_142861813613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public JwtUserResponse_JwtUserResponseBuilder_email_142861813613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1557 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term1557, term1557.getClass(), "username", null);
        setField(term1557, term1557.getClass(), "avatar", null);
        setField(term1557, term1557.getClass(), "fullName", null);
        setField(term1557, term1557.getClass(), "email", null);
        setField(term1557, term1557.getClass(), "roles", null);
        setField(term1557, term1557.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "email", argTypes, term1557, args);
    }

};


