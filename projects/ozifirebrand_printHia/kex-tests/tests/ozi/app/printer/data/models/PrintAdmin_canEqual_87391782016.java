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

public class PrintAdmin_canEqual_87391782016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22576;
     Object term22658;

    public PrintAdmin_canEqual_87391782016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22710 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22709 = ((Class) term22710).getDeclaredField((String) "ADMIN");
        ((Field) term22709).setAccessible(true);
        Object enum80 = ((Field) term22709).get((Object) null);
        term22576 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term22576, term22576.getClass(), "id", "rwKoAngzCu");
        setField(term22576, term22576.getClass(), "firstName", "VUkRVwROTl");
        setField(term22576, term22576.getClass(), "lastName", "UDlkdccCRn");
        setField(term22576, term22576.getClass(), "phoneNumber", "McpzErOcYb");
        setField(term22576, term22576.getClass(), "email", "jqrVEUvYEz");
        setField(term22576, term22576.getClass(), "role", enum80);
        setField(term22576, term22576.getClass(), "password", "QITgiBrmfj");
        term22658 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22658;
        callMethod(klass, "canEqual", argTypes, term22576, args);
    }

};


