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

public class PrintUser_getId_10500491031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;

    public PrintUser_getId_10500491031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term594 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term593 = ((Class) term594).getDeclaredField((String) "USER");
        ((Field) term593).setAccessible(true);
        Object enum2 = ((Field) term593).get((Object) null);
        Class<? extends Object> term808 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term807 = ((Class) term808).getDeclaredField((String) "ORDERED");
        ((Field) term807).setAccessible(true);
        Object enum3 = ((Field) term807).get((Object) null);
        Object term487 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term494 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term487, term487.getClass(), "id", "");
        setField(term487, term487.getClass(), "imageUrl", "");
        setDoubleField(term487, term487.getClass(), "size", 0.13238746331190498);
        setIntField(term487, term487.getClass(), "quantity", 568599855);
        setDoubleField(term487, term487.getClass(), "price", 0.3455959125047594);
        setField(term493, term493.getClass(), "date", null);
        setField(term493, term493.getClass(), "time", null);
        setField(term487, term487.getClass(), "orderDate", term493);
        setField(term494, term494.getClass(), "date", null);
        setField(term494, term494.getClass(), "time", null);
        setField(term487, term487.getClass(), "deliveryDate", term494);
        setBooleanField(term487, term487.getClass(), "ordered", false);
        setField(term487, term487.getClass(), "userId", "");
        setField(term487, term487.getClass(), "orderStatus", enum3);
        Class<? extends Object> term1031 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1030 = ((Class) term1031).getDeclaredField((String) "PENDING");
        ((Field) term1030).setAccessible(true);
        Object enum4 = ((Field) term1030).get((Object) null);
        Object term499 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term505 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term506 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term499, term499.getClass(), "id", "");
        setField(term499, term499.getClass(), "imageUrl", "");
        setDoubleField(term499, term499.getClass(), "size", 0.5523635872663106);
        setIntField(term499, term499.getClass(), "quantity", 1162663216);
        setDoubleField(term499, term499.getClass(), "price", 0.544608645520025);
        setField(term505, term505.getClass(), "date", null);
        setField(term505, term505.getClass(), "time", null);
        setField(term499, term499.getClass(), "orderDate", term505);
        setField(term506, term506.getClass(), "date", null);
        setField(term506, term506.getClass(), "time", null);
        setField(term499, term499.getClass(), "deliveryDate", term506);
        setBooleanField(term499, term499.getClass(), "ordered", false);
        setField(term499, term499.getClass(), "userId", "");
        setField(term499, term499.getClass(), "orderStatus", enum4);
        Object term511 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term518 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term511, term511.getClass(), "id", "");
        setField(term511, term511.getClass(), "imageUrl", "");
        setDoubleField(term511, term511.getClass(), "size", 0.28570734989730284);
        setIntField(term511, term511.getClass(), "quantity", 1484323161);
        setDoubleField(term511, term511.getClass(), "price", 0.40176586625454525);
        setField(term517, term517.getClass(), "date", null);
        setField(term517, term517.getClass(), "time", null);
        setField(term511, term511.getClass(), "orderDate", term517);
        setField(term518, term518.getClass(), "date", null);
        setField(term518, term518.getClass(), "time", null);
        setField(term511, term511.getClass(), "deliveryDate", term518);
        setBooleanField(term511, term511.getClass(), "ordered", false);
        setField(term511, term511.getClass(), "userId", "");
        setField(term511, term511.getClass(), "orderStatus", enum3);
        Object term521 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term528 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term521, term521.getClass(), "id", "");
        setField(term521, term521.getClass(), "imageUrl", "");
        setDoubleField(term521, term521.getClass(), "size", 0.2641345529914265);
        setIntField(term521, term521.getClass(), "quantity", 391863371);
        setDoubleField(term521, term521.getClass(), "price", 0.36923381893433327);
        setField(term527, term527.getClass(), "date", null);
        setField(term527, term527.getClass(), "time", null);
        setField(term521, term521.getClass(), "orderDate", term527);
        setField(term528, term528.getClass(), "date", null);
        setField(term528, term528.getClass(), "time", null);
        setField(term521, term521.getClass(), "deliveryDate", term528);
        setBooleanField(term521, term521.getClass(), "ordered", false);
        setField(term521, term521.getClass(), "userId", "");
        setField(term521, term521.getClass(), "orderStatus", enum4);
        ArrayList term485 = new ArrayList();
        ((ArrayList) term485).add(term487);
        ((ArrayList) term485).add(term499);
        ((ArrayList) term485).add(term511);
        ((ArrayList) term485).add(term521);
        term404 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term404, term404.getClass(), "id", "sjlJAEtRrb");
        setField(term404, term404.getClass(), "firstName", "MuLcgQHgqz");
        setField(term404, term404.getClass(), "lastName", "xxtlPwDYFs");
        setField(term404, term404.getClass(), "password", "jJCZpVmanW");
        setField(term404, term404.getClass(), "phoneNumber", "EGtDIRbSSb");
        setField(term404, term404.getClass(), "email", "SzjVpOQTyS");
        setField(term404, term404.getClass(), "role", enum2);
        setField(term404, term404.getClass(), "orders", term485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term404, args);
    }

};


