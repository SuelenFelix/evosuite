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

public class PrintAdmin_getRole_10746080316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19024;

    public PrintAdmin_getRole_10746080316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19156 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term19155 = ((Class) term19156).getDeclaredField((String) "USER");
        ((Field) term19155).setAccessible(true);
        Object enum69 = ((Field) term19155).get((Object) null);
        term19024 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term19024, term19024.getClass(), "id", "OzXRsFGTIp");
        setField(term19024, term19024.getClass(), "firstName", "TjWpyghUWN");
        setField(term19024, term19024.getClass(), "lastName", "dkZFDZxcde");
        setField(term19024, term19024.getClass(), "phoneNumber", "WXcZEtUKlI");
        setField(term19024, term19024.getClass(), "email", "IkpjUOuWQU");
        setField(term19024, term19024.getClass(), "role", enum69);
        setField(term19024, term19024.getClass(), "password", "boSSpezHeU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term19024, args);
    }

};


