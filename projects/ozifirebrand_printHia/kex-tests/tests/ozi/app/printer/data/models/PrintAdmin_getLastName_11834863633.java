package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PrintAdmin_getLastName_11834863633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18056;

    public PrintAdmin_getLastName_11834863633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18189 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term18188 = ((Class) term18189).getDeclaredField((String) "ADMIN");
        ((Field) term18188).setAccessible(true);
        Object enum66 = ((Field) term18188).get((Object) null);
        term18056 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term18056, term18056.getClass(), "id", "FbSIUZyBXZ");
        setField(term18056, term18056.getClass(), "firstName", "mhQDwIyrRi");
        setField(term18056, term18056.getClass(), "lastName", "HpZXWDPhlg");
        setField(term18056, term18056.getClass(), "phoneNumber", "lBOokzEPfe");
        setField(term18056, term18056.getClass(), "email", "dtGZCsKXbW");
        setField(term18056, term18056.getClass(), "role", enum66);
        setField(term18056, term18056.getClass(), "password", "bdyhHbDAmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term18056, args);
    }

};


