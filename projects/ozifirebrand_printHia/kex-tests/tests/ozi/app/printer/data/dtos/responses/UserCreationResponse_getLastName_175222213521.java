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

public class UserCreationResponse_getLastName_175222213521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21312;

    public UserCreationResponse_getLastName_175222213521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21312 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term21312, term21312.getClass(), "firstName", null);
        setField(term21312, term21312.getClass(), "lastName", null);
        setField(term21312, term21312.getClass(), "username", null);
        setField(term21312, term21312.getClass(), "email", null);
        setField(term21312, term21312.getClass(), "id", null);
        setField(term21312, term21312.getClass(), "role", null);
        setField(term21312, term21312.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term21312, args);
    }

};


