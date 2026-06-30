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
import java.lang.String;
import java.lang.Object;

public class AdminCreationResponse_equals_96071405311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24201;
     Object term24259;

    public AdminCreationResponse_equals_96071405311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24301 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term24300 = ((Class) term24301).getDeclaredField((String) "ADMIN");
        ((Field) term24300).setAccessible(true);
        Object enum87 = ((Field) term24300).get((Object) null);
        term24201 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term24201, term24201.getClass(), "id", "NxgmYPzWCI");
        setField(term24201, term24201.getClass(), "firstName", "SqjyKmayBx");
        setField(term24201, term24201.getClass(), "lastName", "XjDhvToxJy");
        setField(term24201, term24201.getClass(), "email", "nxSTJflLQy");
        setField(term24201, term24201.getClass(), "role", enum87);
        term24259 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24259;
        callMethod(klass, "equals", argTypes, term24201, args);
    }

};


