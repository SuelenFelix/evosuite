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

public class PrintAdmin_toString_88969117437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23562;

    public PrintAdmin_toString_88969117437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23562 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term23562, term23562.getClass(), "id", null);
        setField(term23562, term23562.getClass(), "firstName", null);
        setField(term23562, term23562.getClass(), "lastName", null);
        setField(term23562, term23562.getClass(), "phoneNumber", null);
        setField(term23562, term23562.getClass(), "email", null);
        setField(term23562, term23562.getClass(), "role", null);
        setField(term23562, term23562.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23562, args);
    }

};


