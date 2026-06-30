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

public class PrintUser_equals_175979306517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14132;
     Object term14242;

    public PrintUser_equals_175979306517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14304 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term14303 = ((Class) term14304).getDeclaredField((String) "ADMIN");
        ((Field) term14303).setAccessible(true);
        Object enum52 = ((Field) term14303).get((Object) null);
        Class<? extends Object> term14486 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term14485 = ((Class) term14486).getDeclaredField((String) "PENDING");
        ((Field) term14485).setAccessible(true);
        Object enum53 = ((Field) term14485).get((Object) null);
        Object term14216 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term14222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14223 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14216, term14216.getClass(), "id", "");
        setField(term14216, term14216.getClass(), "imageUrl", "");
        setDoubleField(term14216, term14216.getClass(), "size", 0.8777038609128434);
        setIntField(term14216, term14216.getClass(), "quantity", 1324040357);
        setDoubleField(term14216, term14216.getClass(), "price", 0.008025683154629148);
        setField(term14222, term14222.getClass(), "date", null);
        setField(term14222, term14222.getClass(), "time", null);
        setField(term14216, term14216.getClass(), "orderDate", term14222);
        setField(term14223, term14223.getClass(), "date", null);
        setField(term14223, term14223.getClass(), "time", null);
        setField(term14216, term14216.getClass(), "deliveryDate", term14223);
        setBooleanField(term14216, term14216.getClass(), "ordered", false);
        setField(term14216, term14216.getClass(), "userId", "");
        setField(term14216, term14216.getClass(), "orderStatus", enum53);
        Class<? extends Object> term14709 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term14708 = ((Class) term14709).getDeclaredField((String) "ORDERED");
        ((Field) term14708).setAccessible(true);
        Object enum54 = ((Field) term14708).get((Object) null);
        Object term14228 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term14234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14235 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14228, term14228.getClass(), "id", "");
        setField(term14228, term14228.getClass(), "imageUrl", "");
        setDoubleField(term14228, term14228.getClass(), "size", 0.40598298281353484);
        setIntField(term14228, term14228.getClass(), "quantity", -1588772968);
        setDoubleField(term14228, term14228.getClass(), "price", 0.3710067290060264);
        setField(term14234, term14234.getClass(), "date", null);
        setField(term14234, term14234.getClass(), "time", null);
        setField(term14228, term14228.getClass(), "orderDate", term14234);
        setField(term14235, term14235.getClass(), "date", null);
        setField(term14235, term14235.getClass(), "time", null);
        setField(term14228, term14228.getClass(), "deliveryDate", term14235);
        setBooleanField(term14228, term14228.getClass(), "ordered", true);
        setField(term14228, term14228.getClass(), "userId", "");
        setField(term14228, term14228.getClass(), "orderStatus", enum54);
        ArrayList term14214 = new ArrayList();
        ((ArrayList) term14214).add(term14216);
        ((ArrayList) term14214).add(term14228);
        term14132 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term14132, term14132.getClass(), "id", "yUGCjlqgJE");
        setField(term14132, term14132.getClass(), "firstName", "PXdVZyoJyC");
        setField(term14132, term14132.getClass(), "lastName", "vLerpqavFM");
        setField(term14132, term14132.getClass(), "password", "qnvxzwuGKX");
        setField(term14132, term14132.getClass(), "phoneNumber", "EdPAvpluZg");
        setField(term14132, term14132.getClass(), "email", "DzHVBMqWtE");
        setField(term14132, term14132.getClass(), "role", enum52);
        setField(term14132, term14132.getClass(), "orders", term14214);
        term14242 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14242;
        callMethod(klass, "equals", argTypes, term14132, args);
    }

};


