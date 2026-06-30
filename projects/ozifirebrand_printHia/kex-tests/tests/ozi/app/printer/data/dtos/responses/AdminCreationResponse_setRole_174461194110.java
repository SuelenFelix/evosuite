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

public class AdminCreationResponse_setRole_174461194110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23921;
     Object enum86;

    public AdminCreationResponse_setRole_174461194110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24020 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term24019 = ((Class) term24020).getDeclaredField((String) "ADMIN");
        ((Field) term24019).setAccessible(true);
        enum86 = ((Field) term24019).get((Object) null);
        term23921 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term23921, term23921.getClass(), "id", "KtuuNAqGCQ");
        setField(term23921, term23921.getClass(), "firstName", "OGQsfjmReM");
        setField(term23921, term23921.getClass(), "lastName", "YsUtbngnRO");
        setField(term23921, term23921.getClass(), "email", "JisaWUxcNb");
        setField(term23921, term23921.getClass(), "role", enum86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.Role");
        Object[] args = new Object[1];
        args[0] = enum86;
        callMethod(klass, "setRole", argTypes, term23921, args);
    }

};


