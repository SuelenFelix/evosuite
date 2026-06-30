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

public class PrintUser_getEmail_15757487946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5294;

    public PrintUser_getEmail_15757487946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5453 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term5452 = ((Class) term5453).getDeclaredField((String) "ADMIN");
        ((Field) term5452).setAccessible(true);
        Object enum20 = ((Field) term5452).get((Object) null);
        Class<? extends Object> term5635 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term5634 = ((Class) term5635).getDeclaredField((String) "ORDERED");
        ((Field) term5634).setAccessible(true);
        Object enum21 = ((Field) term5634).get((Object) null);
        Object term5378 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term5384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5385 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5378, term5378.getClass(), "id", "");
        setField(term5378, term5378.getClass(), "imageUrl", "");
        setDoubleField(term5378, term5378.getClass(), "size", 0.3227335400819148);
        setIntField(term5378, term5378.getClass(), "quantity", -203030934);
        setDoubleField(term5378, term5378.getClass(), "price", 0.43337207054070237);
        setField(term5384, term5384.getClass(), "date", null);
        setField(term5384, term5384.getClass(), "time", null);
        setField(term5378, term5378.getClass(), "orderDate", term5384);
        setField(term5385, term5385.getClass(), "date", null);
        setField(term5385, term5385.getClass(), "time", null);
        setField(term5378, term5378.getClass(), "deliveryDate", term5385);
        setBooleanField(term5378, term5378.getClass(), "ordered", true);
        setField(term5378, term5378.getClass(), "userId", "");
        setField(term5378, term5378.getClass(), "orderStatus", enum21);
        ArrayList term5376 = new ArrayList();
        ((ArrayList) term5376).add(term5378);
        term5294 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term5294, term5294.getClass(), "id", "hCWPJQKpdc");
        setField(term5294, term5294.getClass(), "firstName", "WzMEhMXkKx");
        setField(term5294, term5294.getClass(), "lastName", "XOiDvlDhdc");
        setField(term5294, term5294.getClass(), "password", "AdxvLJhNLe");
        setField(term5294, term5294.getClass(), "phoneNumber", "lHfTrWKMPk");
        setField(term5294, term5294.getClass(), "email", "JDaAnsVTGV");
        setField(term5294, term5294.getClass(), "role", enum20);
        setField(term5294, term5294.getClass(), "orders", term5376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term5294, args);
    }

};


