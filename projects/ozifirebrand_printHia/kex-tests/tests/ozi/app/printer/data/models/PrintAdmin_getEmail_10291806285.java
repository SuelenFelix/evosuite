package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PrintAdmin_getEmail_10291806285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18704;

    public PrintAdmin_getEmail_10291806285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18836 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term18835 = ((Class) term18836).getDeclaredField((String) "USER");
        ((Field) term18835).setAccessible(true);
        Object enum68 = ((Field) term18835).get((Object) null);
        term18704 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term18704, term18704.getClass(), "id", "KarbTXFmUU");
        setField(term18704, term18704.getClass(), "firstName", "jiUSjqwSIQ");
        setField(term18704, term18704.getClass(), "lastName", "MgLCedQfoj");
        setField(term18704, term18704.getClass(), "phoneNumber", "zgKiINdgNu");
        setField(term18704, term18704.getClass(), "email", "zLMTXDQHYH");
        setField(term18704, term18704.getClass(), "role", enum68);
        setField(term18704, term18704.getClass(), "password", "PqywFWJlpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term18704, args);
    }

};


