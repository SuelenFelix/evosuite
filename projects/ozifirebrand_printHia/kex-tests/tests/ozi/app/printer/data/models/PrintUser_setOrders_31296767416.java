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
import java.util.LinkedList;

public class PrintUser_setOrders_31296767416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13331;
     Object term13441;

    public PrintUser_setOrders_31296767416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13505 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term13504 = ((Class) term13505).getDeclaredField((String) "ADMIN");
        ((Field) term13504).setAccessible(true);
        Object enum49 = ((Field) term13504).get((Object) null);
        Class<? extends Object> term13687 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term13686 = ((Class) term13687).getDeclaredField((String) "PENDING");
        ((Field) term13686).setAccessible(true);
        Object enum50 = ((Field) term13686).get((Object) null);
        Object term13415 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term13421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13422 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term13415, term13415.getClass(), "id", "");
        setField(term13415, term13415.getClass(), "imageUrl", "");
        setDoubleField(term13415, term13415.getClass(), "size", 0.45069204793711093);
        setIntField(term13415, term13415.getClass(), "quantity", -2095575670);
        setDoubleField(term13415, term13415.getClass(), "price", 0.9341364461850963);
        setField(term13421, term13421.getClass(), "date", null);
        setField(term13421, term13421.getClass(), "time", null);
        setField(term13415, term13415.getClass(), "orderDate", term13421);
        setField(term13422, term13422.getClass(), "date", null);
        setField(term13422, term13422.getClass(), "time", null);
        setField(term13415, term13415.getClass(), "deliveryDate", term13422);
        setBooleanField(term13415, term13415.getClass(), "ordered", true);
        setField(term13415, term13415.getClass(), "userId", "");
        setField(term13415, term13415.getClass(), "orderStatus", enum50);
        Class<? extends Object> term13910 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term13909 = ((Class) term13910).getDeclaredField((String) "ORDERED");
        ((Field) term13909).setAccessible(true);
        Object enum51 = ((Field) term13909).get((Object) null);
        Object term13427 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term13433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13434 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term13427, term13427.getClass(), "id", "");
        setField(term13427, term13427.getClass(), "imageUrl", "");
        setDoubleField(term13427, term13427.getClass(), "size", 0.9022041121474429);
        setIntField(term13427, term13427.getClass(), "quantity", 1225272962);
        setDoubleField(term13427, term13427.getClass(), "price", 0.6512870939318848);
        setField(term13433, term13433.getClass(), "date", null);
        setField(term13433, term13433.getClass(), "time", null);
        setField(term13427, term13427.getClass(), "orderDate", term13433);
        setField(term13434, term13434.getClass(), "date", null);
        setField(term13434, term13434.getClass(), "time", null);
        setField(term13427, term13427.getClass(), "deliveryDate", term13434);
        setBooleanField(term13427, term13427.getClass(), "ordered", false);
        setField(term13427, term13427.getClass(), "userId", "");
        setField(term13427, term13427.getClass(), "orderStatus", enum51);
        ArrayList term13413 = new ArrayList();
        ((ArrayList) term13413).add(term13415);
        ((ArrayList) term13413).add(term13427);
        term13331 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term13331, term13331.getClass(), "id", "TtGbVmKcnX");
        setField(term13331, term13331.getClass(), "firstName", "GJVkUrCVdD");
        setField(term13331, term13331.getClass(), "lastName", "zNdorvdUgu");
        setField(term13331, term13331.getClass(), "password", "oPxuZbkYio");
        setField(term13331, term13331.getClass(), "phoneNumber", "vKitydDVnM");
        setField(term13331, term13331.getClass(), "email", "urCiQnUFBM");
        setField(term13331, term13331.getClass(), "role", enum49);
        setField(term13331, term13331.getClass(), "orders", term13413);
        term13441 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term13441;
        callMethod(klass, "setOrders", argTypes, term13331, args);
    }

};


