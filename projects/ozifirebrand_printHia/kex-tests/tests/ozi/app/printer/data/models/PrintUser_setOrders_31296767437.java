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

public class PrintUser_setOrders_31296767437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16929;

    public PrintUser_setOrders_31296767437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16929 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term16929, term16929.getClass(), "id", null);
        setField(term16929, term16929.getClass(), "firstName", null);
        setField(term16929, term16929.getClass(), "lastName", null);
        setField(term16929, term16929.getClass(), "password", null);
        setField(term16929, term16929.getClass(), "phoneNumber", null);
        setField(term16929, term16929.getClass(), "email", null);
        setField(term16929, term16929.getClass(), "role", null);
        setField(term16929, term16929.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrders", argTypes, term16929, args);
    }

};


