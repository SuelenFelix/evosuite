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
import java.lang.Double;

public class PrintOrder_setPrice_4418792640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31831;
     Object term31836;

    public PrintOrder_setPrice_4418792640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31831 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        setField(term31831, term31831.getClass(), "id", null);
        setField(term31831, term31831.getClass(), "imageUrl", null);
        setDoubleField(term31831, term31831.getClass(), "size", 0.0);
        setIntField(term31831, term31831.getClass(), "quantity", 0);
        setDoubleField(term31831, term31831.getClass(), "price", 0.0);
        setField(term31831, term31831.getClass(), "orderDate", null);
        setField(term31831, term31831.getClass(), "deliveryDate", null);
        setBooleanField(term31831, term31831.getClass(), "ordered", false);
        setField(term31831, term31831.getClass(), "userId", null);
        setField(term31831, term31831.getClass(), "orderStatus", null);
        term31836 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term31836;
        callMethod(klass, "setPrice", argTypes, term31831, args);
    }

};


