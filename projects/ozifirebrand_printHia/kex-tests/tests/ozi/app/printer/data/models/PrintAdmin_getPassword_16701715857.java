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

public class PrintAdmin_getPassword_16701715857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19344;

    public PrintAdmin_getPassword_16701715857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19476 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term19475 = ((Class) term19476).getDeclaredField((String) "USER");
        ((Field) term19475).setAccessible(true);
        Object enum70 = ((Field) term19475).get((Object) null);
        term19344 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term19344, term19344.getClass(), "id", "OUeBWNTQDh");
        setField(term19344, term19344.getClass(), "firstName", "gltJarNuUk");
        setField(term19344, term19344.getClass(), "lastName", "ZwZIDwYcSW");
        setField(term19344, term19344.getClass(), "phoneNumber", "sOdkipUKRu");
        setField(term19344, term19344.getClass(), "email", "oKwCDqywym");
        setField(term19344, term19344.getClass(), "role", enum70);
        setField(term19344, term19344.getClass(), "password", "zjZYTddemL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term19344, args);
    }

};


