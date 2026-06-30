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
import java.util.ArrayList;

public class PrintUser_getOrders_39849088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6671;

    public PrintUser_getOrders_39849088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6818 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term6817 = ((Class) term6818).getDeclaredField((String) "ADMIN");
        ((Field) term6817).setAccessible(true);
        Object enum25 = ((Field) term6817).get((Object) null);
        ArrayList term6753 = new ArrayList();
        term6671 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term6671, term6671.getClass(), "id", "EeBVbzjcCI");
        setField(term6671, term6671.getClass(), "firstName", "UfQtPRyWRC");
        setField(term6671, term6671.getClass(), "lastName", "FPvxVzzSvD");
        setField(term6671, term6671.getClass(), "password", "WHcwFgsGFC");
        setField(term6671, term6671.getClass(), "phoneNumber", "HzqpegHiRq");
        setField(term6671, term6671.getClass(), "email", "jwsfVjMoJT");
        setField(term6671, term6671.getClass(), "role", enum25);
        setField(term6671, term6671.getClass(), "orders", term6753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrders", argTypes, term6671, args);
    }

};


