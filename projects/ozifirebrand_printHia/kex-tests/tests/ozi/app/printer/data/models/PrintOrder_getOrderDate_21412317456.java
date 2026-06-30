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
import java.lang.Object;
import java.lang.String;

public class PrintOrder_getOrderDate_21412317456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25204;

    public PrintOrder_getOrderDate_21412317456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25307 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term25306 = ((Class) term25307).getDeclaredField((String) "ORDERED");
        ((Field) term25306).setAccessible(true);
        Object enum88 = ((Field) term25306).get((Object) null);
        term25204 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term25232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25237 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25247 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25204, term25204.getClass(), "id", "kVAmKknVln");
        setField(term25204, term25204.getClass(), "imageUrl", "MRFLbEGYKG");
        setDoubleField(term25204, term25204.getClass(), "size", 0.5597136413549945);
        setIntField(term25204, term25204.getClass(), "quantity", -481533957);
        setDoubleField(term25204, term25204.getClass(), "price", 0.28292420012823627);
        setIntField(term25233, term25233.getClass(), "year", 2029);
        setShortField(term25233, term25233.getClass(), "month", (short) 11);
        setShortField(term25233, term25233.getClass(), "day", (short) 8);
        setField(term25232, term25232.getClass(), "date", term25233);
        setByteField(term25237, term25237.getClass(), "hour", (byte) 23);
        setByteField(term25237, term25237.getClass(), "minute", (byte) 43);
        setByteField(term25237, term25237.getClass(), "second", (byte) 12);
        setIntField(term25237, term25237.getClass(), "nano", 586227255);
        setField(term25232, term25232.getClass(), "time", term25237);
        setField(term25204, term25204.getClass(), "orderDate", term25232);
        setIntField(term25243, term25243.getClass(), "year", 2014);
        setShortField(term25243, term25243.getClass(), "month", (short) 1);
        setShortField(term25243, term25243.getClass(), "day", (short) 23);
        setField(term25242, term25242.getClass(), "date", term25243);
        setByteField(term25247, term25247.getClass(), "hour", (byte) 19);
        setByteField(term25247, term25247.getClass(), "minute", (byte) 52);
        setByteField(term25247, term25247.getClass(), "second", (byte) 9);
        setIntField(term25247, term25247.getClass(), "nano", 235326975);
        setField(term25242, term25242.getClass(), "time", term25247);
        setField(term25204, term25204.getClass(), "deliveryDate", term25242);
        setBooleanField(term25204, term25204.getClass(), "ordered", true);
        setField(term25204, term25204.getClass(), "userId", "BYrGukTyof");
        setField(term25204, term25204.getClass(), "orderStatus", enum88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderDate", argTypes, term25204, args);
    }

};


