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

public class AdminCreationResponse_setId_21454751096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22725;

    public AdminCreationResponse_setId_21454751096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22836 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22835 = ((Class) term22836).getDeclaredField((String) "ADMIN");
        ((Field) term22835).setAccessible(true);
        Object enum82 = ((Field) term22835).get((Object) null);
        term22725 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term22725, term22725.getClass(), "id", "uXYcXVYJZM");
        setField(term22725, term22725.getClass(), "firstName", "BJhjdJUhkz");
        setField(term22725, term22725.getClass(), "lastName", "cdHYQDgUZR");
        setField(term22725, term22725.getClass(), "email", "KAORSSPSeV");
        setField(term22725, term22725.getClass(), "role", enum82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UimMMORkzd";
        callMethod(klass, "setId", argTypes, term22725, args);
    }

};


