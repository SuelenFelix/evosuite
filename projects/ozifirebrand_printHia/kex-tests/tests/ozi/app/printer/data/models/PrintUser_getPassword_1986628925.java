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

public class PrintUser_getPassword_1986628925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16917;

    public PrintUser_getPassword_1986628925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16917 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term16917, term16917.getClass(), "id", null);
        setField(term16917, term16917.getClass(), "firstName", null);
        setField(term16917, term16917.getClass(), "lastName", null);
        setField(term16917, term16917.getClass(), "password", null);
        setField(term16917, term16917.getClass(), "phoneNumber", null);
        setField(term16917, term16917.getClass(), "email", null);
        setField(term16917, term16917.getClass(), "role", null);
        setField(term16917, term16917.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term16917, args);
    }

};


