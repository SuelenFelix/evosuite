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

public class UserCreationRequest_toString_139099722812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1782;

    public UserCreationRequest_toString_139099722812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1782 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest"));
        setField(term1782, term1782.getClass(), "firstName", "HqBOwkVqjD");
        setField(term1782, term1782.getClass(), "lastName", "MAcUBcBckh");
        setField(term1782, term1782.getClass(), "password", "oVgzLbrsFr");
        setField(term1782, term1782.getClass(), "email", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1782, args);
    }

};


