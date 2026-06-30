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

public class PrintAdmin_getFirstName_2038656452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17732;

    public PrintAdmin_getFirstName_2038656452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17865 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term17864 = ((Class) term17865).getDeclaredField((String) "ADMIN");
        ((Field) term17864).setAccessible(true);
        Object enum65 = ((Field) term17864).get((Object) null);
        term17732 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term17732, term17732.getClass(), "id", "eOJfbiZLnb");
        setField(term17732, term17732.getClass(), "firstName", "nKZKnxWYCK");
        setField(term17732, term17732.getClass(), "lastName", "JOqQxuzRuZ");
        setField(term17732, term17732.getClass(), "phoneNumber", "RSaoipUlsg");
        setField(term17732, term17732.getClass(), "email", "cSHGbqKqlN");
        setField(term17732, term17732.getClass(), "role", enum65);
        setField(term17732, term17732.getClass(), "password", "pFAfANnxup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term17732, args);
    }

};


