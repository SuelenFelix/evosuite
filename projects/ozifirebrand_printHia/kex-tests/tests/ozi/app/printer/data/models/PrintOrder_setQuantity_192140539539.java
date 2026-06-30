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
import java.lang.Integer;

public class PrintOrder_setQuantity_192140539539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31824;
     Object term31829;

    public PrintOrder_setQuantity_192140539539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31824 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        setField(term31824, term31824.getClass(), "id", null);
        setField(term31824, term31824.getClass(), "imageUrl", null);
        setDoubleField(term31824, term31824.getClass(), "size", 0.0);
        setIntField(term31824, term31824.getClass(), "quantity", 0);
        setDoubleField(term31824, term31824.getClass(), "price", 0.0);
        setField(term31824, term31824.getClass(), "orderDate", null);
        setField(term31824, term31824.getClass(), "deliveryDate", null);
        setBooleanField(term31824, term31824.getClass(), "ordered", false);
        setField(term31824, term31824.getClass(), "userId", null);
        setField(term31824, term31824.getClass(), "orderStatus", null);
        term31829 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31829;
        callMethod(klass, "setQuantity", argTypes, term31824, args);
    }

};


