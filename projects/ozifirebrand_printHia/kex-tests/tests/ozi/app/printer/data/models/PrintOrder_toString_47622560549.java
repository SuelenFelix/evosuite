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

public class PrintOrder_toString_47622560549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31880;

    public PrintOrder_toString_47622560549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31880 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        setField(term31880, term31880.getClass(), "id", null);
        setField(term31880, term31880.getClass(), "imageUrl", null);
        setDoubleField(term31880, term31880.getClass(), "size", 0.0);
        setIntField(term31880, term31880.getClass(), "quantity", 0);
        setDoubleField(term31880, term31880.getClass(), "price", 0.0);
        setField(term31880, term31880.getClass(), "orderDate", null);
        setField(term31880, term31880.getClass(), "deliveryDate", null);
        setBooleanField(term31880, term31880.getClass(), "ordered", false);
        setField(term31880, term31880.getClass(), "userId", null);
        setField(term31880, term31880.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31880, args);
    }

};


