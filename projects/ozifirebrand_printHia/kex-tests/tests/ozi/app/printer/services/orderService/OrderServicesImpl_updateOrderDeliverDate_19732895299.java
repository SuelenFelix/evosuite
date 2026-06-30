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

public class OrderServicesImpl_updateOrderDeliverDate_19732895299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;

    public OrderServicesImpl_updateOrderDeliverDate_19732895299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1130 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1126, term1126.getClass(), "year", 2022);
        setShortField(term1126, term1126.getClass(), "month", (short) 2);
        setShortField(term1126, term1126.getClass(), "day", (short) 26);
        setField(term1125, term1125.getClass(), "date", term1126);
        setByteField(term1130, term1130.getClass(), "hour", (byte) 11);
        setByteField(term1130, term1130.getClass(), "minute", (byte) 42);
        setByteField(term1130, term1130.getClass(), "second", (byte) 15);
        setIntField(term1130, term1130.getClass(), "nano", 377731937);
        setField(term1125, term1125.getClass(), "time", term1130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = "oVcInYnLWB";
        args[1] = term1125;
        callMethod(klass, "updateOrderDeliverDate", argTypes, null, args);
    }

};


