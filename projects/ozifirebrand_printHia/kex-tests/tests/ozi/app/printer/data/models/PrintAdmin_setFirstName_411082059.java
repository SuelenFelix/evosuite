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

public class PrintAdmin_setFirstName_411082059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20010;

    public PrintAdmin_setFirstName_411082059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20155 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term20154 = ((Class) term20155).getDeclaredField((String) "ADMIN");
        ((Field) term20154).setAccessible(true);
        Object enum72 = ((Field) term20154).get((Object) null);
        term20010 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term20010, term20010.getClass(), "id", "IENRuqmwUU");
        setField(term20010, term20010.getClass(), "firstName", "GsWxOwXvSu");
        setField(term20010, term20010.getClass(), "lastName", "bKBSncrMEZ");
        setField(term20010, term20010.getClass(), "phoneNumber", "yeSXGqQExb");
        setField(term20010, term20010.getClass(), "email", "uXYcXVYJZM");
        setField(term20010, term20010.getClass(), "role", enum72);
        setField(term20010, term20010.getClass(), "password", "BJhjdJUhkz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cdHYQDgUZR";
        callMethod(klass, "setFirstName", argTypes, term20010, args);
    }

};


