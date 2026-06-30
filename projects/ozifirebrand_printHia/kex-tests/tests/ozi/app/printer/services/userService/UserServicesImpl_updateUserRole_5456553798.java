package ozi.app.printer.services.userService;

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
import static ozi.app.printer.services.userService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UserServicesImpl_updateUserRole_5456553798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public UserServicesImpl_updateUserRole_5456553798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term292 = ((Class) term293).getDeclaredField((String) "USER");
        ((Field) term292).setAccessible(true);
        enum0 = ((Field) term292).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.userService.UserServicesImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("ozi.app.printer.data.models.Role");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = enum0;
        callMethod(klass, "updateUserRole", argTypes, null, args);
    }

};


