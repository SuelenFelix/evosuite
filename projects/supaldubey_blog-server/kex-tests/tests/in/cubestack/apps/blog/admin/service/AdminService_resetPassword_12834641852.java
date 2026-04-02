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

public class AdminService_resetPassword_12834641852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public AdminService_resetPassword_12834641852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("in.cubestack.apps.blog.admin.service.AdminService"));
        Object term93 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.TokenAuthenticationService"));
        setField(term93, term93.getClass(), "jwtSecret", "jJCZpVmanW");
        setField(term92, term92.getClass(), "tokenAuthenticationService", term93);
        setField(term92, term92.getClass(), "personService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.service.AdminService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        callMethod(klass, "resetPassword", argTypes, term92, args);
    }

};


