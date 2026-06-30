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

public class PrintUser_setLastName_107979092932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16924;

    public PrintUser_setLastName_107979092932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16924 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term16924, term16924.getClass(), "id", null);
        setField(term16924, term16924.getClass(), "firstName", null);
        setField(term16924, term16924.getClass(), "lastName", null);
        setField(term16924, term16924.getClass(), "password", null);
        setField(term16924, term16924.getClass(), "phoneNumber", null);
        setField(term16924, term16924.getClass(), "email", null);
        setField(term16924, term16924.getClass(), "role", null);
        setField(term16924, term16924.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term16924, args);
    }

};


