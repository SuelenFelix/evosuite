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

public class UserCreationRequest_hashCode_190175691811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1693;

    public UserCreationRequest_hashCode_190175691811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1693 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest"));
        setField(term1693, term1693.getClass(), "firstName", "whBvTVIIlC");
        setField(term1693, term1693.getClass(), "lastName", "IgRJUzaCwW");
        setField(term1693, term1693.getClass(), "password", "JUmudUmaaV");
        setField(term1693, term1693.getClass(), "email", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1693, args);
    }

};


