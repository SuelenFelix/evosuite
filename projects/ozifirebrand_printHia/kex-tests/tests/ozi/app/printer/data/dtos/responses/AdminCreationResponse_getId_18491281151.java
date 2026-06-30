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

public class AdminCreationResponse_getId_18491281151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21329;

    public AdminCreationResponse_getId_18491281151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21427 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21426 = ((Class) term21427).getDeclaredField((String) "USER");
        ((Field) term21426).setAccessible(true);
        Object enum77 = ((Field) term21426).get((Object) null);
        term21329 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term21329, term21329.getClass(), "id", "WXcZEtUKlI");
        setField(term21329, term21329.getClass(), "firstName", "IkpjUOuWQU");
        setField(term21329, term21329.getClass(), "lastName", "boSSpezHeU");
        setField(term21329, term21329.getClass(), "email", "OUeBWNTQDh");
        setField(term21329, term21329.getClass(), "role", enum77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term21329, args);
    }

};


