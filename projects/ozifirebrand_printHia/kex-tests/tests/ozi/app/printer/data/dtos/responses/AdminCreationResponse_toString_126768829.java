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

public class AdminCreationResponse_toString_126768829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25336;

    public AdminCreationResponse_toString_126768829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25336 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term25336, term25336.getClass(), "id", null);
        setField(term25336, term25336.getClass(), "firstName", null);
        setField(term25336, term25336.getClass(), "lastName", null);
        setField(term25336, term25336.getClass(), "email", null);
        setField(term25336, term25336.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25336, args);
    }

};


