package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdminCreationResponse_getRole_196556689320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25327;

    public AdminCreationResponse_getRole_196556689320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25327 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term25327, term25327.getClass(), "id", null);
        setField(term25327, term25327.getClass(), "firstName", null);
        setField(term25327, term25327.getClass(), "lastName", null);
        setField(term25327, term25327.getClass(), "email", null);
        setField(term25327, term25327.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term25327, args);
    }

};


