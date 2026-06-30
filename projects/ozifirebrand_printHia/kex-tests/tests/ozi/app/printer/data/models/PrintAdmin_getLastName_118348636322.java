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

public class PrintAdmin_getLastName_118348636322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23547;

    public PrintAdmin_getLastName_118348636322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23547 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term23547, term23547.getClass(), "id", null);
        setField(term23547, term23547.getClass(), "firstName", null);
        setField(term23547, term23547.getClass(), "lastName", null);
        setField(term23547, term23547.getClass(), "phoneNumber", null);
        setField(term23547, term23547.getClass(), "email", null);
        setField(term23547, term23547.getClass(), "role", null);
        setField(term23547, term23547.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term23547, args);
    }

};


