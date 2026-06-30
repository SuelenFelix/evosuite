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

public class PrintAdmin_equals_6975519115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22251;
     Object term22333;

    public PrintAdmin_equals_6975519115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22385 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22384 = ((Class) term22385).getDeclaredField((String) "ADMIN");
        ((Field) term22384).setAccessible(true);
        Object enum79 = ((Field) term22384).get((Object) null);
        term22251 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term22251, term22251.getClass(), "id", "AyrEXuGrEj");
        setField(term22251, term22251.getClass(), "firstName", "yevIIoVYHq");
        setField(term22251, term22251.getClass(), "lastName", "UuYWMTqWTV");
        setField(term22251, term22251.getClass(), "phoneNumber", "DSFGlcaXUb");
        setField(term22251, term22251.getClass(), "email", "sHMXNUzNeM");
        setField(term22251, term22251.getClass(), "role", enum79);
        setField(term22251, term22251.getClass(), "password", "gPzGDOEPPw");
        term22333 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22333;
        callMethod(klass, "equals", argTypes, term22251, args);
    }

};


