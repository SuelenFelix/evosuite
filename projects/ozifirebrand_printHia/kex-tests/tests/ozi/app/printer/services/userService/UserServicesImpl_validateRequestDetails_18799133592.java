package ozi.app.printer.services.userService;

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
import static ozi.app.printer.services.userService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserServicesImpl_validateRequestDetails_18799133592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;

    public UserServicesImpl_validateRequestDetails_18799133592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest"));
        setField(term90, term90.getClass(), "firstName", "jJCZpVmanW");
        setField(term90, term90.getClass(), "lastName", "EGtDIRbSSb");
        setField(term90, term90.getClass(), "password", "SzjVpOQTyS");
        setField(term90, term90.getClass(), "email", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.userService.UserServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "validateRequestDetails", argTypes, null, args);
    }

};


