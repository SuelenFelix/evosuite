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

public class PrintOrder_canEqual_128738338947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31870;

    public PrintOrder_canEqual_128738338947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31870 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        setField(term31870, term31870.getClass(), "id", null);
        setField(term31870, term31870.getClass(), "imageUrl", null);
        setDoubleField(term31870, term31870.getClass(), "size", 0.0);
        setIntField(term31870, term31870.getClass(), "quantity", 0);
        setDoubleField(term31870, term31870.getClass(), "price", 0.0);
        setField(term31870, term31870.getClass(), "orderDate", null);
        setField(term31870, term31870.getClass(), "deliveryDate", null);
        setBooleanField(term31870, term31870.getClass(), "ordered", false);
        setField(term31870, term31870.getClass(), "userId", null);
        setField(term31870, term31870.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term31870, args);
    }

};


