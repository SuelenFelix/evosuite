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

public class PrintOrder_setUserId_140583408344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31855;

    public PrintOrder_setUserId_140583408344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31855 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        setField(term31855, term31855.getClass(), "id", null);
        setField(term31855, term31855.getClass(), "imageUrl", null);
        setDoubleField(term31855, term31855.getClass(), "size", 0.0);
        setIntField(term31855, term31855.getClass(), "quantity", 0);
        setDoubleField(term31855, term31855.getClass(), "price", 0.0);
        setField(term31855, term31855.getClass(), "orderDate", null);
        setField(term31855, term31855.getClass(), "deliveryDate", null);
        setBooleanField(term31855, term31855.getClass(), "ordered", false);
        setField(term31855, term31855.getClass(), "userId", null);
        setField(term31855, term31855.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserId", argTypes, term31855, args);
    }

};


