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

public class AdminCreationResponse_canEqual_176487668212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24482;
     Object term24540;

    public AdminCreationResponse_canEqual_176487668212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24582 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term24581 = ((Class) term24582).getDeclaredField((String) "ADMIN");
        ((Field) term24581).setAccessible(true);
        Object enum88 = ((Field) term24581).get((Object) null);
        term24482 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term24482, term24482.getClass(), "id", "FlHzxEfFzI");
        setField(term24482, term24482.getClass(), "firstName", "aSATgQUpoe");
        setField(term24482, term24482.getClass(), "lastName", "VkPSXewZfB");
        setField(term24482, term24482.getClass(), "email", "ubodzJoMGW");
        setField(term24482, term24482.getClass(), "role", enum88);
        term24540 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24540;
        callMethod(klass, "canEqual", argTypes, term24482, args);
    }

};


