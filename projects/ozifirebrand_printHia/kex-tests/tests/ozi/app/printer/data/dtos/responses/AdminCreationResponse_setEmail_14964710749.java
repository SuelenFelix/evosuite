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

public class AdminCreationResponse_setEmail_14964710749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23623;

    public AdminCreationResponse_setEmail_14964710749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23733 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term23732 = ((Class) term23733).getDeclaredField((String) "USER");
        ((Field) term23732).setAccessible(true);
        Object enum85 = ((Field) term23732).get((Object) null);
        term23623 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term23623, term23623.getClass(), "id", "IpmgwHTgnG");
        setField(term23623, term23623.getClass(), "firstName", "tIpkeYIezR");
        setField(term23623, term23623.getClass(), "lastName", "YkZtEtthvz");
        setField(term23623, term23623.getClass(), "email", "dwlZSxlXOo");
        setField(term23623, term23623.getClass(), "role", enum85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lKrEAkypza";
        callMethod(klass, "setEmail", argTypes, term23623, args);
    }

};


