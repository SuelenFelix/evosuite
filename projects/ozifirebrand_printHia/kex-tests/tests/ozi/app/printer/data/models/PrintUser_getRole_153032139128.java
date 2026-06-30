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

public class PrintUser_getRole_153032139128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16920;

    public PrintUser_getRole_153032139128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16920 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term16920, term16920.getClass(), "id", null);
        setField(term16920, term16920.getClass(), "firstName", null);
        setField(term16920, term16920.getClass(), "lastName", null);
        setField(term16920, term16920.getClass(), "password", null);
        setField(term16920, term16920.getClass(), "phoneNumber", null);
        setField(term16920, term16920.getClass(), "email", null);
        setField(term16920, term16920.getClass(), "role", null);
        setField(term16920, term16920.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term16920, args);
    }

};


