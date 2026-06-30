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

public class PrintAdmin_setLastName_152513849310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20356;

    public PrintAdmin_setLastName_152513849310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20501 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term20500 = ((Class) term20501).getDeclaredField((String) "ADMIN");
        ((Field) term20500).setAccessible(true);
        Object enum73 = ((Field) term20500).get((Object) null);
        term20356 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term20356, term20356.getClass(), "id", "KAORSSPSeV");
        setField(term20356, term20356.getClass(), "firstName", "UimMMORkzd");
        setField(term20356, term20356.getClass(), "lastName", "huVIXUWLtI");
        setField(term20356, term20356.getClass(), "phoneNumber", "vhKzFyKPOT");
        setField(term20356, term20356.getClass(), "email", "nQhIgWXdRc");
        setField(term20356, term20356.getClass(), "role", enum73);
        setField(term20356, term20356.getClass(), "password", "EusenEbIoF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SScVQYSvWH";
        callMethod(klass, "setLastName", argTypes, term20356, args);
    }

};


