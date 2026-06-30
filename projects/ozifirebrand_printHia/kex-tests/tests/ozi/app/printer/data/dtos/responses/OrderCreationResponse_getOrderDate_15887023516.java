package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class OrderCreationResponse_getOrderDate_15887023516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public OrderCreationResponse_getOrderDate_15887023516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1648 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1647 = ((Class) term1648).getDeclaredField((String) "PENDING");
        ((Field) term1647).setAccessible(true);
        Object enum5 = ((Field) term1647).get((Object) null);
        term1567 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term1595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1610 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1567, term1567.getClass(), "id", "NRdvgJlhkX");
        setField(term1567, term1567.getClass(), "imageUrl", "uuaPigETmJ");
        setDoubleField(term1567, term1567.getClass(), "size", 0.8474802076607362);
        setIntField(term1567, term1567.getClass(), "quantity", -616727354);
        setDoubleField(term1567, term1567.getClass(), "price", 0.5183269973490326);
        setIntField(term1596, term1596.getClass(), "year", 2019);
        setShortField(term1596, term1596.getClass(), "month", (short) 2);
        setShortField(term1596, term1596.getClass(), "day", (short) 21);
        setField(term1595, term1595.getClass(), "date", term1596);
        setByteField(term1600, term1600.getClass(), "hour", (byte) 5);
        setByteField(term1600, term1600.getClass(), "minute", (byte) 41);
        setByteField(term1600, term1600.getClass(), "second", (byte) 11);
        setIntField(term1600, term1600.getClass(), "nano", 859829782);
        setField(term1595, term1595.getClass(), "time", term1600);
        setField(term1567, term1567.getClass(), "orderDate", term1595);
        setIntField(term1606, term1606.getClass(), "year", 2018);
        setShortField(term1606, term1606.getClass(), "month", (short) 9);
        setShortField(term1606, term1606.getClass(), "day", (short) 28);
        setField(term1605, term1605.getClass(), "date", term1606);
        setByteField(term1610, term1610.getClass(), "hour", (byte) 3);
        setByteField(term1610, term1610.getClass(), "minute", (byte) 37);
        setByteField(term1610, term1610.getClass(), "second", (byte) 46);
        setIntField(term1610, term1610.getClass(), "nano", 763326845);
        setField(term1605, term1605.getClass(), "time", term1610);
        setField(term1567, term1567.getClass(), "deliveryDate", term1605);
        setBooleanField(term1567, term1567.getClass(), "ordered", true);
        setField(term1567, term1567.getClass(), "orderStatus", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderDate", argTypes, term1567, args);
    }

};


