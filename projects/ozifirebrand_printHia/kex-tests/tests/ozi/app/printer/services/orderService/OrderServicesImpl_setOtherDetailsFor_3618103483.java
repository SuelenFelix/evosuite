package ozi.app.printer.services.orderService;

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
import static ozi.app.printer.services.orderService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class OrderServicesImpl_setOtherDetailsFor_3618103483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public OrderServicesImpl_setOtherDetailsFor_3618103483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term232 = ((Class) term233).getDeclaredField((String) "PENDING");
        ((Field) term232).setAccessible(true);
        Object enum0 = ((Field) term232).get((Object) null);
        term95 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term95, term95.getClass(), "id", "jJCZpVmanW");
        setField(term95, term95.getClass(), "imageUrl", "EGtDIRbSSb");
        setDoubleField(term95, term95.getClass(), "size", 0.5523635872663106);
        setIntField(term95, term95.getClass(), "quantity", 1484323161);
        setDoubleField(term95, term95.getClass(), "price", 0.544608645520025);
        setIntField(term124, term124.getClass(), "year", 2012);
        setShortField(term124, term124.getClass(), "month", (short) 8);
        setShortField(term124, term124.getClass(), "day", (short) 25);
        setField(term123, term123.getClass(), "date", term124);
        setByteField(term128, term128.getClass(), "hour", (byte) 5);
        setByteField(term128, term128.getClass(), "minute", (byte) 20);
        setByteField(term128, term128.getClass(), "second", (byte) 50);
        setIntField(term128, term128.getClass(), "nano", 345595912);
        setField(term123, term123.getClass(), "time", term128);
        setField(term95, term95.getClass(), "orderDate", term123);
        setIntField(term134, term134.getClass(), "year", 2021);
        setShortField(term134, term134.getClass(), "month", (short) 1);
        setShortField(term134, term134.getClass(), "day", (short) 18);
        setField(term133, term133.getClass(), "date", term134);
        setByteField(term138, term138.getClass(), "hour", (byte) 13);
        setByteField(term138, term138.getClass(), "minute", (byte) 38);
        setByteField(term138, term138.getClass(), "second", (byte) 26);
        setIntField(term138, term138.getClass(), "nano", 544608644);
        setField(term133, term133.getClass(), "time", term138);
        setField(term95, term95.getClass(), "deliveryDate", term133);
        setBooleanField(term95, term95.getClass(), "ordered", false);
        setField(term95, term95.getClass(), "userId", "SzjVpOQTyS");
        setField(term95, term95.getClass(), "orderStatus", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Object[] args = new Object[1];
        args[0] = term95;
        callMethod(klass, "setOtherDetailsFor", argTypes, null, args);
    }

};


