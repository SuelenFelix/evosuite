package online.devupgrade.sezon2.dto;

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
import static online.devupgrade.sezon2.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginCredentials_getRoles_180665837714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;

    public LoginCredentials_getRoles_180665837714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049 = newInstance(Class.forName("online.devupgrade.sezon2.dto.LoginCredentials"));
        setField(term1049, term1049.getClass(), "login", null);
        setField(term1049, term1049.getClass(), "password", null);
        setField(term1049, term1049.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.LoginCredentials");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term1049, args);
    }

};


