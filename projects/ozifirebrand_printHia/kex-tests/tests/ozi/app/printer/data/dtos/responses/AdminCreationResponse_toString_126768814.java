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

public class AdminCreationResponse_toString_126768814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25043;

    public AdminCreationResponse_toString_126768814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25142 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term25141 = ((Class) term25142).getDeclaredField((String) "ADMIN");
        ((Field) term25141).setAccessible(true);
        Object enum90 = ((Field) term25141).get((Object) null);
        term25043 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term25043, term25043.getClass(), "id", "mKaHyMybrK");
        setField(term25043, term25043.getClass(), "firstName", "AyrEXuGrEj");
        setField(term25043, term25043.getClass(), "lastName", "yevIIoVYHq");
        setField(term25043, term25043.getClass(), "email", "UuYWMTqWTV");
        setField(term25043, term25043.getClass(), "role", enum90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25043, args);
    }

};


