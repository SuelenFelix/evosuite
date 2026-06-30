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

public class AdminCreationResponse_getRole_19655668935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22445;

    public AdminCreationResponse_getRole_19655668935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22544 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22543 = ((Class) term22544).getDeclaredField((String) "ADMIN");
        ((Field) term22543).setAccessible(true);
        Object enum81 = ((Field) term22543).get((Object) null);
        term22445 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term22445, term22445.getClass(), "id", "IENRuqmwUU");
        setField(term22445, term22445.getClass(), "firstName", "GsWxOwXvSu");
        setField(term22445, term22445.getClass(), "lastName", "bKBSncrMEZ");
        setField(term22445, term22445.getClass(), "email", "yeSXGqQExb");
        setField(term22445, term22445.getClass(), "role", enum81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term22445, args);
    }

};


