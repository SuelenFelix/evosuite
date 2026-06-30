package in.cubestack.apps.blog.admin.service;

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
import static in.cubestack.apps.blog.admin.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AdminService_login_10418913051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public AdminService_login_10418913051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("in.cubestack.apps.blog.admin.service.AdminService"));
        Object term25 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.TokenAuthenticationService"));
        setField(term25, term25.getClass(), "jwtSecret", "sjlJAEtRrb");
        setField(term24, term24.getClass(), "tokenAuthenticationService", term25);
        setField(term24, term24.getClass(), "personService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.service.AdminService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        callMethod(klass, "login", argTypes, term24, args);
    }

};


