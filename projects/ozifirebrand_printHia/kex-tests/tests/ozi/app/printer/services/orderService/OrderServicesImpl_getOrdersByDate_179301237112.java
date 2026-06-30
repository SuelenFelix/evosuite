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

public class OrderServicesImpl_getOrdersByDate_179301237112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;

    public OrderServicesImpl_getOrdersByDate_179301237112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1172 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1168, term1168.getClass(), "year", 2026);
        setShortField(term1168, term1168.getClass(), "month", (short) 12);
        setShortField(term1168, term1168.getClass(), "day", (short) 14);
        setField(term1167, term1167.getClass(), "date", term1168);
        setByteField(term1172, term1172.getClass(), "hour", (byte) 16);
        setByteField(term1172, term1172.getClass(), "minute", (byte) 34);
        setByteField(term1172, term1172.getClass(), "second", (byte) 9);
        setIntField(term1172, term1172.getClass(), "nano", 518326996);
        setField(term1167, term1167.getClass(), "time", term1172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1167;
        callMethod(klass, "getOrdersByDate", argTypes, null, args);
    }

};


