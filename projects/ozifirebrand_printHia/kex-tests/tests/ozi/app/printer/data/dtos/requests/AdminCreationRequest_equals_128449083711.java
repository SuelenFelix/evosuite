package ozi.app.printer.data.dtos.requests;

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
import static ozi.app.printer.data.dtos.requests.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdminCreationRequest_equals_128449083711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3103;
     Object term3164;

    public AdminCreationRequest_equals_128449083711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3103 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest"));
        setField(term3103, term3103.getClass(), "firstName", "EYtfuJaxiM");
        setField(term3103, term3103.getClass(), "lastName", "gCWtLVKVVe");
        setField(term3103, term3103.getClass(), "phoneNumber", "fWKJoSoCwE");
        setField(term3103, term3103.getClass(), "email", "wfaXBpWAUH");
        setField(term3103, term3103.getClass(), "password", "VMeAzAHwZj");
        term3164 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3164;
        callMethod(klass, "equals", argTypes, term3103, args);
    }

};


