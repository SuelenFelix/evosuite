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

public class PrintUser_setPassword_156647615112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9503;

    public PrintUser_setPassword_156647615112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9696 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term9695 = ((Class) term9696).getDeclaredField((String) "ADMIN");
        ((Field) term9695).setAccessible(true);
        Object enum35 = ((Field) term9695).get((Object) null);
        Class<? extends Object> term9878 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term9877 = ((Class) term9878).getDeclaredField((String) "ORDERED");
        ((Field) term9877).setAccessible(true);
        Object enum36 = ((Field) term9877).get((Object) null);
        Object term9587 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9594 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9587, term9587.getClass(), "id", "");
        setField(term9587, term9587.getClass(), "imageUrl", "");
        setDoubleField(term9587, term9587.getClass(), "size", 0.5187846213101265);
        setIntField(term9587, term9587.getClass(), "quantity", 1876565163);
        setDoubleField(term9587, term9587.getClass(), "price", 0.045893173090043815);
        setField(term9593, term9593.getClass(), "date", null);
        setField(term9593, term9593.getClass(), "time", null);
        setField(term9587, term9587.getClass(), "orderDate", term9593);
        setField(term9594, term9594.getClass(), "date", null);
        setField(term9594, term9594.getClass(), "time", null);
        setField(term9587, term9587.getClass(), "deliveryDate", term9594);
        setBooleanField(term9587, term9587.getClass(), "ordered", false);
        setField(term9587, term9587.getClass(), "userId", "");
        setField(term9587, term9587.getClass(), "orderStatus", enum36);
        Class<? extends Object> term10101 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term10100 = ((Class) term10101).getDeclaredField((String) "DELIVERED");
        ((Field) term10100).setAccessible(true);
        Object enum37 = ((Field) term10100).get((Object) null);
        Object term9599 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9606 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9599, term9599.getClass(), "id", "");
        setField(term9599, term9599.getClass(), "imageUrl", "");
        setDoubleField(term9599, term9599.getClass(), "size", 0.3626177854778667);
        setIntField(term9599, term9599.getClass(), "quantity", -817164822);
        setDoubleField(term9599, term9599.getClass(), "price", 0.3163771663728089);
        setField(term9605, term9605.getClass(), "date", null);
        setField(term9605, term9605.getClass(), "time", null);
        setField(term9599, term9599.getClass(), "orderDate", term9605);
        setField(term9606, term9606.getClass(), "date", null);
        setField(term9606, term9606.getClass(), "time", null);
        setField(term9599, term9599.getClass(), "deliveryDate", term9606);
        setBooleanField(term9599, term9599.getClass(), "ordered", true);
        setField(term9599, term9599.getClass(), "userId", "");
        setField(term9599, term9599.getClass(), "orderStatus", enum37);
        Object term9611 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term9617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9618 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term9611, term9611.getClass(), "id", "");
        setField(term9611, term9611.getClass(), "imageUrl", "");
        setDoubleField(term9611, term9611.getClass(), "size", 0.8819646072665548);
        setIntField(term9611, term9611.getClass(), "quantity", -1016503459);
        setDoubleField(term9611, term9611.getClass(), "price", 0.5412182593116958);
        setField(term9617, term9617.getClass(), "date", null);
        setField(term9617, term9617.getClass(), "time", null);
        setField(term9611, term9611.getClass(), "orderDate", term9617);
        setField(term9618, term9618.getClass(), "date", null);
        setField(term9618, term9618.getClass(), "time", null);
        setField(term9611, term9611.getClass(), "deliveryDate", term9618);
        setBooleanField(term9611, term9611.getClass(), "ordered", true);
        setField(term9611, term9611.getClass(), "userId", "");
        setField(term9611, term9611.getClass(), "orderStatus", enum36);
        ArrayList term9585 = new ArrayList();
        ((ArrayList) term9585).add(term9587);
        ((ArrayList) term9585).add(term9599);
        ((ArrayList) term9585).add(term9611);
        term9503 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term9503, term9503.getClass(), "id", "ZkMALXpEAZ");
        setField(term9503, term9503.getClass(), "firstName", "tXfQjSqDzN");
        setField(term9503, term9503.getClass(), "lastName", "BjugTaMcxJ");
        setField(term9503, term9503.getClass(), "password", "vGiuZVPJNH");
        setField(term9503, term9503.getClass(), "phoneNumber", "tlzpzIjMib");
        setField(term9503, term9503.getClass(), "email", "AZdLeSugwv");
        setField(term9503, term9503.getClass(), "role", enum35);
        setField(term9503, term9503.getClass(), "orders", term9585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "setPassword", argTypes, term9503, args);
    }

};


