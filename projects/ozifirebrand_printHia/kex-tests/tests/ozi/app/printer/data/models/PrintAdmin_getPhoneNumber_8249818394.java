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

public class PrintAdmin_getPhoneNumber_8249818394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18380;

    public PrintAdmin_getPhoneNumber_8249818394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18513 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term18512 = ((Class) term18513).getDeclaredField((String) "ADMIN");
        ((Field) term18512).setAccessible(true);
        Object enum67 = ((Field) term18512).get((Object) null);
        term18380 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term18380, term18380.getClass(), "id", "BBXiTNHqGE");
        setField(term18380, term18380.getClass(), "firstName", "IEYhJmgCVd");
        setField(term18380, term18380.getClass(), "lastName", "KSJeYkkvpk");
        setField(term18380, term18380.getClass(), "phoneNumber", "qUtkFGMNUV");
        setField(term18380, term18380.getClass(), "email", "mGRiYhnMcR");
        setField(term18380, term18380.getClass(), "role", enum67);
        setField(term18380, term18380.getClass(), "password", "NFlvfJCVPO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term18380, args);
    }

};


