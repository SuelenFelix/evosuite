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

public class AdminCreationResponse_getFirstName_6870932172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21605;

    public AdminCreationResponse_getFirstName_6870932172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21704 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21703 = ((Class) term21704).getDeclaredField((String) "ADMIN");
        ((Field) term21703).setAccessible(true);
        Object enum78 = ((Field) term21703).get((Object) null);
        term21605 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term21605, term21605.getClass(), "id", "gltJarNuUk");
        setField(term21605, term21605.getClass(), "firstName", "ZwZIDwYcSW");
        setField(term21605, term21605.getClass(), "lastName", "sOdkipUKRu");
        setField(term21605, term21605.getClass(), "email", "oKwCDqywym");
        setField(term21605, term21605.getClass(), "role", enum78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term21605, args);
    }

};


