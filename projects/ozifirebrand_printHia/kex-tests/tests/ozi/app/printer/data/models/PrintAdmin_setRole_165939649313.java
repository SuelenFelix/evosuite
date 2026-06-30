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

public class PrintAdmin_setRole_165939649313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21394;
     Object enum77;

    public PrintAdmin_setRole_165939649313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21535 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21534 = ((Class) term21535).getDeclaredField((String) "ADMIN");
        ((Field) term21534).setAccessible(true);
        Object enum76 = ((Field) term21534).get((Object) null);
        term21394 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term21394, term21394.getClass(), "id", "NxgmYPzWCI");
        setField(term21394, term21394.getClass(), "firstName", "SqjyKmayBx");
        setField(term21394, term21394.getClass(), "lastName", "XjDhvToxJy");
        setField(term21394, term21394.getClass(), "phoneNumber", "nxSTJflLQy");
        setField(term21394, term21394.getClass(), "email", "FlHzxEfFzI");
        setField(term21394, term21394.getClass(), "role", enum76);
        setField(term21394, term21394.getClass(), "password", "aSATgQUpoe");
        Class<? extends Object> term21727 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21726 = ((Class) term21727).getDeclaredField((String) "USER");
        ((Field) term21726).setAccessible(true);
        enum77 = ((Field) term21726).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.Role");
        Object[] args = new Object[1];
        args[0] = enum77;
        callMethod(klass, "setRole", argTypes, term21394, args);
    }

};


