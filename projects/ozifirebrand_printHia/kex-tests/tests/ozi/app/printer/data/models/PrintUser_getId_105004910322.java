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

public class PrintUser_getId_105004910322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16914;

    public PrintUser_getId_105004910322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16914 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term16914, term16914.getClass(), "id", null);
        setField(term16914, term16914.getClass(), "firstName", null);
        setField(term16914, term16914.getClass(), "lastName", null);
        setField(term16914, term16914.getClass(), "password", null);
        setField(term16914, term16914.getClass(), "phoneNumber", null);
        setField(term16914, term16914.getClass(), "email", null);
        setField(term16914, term16914.getClass(), "role", null);
        setField(term16914, term16914.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term16914, args);
    }

};


