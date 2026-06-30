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

public class PrintAdmin_setPhoneNumber_92803265530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23555;

    public PrintAdmin_setPhoneNumber_92803265530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23555 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term23555, term23555.getClass(), "id", null);
        setField(term23555, term23555.getClass(), "firstName", null);
        setField(term23555, term23555.getClass(), "lastName", null);
        setField(term23555, term23555.getClass(), "phoneNumber", null);
        setField(term23555, term23555.getClass(), "email", null);
        setField(term23555, term23555.getClass(), "role", null);
        setField(term23555, term23555.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhoneNumber", argTypes, term23555, args);
    }

};


