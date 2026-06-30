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

public class AdminCreationResponse_getEmail_19201394904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22165;

    public AdminCreationResponse_getEmail_19201394904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22264 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22263 = ((Class) term22264).getDeclaredField((String) "ADMIN");
        ((Field) term22263).setAccessible(true);
        Object enum80 = ((Field) term22263).get((Object) null);
        term22165 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term22165, term22165.getClass(), "id", "CVRGEomOth");
        setField(term22165, term22165.getClass(), "firstName", "vSeruUyNWX");
        setField(term22165, term22165.getClass(), "lastName", "UkKvaeJfEC");
        setField(term22165, term22165.getClass(), "email", "WPxXsahPRq");
        setField(term22165, term22165.getClass(), "role", enum80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term22165, args);
    }

};


